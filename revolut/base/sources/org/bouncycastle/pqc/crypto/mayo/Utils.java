package org.bouncycastle.pqc.crypto.mayo;

import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.modes.CTRModeCipher;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
class Utils {
    public static void expandP1P2(MayoParameters mayoParameters, long[] jArr, byte[] bArr) {
        int p2Bytes = mayoParameters.getP2Bytes() + mayoParameters.getP1Bytes();
        byte[] bArr2 = new byte[p2Bytes];
        CTRModeCipher cTRModeCipherNewInstance = SICBlockCipher.newInstance(AESEngine.newInstance());
        cTRModeCipherNewInstance.init(true, new ParametersWithIV(new KeyParameter(Arrays.copyOf(bArr, mayoParameters.getPkSeedBytes())), new byte[16]));
        int blockSize = cTRModeCipherNewInstance.getBlockSize();
        byte[] bArr3 = new byte[blockSize];
        byte[] bArr4 = new byte[blockSize];
        int i = 0;
        while (true) {
            int i2 = i + blockSize;
            if (i2 > p2Bytes) {
                break;
            }
            cTRModeCipherNewInstance.processBlock(bArr3, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, bArr2, i, blockSize);
            i = i2;
        }
        if (i < p2Bytes) {
            cTRModeCipherNewInstance.processBlock(bArr3, 0, bArr4, 0);
            System.arraycopy(bArr4, 0, bArr2, i, p2Bytes - i);
        }
        unpackMVecs(bArr2, 0, jArr, 0, (mayoParameters.getP2Limbs() + mayoParameters.getP1Limbs()) / mayoParameters.getMVecLimbs(), mayoParameters.getM());
    }

    public static void packMVecs(long[] jArr, byte[] bArr, int i, int i2, int i3) {
        int i5 = (i3 + 15) >> 4;
        int i6 = i3 >> 1;
        int i21 = (8 - (i5 << 3)) + i6;
        int i22 = 0;
        int i32 = 0;
        while (i22 < i2) {
            int i33 = 0;
            while (i33 < i5 - 1) {
                Pack.longToLittleEndian(jArr[i32 + i33], bArr, (i33 << 3) + i);
                i33++;
            }
            if (i21 > 0) {
                Pack.longToLittleEndian_Low(jArr[i32 + i33], bArr, (i33 << 3) + i, i21);
            }
            i22++;
            i += i6;
            i32 += i5;
        }
    }

    public static void unpackMVecs(byte[] bArr, int i, long[] jArr, int i2, int i3, int i5) {
        int i6 = (i5 + 15) >> 4;
        int i21 = i5 >> 1;
        int i22 = (8 - (i6 << 3)) + i21;
        int i32 = i3 - 1;
        int i33 = (i32 * i6) + i2;
        int i43 = (i32 * i21) + i;
        while (i32 >= 0) {
            int i59 = 0;
            while (i59 < i6 - 1) {
                jArr[i33 + i59] = Pack.littleEndianToLong(bArr, (i59 << 3) + i43);
                i59++;
            }
            jArr[i33 + i59] = i22 <= 0 ? 0L : Pack.littleEndianToLong_Low(bArr, (i59 << 3) + i43, i22);
            i32--;
            i33 -= i6;
            i43 -= i21;
        }
    }
}
