import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Dao mang so nguyen");
        Stack<Integer> stack = new Stack<>();
        int[] array = {3,1,6,2,5,4};
        for (int i = 0; i < array.length; i++){
            stack.push(array[i]);
        }
        System.out.println(stack);
        for (int i = 0; i < array.length; i++) {
            array[i]  = stack.pop();

        }
        System.out.println(Arrays.toString(array));
        System.out.println("Chuoi String truoc khi dao nguoc ");
        Stack<String> wStack = new Stack<>();
        String str = "hello";
        String[] arr = str.split("");
        for (int i = 0; i < arr.length; i++) {
            wStack.push(arr[i]);
        }
        System.out.println(wStack);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = wStack.pop();

        }
        System.out.println(Arrays.toString(arr));
    }
}