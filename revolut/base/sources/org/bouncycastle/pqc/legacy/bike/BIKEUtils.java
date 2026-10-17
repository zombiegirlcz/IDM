package org.bouncycastle.pqc.legacy.bike;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
class BIKEUtils {
    public static int CHECK_BIT(byte[] bArr, int i) {
        return (bArr[i / 8] >>> (i % 8)) & 1;
    }

    public static void SET_BIT(byte[] bArr, int i) {
        bArr[i / 8] = (byte) (((long) bArr[r0]) | (1 << (i % 8)));
    }

    public static void fromBitArrayToByteArray(byte[] bArr, byte[] bArr2, int i, int i2) {
        long j2 = i2;
        int i3 = 0;
        int i5 = 0;
        while (i3 < j2) {
            int i6 = i3 + 8;
            if (i6 >= i2) {
                int i21 = i + i3;
                int i22 = bArr2[i21];
                for (int i32 = (i2 - i3) - 1; i32 >= 1; i32--) {
                    i22 |= bArr2[i21 + i32] << i32;
                }
                bArr[i5] = (byte) i22;
            } else {
                int i33 = i3 + i;
                int i43 = bArr2[i33];
                for (int i59 = 7; i59 >= 1; i59--) {
                    i43 |= bArr2[i33 + i59] << i59;
                }
                bArr[i5] = (byte) i43;
            }
            i5++;
            i3 = i6;
        }
    }

    public static void generateRandomByteArray(byte[] bArr, int i, int i2, Xof xof2) {
        byte[] bArr2 = new byte[4];
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            xof2.doOutput(bArr2, 0, 4);
            int iLittleEndianToInt = ((int) (((((long) Pack.littleEndianToInt(bArr2, 0)) & BodyPartID.bodyIdMax) * ((long) (i - i3))) >> 32)) + i3;
            if (CHECK_BIT(bArr, iLittleEndianToInt) != 0) {
                iLittleEndianToInt = i3;
            }
            SET_BIT(bArr, iLittleEndianToInt);
        }
    }

    public static int getHammingWeight(byte[] bArr) {
        int i = 0;
        for (byte b4 : bArr) {
            i += b4;
        }
        return i;
    }
}
