package org.bouncycastle.crypto.generators;

import com.google.android.gms.internal.mlkit_vision_face.a;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.engines.Salsa20Engine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class SCrypt {
    private SCrypt() {
    }

    private static void BlockMix(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        System.arraycopy(iArr, iArr.length - 16, iArr2, 0, 16);
        int length = iArr.length >>> 1;
        int i2 = 0;
        int i3 = 0;
        for (int i5 = i * 2; i5 > 0; i5--) {
            Xor(iArr2, iArr, i2, iArr3);
            Salsa20Engine.salsaCore(8, iArr3, iArr2);
            System.arraycopy(iArr2, 0, iArr4, i3, 16);
            i3 = (length + i2) - i3;
            i2 += 16;
        }
    }

    private static void Clear(byte[] bArr) {
        if (bArr != null) {
            Arrays.fill(bArr, (byte) 0);
        }
    }

    private static void ClearAll(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            Clear(iArr2);
        }
    }

    private static byte[] MFcrypt(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i5) {
        int i6 = i2 * 128;
        byte[] bArrSingleIterationPBKDF2 = SingleIterationPBKDF2(bArr, bArr2, i3 * i6);
        int[] iArr = null;
        try {
            int length = bArrSingleIterationPBKDF2.length >>> 2;
            iArr = new int[length];
            Pack.littleEndianToInt(bArrSingleIterationPBKDF2, 0, iArr);
            int i21 = 0;
            for (int i22 = i * i2; i - i21 > 2 && i22 > 1024; i22 >>>= 1) {
                i21++;
            }
            int i32 = i6 >>> 2;
            for (int i33 = 0; i33 < length; i33 += i32) {
                SMix(iArr, i33, i, i21, i2);
            }
            Pack.intToLittleEndian(iArr, bArrSingleIterationPBKDF2, 0);
            byte[] bArrSingleIterationPBKDF22 = SingleIterationPBKDF2(bArr, bArrSingleIterationPBKDF2, i5);
            Clear(bArrSingleIterationPBKDF2);
            Clear(iArr);
            return bArrSingleIterationPBKDF22;
        } catch (Throwable th10) {
            Clear(bArrSingleIterationPBKDF2);
            Clear(iArr);
            throw th10;
        }
    }

    private static void SMix(int[] iArr, int i, int i2, int i3, int i5) {
        int i6 = i2 >>> i3;
        int i21 = 1 << i3;
        int i22 = i6 - 1;
        int iNumberOfTrailingZeros = Integers.numberOfTrailingZeros(i2) - i3;
        int i32 = i5 * 32;
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[i32];
        int[] iArr5 = new int[i32];
        int[][] iArr6 = new int[i21][];
        try {
            System.arraycopy(iArr, i, iArr5, 0, i32);
            int i33 = 0;
            while (i33 < i21) {
                int[] iArr7 = new int[i6 * i32];
                iArr6[i33] = iArr7;
                int i43 = iNumberOfTrailingZeros;
                int i59 = i21;
                int i66 = 0;
                for (int i74 = 0; i74 < i6; i74 += 2) {
                    System.arraycopy(iArr5, 0, iArr7, i66, i32);
                    int i92 = i66 + i32;
                    BlockMix(iArr5, iArr2, iArr3, iArr4, i5);
                    System.arraycopy(iArr4, 0, iArr7, i92, i32);
                    i66 = i92 + i32;
                    BlockMix(iArr4, iArr2, iArr3, iArr5, i5);
                }
                i33++;
                iNumberOfTrailingZeros = i43;
                i21 = i59;
            }
            int i96 = iNumberOfTrailingZeros;
            int i99 = i2 - 1;
            for (int i100 = 0; i100 < i2; i100++) {
                int i101 = iArr5[i32 - 16] & i99;
                System.arraycopy(iArr6[i101 >>> i96], (i101 & i22) * i32, iArr4, 0, i32);
                Xor(iArr4, iArr5, 0, iArr4);
                BlockMix(iArr4, iArr2, iArr3, iArr5, i5);
            }
            System.arraycopy(iArr5, 0, iArr, i, i32);
            ClearAll(iArr6);
            ClearAll(new int[][]{iArr5, iArr2, iArr3, iArr4});
        } catch (Throwable th10) {
            ClearAll(iArr6);
            ClearAll(new int[][]{iArr5, iArr2, iArr3, iArr4});
            throw th10;
        }
    }

    private static byte[] SingleIterationPBKDF2(byte[] bArr, byte[] bArr2, int i) {
        PKCS5S2ParametersGenerator pKCS5S2ParametersGenerator = new PKCS5S2ParametersGenerator(SHA256Digest.newInstance());
        pKCS5S2ParametersGenerator.init(bArr, bArr2, 1);
        return ((KeyParameter) pKCS5S2ParametersGenerator.generateDerivedMacParameters(i * 8)).getKey();
    }

    private static void Xor(int[] iArr, int[] iArr2, int i, int[] iArr3) {
        for (int length = iArr3.length - 1; length >= 0; length--) {
            iArr3[length] = iArr[length] ^ iArr2[i + length];
        }
    }

    public static byte[] generate(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i5) {
        if (bArr == null) {
            throw new IllegalArgumentException("Passphrase P must be provided.");
        }
        if (bArr2 == null) {
            throw new IllegalArgumentException("Salt S must be provided.");
        }
        if (i <= 1 || !isPowerOf2(i)) {
            throw new IllegalArgumentException("Cost parameter N must be > 1 and a power of 2");
        }
        if (i2 == 1 && i >= 65536) {
            throw new IllegalArgumentException("Cost parameter N must be > 1 and < 65536.");
        }
        if (i2 < 1) {
            throw new IllegalArgumentException("Block size r must be >= 1.");
        }
        int i6 = Integer.MAX_VALUE / (i2 * 1024);
        if (i3 < 1 || i3 > i6) {
            throw new IllegalArgumentException(a.m("Parallelisation parameter p must be >= 1 and <= ", i6, i2, " (based on block size r of ", ")"));
        }
        if (i5 >= 1) {
            return MFcrypt(bArr, bArr2, i, i2, i3, i5);
        }
        throw new IllegalArgumentException("Generated key length dkLen must be >= 1.");
    }

    private static boolean isPowerOf2(int i) {
        return (i & (i + (-1))) == 0;
    }

    private static void Clear(int[] iArr) {
        if (iArr != null) {
            Arrays.fill(iArr, 0);
        }
    }
}
