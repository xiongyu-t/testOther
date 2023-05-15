package com.qin.test.test1;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
//        String[] strArr = {"hello", "world"};
//        mgm.printArray(strArr); // 输出hello 和 world

        //是大二  1313
//        int i = aTest();
//        System.out.println(i);


        //获取一个类的class对象
        Class<?> aClass = test.getClass();


    }

    // 泛型方法，T代表任意类型
    public <T> void printArray(T[] arr){
        for (T element : arr){
            System.out.println(element);
        }
    }

    public static int aTest(){
        int a = 1;
        try {
            a = 2;
            return a;

        }catch (Exception e){
            a = 3;
            return a;
        }finally {
            a = 4;
            return a;
        }
    }
}
