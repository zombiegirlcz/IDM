package fr.devnied.bitlib;

import a0.d;
import java.math.BigInteger;
import net.sf.scuba.smartcards.ISO7816;

/* JADX INFO: loaded from: classes20.dex */
public final class BytesUtils {
    private static final int CHAR_DIGIT_SEVEN = 55;
    private static final int CHAR_DIGIT_ZERO = 48;
    private static final char CHAR_SPACE = ' ';
    private static final int HEXA = 16;
    private static final int LEFT_MASK = 240;
    private static final int MAX_BIT_INTEGER = 31;
    private static final int RIGHT_MASK = 15;

    private BytesUtils() {
    }

    public static int byteArrayToInt(byte[] bArr) {
        if (bArr != null) {
            return byteArrayToInt(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("Parameter 'byteArray' cannot be null");
    }

    public static String bytesToString(byte[] bArr) {
        return formatByte(bArr, true, false);
    }

    public static String bytesToStringNoSpace(byte b4) {
        return formatByte(new byte[]{b4}, false, false);
    }

    private static String formatByte(byte[] bArr, boolean z, boolean z3) {
        int i;
        if (bArr == null) {
            return "";
        }
        if (z3) {
            i = 0;
            while (i < bArr.length && bArr[i] == 0) {
                i++;
            }
        } else {
            i = 0;
        }
        if (i >= bArr.length) {
            return "";
        }
        int length = (bArr.length - i) * (z ? 3 : 2);
        char[] cArr = new char[length];
        int i2 = 0;
        while (i < bArr.length) {
            byte b4 = bArr[i];
            byte b5 = (byte) ((b4 & 240) >> 4);
            cArr[i2] = (char) (b5 > 9 ? b5 + 55 : b5 + ISO7816.INS_DECREASE);
            byte b7 = (byte) (b4 & 15);
            int i3 = i2 + 1;
            cArr[i3] = (char) (b7 > 9 ? b7 + 55 : b7 + ISO7816.INS_DECREASE);
            if (z) {
                i3 = i2 + 2;
                cArr[i3] = ' ';
            }
            i++;
            i2 = i3 + 1;
        }
        return z ? new String(cArr, 0, length - 1) : new String(cArr);
    }

    public static byte[] fromString(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Argument can't be null");
        }
        StringBuilder sb6 = new StringBuilder(str);
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < sb6.length(); i3++) {
            if (!Character.isWhitespace(sb6.charAt(i3))) {
                sb6.setCharAt(i2, sb6.charAt(i3));
                i2++;
            }
        }
        sb6.delete(i2, sb6.length());
        if (sb6.length() % 2 != 0) {
            throw new IllegalArgumentException("Hex binary needs to be even-length :".concat(str));
        }
        byte[] bArr = new byte[sb6.length() / 2];
        int i5 = 0;
        while (i < sb6.length()) {
            bArr[i5] = (byte) (Character.digit(sb6.charAt(i + 1), 16) + (Character.digit(sb6.charAt(i), 16) << 4));
            i += 2;
            i5++;
        }
        return bArr;
    }

    public static boolean matchBitByBitIndex(int i, int i2) {
        if (i2 < 0 || i2 > 31) {
            throw new IllegalArgumentException(d.n("parameter 'pBitIndex' must be between 0 and 31. pBitIndex=", i2));
        }
        return (i & (1 << i2)) != 0;
    }

    public static byte setBit(byte b4, int i, boolean z) {
        if (i < 0 || i > 7) {
            throw new IllegalArgumentException(d.n("parameter 'pBitIndex' must be between 0 and 7. pBitIndex=", i));
        }
        return (byte) (z ? b4 | (1 << i) : b4 & (~(1 << i)));
    }

    public static String toBinary(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        StringBuilder sb6 = new StringBuilder(new BigInteger(bytesToStringNoSpace(bArr), 16).toString(2));
        for (int length = sb6.length(); length < bArr.length * 8; length++) {
            sb6.insert(0, 0);
        }
        return sb6.toString();
    }

    public static byte[] toByteArray(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static String bytesToString(byte[] bArr, boolean z) {
        return formatByte(bArr, true, z);
    }

    public static String bytesToStringNoSpace(byte[] bArr) {
        return formatByte(bArr, false, false);
    }

    public static int byteArrayToInt(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("Parameter 'byteArray' cannot be null");
        }
        if (i2 > 0 && i2 <= 4) {
            if (i < 0 || bArr.length < i + i2) {
                throw new IllegalArgumentException("Length or startPos not valid");
            }
            int i3 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                i3 += (bArr[i + i5] & 255) << (((i2 - i5) - 1) * 8);
            }
            return i3;
        }
        throw new IllegalArgumentException(d.n("Length must be between 1 and 4. Length = ", i2));
    }

    public static String bytesToStringNoSpace(byte[] bArr, boolean z) {
        return formatByte(bArr, false, z);
    }
}
