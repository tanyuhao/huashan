package com.shopping.test;

import org.junit.Test;

public class Apple {
	public static void main(String[] args) {
		System.out.println("你好456");
		System.out.println("TestGit1添加一句话 ,TestGit2添加第二句话 ");
		System.out.println("TestGit3添加一句话");
		System.out.println("合并之后再添加新的语句");
		System.out.println("我已经搞定了。");
		
		
		
	}
	
	/**
	 * 二分查找算法
	 * @param arr
	 * @param searchValue
	 * @return	没有找到返回-1,找到了返回他在数值的第几个位置。
	 */
	public int binarySearch(int [] arr, int searchValue) {
		//1。定义3个变量 min,max,mid
		int min = 0;
		int max = arr.length-1;
		//2.判断条件：如果min > max说明查找结束
		while(min<max) {
			int mid = (min + max)/2;
			if(arr[mid] == searchValue)return min +1;
			else if(arr[mid] > searchValue) {
					//3。中间值大于寻找的值，说明要寻找的只在左边，max需要移动
				
				max = mid-1;
			}else {
				min = mid +1;
			}
		}
		return -1;
	}
	@Test
	public void testMain() {
		int [] arr = {1,2,3,4,5,6,7};
		int binarySearch = binarySearch(arr, 6);
		System.out.println(binarySearch);
	}
}
