package ch.qos.logback.core.encoder;

import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes16.dex */
public class ByteArrayUtil {
    public static byte[] hexStringToByteArray(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (Integer.parseInt(str.substring(i2, i2 + 2), 16) & 255);
        }
        return bArr;
    }

    public static int readInt(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 += (bArr[i + i3] & 255) << (24 - (i3 * 8));
        }
        return i2;
    }

    public static String toHexString(byte[] bArr) {
        StringBuilder sb6 = new StringBuilder();
        for (byte b4 : bArr) {
            String hexString = Integer.toHexString(b4 & UnsignedBytes.MAX_VALUE);
            if (hexString.length() == 1) {
                sb6.append('0');
            }
            sb6.append(hexString);
        }
        return sb6.toString();
    }

    public static void writeInt(ByteArrayOutputStream byteArrayOutputStream, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            byteArrayOutputStream.write((byte) (i >>> (24 - (i2 * 8))));
        }
    }

    public static void writeInt(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i + i3] = (byte) (i2 >>> (24 - (i3 * 8)));
        }
    }
}
