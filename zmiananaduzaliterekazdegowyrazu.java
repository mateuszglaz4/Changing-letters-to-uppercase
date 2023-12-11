package pl.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        StringBuffer cl = new StringBuffer();
        char[] chars = s.toCharArray();

        for(int i=0; i<chars.length; i++){
            char c= (i == 0 || chars[i-1] == ' ') ? Character.toUpperCase(chars[i]) : chars[i];
            cl.append(c);
        }
        System.out.println(cl);

    }
}
