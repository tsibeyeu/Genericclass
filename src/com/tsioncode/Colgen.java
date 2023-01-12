package com.tsioncode;
import java.util.*;

public class Colgen <T,K>{
    T id;
    K student;
    Colgen(T t,K k){
        this.id=t;
        this.student=k;
    }
    <T> void displayArray(T[] arr){
        for (T x:arr) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        String y;
        System.out.println("");
        Colgen<String, Integer> gc=new Colgen<String,Integer>("ETH",251);
        Integer[] x ={100,104,700,340};
        gc.displayArray(x);


         
        LinkedList<String> names=new LinkedList<String>();
        names.add("ABC");
        names.add("EDC");
        System.out.println(names);
        Iterator it =names.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        Map <String,Integer>countrycode=new HashMap<String, Integer>();
        countrycode.put("ETH",251);
        countrycode.put("ETH",253);
        countrycode.put("ETH",256);
        countrycode.put("ETH",258);
        countrycode.put("ETH",252);
        System.out.println(countrycode.keySet());
        System.out.println(countrycode.values());
    }
}
