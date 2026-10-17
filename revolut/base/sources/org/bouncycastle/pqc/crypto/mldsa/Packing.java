package org.bouncycastle.pqc.crypto.mldsa;

import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
class Packing {
    public static byte[] packPublicKey(PolyVecK polyVecK, MLDSAEngine mLDSAEngine) {
        byte[] bArr = new byte[mLDSAEngine.getCryptoPublicKeyBytes() - 32];
        for (int i = 0; i < mLDSAEngine.getDilithiumK(); i++) {
            System.arraycopy(polyVecK.getVectorIndex(i).polyt1Pack(), 0, bArr, i * 320, 320);
        }
        return bArr;
    }

    public static byte[][] packSecretKey(byte[] bArr, byte[] bArr2, byte[] bArr3, PolyVecK polyVecK, PolyVecL polyVecL, PolyVecK polyVecK2, MLDSAEngine mLDSAEngine) {
        byte[][] bArr4 = new byte[6][];
        bArr4[0] = bArr;
        bArr4[1] = bArr3;
        bArr4[2] = bArr2;
        bArr4[3] = new byte[mLDSAEngine.getDilithiumL() * mLDSAEngine.getDilithiumPolyEtaPackedBytes()];
        for (int i = 0; i < mLDSAEngine.getDilithiumL(); i++) {
            polyVecL.getVectorIndex(i).polyEtaPack(bArr4[3], mLDSAEngine.getDilithiumPolyEtaPackedBytes() * i);
        }
        bArr4[4] = new byte[mLDSAEngine.getDilithiumK() * mLDSAEngine.getDilithiumPolyEtaPackedBytes()];
        for (int i2 = 0; i2 < mLDSAEngine.getDilithiumK(); i2++) {
            polyVecK2.getVectorIndex(i2).polyEtaPack(bArr4[4], mLDSAEngine.getDilithiumPolyEtaPackedBytes() * i2);
        }
        bArr4[5] = new byte[mLDSAEngine.getDilithiumK() * 416];
        for (int i3 = 0; i3 < mLDSAEngine.getDilithiumK(); i3++) {
            polyVecK.getVectorIndex(i3).polyt0Pack(bArr4[5], i3 * 416);
        }
        return bArr4;
    }

    public static void packSignature(byte[] bArr, PolyVecL polyVecL, PolyVecK polyVecK, MLDSAEngine mLDSAEngine) {
        int dilithiumCTilde = mLDSAEngine.getDilithiumCTilde();
        for (int i = 0; i < mLDSAEngine.getDilithiumL(); i++) {
            polyVecL.getVectorIndex(i).zPack(bArr, dilithiumCTilde);
            dilithiumCTilde += mLDSAEngine.getDilithiumPolyZPackedBytes();
        }
        for (int i2 = 0; i2 < mLDSAEngine.getDilithiumOmega() + mLDSAEngine.getDilithiumK(); i2++) {
            bArr[dilithiumCTilde + i2] = 0;
        }
        int i3 = 0;
        for (int i5 = 0; i5 < mLDSAEngine.getDilithiumK(); i5++) {
            for (int i6 = 0; i6 < 256; i6++) {
                if (polyVecK.getVectorIndex(i5).getCoeffIndex(i6) != 0) {
                    bArr[i3 + dilithiumCTilde] = (byte) i6;
                    i3++;
                }
            }
            bArr[mLDSAEngine.getDilithiumOmega() + dilithiumCTilde + i5] = (byte) i3;
        }
    }

    public static PolyVecK unpackPublicKey(PolyVecK polyVecK, byte[] bArr, MLDSAEngine mLDSAEngine) {
        int i = 0;
        while (i < mLDSAEngine.getDilithiumK()) {
            Poly vectorIndex = polyVecK.getVectorIndex(i);
            int i2 = i * 320;
            i++;
            vectorIndex.polyt1Unpack(Arrays.copyOfRange(bArr, i2, i * 320));
        }
        return polyVecK;
    }

    public static void unpackSecretKey(PolyVecK polyVecK, PolyVecL polyVecL, PolyVecK polyVecK2, byte[] bArr, byte[] bArr2, byte[] bArr3, MLDSAEngine mLDSAEngine) {
        for (int i = 0; i < mLDSAEngine.getDilithiumL(); i++) {
            polyVecL.getVectorIndex(i).polyEtaUnpack(bArr2, mLDSAEngine.getDilithiumPolyEtaPackedBytes() * i);
        }
        for (int i2 = 0; i2 < mLDSAEngine.getDilithiumK(); i2++) {
            polyVecK2.getVectorIndex(i2).polyEtaUnpack(bArr3, mLDSAEngine.getDilithiumPolyEtaPackedBytes() * i2);
        }
        for (int i3 = 0; i3 < mLDSAEngine.getDilithiumK(); i3++) {
            polyVecK.getVectorIndex(i3).polyt0Unpack(bArr, i3 * 416);
        }
    }

    public static boolean unpackSignature(PolyVecL polyVecL, PolyVecK polyVecK, byte[] bArr, MLDSAEngine mLDSAEngine) {
        int dilithiumCTilde = mLDSAEngine.getDilithiumCTilde();
        int i = 0;
        while (i < mLDSAEngine.getDilithiumL()) {
            Poly vectorIndex = polyVecL.getVectorIndex(i);
            int dilithiumPolyZPackedBytes = (mLDSAEngine.getDilithiumPolyZPackedBytes() * i) + dilithiumCTilde;
            i++;
            vectorIndex.zUnpack(Arrays.copyOfRange(bArr, dilithiumPolyZPackedBytes, (mLDSAEngine.getDilithiumPolyZPackedBytes() * i) + dilithiumCTilde));
        }
        int dilithiumL = (mLDSAEngine.getDilithiumL() * mLDSAEngine.getDilithiumPolyZPackedBytes()) + dilithiumCTilde;
        int i2 = 0;
        for (int i3 = 0; i3 < mLDSAEngine.getDilithiumK(); i3++) {
            for (int i5 = 0; i5 < 256; i5++) {
                polyVecK.getVectorIndex(i3).setCoeffIndex(i5, 0);
            }
            if ((bArr[mLDSAEngine.getDilithiumOmega() + dilithiumL + i3] & 255) < i2 || (bArr[mLDSAEngine.getDilithiumOmega() + dilithiumL + i3] & 255) > mLDSAEngine.getDilithiumOmega()) {
                return false;
            }
            for (int i6 = i2; i6 < (bArr[mLDSAEngine.getDilithiumOmega() + dilithiumL + i3] & 255); i6++) {
                if (i6 > i2) {
                    int i21 = dilithiumL + i6;
                    if ((bArr[i21] & UnsignedBytes.MAX_VALUE) <= (bArr[i21 - 1] & UnsignedBytes.MAX_VALUE)) {
                        return false;
                    }
                }
                polyVecK.getVectorIndex(i3).setCoeffIndex(bArr[dilithiumL + i6] & UnsignedBytes.MAX_VALUE, 1);
            }
            i2 = bArr[mLDSAEngine.getDilithiumOmega() + dilithiumL + i3];
        }
        while (i2 < mLDSAEngine.getDilithiumOmega()) {
            if ((bArr[dilithiumL + i2] & UnsignedBytes.MAX_VALUE) != 0) {
                return false;
            }
            i2++;
        }
        return true;
    }
}
