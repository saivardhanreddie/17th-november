
import java.util.Scanner;

public class checkdigits {

    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }

        System.out.println("number of digits= " + count);

    }

}
