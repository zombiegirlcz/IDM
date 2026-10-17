package ch.qos.logback.core.subst;

import ch.qos.logback.core.CoreConstants;
import com.revolut.data.database.models.openbanking.d;
import v0.a;

/* JADX INFO: loaded from: classes.dex */
public class Node {
    Object defaultPart;
    Node next;
    Object payload;
    Type type;

    /* JADX INFO: renamed from: ch.qos.logback.core.subst.Node$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$subst$Node$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$ch$qos$logback$core$subst$Node$Type = iArr;
            try {
                iArr[Type.LITERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Node$Type[Type.VARIABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum Type {
        LITERAL,
        VARIABLE
    }

    public Node(Type type, Object obj2) {
        this.type = type;
        this.payload = obj2;
    }

    public void append(Node node) {
        if (node == null) {
            return;
        }
        Node node2 = this;
        while (true) {
            Node node3 = node2.next;
            if (node3 == null) {
                node2.next = node;
                return;
            }
            node2 = node3;
        }
    }

    public void dump() {
        System.out.print(toString());
        System.out.print(" -> ");
        Node node = this.next;
        if (node != null) {
            node.dump();
        } else {
            System.out.print(" null");
        }
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        Node node = (Node) obj2;
        if (this.type != node.type) {
            return false;
        }
        Object obj3 = this.payload;
        if (obj3 == null ? node.payload != null : !obj3.equals(node.payload)) {
            return false;
        }
        Object obj4 = this.defaultPart;
        if (obj4 == null ? node.defaultPart != null : !obj4.equals(node.defaultPart)) {
            return false;
        }
        Node node2 = this.next;
        Node node3 = node.next;
        return node2 == null ? node3 == null : node2.equals(node3);
    }

    public int hashCode() {
        Type type = this.type;
        int iHashCode = (type != null ? type.hashCode() : 0) * 31;
        Object obj2 = this.payload;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object obj3 = this.defaultPart;
        int iHashCode3 = (iHashCode2 + (obj3 != null ? obj3.hashCode() : 0)) * 31;
        Node node = this.next;
        return iHashCode3 + (node != null ? node.hashCode() : 0);
    }

    public void recursive(Node node, StringBuilder sb6) {
        while (node != null) {
            sb6.append(node.toString());
            sb6.append(" --> ");
            node = node.next;
        }
        sb6.append("null ");
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public String toString() {
        int i = AnonymousClass1.$SwitchMap$ch$qos$logback$core$subst$Node$Type[this.type.ordinal()];
        if (i == 1) {
            StringBuilder sb6 = new StringBuilder("Node{type=");
            sb6.append(this.type);
            sb6.append(", payload='");
            return d.t(sb6, this.payload, "'}");
        }
        if (i != 2) {
            return null;
        }
        StringBuilder sb9 = new StringBuilder();
        StringBuilder sb10 = new StringBuilder();
        Object obj2 = this.defaultPart;
        if (obj2 != null) {
            recursive((Node) obj2, sb10);
        }
        recursive((Node) this.payload, sb9);
        String string = "Node{type=" + this.type + ", payload='" + sb9.toString() + "'";
        if (this.defaultPart != null) {
            StringBuilder sbL = a.l(string, ", defaultPart=");
            sbL.append(sb10.toString());
            string = sbL.toString();
        }
        return string + CoreConstants.CURLY_RIGHT;
    }

    public Node(Type type, Object obj2, Object obj3) {
        this.type = type;
        this.payload = obj2;
        this.defaultPart = obj3;
    }
}
