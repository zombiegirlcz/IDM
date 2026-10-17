package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes17.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class CharEscaper extends Escaper {
    private static final int DEST_PAD_MULTIPLIER = 2;

    private static char[] growBuffer(char[] cArr, int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }

    @Override // com.google.common.escape.Escaper
    public String escape(String str) {
        Preconditions.checkNotNull(str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (escape(str.charAt(i)) != null) {
                return escapeSlow(str, i);
            }
        }
        return str;
    }

    public abstract char[] escape(char c2);

    public final String escapeSlow(String str, int i) {
        int length = str.length();
        char[] cArrCharBufferFromThreadLocal = Platform.charBufferFromThreadLocal();
        int length2 = cArrCharBufferFromThreadLocal.length;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            char[] cArrEscape = escape(str.charAt(i));
            if (cArrEscape != null) {
                int length3 = cArrEscape.length;
                int i5 = i - i2;
                int i6 = i3 + i5;
                int i21 = i6 + length3;
                if (length2 < i21) {
                    length2 = v0.a.a(length, i, 2, i21);
                    cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, i3, length2);
                }
                if (i5 > 0) {
                    str.getChars(i2, i, cArrCharBufferFromThreadLocal, i3);
                    i3 = i6;
                }
                if (length3 > 0) {
                    System.arraycopy(cArrEscape, 0, cArrCharBufferFromThreadLocal, i3, length3);
                    i3 += length3;
                }
                i2 = i + 1;
            }
            i++;
        }
        int i22 = length - i2;
        if (i22 > 0) {
            int i32 = i22 + i3;
            if (length2 < i32) {
                cArrCharBufferFromThreadLocal = growBuffer(cArrCharBufferFromThreadLocal, i3, i32);
            }
            str.getChars(i2, length, cArrCharBufferFromThreadLocal, i3);
            i3 = i32;
        }
        return new String(cArrCharBufferFromThreadLocal, 0, i3);
    }
}
