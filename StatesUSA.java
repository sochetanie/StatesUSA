import java.io.*;
import java.util.*;

public class StatesUSA {
    public static void main(String[] args) {
        final int STATES = 50;
        final int INFO = 2;

        String[][] arr;
        arr = getStateArray(STATES, INFO);
        quizUser(arr);
    }

    public static String[][] getStateArray(int STATES, int INFO) {
        String stateCapitals = "Alabama|Montgomery|Alaska|Juneau"
               + "|Arizona|Phoenix|Arkansas|Little Rock|California"
               + "|Sacramento|Colorado|Denver|Connecticut|Hartford"
               + "|Delaware|Dover|Florida|Tallahassee|Georgia|Atlanta"
               + "|Hawaii|Honolulu|Idaho|Boise|Illinois|Springfield|Indiana"
               + "|Indianapolis|Iowa|Des Moines|Kansas|Topeka|Kentucky"
               + "|Frankfort|Louisiana|Baton Rouge|Maine|Augusta|Maryland"
               + "|Annapolis|Massachusetts|Boston|Michigan|Lansing|Minnesota"
               + "|St. Paul|Mississippi|Jackson|Missouri|Jefferson City"
               + "|Montana|Helena|Nebraska|Lincoln|Nevada|Carson City"
               + "|New Hampshire|Concord|New Jersey|Trenton|New Mexico"
               + "|Santa Fe|New York|Albany|North Carolina|Raleigh|North Dakota"
               + "|Bismarck|Ohio|Columbus|Oklahoma|Oklahoma City|Oregon"
               + "|Salem|Pennsylvania|Harrisburg|Rhode Island|Providence"
               + "|South Carolina|Columbia|South Dakota|Pierre|Tennessee"
               + "|Nashville|Texas|Austin|Utah|Salt Lake City|Vermont"
               + "|Montpelier|Virginia|Richmond|Washington|Olympia"
               + "|West Virginia|Charleston|Wisconsin|Madison|Wyoming"
               + "|Cheyenne";


        Scanner scanStr = new Scanner(stateCapitals);
        scanStr.useDelimiter("\\|");

        String[][] arr = new String[STATES][INFO];
        for (int state = 0; state < STATES; state++) {
            for (int datum = 0; datum < INFO; datum++) {
                arr[state][datum] = scanStr.next();
            }
        }
        scanStr.close();
    return arr;
    }

    public static void quizUser(String[][] arr) {
        Scanner stdin = new Scanner(System.in);
        int correct = 0;
        for (String[] state : arr) {
            System.out.print("What is the capital of " + state[0] + "? ");
            String answer = stdin.nextLine();
            if (answer.equalsIgnoreCase(state[1])) {
                System.out.println("Your answer is correct.");
                correct++;
            } else {
                System.out.println("The correct answer is " + state[1]);
            }
        }
        System.out.print("You got " + correct + " answers correct.\n");
        stdin.close();
    }
}