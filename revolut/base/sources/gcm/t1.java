package gcm;

import com.google.common.base.Charsets;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public abstract class t1 extends b {
    public static final ecm.k1 v = ecm.o0.a(":status", new m1(1));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ecm.g2 f142878r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ecm.m1 f142879s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Charset f142880t;
    public boolean u;

    public static Charset h(ecm.m1 m1Var) {
        String str = (String) m1Var.c(p1.i);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return Charsets.UTF_8;
    }

    public static ecm.g2 i(ecm.m1 m1Var) {
        char cCharAt;
        Integer num = (Integer) m1Var.c(v);
        if (num == null) {
            return ecm.g2.f124806l.g("Missing HTTP status code");
        }
        String str = (String) m1Var.c(p1.i);
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (cCharAt = lowerCase.charAt(16)) == '+' || cCharAt == ';')) {
                return null;
            }
        }
        return p1.g(num.intValue()).a("invalid content-type: " + str);
    }
}
