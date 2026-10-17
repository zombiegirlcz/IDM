package kotlin.text;

import com.google.common.primitives.UnsignedBytes;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import yhm.w;

/* JADX INFO: loaded from: classes14.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f187902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f187903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long[] f187904c;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        f187902a = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        f187903b = iArr2;
        int[] iArr3 = new int[256];
        for (int i5 = 0; i5 < 256; i5++) {
            iArr3[i5] = -1;
        }
        int i6 = 0;
        int i21 = 0;
        while (i6 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i6)] = i21;
            i6++;
            i21++;
        }
        int i22 = 0;
        int i32 = 0;
        while (i22 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i22)] = i32;
            i22++;
            i32++;
        }
        long[] jArr = new long[256];
        for (int i33 = 0; i33 < 256; i33++) {
            jArr[i33] = -1;
        }
        int i43 = 0;
        int i59 = 0;
        while (i43 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i43)] = i59;
            i43++;
            i59++;
        }
        int i66 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i66;
            i++;
            i66++;
        }
        f187904c = jArr;
    }

    public static final int a(long j2) {
        if (0 <= j2 && j2 <= 2147483647L) {
            return (int) j2;
        }
        StringBuilder sb6 = new StringBuilder("The resulting string length is too big: ");
        w.Companion companion = yhm.w.INSTANCE;
        sb6.append((Object) zi0.c.d0(10, j2));
        throw new IllegalArgumentException(sb6.toString());
    }

    public static final void b(int i, int i2, String str) {
        int i3 = i2 - i;
        if (i3 < 1) {
            String strSubstring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            throw new NumberFormatException("Expected at least 1 hexadecimal digits at index " + i + ", but was \"" + strSubstring + "\" of length " + i3);
        }
        if (i3 > 16) {
            int i5 = (i3 + i) - 16;
            while (i < i5) {
                if (str.charAt(i) != '0') {
                    StringBuilder sbW = a0.d.w(i, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    sbW.append(str.charAt(i));
                    sbW.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbW.toString());
                }
                i++;
            }
        }
    }

    public static final int c(byte[] bArr, int i, int[] iArr, char[] cArr, int i2) {
        int i3 = iArr[bArr[i] & UnsignedBytes.MAX_VALUE];
        cArr[i2] = (char) (i3 >> 8);
        cArr[i2 + 1] = (char) (i3 & 255);
        return i2 + 2;
    }

    public static long d(int i, int i2, String str) {
        k.Companion.getClass();
        k format = k.d;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        a.Companion companion = kotlin.collections.a.INSTANCE;
        int length = str.length();
        companion.getClass();
        a.Companion.a(i, i2, length);
        if (format.f187912c.f187909a) {
            b(i, i2, str);
            return e(i, i2, str);
        }
        if (i2 - i > 0) {
            b(i, i2, str);
            return e(i, i2, str);
        }
        String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException(j6.a.q("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ", strSubstring));
    }

    public static final long e(int i, int i2, String str) {
        long j2 = 0;
        while (i < i2) {
            long j3 = j2 << 4;
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') == 0) {
                long j5 = f187904c[cCharAt];
                if (j5 >= 0) {
                    j2 = j3 | j5;
                    i++;
                }
            }
            StringBuilder sbW = a0.d.w(i, "Expected a hexadecimal digit at index ", ", but was ");
            sbW.append(str.charAt(i));
            throw new NumberFormatException(sbW.toString());
        }
        return j2;
    }

    public static final int f(String str, char[] cArr, int i) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                str.getChars(0, str.length(), cArr, i);
            } else {
                cArr[i] = str.charAt(0);
            }
        }
        return str.length() + i;
    }

    public static String g(byte[] bArr) {
        k.Companion.getClass();
        k format = k.d;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        int length = bArr.length;
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        a.Companion companion = kotlin.collections.a.INSTANCE;
        int length2 = bArr.length;
        companion.getClass();
        a.Companion.a(0, length, length2);
        if (length == 0) {
            return "";
        }
        int[] iArr = format.f187910a ? f187903b : f187902a;
        g gVar = format.f187911b;
        if (gVar.f187906a) {
            if (gVar.f187907b) {
                char[] cArr = new char[a(((long) length) * 2)];
                int iC = 0;
                for (int i = 0; i < length; i++) {
                    iC = c(bArr, i, iArr, cArr, iC);
                }
                return a0.r(cArr);
            }
            if (length <= 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            long j2 = 0;
            char[] cArr2 = new char[a((((long) length) * (((2 + j2) + j2) + j2)) - j2)];
            int iF = f("", cArr2, c(bArr, 0, iArr, cArr2, f("", cArr2, 0)));
            for (int i2 = 1; i2 < length; i2++) {
                iF = f("", cArr2, c(bArr, i2, iArr, cArr2, f("", cArr2, f("", cArr2, iF))));
            }
            return a0.r(cArr2);
        }
        if (length <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i3 = length - 1;
        int i5 = i3 / Integer.MAX_VALUE;
        int i6 = length % Integer.MAX_VALUE;
        if (i6 == 0) {
            i6 = Integer.MAX_VALUE;
        }
        int i21 = (i6 - 1) / Integer.MAX_VALUE;
        long j3 = 0;
        int iA = a(((2 + j3 + j3) * ((long) length)) + (((long) ((i3 - i5) - i21)) * j3) + (((long) i21) * ((long) 2)) + ((long) i5));
        char[] cArr3 = new char[iA];
        int iF2 = 0;
        int i22 = 0;
        int i32 = 0;
        for (int i33 = 0; i33 < length; i33++) {
            if (i22 == Integer.MAX_VALUE) {
                cArr3[iF2] = '\n';
                i32 = 0;
                iF2++;
                i22 = 0;
            } else if (i32 == Integer.MAX_VALUE) {
                iF2 = f("  ", cArr3, iF2);
                i32 = 0;
            }
            if (i32 != 0) {
                iF2 = f("", cArr3, iF2);
            }
            iF2 = f("", cArr3, c(bArr, i33, iArr, cArr3, f("", cArr3, iF2)));
            i32++;
            i22++;
        }
        if (iF2 == iA) {
            return a0.r(cArr3);
        }
        throw new IllegalStateException("Check failed.");
    }
}
