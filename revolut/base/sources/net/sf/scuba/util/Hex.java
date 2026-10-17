package net.sf.scuba.util;

import ch.qos.logback.core.CoreConstants;
import com.google.common.primitives.UnsignedBytes;
import p.a;
import zsc.p;

/* JADX INFO: loaded from: classes14.dex */
public final class Hex {
    private static final boolean LEFT = true;
    private static final boolean RIGHT = false;
    private static final String PRINTABLE = " .,:;'`\"<>()[]{}?/\\!@#$%^&*_-=+|~0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String HEXCHARS = "0123456789abcdefABCDEF";

    private Hex() {
    }

    public static String byteToHexString(byte b4) {
        int i = b4 & UnsignedBytes.MAX_VALUE;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(i < 16 ? "0" : "");
        sb6.append(Integer.toHexString(i));
        return sb6.toString().toUpperCase();
    }

    public static String bytesToASCIIString(byte[] bArr) {
        StringBuilder sb6 = new StringBuilder();
        for (byte b4 : bArr) {
            char c2 = (char) b4;
            if (" .,:;'`\"<>()[]{}?/\\!@#$%^&*_-=+|~0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(c2) < 0) {
                c2 = CoreConstants.DOT;
            }
            sb6.append(Character.toString(c2));
        }
        return sb6.toString();
    }

    public static String[] bytesToASCIIStrings(byte[] bArr, int i) {
        byte[][] bArrSplit = split(bArr, i);
        String[] strArr = new String[bArrSplit.length];
        for (int i2 = 0; i2 < bArrSplit.length; i2++) {
            strArr[i2] = bytesToASCIIString(bArrSplit[i2]);
        }
        return strArr;
    }

    public static String bytesToHexString(byte[] bArr) {
        return bytesToHexString(bArr, 1000);
    }

    public static String bytesToPrettyString(byte[] bArr) {
        return bytesToPrettyString(bArr, 16, LEFT, 4, null, LEFT);
    }

    public static String bytesToSpacedHexString(byte[] bArr) {
        StringBuilder sb6 = new StringBuilder();
        int i = 0;
        while (i < bArr.length) {
            sb6.append(byteToHexString(bArr[i]));
            sb6.append(i < bArr.length + (-1) ? " " : "");
            i++;
        }
        return sb6.toString().toUpperCase();
    }

    private static String[] bytesToSpacedHexStrings(byte[] bArr, int i, int i2) {
        byte[][] bArrSplit = split(bArr, i);
        String[] strArr = new String[bArrSplit.length];
        for (int i3 = 0; i3 < bArrSplit.length; i3++) {
            strArr[i3] = pad(bytesToSpacedHexString(bArrSplit[i3]), i2, p.SPACE_CHAR, false);
        }
        return strArr;
    }

    public static int hexDigitToInt(char c2) throws NumberFormatException {
        switch (c2) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                switch (c2) {
                    case 'A':
                        return 10;
                    case 'B':
                        return 11;
                    case 'C':
                        return 12;
                    case 'D':
                        return 13;
                    case 'E':
                        return 14;
                    case 'F':
                        return 15;
                    default:
                        switch (c2) {
                            case 'a':
                                return 10;
                            case 'b':
                                return 11;
                            case 'c':
                                return 12;
                            case 'd':
                                return 13;
                            case 'e':
                                return 14;
                            case 'f':
                                return 15;
                            default:
                                throw new NumberFormatException();
                        }
                }
        }
    }

    public static byte hexStringToByte(String str) throws NumberFormatException {
        byte[] bArrHexStringToBytes = hexStringToBytes(str);
        if (bArrHexStringToBytes == null || bArrHexStringToBytes.length != 1) {
            throw new NumberFormatException();
        }
        return bArrHexStringToBytes[0];
    }

    public static byte[] hexStringToBytes(String str) throws NumberFormatException {
        if (str == null) {
            return null;
        }
        StringBuilder sb6 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (!Character.isWhitespace(cCharAt)) {
                if ("0123456789abcdefABCDEF".indexOf(cCharAt) < 0) {
                    throw new NumberFormatException();
                }
                sb6.append(cCharAt);
            }
        }
        if (sb6.length() % 2 != 0) {
            sb6.insert(0, "0");
        }
        byte[] bArr = new byte[sb6.length() / 2];
        for (int i2 = 0; i2 < sb6.length(); i2 += 2) {
            bArr[i2 / 2] = (byte) (((hexDigitToInt(sb6.charAt(i2)) & 255) << 4) | (hexDigitToInt(sb6.charAt(i2 + 1)) & 255));
        }
        return bArr;
    }

    public static int hexStringToInt(String str) throws NumberFormatException {
        byte[] bArrHexStringToBytes = hexStringToBytes(str);
        if (bArrHexStringToBytes == null || bArrHexStringToBytes.length != 4) {
            throw new NumberFormatException();
        }
        return (bArrHexStringToBytes[3] & UnsignedBytes.MAX_VALUE) | ((bArrHexStringToBytes[0] & UnsignedBytes.MAX_VALUE) << 24) | ((bArrHexStringToBytes[1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArrHexStringToBytes[2] & UnsignedBytes.MAX_VALUE) << 8);
    }

    public static short hexStringToShort(String str) throws NumberFormatException {
        byte[] bArrHexStringToBytes = hexStringToBytes(str);
        if (bArrHexStringToBytes == null || bArrHexStringToBytes.length != 2) {
            throw new NumberFormatException();
        }
        return (short) ((bArrHexStringToBytes[1] & UnsignedBytes.MAX_VALUE) | ((bArrHexStringToBytes[0] & UnsignedBytes.MAX_VALUE) << 8));
    }

    public static String intToHexString(int i) {
        StringBuilder sb6 = new StringBuilder();
        sb6.append(i < 268435456 ? "0" : "");
        sb6.append(i < 16777216 ? "0" : "");
        sb6.append(i < 1048576 ? "0" : "");
        sb6.append(i < 65536 ? "0" : "");
        sb6.append(i < 4096 ? "0" : "");
        sb6.append(i < 256 ? "0" : "");
        sb6.append(i < 16 ? "0" : "");
        sb6.append(Integer.toHexString(i));
        return sb6.toString().toUpperCase();
    }

    private static String pad(String str, int i, char c2, boolean z) {
        StringBuilder sb6 = new StringBuilder();
        int length = str.length();
        if (length >= i) {
            return str;
        }
        int i2 = i - length;
        for (int i3 = 0; i3 < i2; i3++) {
            sb6.append(c2);
        }
        if (z) {
            sb6.append(str);
            return sb6.toString();
        }
        StringBuilder sbS = a.s(str);
        sbS.append(sb6.toString());
        return sbS.toString();
    }

    public static String shortToHexString(short s2) {
        int i = 65535 & s2;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(i < 4096 ? "0" : "");
        sb6.append(i < 256 ? "0" : "");
        sb6.append(i < 16 ? "0" : "");
        sb6.append(Integer.toHexString(s2));
        String string = sb6.toString();
        if (string.length() > 4) {
            string = string.substring(string.length() - 4, string.length());
        }
        return string.toUpperCase();
    }

    public static byte[][] split(byte[] bArr, int i) {
        int length = bArr.length / i;
        int length2 = bArr.length % i;
        byte[][] bArr2 = new byte[(length2 > 0 ? 1 : 0) + length][];
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            byte[] bArr3 = new byte[i];
            bArr2[i3] = bArr3;
            System.arraycopy(bArr, i2, bArr3, 0, i);
            i2 += i;
        }
        if (length2 > 0) {
            byte[] bArr4 = new byte[length2];
            bArr2[length] = bArr4;
            System.arraycopy(bArr, i2, bArr4, 0, length2);
        }
        return bArr2;
    }

    public static String toHexString(byte[] bArr) {
        return bytesToHexString(bArr, 0, bArr.length, 1000);
    }

    public static String bytesToHexString(byte[] bArr, int i) {
        return bArr == null ? "NULL" : bytesToHexString(bArr, 0, bArr.length, i);
    }

    public static String bytesToPrettyString(byte[] bArr, int i, boolean z, int i2, String str, boolean z3) {
        StringBuilder sb6 = new StringBuilder();
        String[] strArrBytesToSpacedHexStrings = bytesToSpacedHexStrings(bArr, i, i * 3);
        String[] strArrBytesToASCIIStrings = bytesToASCIIStrings(bArr, i);
        int i3 = 0;
        while (i3 < strArrBytesToSpacedHexStrings.length) {
            if (z) {
                sb6.append(pad(Integer.toHexString(i3 * i).toUpperCase(), i2, '0', LEFT) + ": ");
            } else {
                sb6.append(pad(i3 == 0 ? str : "", i2, p.SPACE_CHAR, LEFT) + " ");
            }
            sb6.append(strArrBytesToSpacedHexStrings[i3]);
            if (z3) {
                sb6.append(" " + strArrBytesToASCIIStrings[i3]);
            }
            sb6.append("\n");
            i3++;
        }
        return sb6.toString();
    }

    public static String toHexString(byte[] bArr, int i) {
        return bytesToHexString(bArr, 0, bArr.length, i);
    }

    public static String bytesToHexString(byte[] bArr, int i, int i2, int i3) {
        if (bArr == null) {
            return "NULL";
        }
        StringBuilder sb6 = new StringBuilder();
        for (int i5 = 0; i5 < i2; i5++) {
            if (i5 != 0 && i5 % i3 == 0) {
                sb6.append("\n");
            }
            sb6.append(byteToHexString(bArr[i + i5]));
        }
        return sb6.toString();
    }

    public static String bytesToHexString(byte[] bArr, int i, int i2) {
        return bytesToHexString(bArr, i, i2, 1000);
    }
}
