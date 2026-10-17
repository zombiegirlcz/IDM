package org.bouncycastle.util.encoders;

import com.google.common.base.Ascii;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes14.dex */
public class UTF8 {
    private static final byte C_CR1 = 1;
    private static final byte C_CR2 = 2;
    private static final byte C_CR3 = 3;
    private static final byte C_ILL = 0;
    private static final byte C_L2A = 4;
    private static final byte C_L3A = 5;
    private static final byte C_L3B = 6;
    private static final byte C_L3C = 7;
    private static final byte C_L4A = 8;
    private static final byte C_L4B = 9;
    private static final byte C_L4C = 10;
    private static final byte S_CS1 = 0;
    private static final byte S_CS2 = 16;
    private static final byte S_CS3 = 32;
    private static final byte S_END = -1;
    private static final byte S_ERR = -2;
    private static final byte S_P3A = 48;
    private static final byte S_P3B = 64;
    private static final byte S_P4A = 80;
    private static final byte S_P4B = 96;
    private static final short[] firstUnitTable = new short[128];
    private static final byte[] transitionTable;

    static {
        byte[] bArr = new byte[112];
        transitionTable = bArr;
        byte[] bArr2 = new byte[128];
        fill(bArr2, 0, 15, (byte) 1);
        fill(bArr2, 16, 31, (byte) 2);
        fill(bArr2, 32, 63, (byte) 3);
        fill(bArr2, 64, 65, (byte) 0);
        fill(bArr2, 66, 95, (byte) 4);
        fill(bArr2, 96, 96, (byte) 5);
        fill(bArr2, 97, LDSFile.EF_DG12_TAG, (byte) 6);
        fill(bArr2, LDSFile.EF_DG13_TAG, LDSFile.EF_DG13_TAG, (byte) 7);
        fill(bArr2, LDSFile.EF_DG14_TAG, LDSFile.EF_DG15_TAG, (byte) 6);
        fill(bArr2, 112, 112, (byte) 8);
        fill(bArr2, 113, ISO781611.DISCRETIONARY_DATA_FOR_PAYLOAD_CONSTRUCTED_TAG, (byte) 9);
        fill(bArr2, 116, 116, (byte) 10);
        fill(bArr2, LDSFile.EF_DG2_TAG, CertificateBody.profileType, (byte) 0);
        fill(bArr, 0, bArr.length - 1, S_ERR);
        fill(bArr, 8, 11, (byte) -1);
        fill(bArr, 24, 27, (byte) 0);
        fill(bArr, 40, 43, (byte) 16);
        fill(bArr, 58, 59, (byte) 0);
        fill(bArr, 72, 73, (byte) 0);
        fill(bArr, 89, 91, (byte) 16);
        fill(bArr, 104, 104, (byte) 16);
        byte[] bArr3 = {0, 0, 0, 0, Ascii.US, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {S_ERR, S_ERR, S_ERR, S_ERR, 0, 48, 16, 64, S_P4A, 32, S_P4B};
        for (int i = 0; i < 128; i++) {
            byte b4 = bArr2[i];
            firstUnitTable[i] = (short) (bArr4[b4] | ((bArr3[b4] & i) << 8));
        }
    }

    private static void fill(byte[] bArr, int i, int i2, byte b4) {
        while (i <= i2) {
            bArr[i] = b4;
            i++;
        }
    }

    public static int transcodeToUTF16(byte[] bArr, int i, int i2, char[] cArr) {
        int i3 = i2 + i;
        int i5 = 0;
        while (i < i3) {
            int i6 = i + 1;
            byte b4 = bArr[i];
            if (b4 < 0) {
                short s2 = firstUnitTable[b4 & Ascii.DEL];
                int i21 = s2 >>> 8;
                byte b5 = (byte) s2;
                while (b5 >= 0) {
                    if (i6 >= i3) {
                        return -1;
                    }
                    int i22 = i6 + 1;
                    byte b7 = bArr[i6];
                    i21 = (i21 << 6) | (b7 & 63);
                    b5 = transitionTable[b5 + ((b7 & 255) >>> 4)];
                    i6 = i22;
                }
                if (b5 == -2) {
                    return -1;
                }
                if (i21 <= 65535) {
                    if (i5 >= cArr.length) {
                        return -1;
                    }
                    cArr[i5] = (char) i21;
                    i5++;
                } else {
                    if (i5 >= cArr.length - 1) {
                        return -1;
                    }
                    int i32 = i5 + 1;
                    cArr[i5] = (char) ((i21 >>> 10) + 55232);
                    i5 += 2;
                    cArr[i32] = (char) ((i21 & 1023) | 56320);
                }
                i = i6;
            } else {
                if (i5 >= cArr.length) {
                    return -1;
                }
                cArr[i5] = (char) b4;
                i = i6;
                i5++;
            }
        }
        return i5;
    }

    public static int transcodeToUTF16(byte[] bArr, char[] cArr) {
        return transcodeToUTF16(bArr, 0, bArr.length, cArr);
    }
}
