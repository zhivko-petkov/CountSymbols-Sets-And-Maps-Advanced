package EXERCISES;

import com.sun.source.tree.Tree;

import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<Character, Integer> symbols = new TreeMap<>();
        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char currentCh = input.charAt(i);
            if(!symbols.containsKey(currentCh)){
                symbols.put(currentCh,1);
            } else {
                symbols.put(currentCh, symbols.get(currentCh)+1);
            }
        }

        symbols.entrySet()
                .forEach((entry) -> System.out.println(entry.getKey() +
                        ": " + entry.getValue() + " time/s"));
    }
}
