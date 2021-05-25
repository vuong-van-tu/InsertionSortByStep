import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");

    }

    public static void insertionSortByStep(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j]+" ");
            }
            System.out.println();
        }

    }

}
