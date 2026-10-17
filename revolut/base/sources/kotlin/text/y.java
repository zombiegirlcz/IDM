package kotlin.text;

import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class y extends x {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean h(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.y.h(java.lang.String):boolean");
    }

    public static BigDecimal i(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (h(str)) {
                return new BigDecimal(str);
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static BigInteger j(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length != 1) {
            for (int i = str.charAt(0) == '-' ? 1 : 0; i < length; i++) {
                if (Character.digit((int) str.charAt(i), 10) < 0) {
                    return null;
                }
            }
        } else if (Character.digit((int) str.charAt(0), 10) < 0) {
            return null;
        }
        return new BigInteger(str, CharsKt__CharJVMKt.checkRadix(10));
    }

    public static Double k(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (h(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
