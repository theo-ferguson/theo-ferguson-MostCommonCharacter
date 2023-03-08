import java.util.*;
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> counter = new HashMap<Character, Integer>();
        counter.put(str.charAt(0), 1);

        char mostCommon = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (counter.get(str.charAt(i)) != null) {
                counter.put(str.charAt(i), counter.get(str.charAt(i))+1);
                if (counter.get(mostCommon) < counter.get(str.charAt(i))) {
                    mostCommon = str.charAt(i);
                }
            } else {
                counter.put(str.charAt(i), 1);
            }
        }

        return mostCommon;
    }
}
