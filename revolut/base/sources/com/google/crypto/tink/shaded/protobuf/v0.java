package com.google.crypto.tink.shaded.protobuf;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f49418a;

    static {
        char[] cArr = new char[80];
        f49418a = cArr;
        Arrays.fill(cArr, zsc.p.SPACE_CHAR);
    }

    public static void a(int i, StringBuilder sb6) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb6.append(f49418a, 0, i2);
            i -= i2;
        }
    }

    public static void b(StringBuilder sb6, int i, String str, Object obj2) {
        if (obj2 instanceof List) {
            Iterator it8 = ((List) obj2).iterator();
            while (it8.hasNext()) {
                b(sb6, i, str, it8.next());
            }
            return;
        }
        if (obj2 instanceof Map) {
            Iterator it9 = ((Map) obj2).entrySet().iterator();
            while (it9.hasNext()) {
                b(sb6, i, str, (Map.Entry) it9.next());
            }
            return;
        }
        sb6.append('\n');
        a(i, sb6);
        if (!str.isEmpty()) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb9.append("_");
                }
                sb9.append(Character.toLowerCase(cCharAt));
            }
            str = sb9.toString();
        }
        sb6.append(str);
        if (obj2 instanceof String) {
            sb6.append(": \"");
            i iVar = j.f49370b;
            sb6.append(pyd.c.l(new i(((String) obj2).getBytes(g0.f49364a))));
            sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj2 instanceof j) {
            sb6.append(": \"");
            sb6.append(pyd.c.l((j) obj2));
            sb6.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj2 instanceof b0) {
            sb6.append(" {");
            c((b0) obj2, sb6, i + 2);
            sb6.append("\n");
            a(i, sb6);
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
        int i3 = i + 2;
        b(sb6, i3, "key", entry.getKey());
        b(sb6, i3, "value", entry.getValue());
        sb6.append("\n");
        a(i, sb6);
        sb6.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(com.google.crypto.tink.shaded.protobuf.b0 r21, java.lang.StringBuilder r22, int r23) {
        /*
            Method dump skipped, instruction units count: 546
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.v0.c(com.google.crypto.tink.shaded.protobuf.b0, java.lang.StringBuilder, int):void");
    }
}
