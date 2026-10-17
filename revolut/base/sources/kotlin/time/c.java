package kotlin.time;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlin.text.f0;
import kotlin.time.b;

/* JADX INFO: loaded from: classes13.dex */
public abstract class c {
    public static final long a(String str) {
        pkm.e eVar;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        b.INSTANCE.getClass();
        char cCharAt2 = str.charAt(0);
        int i = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z = i > 0 && d0.r0(CoreConstants.DASH_CHAR, str);
        if (length <= i) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i) != 'P') {
            throw new IllegalArgumentException();
        }
        int i2 = i + 1;
        if (i2 == length) {
            throw new IllegalArgumentException();
        }
        pkm.e eVar2 = null;
        long jL = 0;
        boolean z3 = false;
        while (i2 < length) {
            if (str.charAt(i2) != 'T') {
                int i3 = i2;
                while (i3 < str.length() && (('0' <= (cCharAt = str.charAt(i3)) && cCharAt < ':') || d0.K("+-.", cCharAt))) {
                    i3++;
                }
                String strSubstring = str.substring(i2, i3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i2;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i5 = length2 + 1;
                if (z3) {
                    if (cCharAt3 == 'H') {
                        eVar = pkm.e.HOURS;
                    } else if (cCharAt3 == 'M') {
                        eVar = pkm.e.MINUTES;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException(com.google.android.gms.internal.mlkit_vision_face.a.j(cCharAt3, "Invalid duration ISO time unit: "));
                        }
                        eVar = pkm.e.SECONDS;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException(com.google.android.gms.internal.mlkit_vision_face.a.j(cCharAt3, "Invalid or unsupported duration ISO non-time unit: "));
                    }
                    eVar = pkm.e.DAYS;
                }
                if (eVar2 != null && eVar2.compareTo(eVar) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iS = d0.S(strSubstring, CoreConstants.DOT, 0, 6);
                if (eVar != pkm.e.SECONDS || iS <= 0) {
                    jL = b.l(jL, h(e(strSubstring), eVar));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iS);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                    long jL2 = b.l(jL, h(e(strSubstring2), eVar));
                    String strSubstring3 = strSubstring.substring(iS);
                    Intrinsics.checkNotNullExpressionValue(strSubstring3, "substring(...)");
                    jL = b.l(jL2, f(Double.parseDouble(strSubstring3), eVar));
                }
                eVar2 = eVar;
                i2 = i5;
            } else {
                if (z3 || (i2 = i2 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z3 = true;
            }
        }
        return z ? b.p(jL) : jL;
    }

    public static final long b(long j2) {
        long j3 = (j2 << 1) + 1;
        b.Companion companion = b.INSTANCE;
        int i = pkm.d.f237215a;
        return j3;
    }

    public static final long c(long j2) {
        return (-4611686018426L > j2 || j2 >= 4611686018427L) ? b(kotlin.ranges.f.i(j2, -4611686018427387903L, 4611686018427387903L)) : d(j2 * ((long) 1000000));
    }

    public static final long d(long j2) {
        long j3 = j2 << 1;
        b.Companion companion = b.INSTANCE;
        int i = pkm.d.f237215a;
        return j3;
    }

    public static final long e(String str) {
        char cCharAt;
        int length = str.length();
        int i = (length <= 0 || !d0.K("+-", str.charAt(0))) ? 0 : 1;
        if (length - i > 16) {
            int i2 = i;
            while (true) {
                if (i < length) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 == '0') {
                        if (i2 == i) {
                            i2++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i++;
                } else if (length - i2 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!a0.H(str, "+", false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(f0.N0(1, str));
    }

    public static final long f(double d, pkm.e unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        double dA = pkm.f.a(d, unit, pkm.e.NANOSECONDS);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jD = rim.d.d(dA);
        return (-4611686018426999999L > jD || jD >= 4611686018427000000L) ? c(rim.d.d(pkm.f.a(d, unit, pkm.e.MILLISECONDS))) : d(jD);
    }

    public static final long g(int i, pkm.e unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return unit.compareTo(pkm.e.SECONDS) <= 0 ? d(pkm.f.c(i, unit, pkm.e.NANOSECONDS)) : h(i, unit);
    }

    public static final long h(long j2, pkm.e unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        pkm.e eVar = pkm.e.NANOSECONDS;
        long jC = pkm.f.c(4611686018426999999L, eVar, unit);
        return ((-jC) > j2 || j2 > jC) ? b(kotlin.ranges.f.i(pkm.f.b(j2, unit, pkm.e.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : d(pkm.f.c(j2, unit, eVar));
    }
}
