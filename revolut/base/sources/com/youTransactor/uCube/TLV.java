package com.youTransactor.uCube;

import com.google.common.base.Ascii;
import com.youTransactor.uCube.log.LogManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import net.sf.scuba.smartcards.ISOFileInfo;

/* JADX INFO: loaded from: classes15.dex */
public final class TLV {
    public static Map<Integer, byte[]> parse(byte[] bArr) {
        return parse(bArr, 0, bArr == null ? 0 : bArr.length);
    }

    public static Map<Integer, byte[]> parseWithRedundancy(byte[] bArr, int i, int i2) {
        int length;
        byte[] tagLength;
        int length2;
        byte[] tagValue;
        HashMap map = new HashMap();
        int iMin = bArr == null ? 0 : Math.min(bArr.length, i2 + i);
        while (i < iMin) {
            byte[] tag2 = readTag(bArr, i);
            if (tag2 == null || (tagLength = readTagLength(bArr, (length = i + tag2.length))) == null || (tagValue = readTagValue(bArr, (length2 = length + tagLength.length), toInt(tagLength))) == null) {
                break;
            }
            i = length2 + tagValue.length;
            if (!map.containsKey(Integer.valueOf(toInt(tag2)))) {
                map.put(Integer.valueOf(toInt(tag2)), tagValue);
            }
        }
        return map;
    }

    public static Map<Integer, byte[]> parseYtBerMixedLen(byte[] bArr) {
        return parseYtBerMixedLen(bArr, 0, bArr == null ? 0 : bArr.length);
    }

    public static byte[] readTag(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= i) {
            return null;
        }
        byte b4 = bArr[i];
        if ((b4 & Ascii.US) != 31) {
            return new byte[]{b4};
        }
        int i2 = 2;
        for (int i3 = i + 1; i3 < i + 10 && (bArr[i3] & 128) == 128; i3++) {
            i2++;
        }
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    public static byte[] readTagLength(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= i) {
            return null;
        }
        int i2 = i + 1;
        byte b4 = bArr[i];
        if ((b4 & 128) == 0) {
            return new byte[]{b4};
        }
        byte b5 = (byte) (b4 & Ascii.DEL);
        return b5 == 0 ? new byte[]{-128} : Arrays.copyOfRange(bArr, i2, b5 + i2);
    }

    public static byte[] readTagLengthYTBERMixedStyle(byte[] bArr, int i, byte[] bArr2) {
        if (bArr == null || bArr.length <= i) {
            return null;
        }
        int i2 = i + 1;
        byte b4 = bArr[i];
        if ((b4 & 128) == 0) {
            return new byte[]{b4};
        }
        if (bArr2[0] == -24) {
            if (LogManager.getLogLevel().getCode() >= LogManager.LogLevel.SYSTEM.getCode()) {
                LogManager.d("[SYSTEM]", "Mixed BER-TLV and YT-TLV tag length detected!");
            }
            if (b4 != -127 && b4 != -126) {
                return new byte[]{b4};
            }
        }
        byte b5 = (byte) (b4 & Ascii.DEL);
        if (b5 == 0) {
            return new byte[]{-128};
        }
        byte[] bArr3 = new byte[b5 + 1];
        bArr3[0] = 0;
        System.arraycopy(bArr, i2, bArr3, 1, b5);
        return bArr3;
    }

    public static byte[] readTagValue(byte[] bArr, int i, int i2) {
        int i3;
        if (bArr == null || bArr.length < (i3 = i2 + i)) {
            return null;
        }
        return Arrays.copyOfRange(bArr, i, i3);
    }

    public static int toInt(byte[] bArr) {
        if (bArr == 0 || bArr.length <= 0) {
            return 0;
        }
        int i = 0;
        for (int i2 : bArr) {
            if (i2 < 0) {
                i2 += 256;
            }
            i = (i << 8) | i2;
        }
        int length = bArr.length;
        return length != 1 ? length != 2 ? length != 3 ? i : 16777215 & i : 65535 & i : i & 255;
    }

    public static int writeTagID(int i, byte[] bArr, int i2) {
        int i3;
        if (i >= 65536) {
            bArr[i2] = (byte) ((i >> 16) & 255);
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i >= 256) {
            bArr[i2 + i3] = (byte) ((i >> 8) & 255);
            i3++;
        }
        bArr[i2 + i3] = (byte) (i & 255);
        return i3 + 1;
    }

    public static int writeTagLength(int i, byte[] bArr, int i2) {
        if (bArr == null || bArr.length <= i2 || i > 65535) {
            return 0;
        }
        if (i < 127) {
            bArr[i2] = (byte) i;
            return 1;
        }
        if (i <= 255) {
            bArr[i2] = ISOFileInfo.DATA_BYTES2;
            bArr[i2 + 1] = (byte) i;
            return 2;
        }
        bArr[i2] = -126;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) i;
        return 3;
    }

    public static Map<Integer, byte[]> parse(byte[] bArr, int i, int i2) {
        int length;
        byte[] tagLength;
        int length2;
        byte[] tagValue;
        HashMap map = new HashMap();
        int iMin = bArr == null ? 0 : Math.min(bArr.length, i2 + i);
        while (i < iMin) {
            byte[] tag2 = readTag(bArr, i);
            if (tag2 == null || (tagLength = readTagLength(bArr, (length = i + tag2.length))) == null || (tagValue = readTagValue(bArr, (length2 = length + tagLength.length), toInt(tagLength))) == null) {
                break;
            }
            i = length2 + tagValue.length;
            map.put(Integer.valueOf(toInt(tag2)), tagValue);
        }
        return map;
    }

    public static Map<Integer, byte[]> parseYtBerMixedLen(byte[] bArr, int i, int i2) {
        int length;
        byte[] tagLengthYTBERMixedStyle;
        int length2;
        byte[] tagValue;
        HashMap map = new HashMap();
        int iMin = bArr == null ? 0 : Math.min(bArr.length, i2 + i);
        while (i < iMin) {
            byte[] tag2 = readTag(bArr, i);
            if (tag2 == null || (tagLengthYTBERMixedStyle = readTagLengthYTBERMixedStyle(bArr, (length = i + tag2.length), tag2)) == null || (tagValue = readTagValue(bArr, (length2 = length + tagLengthYTBERMixedStyle.length), toInt(tagLengthYTBERMixedStyle))) == null) {
                break;
            }
            i = length2 + tagValue.length;
            map.put(Integer.valueOf(toInt(tag2)), tagValue);
        }
        return map;
    }
}
