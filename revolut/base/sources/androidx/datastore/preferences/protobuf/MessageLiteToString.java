package androidx.datastore.preferences.protobuf;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v0.a;
import zsc.p;

/* JADX INFO: loaded from: classes15.dex */
abstract class MessageLiteToString {
    private static final char[] INDENT_BUFFER;

    static {
        char[] cArr = new char[80];
        INDENT_BUFFER = cArr;
        Arrays.fill(cArr, p.SPACE_CHAR);
    }

    private static void indent(int i, StringBuilder sb6) {
        while (i > 0) {
            char[] cArr = INDENT_BUFFER;
            int length = i > cArr.length ? cArr.length : i;
            sb6.append(cArr, 0, length);
            i -= length;
        }
    }

    private static boolean isDefaultValue(Object obj2) {
        return obj2 instanceof Boolean ? !((Boolean) obj2).booleanValue() : obj2 instanceof Integer ? ((Integer) obj2).intValue() == 0 : obj2 instanceof Float ? Float.floatToRawIntBits(((Float) obj2).floatValue()) == 0 : obj2 instanceof Double ? Double.doubleToRawLongBits(((Double) obj2).doubleValue()) == 0 : obj2 instanceof String ? obj2.equals("") : obj2 instanceof ByteString ? obj2.equals(ByteString.EMPTY) : obj2 instanceof MessageLite ? obj2 == ((MessageLite) obj2).getDefaultInstanceForType() : (obj2 instanceof Enum) && ((Enum) obj2).ordinal() == 0;
    }

    private static String pascalCaseToSnakeCase(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(Character.toLowerCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb6.append("_");
            }
            sb6.append(Character.toLowerCase(cCharAt));
        }
        return sb6.toString();
    }

    public static void printField(StringBuilder sb6, int i, String str, Object obj2) {
        if (obj2 instanceof List) {
            Iterator it8 = ((List) obj2).iterator();
            while (it8.hasNext()) {
                printField(sb6, i, str, it8.next());
            }
            return;
        }
        if (obj2 instanceof Map) {
            Iterator it9 = ((Map) obj2).entrySet().iterator();
            while (it9.hasNext()) {
                printField(sb6, i, str, (Map.Entry) it9.next());
            }
            return;
        }
        sb6.append('\n');
        indent(i, sb6);
        sb6.append(pascalCaseToSnakeCase(str));
        if (obj2 instanceof String) {
            sb6.append(": \"");
            sb6.append(TextFormatEscaper.escapeText((String) obj2));
            sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj2 instanceof ByteString) {
            sb6.append(": \"");
            sb6.append(TextFormatEscaper.escapeBytes((ByteString) obj2));
            sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj2 instanceof GeneratedMessageLite) {
            sb6.append(" {");
            reflectivePrintWithIndent((GeneratedMessageLite) obj2, sb6, i + 2);
            sb6.append("\n");
            indent(i, sb6);
            sb6.append("}");
            return;
        }
        if (!(obj2 instanceof Map.Entry)) {
            sb6.append(": ");
            sb6.append(obj2);
            return;
        }
        sb6.append(" {");
        Map.Entry entry = (Map.Entry) obj2;
        int i2 = i + 2;
        printField(sb6, i2, "key", entry.getKey());
        printField(sb6, i2, "value", entry.getValue());
        sb6.append("\n");
        indent(i, sb6);
        sb6.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void reflectivePrintWithIndent(androidx.datastore.preferences.protobuf.MessageLite r16, java.lang.StringBuilder r17, int r18) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.MessageLiteToString.reflectivePrintWithIndent(androidx.datastore.preferences.protobuf.MessageLite, java.lang.StringBuilder, int):void");
    }

    public static String toString(MessageLite messageLite, String str) {
        StringBuilder sbL = a.l("# ", str);
        reflectivePrintWithIndent(messageLite, sbL, 0);
        return sbL.toString();
    }
}
