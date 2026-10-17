package ulm;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class g {
    public static String a(x0 url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        mmm.l lVar = mmm.m.Companion;
        String str = url2.i;
        lVar.getClass();
        return mmm.l.c(str).c("MD5").e();
    }

    public static int b(mmm.l0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            long jF = source.f();
            String strE = source.e(Long.MAX_VALUE);
            if (jF >= 0 && jF <= 2147483647L && strE.length() <= 0) {
                return (int) jF;
            }
            throw new IOException("expected an int but was \"" + jF + strE + CoreConstants.DOUBLE_QUOTE_CHAR);
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static Set c(u0 u0Var) {
        int size = u0Var.size();
        TreeSet treeSet = null;
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(ue8.c.l(u0Var, i))) {
                String strQ = ue8.c.q(u0Var, i);
                if (treeSet == null) {
                    kotlin.text.a0.A(kotlin.jvm.internal.t0.f186434a);
                    treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                Iterator it8 = kotlin.text.d0.m0(strQ, new char[]{CoreConstants.COMMA_CHAR}, 6).iterator();
                while (it8.hasNext()) {
                    treeSet.add(kotlin.text.d0.F0((String) it8.next()).toString());
                }
            }
        }
        return treeSet == null ? zhm.h0.f322473a : treeSet;
    }
}
