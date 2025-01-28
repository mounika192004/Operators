import java.util.Scanner;

public class OperatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arithmetic Operators
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int modulus = num1 % num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Modulus: " + modulus);

        // Relational Operators
        System.out.println("Is " + num1 + " greater than " + num2 + "? " + (num1 > num2));
        System.out.println("Is " + num1 + " less than " + num2 + "? " + (num1 < num2));
        System.out.println("Is " + num1 + " equal to " + num2 + "? " + (num1 == num2));
        System.out.println("Is " + num1 + " not equal to " + num2 + "? " + (num1 != num2));
        System.out.println("Is " + num1 + " greater than or equal to " + num2 + "? " + (num1 >= num2));
        System.out.println("Is " + num1 + " less than or equal to " + num2 + "? " + (num1 <= num2));

        // Logical Operators
        boolean isAdmin = true;
        boolean isModerator = false;

        System.out.println("Is admin and moderator? " + (isAdmin && isModerator));
        System.out.println("Is admin or moderator? " + (isAdmin || isModerator));
        System.out.println("Is not admin? " + !isAdmin);

        scanner.close();
    }
}
