package com.youTransactor.uCube;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import com.google.common.primitives.UnsignedBytes;
import ehe.n;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import ymm.g;

/* JADX INFO: loaded from: classes15.dex */
public class Tools {
    public static String bytesToHex(byte[] bArr) {
        return (bArr == null || bArr.length == 0) ? "" : new String(Hex.encodeHex(bArr)).toUpperCase();
    }

    public static boolean checkForBleFeature(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    public static boolean checkForBluetooth(Context context) {
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        return (bluetoothManager == null || bluetoothManager.getAdapter() == null) ? false : true;
    }

    public static int computeChecksumCRC16(byte[] bArr) {
        int i = 0;
        for (int i2 : bArr) {
            if (i2 < 0) {
                i2 += 256;
            }
            for (int i3 = 0; i3 < 8; i3++) {
                int i5 = (i >> 15) ^ (i2 >> 7);
                i = (i << 1) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
                if (i5 > 0) {
                    i = (i ^ 4129) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
                }
                i2 = (i2 << 1) & 255;
            }
        }
        return i;
    }

    public static String formattedAmount(int i, long j2) {
        String strValueOf = String.valueOf(j2);
        if (i == 0) {
            return strValueOf;
        }
        int length = strValueOf.length() - i;
        if (length <= 0) {
            while (length <= 0) {
                int length2 = strValueOf.length();
                char[] cArr = new char[length2 + 1];
                strValueOf.getChars(0, 0, cArr, 0);
                cArr[0] = '0';
                strValueOf.getChars(0, length2, cArr, 1);
                strValueOf = new String(cArr);
                length++;
            }
            length = 1;
        }
        int length3 = strValueOf.length();
        char[] cArr2 = new char[length3 + 1];
        strValueOf.getChars(0, length, cArr2, 0);
        cArr2[length] = CoreConstants.COMMA_CHAR;
        strValueOf.getChars(length, length3, cArr2, length + 1);
        return new String(cArr2);
    }

    public static int fromBCD(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int i = 0;
        for (byte b4 : bArr) {
            i = (((i * 10) + ((b4 >> 4) & 15)) * 10) + (b4 & 15);
        }
        return i;
    }

    public static int getByteLenFromBits(byte b4) {
        int i = b4 / 8;
        return b4 % 8 != 0 ? i + 1 : i;
    }

    public static byte hexStringToByte(String str) {
        if (str == null) {
            return (byte) 0;
        }
        try {
            return Hex.decodeHex(str.toCharArray())[0];
        } catch (Exception e) {
            e.printStackTrace();
            return (byte) 0;
        }
    }

    public static byte[] hexStringToByteArray(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Hex.decodeHex(str.toCharArray());
        } catch (DecoderException e) {
            e.printStackTrace();
            return new byte[0];
        }
    }

    public static byte intToBcdByte(int i) {
        if (i > 99) {
            return (byte) -1;
        }
        return (byte) ((((byte) (i / 10)) * 16) + ((byte) (i % 10)));
    }

    public static short intToBcdShort(int i) {
        if (i > 9999) {
            return (short) -1;
        }
        return (short) n.a((byte) ((i % 100) / 10), 16, (byte) (i % 10), ((((byte) (i / 1000)) * 16) + ((byte) ((i % 1000) / 100))) * 256);
    }

    public static byte[] intToByteArray(int i, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            bArr[i3] = (byte) i;
            i >>= 8;
        }
        return bArr;
    }

    public static boolean isUCubePaired(@NonNull String str) {
        ArrayList arrayList = new ArrayList(BluetoothAdapter.getDefaultAdapter().getBondedDevices());
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (((BluetoothDevice) obj2).getAddress().equals(str)) {
                z = true;
            }
        }
        return z;
    }

    public static int makeInt(byte b4, byte b5) {
        int i = b4 & UnsignedBytes.MAX_VALUE;
        int i2 = b5 & UnsignedBytes.MAX_VALUE;
        if (i < 0) {
            i += 256;
        }
        if (i2 < 0) {
            i2 += 256;
        }
        return (i * 256) + i2;
    }

    public static short makeShort(byte b4, byte b5) {
        return (short) (((b4 & UnsignedBytes.MAX_VALUE) * 256) + (b5 & UnsignedBytes.MAX_VALUE));
    }

    public static int neg_byte_to_int(byte b4) {
        return b4 >= 0 ? b4 : b4 + 256;
    }

    public static List<String> parseAsciiLV(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int length = bArr == null ? 0 : bArr.length;
        while (i < length) {
            int i2 = i + 1;
            i = bArr[i] + i2;
            arrayList.add(new String(Arrays.copyOfRange(bArr, i2, i), StandardCharsets.UTF_8));
        }
        return arrayList;
    }

    public static String parseBleVersion(byte[] bArr) {
        StringBuilder sb6 = new StringBuilder();
        if (bArr != null) {
            for (byte b4 : bArr) {
                sb6.append((char) b4);
            }
        }
        return sb6.toString();
    }

    public static String parsePartNumber(byte[] bArr) {
        if (bArr == null || bArr.length != 15) {
            return "";
        }
        byte[] bArr2 = new byte[15];
        System.arraycopy(bArr, 0, bArr2, 0, 15);
        return new String(bArr2, StandardCharsets.UTF_8).replaceAll(" ", "");
    }

    public static String parseSerial(byte[] bArr) {
        if (bArr == null || bArr.length != 5) {
            return "";
        }
        long j2 = 0;
        for (byte b4 : bArr) {
            j2 = (j2 << 8) + ((long) (b4 & UnsignedBytes.MAX_VALUE));
        }
        return String.format("%012d", Long.valueOf(j2 / 4));
    }

    public static String parseVersion(byte[] bArr) {
        StringBuilder sb6 = new StringBuilder();
        if (bArr != null) {
            for (byte b4 : bArr) {
                if (sb6.length() > 0) {
                    sb6.append(CoreConstants.DOT);
                }
                sb6.append(String.valueOf((int) b4));
            }
        }
        return sb6.toString();
    }

    public static byte[] stringDecimalVersionToHexByteArray(String str) {
        int i;
        String strSubstring;
        if (str == null) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i2 = 0;
        int i3 = 0;
        while (i2 < 4) {
            int iIndexOf = str.indexOf(".", i3);
            if (iIndexOf != -1) {
                strSubstring = str.substring(i3, iIndexOf);
                i = iIndexOf + 1;
            } else {
                i = i3;
                strSubstring = str.substring(i3);
            }
            bArr[i2] = Byte.parseByte(Integer.toHexString(Integer.parseInt(strSubstring, 16)));
            i2++;
            i3 = i;
        }
        return bArr;
    }

    public static byte[] stringToBytesASCII(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static byte[] toBCD(long j2, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            byte b4 = (byte) (j2 % 10);
            bArr[i2] = b4;
            bArr[i2] = (byte) (b4 | ((byte) ((r7 % 10) << 4)));
            j2 = (j2 / 10) / 10;
        }
        return bArr;
    }

    public static byte[] toBCD_double(double d, int i) {
        return hexStringToByteArray(g.f(new DecimalFormat("#").format(d), i * 2, '0'));
    }
}
