package org.bouncycastle.pqc.crypto.falcon;

import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.digests.SHAKEDigest;

/* JADX INFO: loaded from: classes14.dex */
class FalconCommon {
    static final int[] l2bound = {0, 101498, 208714, 428865, 892039, 1852696, 3842630, 7959734, 16468416, 34034726, 70265242};

    public static void hash_to_point_vartime(SHAKEDigest sHAKEDigest, short[] sArr, int i) {
        int i2 = 1 << i;
        byte[] bArr = new byte[2];
        int i3 = 0;
        while (i2 > 0) {
            sHAKEDigest.doOutput(bArr, 0, 2);
            int i5 = ((bArr[0] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[1] & UnsignedBytes.MAX_VALUE);
            if (i5 < 61445) {
                sArr[i3] = (short) (i5 % 12289);
                i2--;
                i3++;
            }
        }
    }

    public static int is_short(short[] sArr, int i, short[] sArr2, int i2) {
        int i3 = 1 << i2;
        int i5 = 0;
        int i6 = 0;
        int i21 = 0;
        while (i5 < i3) {
            short s2 = sArr[i + i5];
            int i22 = (s2 * s2) + i6;
            int i32 = i21 | i22;
            short s3 = sArr2[i5];
            int i33 = (s3 * s3) + i22;
            i5++;
            i21 = i32 | i33;
            i6 = i33;
        }
        return (((long) ((-(i21 >>> 31)) | i6)) & BodyPartID.bodyIdMax) <= ((long) l2bound[i2]) ? 1 : 0;
    }

    public static int is_short_half(int i, short[] sArr, int i2) {
        int i3 = 1 << i2;
        int i5 = -(i >>> 31);
        for (int i6 = 0; i6 < i3; i6++) {
            short s2 = sArr[i6];
            i += s2 * s2;
            i5 |= i;
        }
        return (((long) (i | (-(i5 >>> 31)))) & BodyPartID.bodyIdMax) <= ((long) l2bound[i2]) ? 1 : 0;
    }
}
