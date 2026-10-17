package jmm;

import com.google.common.primitives.UnsignedBytes;
import java.io.EOFException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import mmm.h;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f176637a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str, int i, boolean z, String encodeSet, int i2, int i3) {
        int i5 = (i3 & 1) != 0 ? 0 : i;
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        int i6 = i2;
        boolean z3 = (i3 & 8) != 0 ? false : z;
        boolean z4 = (i3 & 16) == 0;
        boolean z6 = (i3 & 32) == 0;
        boolean z11 = (i3 & 64) == 0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        return b(str, i5, i6, encodeSet, z3, z4, z6, z11, 128);
    }

    public static String b(String input, int i, int i2, String encodeSet, boolean z, boolean z3, boolean z4, boolean z6, int i3) throws EOFException {
        int i5 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? input.length() : i2;
        boolean z11 = (i3 & 8) != 0 ? false : z;
        boolean z12 = (i3 & 16) != 0 ? false : z3;
        boolean z29 = (i3 & 64) == 0 ? z6 : false;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        int iCharCount = i5;
        while (iCharCount < length) {
            int iCodePointAt = input.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z29) || d0.K(encodeSet, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z11 || (z12 && !c(iCharCount, length, input)))) || (iCodePointAt == 43 && z4)))) {
                h hVar = new h();
                hVar.C(i5, iCharCount, input);
                Intrinsics.checkNotNullParameter(hVar, "<this>");
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
                h hVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = input.codePointAt(iCharCount);
                    if (z11 && (iCodePointAt2 == 9 || iCodePointAt2 == 10 || iCodePointAt2 == 12 || iCodePointAt2 == 13)) {
                        Unit unit = Unit.f186387a;
                    } else {
                        if (iCodePointAt2 == 32 && encodeSet == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            hVar.D("+");
                        } else if (iCodePointAt2 == 43 && z4) {
                            hVar.D(z11 ? "+" : "%2B");
                        } else {
                            if (iCodePointAt2 >= 32 && iCodePointAt2 != 127) {
                                if ((iCodePointAt2 < 128 || z29) && !d0.K(encodeSet, (char) iCodePointAt2) && (iCodePointAt2 != 37 || (z11 && (!z12 || c(iCharCount, length, input))))) {
                                    hVar.E(iCodePointAt2);
                                }
                                iCharCount += Character.charCount(iCodePointAt2);
                            }
                            if (hVar2 == null) {
                                hVar2 = new h();
                            }
                            hVar2.E(iCodePointAt2);
                            while (!hVar2.J()) {
                                byte b4 = hVar2.readByte();
                                int i6 = b4 & UnsignedBytes.MAX_VALUE;
                                hVar.w(37);
                                char[] cArr = f176637a;
                                hVar.w(cArr[(i6 >> 4) & 15]);
                                hVar.w(cArr[b4 & 15]);
                            }
                            Unit unit2 = Unit.f186387a;
                            iCharCount += Character.charCount(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return hVar.q();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = input.substring(i5, length);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean c(int i, int i2, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && vlm.h.w(str.charAt(i + 1)) != -1 && vlm.h.w(str.charAt(i3)) != -1;
    }

    public static String d(int i, int i2, int i3, String encoded) {
        int i5;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = encoded.length();
        }
        boolean z = (i3 & 4) == 0;
        Intrinsics.checkNotNullParameter(encoded, "<this>");
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = encoded.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                h hVar = new h();
                hVar.C(i, iCharCount, encoded);
                Intrinsics.checkNotNullParameter(hVar, "<this>");
                Intrinsics.checkNotNullParameter(encoded, "encoded");
                while (iCharCount < i2) {
                    int iCodePointAt = encoded.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i5 = iCharCount + 2) < i2) {
                        int iW = vlm.h.w(encoded.charAt(iCharCount + 1));
                        int iW2 = vlm.h.w(encoded.charAt(i5));
                        if (iW == -1 || iW2 == -1) {
                            hVar.E(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            hVar.w((iW << 4) + iW2);
                            iCharCount = Character.charCount(iCodePointAt) + i5;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        hVar.w(32);
                        iCharCount++;
                    } else {
                        hVar.E(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return hVar.q();
            }
            iCharCount++;
        }
        String strSubstring = encoded.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }
}
