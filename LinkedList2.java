package com.Bridgelabz;

import java.util.Scanner;

public class LinkedList2 {

    public static ListNode head;

    public static class ListNode {
        ListNode next;
        int data;

        public void Node(int data) {

            ListNode node = new ListNode();
            node.data = data;
            node.next = null;

            if (head == null) {
                head = node;
            } else {
                ListNode n = head;
                while (n.next != null) {
                    n = n.next;
                }
                n.next = node;
            }
        }
        }


        public void display() {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.data + "-->");
                current = current.next;
            }
        }

        public boolean search(int searchKey){
            ListNode temp = head;
            while( temp != null ){
                if(temp.data == searchKey){
                    return true;
                }
                temp = temp.next;
            }
                return false;
        }


        public static void main(String[] args) {

            ListNode list = new ListNode();
            list.Node(100);
            list.Node(300);
            list.Node(400);

            LinkedList2 show = new LinkedList2();
            show.display();

            if (show.search(500)) {
                System.out.print("search key is found");
            } else {
                System.out.print("search key is not found");
            }

        }
    }

