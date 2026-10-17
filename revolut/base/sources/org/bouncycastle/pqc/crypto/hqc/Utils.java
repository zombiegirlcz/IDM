package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
class Utils {
    public static void fromByte32ArrayToLongArray(long[] jArr, int[] iArr) {
        for (int i = 0; i != iArr.length; i += 2) {
            int i2 = i / 2;
            long j2 = ((long) iArr[i]) & BodyPartID.bodyIdMax;
            jArr[i2] = j2;
            jArr[i2] = j2 | (((long) iArr[i + 1]) << 32);
        }
    }

    public static void fromByteArrayToLongArray(long[] jArr, byte[] bArr, int i, int i2) {
        int i3 = i2 >> 3;
        Pack.littleEndianToLong(bArr, i, jArr, 0, i3);
        int i5 = i2 & 7;
        if (i5 != 0) {
            jArr[i3] = Pack.littleEndianToLong_Low(bArr, (i + i2) - i5, i5);
        }
    }

    public static void fromLongArrayToByte32Array(int[] iArr, long[] jArr) {
        for (int i = 0; i != jArr.length; i++) {
            int i2 = i * 2;
            long j2 = jArr[i];
            iArr[i2] = (int) j2;
            iArr[i2 + 1] = (int) (j2 >> 32);
        }
    }

    public static void fromLongArrayToByteArray(byte[] bArr, int i, int i2, long[] jArr) {
        int i3 = i2 >> 3;
        Pack.longToLittleEndian(jArr, 0, i3, bArr, i);
        int i5 = i2 & 7;
        if (i5 != 0) {
            Pack.longToLittleEndian_Low(jArr[i3], bArr, (i + i2) - i5, i5);
        }
    }

    public static int getByte64SizeFromBitSize(int i) {
        return (i + 63) / 64;
    }

    public static int getByteSizeFromBitSize(int i) {
        return (i + 7) / 8;
    }

    public static int toUnsigned16Bits(int i) {
        return i & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
    }

    public static int toUnsigned8bits(int i) {
        return i & 255;
    }
}
