package Arrays;
import java.util.Scanner;
public class Subsets {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr []  = new int [n];
        System.out.println("Enter the elements in array");
        for(int i = 0; i<n; i++){
            arr[i]= sc.nextInt();
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.println(arr[i]+","+arr[j]);
            }
            System.out.println();
        }

    }
}
