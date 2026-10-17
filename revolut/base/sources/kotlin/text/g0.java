package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import yhm.u;
import yhm.w;

/* JADX INFO: loaded from: classes14.dex */
public abstract class g0 {
    public static final boolean a(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Intrinsics.k(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    public static fnc.s b(o oVar) {
        return new fnc.s(oVar);
    }

    public static final String c(int i, int i2) {
        return zi0.c.d0(CharsKt__CharJVMKt.checkRadix(i2), ((long) i) & BodyPartID.bodyIdMax);
    }

    public static final yhm.u d(String str) {
        int i;
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.k(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        u.Companion companion = yhm.u.INSTANCE;
        int iDivideUnsigned = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i3 = i2 * 10;
            int i5 = iDigit + i3;
            if (Integer.compareUnsigned(i5, i3) < 0) {
                return null;
            }
            i++;
            i2 = i5;
        }
        return new yhm.u(i2);
    }

    public static final yhm.w e(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.k(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j2 = 10;
        w.Companion companion = yhm.w.INSTANCE;
        long j3 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j3, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, j2);
                if (Long.compareUnsigned(j3, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j5 = j3 * j2;
            u.Companion companion2 = yhm.u.INSTANCE;
            long j16 = (((long) iDigit) & BodyPartID.bodyIdMax) + j5;
            if (Long.compareUnsigned(j16, j5) < 0) {
                return null;
            }
            i++;
            j3 = j16;
        }
        return new yhm.w(j3);
    }
}
