package org.bouncycastle.pqc.crypto.crystals.dilithium;

import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
class Packing {
    public static byte[] packPublicKey(PolyVecK polyVecK, DilithiumEngine dilithiumEngine) {
        byte[] bArr = new byte[dilithiumEngine.getCryptoPublicKeyBytes() - 32];
        for (int i = 0; i < dilithiumEngine.getDilithiumK(); i++) {
            System.arraycopy(polyVecK.getVectorIndex(i).polyt1Pack(), 0, bArr, i * 320, 320);
        }
        return bArr;
    }

    public static byte[][] packSecretKey(byte[] bArr, byte[] bArr2, byte[] bArr3, PolyVecK polyVecK, PolyVecL polyVecL, PolyVecK polyVecK2, DilithiumEngine dilithiumEngine) {
        byte[][] bArr4 = new byte[6][];
        bArr4[0] = bArr;
        bArr4[1] = bArr3;
        bArr4[2] = bArr2;
        bArr4[3] = new byte[dilithiumEngine.getDilithiumL() * dilithiumEngine.getDilithiumPolyEtaPackedBytes()];
        for (int i = 0; i < dilithiumEngine.getDilithiumL(); i++) {
            polyVecL.getVectorIndex(i).polyEtaPack(bArr4[3], dilithiumEngine.getDilithiumPolyEtaPackedBytes() * i);
        }
        bArr4[4] = new byte[dilithiumEngine.getDilithiumK() * dilithiumEngine.getDilithiumPolyEtaPackedBytes()];
        for (int i2 = 0; i2 < dilithiumEngine.getDilithiumK(); i2++) {
            polyVecK2.getVectorIndex(i2).polyEtaPack(bArr4[4], dilithiumEngine.getDilithiumPolyEtaPackedBytes() * i2);
        }
        bArr4[5] = new byte[dilithiumEngine.getDilithiumK() * 416];
        for (int i3 = 0; i3 < dilithiumEngine.getDilithiumK(); i3++) {
            polyVecK.getVectorIndex(i3).polyt0Pack(bArr4[5], i3 * 416);
        }
        return bArr4;
    }

    public static byte[] packSignature(byte[] bArr, PolyVecL polyVecL, PolyVecK polyVecK, DilithiumEngine dilithiumEngine) {
        byte[] bArr2 = new byte[dilithiumEngine.getCryptoBytes()];
        System.arraycopy(bArr, 0, bArr2, 0, dilithiumEngine.getDilithiumCTilde());
        int dilithiumCTilde = dilithiumEngine.getDilithiumCTilde();
        for (int i = 0; i < dilithiumEngine.getDilithiumL(); i++) {
            System.arraycopy(polyVecL.getVectorIndex(i).zPack(), 0, bArr2, (dilithiumEngine.getDilithiumPolyZPackedBytes() * i) + dilithiumCTilde, dilithiumEngine.getDilithiumPolyZPackedBytes());
        }
        int dilithiumL = (dilithiumEngine.getDilithiumL() * dilithiumEngine.getDilithiumPolyZPackedBytes()) + dilithiumCTilde;
        for (int i2 = 0; i2 < dilithiumEngine.getDilithiumOmega() + dilithiumEngine.getDilithiumK(); i2++) {
            bArr2[dilithiumL + i2] = 0;
        }
        int i3 = 0;
        for (int i5 = 0; i5 < dilithiumEngine.getDilithiumK(); i5++) {
            for (int i6 = 0; i6 < 256; i6++) {
                if (polyVecK.getVectorIndex(i5).getCoeffIndex(i6) != 0) {
                    bArr2[i3 + dilithiumL] = (byte) i6;
                    i3++;
                }
            }
            bArr2[dilithiumEngine.getDilithiumOmega() + dilithiumL + i5] = (byte) i3;
        }
        return bArr2;
    }

    public static PolyVecK unpackPublicKey(PolyVecK polyVecK, byte[] bArr, DilithiumEngine dilithiumEngine) {
        int i = 0;
        while (i < dilithiumEngine.getDilithiumK()) {
            Poly vectorIndex = polyVecK.getVectorIndex(i);
            int i2 = i * 320;
            i++;
            vectorIndex.polyt1Unpack(Arrays.copyOfRange(bArr, i2, i * 320));
        }
        return polyVecK;
    }

    public static void unpackSecretKey(PolyVecK polyVecK, PolyVecL polyVecL, PolyVecK polyVecK2, byte[] bArr, byte[] bArr2, byte[] bArr3, DilithiumEngine dilithiumEngine) {
        for (int i = 0; i < dilithiumEngine.getDilithiumL(); i++) {
            polyVecL.getVectorIndex(i).polyEtaUnpack(bArr2, dilithiumEngine.getDilithiumPolyEtaPackedBytes() * i);
        }
        for (int i2 = 0; i2 < dilithiumEngine.getDilithiumK(); i2++) {
            polyVecK2.getVectorIndex(i2).polyEtaUnpack(bArr3, dilithiumEngine.getDilithiumPolyEtaPackedBytes() * i2);
        }
        for (int i3 = 0; i3 < dilithiumEngine.getDilithiumK(); i3++) {
            polyVecK.getVectorIndex(i3).polyt0Unpack(bArr, i3 * 416);
        }
    }

    public static boolean unpackSignature(PolyVecL polyVecL, PolyVecK polyVecK, byte[] bArr, DilithiumEngine dilithiumEngine) {
        int dilithiumCTilde = dilithiumEngine.getDilithiumCTilde();
        int i = 0;
        while (i < dilithiumEngine.getDilithiumL()) {
            Poly vectorIndex = polyVecL.getVectorIndex(i);
            int dilithiumPolyZPackedBytes = (dilithiumEngine.getDilithiumPolyZPackedBytes() * i) + dilithiumCTilde;
            i++;
            vectorIndex.zUnpack(Arrays.copyOfRange(bArr, dilithiumPolyZPackedBytes, (dilithiumEngine.getDilithiumPolyZPackedBytes() * i) + dilithiumCTilde));
        }
        int dilithiumL = (dilithiumEngine.getDilithiumL() * dilithiumEngine.getDilithiumPolyZPackedBytes()) + dilithiumCTilde;
        int i2 = 0;
        for (int i3 = 0; i3 < dilithiumEngine.getDilithiumK(); i3++) {
            for (int i5 = 0; i5 < 256; i5++) {
                polyVecK.getVectorIndex(i3).setCoeffIndex(i5, 0);
            }
            if ((bArr[dilithiumEngine.getDilithiumOmega() + dilithiumL + i3] & 255) < i2 || (bArr[dilithiumEngine.getDilithiumOmega() + dilithiumL + i3] & 255) > dilithiumEngine.getDilithiumOmega()) {
                return false;
            }
            for (int i6 = i2; i6 < (bArr[dilithiumEngine.getDilithiumOmega() + dilithiumL + i3] & 255); i6++) {
                if (i6 > i2) {
                    int i21 = dilithiumL + i6;
                    if ((bArr[i21] & UnsignedBytes.MAX_VALUE) <= (bArr[i21 - 1] & UnsignedBytes.MAX_VALUE)) {
                        return false;
                    }
                }
                polyVecK.getVectorIndex(i3).setCoeffIndex(bArr[dilithiumL + i6] & UnsignedBytes.MAX_VALUE, 1);
            }
            i2 = bArr[dilithiumEngine.getDilithiumOmega() + dilithiumL + i3];
        }
        while (i2 < dilithiumEngine.getDilithiumOmega()) {
            if ((bArr[dilithiumL + i2] & UnsignedBytes.MAX_VALUE) != 0) {
                return false;
            }
            i2++;
        }
        return true;
    }
}
