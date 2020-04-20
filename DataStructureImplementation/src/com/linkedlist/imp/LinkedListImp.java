package com.linkedlist.imp;

class Node {

	int data;
	Node next;

}

public class LinkedListImp {
	Node head;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (head == null) {
			head = node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;
		}

	}

	public void show() {
		Node node = head;

		while (node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}

	public static void main(String[] args) {
		LinkedListImp list = new LinkedListImp();
		list.insert(5);
		list.insert(10);
		list.insert(15);
		list.insert(20);

		System.out.println("Inserted data in linkedlist");

		list.show();
	}

}
