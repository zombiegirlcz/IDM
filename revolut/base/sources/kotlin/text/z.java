package kotlin.text;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class z extends y {
    public static final void l(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        throw new NumberFormatException(p.a.l(CoreConstants.SINGLE_QUOTE_CHAR, "Invalid number format: '", input));
    }

    public static Integer m(String str) {
        boolean z;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        int i5 = -2147483647;
        if (Intrinsics.k(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i5 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i6 = -59652323;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i3 < i6 && (i6 != -59652323 || i3 < (i6 = i5 / 10))) || (i2 = i3 * 10) < i5 + iDigit) {
                return null;
            }
            i3 = i2 - iDigit;
            i++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    public static Long n(String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        CharsKt__CharJVMKt.checkRadix(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j2 = -9223372036854775807L;
        if (Intrinsics.k(cCharAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j2 = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z = false;
        }
        long j3 = 0;
        long j5 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j3 < j5) {
                if (j5 != -256204778801521550L) {
                    return null;
                }
                j5 = j2 / ((long) 10);
                if (j3 < j5) {
                    return null;
                }
            }
            long j16 = j3 * ((long) 10);
            long j22 = iDigit;
            if (j16 < j2 + j22) {
                return null;
            }
            j3 = j16 - j22;
            i++;
        }
        return z ? Long.valueOf(j3) : Long.valueOf(-j3);
    }
}
