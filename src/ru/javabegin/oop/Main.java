//Написать программу, удаляющую из вещественного массива A размерности N «лишние» элементы так,
//чтобы оставшиеся элементы оказались упорядоченными по возрастанию (начиная от первого
//элемента): первый элемент не удаляется, второй элемент удаляется, если он меньше первого, третий —
//если он меньше предыдущего элемента, оставленного в массиве, и т. д. Например, массив 5.5, 2.5, 4.6,
//7.2, 5.8, 9.4 должен быть преобразован к виду 5.5, 7.2, 9.4. а экран должны выводиться как
//оригинальное состояние массива, так и итоговое.
package ru.javabegin.oop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите числа в коллекцию");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Float> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(Float.parseFloat(s));
        }
        System.out.println(list);
        System.out.println("Введите номер элемента коллекции");

        int x = (int) in.nextFloat();
        float sum = 0;
        for(int i = 0; i < x; i++) {
            //sum = list.get(i)+ list.get(i+1);
            //i = i + i++;
            sum = sum+ list.get(i);
        }
        System.out.println(sum);
        for(int i = 0; i <= x-1; i++) {
            if (i == x-1) {
                list.set(0, sum);
            }else{
                list.remove(i);
            }

        }
        System.out.println(list);
    }
}
