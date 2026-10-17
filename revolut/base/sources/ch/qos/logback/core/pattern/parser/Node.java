package ch.qos.logback.core.pattern.parser;

/* JADX INFO: loaded from: classes.dex */
public class Node {
    static final int COMPOSITE_KEYWORD = 2;
    static final int LITERAL = 0;
    static final int SIMPLE_KEYWORD = 1;
    Node next;
    final int type;
    final Object value;

    public Node(int i) {
        this(i, null);
    }

    public boolean equals(Object obj2) {
        Object obj3;
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Node)) {
            return false;
        }
        Node node = (Node) obj2;
        if (this.type == node.type && ((obj3 = this.value) == null ? node.value == null : obj3.equals(node.value))) {
            Node node2 = this.next;
            Node node3 = node.next;
            if (node2 == null ? node3 == null : node2.equals(node3)) {
                return true;
            }
        }
        return false;
    }

    public Node getNext() {
        return this.next;
    }

    public int getType() {
        return this.type;
    }

    public Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int i = this.type * 31;
        Object obj2 = this.value;
        return i + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String printNext() {
        if (this.next == null) {
            return "";
        }
        return " -> " + this.next;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public String toString() {
        String string;
        StringBuffer stringBuffer = new StringBuffer();
        if (this.type != 0) {
            string = super.toString();
        } else {
            string = "LITERAL(" + this.value + ")";
        }
        stringBuffer.append(string);
        stringBuffer.append(printNext());
        return stringBuffer.toString();
    }

    public Node(int i, Object obj2) {
        this.type = i;
        this.value = obj2;
    }
}
