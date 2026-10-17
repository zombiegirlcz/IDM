package ch.qos.logback.core.subst;

import ch.qos.logback.core.spi.PropertyContainer;
import ch.qos.logback.core.spi.ScanException;
import ch.qos.logback.core.subst.Node;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Iterator;
import java.util.Stack;

/* JADX INFO: loaded from: classes.dex */
public class NodeToStringTransformer {
    final Node node;
    final PropertyContainer propertyContainer0;
    final PropertyContainer propertyContainer1;

    /* JADX INFO: renamed from: ch.qos.logback.core.subst.NodeToStringTransformer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ch$qos$logback$core$subst$Node$Type;

        static {
            int[] iArr = new int[Node.Type.values().length];
            $SwitchMap$ch$qos$logback$core$subst$Node$Type = iArr;
            try {
                iArr[Node.Type.LITERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ch$qos$logback$core$subst$Node$Type[Node.Type.VARIABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public NodeToStringTransformer(Node node, PropertyContainer propertyContainer) {
        this(node, propertyContainer, null);
    }

    private void compileNode(Node node, StringBuilder sb6, Stack<Node> stack) throws ScanException {
        while (node != null) {
            int i = AnonymousClass1.$SwitchMap$ch$qos$logback$core$subst$Node$Type[node.type.ordinal()];
            if (i == 1) {
                handleLiteral(node, sb6);
            } else if (i == 2) {
                handleVariable(node, sb6, stack);
            }
            node = node.next;
        }
    }

    private String constructRecursionErrorMessage(Stack<Node> stack) {
        StringBuilder sb6 = new StringBuilder("Circular variable reference detected while parsing input [");
        for (Node node : stack) {
            sb6.append("${");
            sb6.append(variableNodeValue(node));
            sb6.append("}");
            if (stack.lastElement() != node) {
                sb6.append(" --> ");
            }
        }
        sb6.append("]");
        return sb6.toString();
    }

    private boolean equalNodes(Node node, Node node2) {
        Node.Type type = node.type;
        if (type != null && !type.equals(node2.type)) {
            return false;
        }
        Object obj2 = node.payload;
        if (obj2 != null && !obj2.equals(node2.payload)) {
            return false;
        }
        Object obj3 = node.defaultPart;
        return obj3 == null || obj3.equals(node2.defaultPart);
    }

    private void handleLiteral(Node node, StringBuilder sb6) {
        sb6.append((String) node.payload);
    }

    private void handleVariable(Node node, StringBuilder sb6, Stack<Node> stack) throws ScanException {
        boolean zHaveVisitedNodeAlready = haveVisitedNodeAlready(node, stack);
        stack.push(node);
        if (zHaveVisitedNodeAlready) {
            throw new IllegalArgumentException(constructRecursionErrorMessage(stack));
        }
        StringBuilder sb9 = new StringBuilder();
        compileNode((Node) node.payload, sb9, stack);
        String string = sb9.toString();
        String strLookupKey = lookupKey(string);
        if (strLookupKey != null) {
            compileNode(tokenizeAndParseString(strLookupKey), sb6, stack);
            stack.pop();
            return;
        }
        Object obj2 = node.defaultPart;
        if (obj2 != null) {
            StringBuilder sb10 = new StringBuilder();
            compileNode((Node) obj2, sb10, stack);
            stack.pop();
            sb6.append(sb10.toString());
            return;
        }
        sb6.append(string + "_IS_UNDEFINED");
        stack.pop();
    }

    private boolean haveVisitedNodeAlready(Node node, Stack<Node> stack) {
        Iterator<Node> it8 = stack.iterator();
        while (it8.hasNext()) {
            if (equalNodes(node, it8.next())) {
                return true;
            }
        }
        return false;
    }

    private String lookupKey(String str) {
        String property;
        String property2 = this.propertyContainer0.getProperty(str);
        if (property2 != null) {
            return property2;
        }
        PropertyContainer propertyContainer = this.propertyContainer1;
        if (propertyContainer != null && (property = propertyContainer.getProperty(str)) != null) {
            return property;
        }
        String systemProperty = OptionHelper.getSystemProperty(str, null);
        if (systemProperty != null) {
            return systemProperty;
        }
        String env = OptionHelper.getEnv(str);
        if (env != null) {
            return env;
        }
        return null;
    }

    public static String substituteVariable(String str, PropertyContainer propertyContainer, PropertyContainer propertyContainer2) throws ScanException {
        return new NodeToStringTransformer(tokenizeAndParseString(str), propertyContainer, propertyContainer2).transform();
    }

    private static Node tokenizeAndParseString(String str) throws ScanException {
        return new Parser(new Tokenizer(str).tokenize()).parse();
    }

    private String variableNodeValue(Node node) {
        return (String) ((Node) node.payload).payload;
    }

    public String transform() throws ScanException {
        StringBuilder sb6 = new StringBuilder();
        compileNode(this.node, sb6, new Stack<>());
        return sb6.toString();
    }

    public NodeToStringTransformer(Node node, PropertyContainer propertyContainer, PropertyContainer propertyContainer2) {
        this.node = node;
        this.propertyContainer0 = propertyContainer;
        this.propertyContainer1 = propertyContainer2;
    }
}
