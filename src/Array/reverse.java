//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[]yash= new int[n];
        for (int i = 0; i <yash.length; i++) {
            yash[i] = sc.nextInt();
        }
        for (int i = 0; i <yash.length; i++) {
            // sum+=yash[i];
        }
        int left =0;
        int right =yash.length-1;
        while(left<right){
            int temp =yash[left];
            yash[left]=yash[right];
            yash[right]=temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(yash));;
    }
}