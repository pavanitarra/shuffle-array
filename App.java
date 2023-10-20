import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mainnn {
    public static void main(String[] args) {
        // Create the initial list
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);

        // Shuffle the list
        Collections.shuffle(myList);

        // Convert the shuffled list back to an array if needed
        Integer[] shuffledArray = myList.toArray(new Integer[myList.size()]);

        // Print the shuffled array or list
        for (int value : shuffledArray) {
            System.out.print(value + " ");
        }
    }
}

