package array_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(5);
        list1.add(6);
        list1.add(6);
        list1.add(7);
        list1.add(7);
        list1.add(8);
        list1.add(8);

        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(5);
        list1.add(6);
        list1.add(6);
        list1.add(7);
        list1.add(7);
        list1.add(8);
        list1.add(8);

        showList(list1);
        showList(list2);

        list2.add(list1.get(0));
        list2.add(0, list1.get(list1.size() - 1));

        showList(list2);

        List<Integer> list3 = new ArrayList<>(list2);
        list3.addAll(list1);

        showList(list3);

        for (int i = 0; i < 5; i++) {
            list3.remove(0);
        }

        showList(list3);
    }

    private static void showList(List<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
