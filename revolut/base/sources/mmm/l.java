package mmm;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes13.dex */
public final class l {
    public static m a(String str) {
        int i;
        char cCharAt;
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bArr = a.f207244a;
        Intrinsics.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i2];
        int i3 = 0;
        int i5 = 0;
        int i6 = 0;
        int i21 = 0;
        while (true) {
            if (i3 < length) {
                char cCharAt2 = str.charAt(i3);
                if ('A' <= cCharAt2 && cCharAt2 < '[') {
                    i = cCharAt2 - 'A';
                } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                    i = cCharAt2 - 'G';
                } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                    i = cCharAt2 + 4;
                } else if (cCharAt2 != '+' && cCharAt2 != '-') {
                    if (cCharAt2 != '/' && cCharAt2 != '_') {
                        if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                            break;
                        }
                        i3++;
                    } else {
                        i = 63;
                    }
                } else {
                    i = 62;
                }
                i6 = (i6 << 6) | i;
                i5++;
                if (i5 % 4 == 0) {
                    bArrCopyOf[i21] = (byte) (i6 >> 16);
                    int i22 = i21 + 2;
                    bArrCopyOf[i21 + 1] = (byte) (i6 >> 8);
                    i21 += 3;
                    bArrCopyOf[i22] = (byte) i6;
                }
                i3++;
            } else {
                int i32 = i5 % 4;
                if (i32 != 1) {
                    if (i32 == 2) {
                        bArrCopyOf[i21] = (byte) ((i6 << 12) >> 16);
                        i21++;
                    } else if (i32 == 3) {
                        int i33 = i6 << 6;
                        int i43 = i21 + 1;
                        bArrCopyOf[i21] = (byte) (i33 >> 16);
                        i21 += 2;
                        bArrCopyOf[i43] = (byte) (i33 >> 8);
                    }
                    if (i21 != i2) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i21);
                        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                    }
                }
            }
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new m(bArrCopyOf);
        }
        return null;
    }

    public static m b(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (nmm.o.a(str.charAt(i2 + 1)) + (nmm.o.a(str.charAt(i2)) << 4));
        }
        return new m(bArr);
    }

    public static m c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        m mVar = new m(bytes);
        mVar.f207287c = str;
        return mVar;
    }

    public static m d(int i, byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        if (i == -1234567890) {
            i = bArr.length;
        }
        b.b(bArr.length, 0, i);
        return new m(zhm.p.m(bArr, 0, i));
    }

    public static m e(byte... data) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return new m(bArrCopyOf);
    }

    public static /* synthetic */ m f(l lVar, byte[] bArr) {
        lVar.getClass();
        return d(-1234567890, bArr);
    }
}
