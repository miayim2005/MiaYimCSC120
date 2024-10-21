import java.util.Scanner;

public class Qualities {
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String endString;
        String currentString;


        System.out.println("Please enter sentences, . to end.");
        endString = "The qualities are ";
        do {
            currentString = keyboard.nextLine();

            if (currentString.startsWith("I am")) {
                currentString = currentString.substring(5);
                endString += currentString + ", ";
            }

        } while (!currentString.equals("."));

        System.out.println(endString);
    }//end of the main class

}//end of the Qualities class

