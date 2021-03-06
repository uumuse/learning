package com.jyz.ttest.maplistTest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("1", "a");
		hashMap.put("2", "b");
		hashMap.put("3", "c");
		hashMap.put("4", "d");
		hashMap.get("4");
		String a = "abc";
		String c = new String("abc");
		int b = a.hashCode();
		System.out.println(b==c.hashCode());
		System.out.println(a.equals(c)&&b==c.hashCode());
		//变成线程安全
		Map m = Collections.synchronizedMap(hashMap);
		System.out.println(m);
		
		
	}
}
