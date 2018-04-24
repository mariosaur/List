
package de.ur.adp.linkedlist;


public class Node {

  private int content;
  private Node next;


  public Node(int content) {

    this.content = content;
  }

  /**
   * Get the Node's content
   *
   * @return the Node's content
   */
  public int getContent() {

    return this.content;
  }

  /**
   * Get the next Node
   *
   * @return the next Node
   */
  public Node getNextNode() {

    return this.next;
  }

  /**
   * Set the next Node
   *
   * @param nextNode
   *         the next Node
   */
  public void setNextNode(Node nextNode) {

    while (this.next != null) getNextNode();
    this.next = nextNode;
  }

  /**
   * Two Nodes are equals if
   * a) their content is the same and
   * b) they both have the same next node
   *
   * @param o
   *         another object which should be a Node
   * @return
   */
  @Override
  public boolean equals(Object o) {

    if(!(o instanceof  Node)) return false;
    if(this.getContent() != ((Node) o).content) return false;
    if(this.getNextNode() != ((Node) o).getNextNode()) return false;
    return true;
  }
}
