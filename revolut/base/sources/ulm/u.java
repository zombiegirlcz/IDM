package ulm;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class u {
    public static final v a(u uVar, String str) {
        v vVar = new v(str);
        v.f281144c.put(str, vVar);
        return vVar;
    }

    public static String c(String str) {
        if (kotlin.text.a0.H(str, "TLS_", false)) {
            StringBuilder sb6 = new StringBuilder("SSL_");
            String strSubstring = str.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sb6.append(strSubstring);
            return sb6.toString();
        }
        if (!kotlin.text.a0.H(str, "SSL_", false)) {
            return str;
        }
        StringBuilder sb9 = new StringBuilder("TLS_");
        String strSubstring2 = str.substring(4);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb9.append(strSubstring2);
        return sb9.toString();
    }

    public final synchronized v b(String javaName) {
        v vVar;
        try {
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            LinkedHashMap linkedHashMap = v.f281144c;
            vVar = (v) linkedHashMap.get(javaName);
            if (vVar == null) {
                vVar = (v) linkedHashMap.get(c(javaName));
                if (vVar == null) {
                    vVar = new v(javaName);
                }
                linkedHashMap.put(javaName, vVar);
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return vVar;
    }
}
