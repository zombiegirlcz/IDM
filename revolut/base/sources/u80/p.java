package u80;

import android.os.Build;
import java.math.BigInteger;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f278066a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f278067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Regex f278068c;

    static {
        f278067b = Build.VERSION.SDK_INT >= 29 ? "\uf010" : "AED";
        f278068c = new Regex("[^0-9]");
    }

    private p() {
    }

    public static long a(String str, String str2, qd0.b languageProvider, Integer num) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        BigInteger bigIntegerB = b(str, str2, languageProvider, num);
        Long lValueOf = null;
        if (bigIntegerB != null) {
            try {
                lValueOf = Long.valueOf(i26.l.q(bigIntegerB));
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            }
        }
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }

    public static BigInteger b(String str, String str2, qd0.b languageProvider, Integer num) {
        String strJ;
        int iP;
        String strB0;
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        if (str == null || str.length() == 0) {
            BigInteger ZERO = BigInteger.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            return ZERO;
        }
        Regex regex = f278068c;
        String strReplace = regex.replace(str, "");
        if (strReplace.length() == 0) {
            BigInteger ZERO2 = BigInteger.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
            return ZERO2;
        }
        char cK = oc.c.k(((s80.b) languageProvider).b());
        if (str2 != null) {
            xi0.b.Companion.getClass();
            strJ = cp5.d.J(xi0.a.a(str2));
        } else {
            strJ = null;
        }
        if (strJ != null && d0.S(strJ, cK, 0, 6) != -1) {
            str = a0.D(str, strJ, "", false);
        }
        if (d0.S(str, cK, 0, 6) != d0.X(str, cK, 0, 6)) {
            BigInteger ZERO3 = BigInteger.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO3, "ZERO");
            return ZERO3;
        }
        if (num != null) {
            iP = num.intValue();
        } else if (str2 != null) {
            xi0.b.Companion.getClass();
            iP = cp5.d.p(xi0.a.a(str2));
        } else {
            iP = 2;
        }
        if (d0.J(str, String.valueOf(cK), false)) {
            String strSubstring = str.substring(d0.S(str, cK, 0, 6) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            strB0 = d0.a0(regex.replace(strSubstring, ""), iP, '0');
            String strSubstring2 = str.substring(0, d0.S(str, cK, 0, 6));
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            strReplace = regex.replace(strSubstring2, "");
        } else {
            strB0 = d0.b0("", iP, '0');
        }
        try {
            return new BigInteger(strReplace + strB0);
        } catch (Throwable unused) {
            BigInteger bigInteger = BigInteger.ZERO;
            Intrinsics.h(bigInteger);
            return bigInteger;
        }
    }
}
