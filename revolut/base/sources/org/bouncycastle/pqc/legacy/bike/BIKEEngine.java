package org.bouncycastle.pqc.legacy.bike;

import com.google.common.primitives.UnsignedBytes;
import java.security.SecureRandom;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;

/* JADX INFO: loaded from: classes14.dex */
class BIKEEngine {
    private int L_BYTE;
    private int R2_BYTE;
    private int R_BYTE;
    private final BIKERing bikeRing;

    /* JADX INFO: renamed from: hw, reason: collision with root package name */
    private int f228899hw;
    private int nbIter;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f228900r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f228901t;
    private int tau;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f228902w;

    public BIKEEngine(int i, int i2, int i3, int i5, int i6, int i21) {
        this.f228900r = i;
        this.f228902w = i2;
        this.f228901t = i3;
        this.nbIter = i6;
        this.tau = i21;
        this.f228899hw = i2 / 2;
        this.L_BYTE = i5 / 8;
        this.R_BYTE = (i + 7) >>> 3;
        this.R2_BYTE = ((i * 2) + 7) >>> 3;
        this.bikeRing = new BIKERing(i);
    }

    private void BFIter(byte[] bArr, byte[] bArr2, int i, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        ctrAll(iArr3, bArr, bArr5);
        int i2 = bArr5[0] & UnsignedBytes.MAX_VALUE;
        int i3 = ((i2 - i) >> 31) + 1;
        int i5 = ((i2 - (i - this.tau)) >> 31) + 1;
        byte b4 = (byte) i3;
        bArr2[0] = (byte) (bArr2[0] ^ b4);
        bArr3[0] = b4;
        bArr4[0] = (byte) i5;
        int i6 = 1;
        while (true) {
            int i21 = this.f228900r;
            if (i6 >= i21) {
                break;
            }
            int i22 = bArr5[i6] & UnsignedBytes.MAX_VALUE;
            int i32 = ((i22 - i) >> 31) + 1;
            int i33 = ((i22 - (i - this.tau)) >> 31) + 1;
            int i43 = i21 - i6;
            byte b5 = (byte) i32;
            bArr2[i43] = (byte) (bArr2[i43] ^ b5);
            bArr3[i6] = b5;
            bArr4[i6] = (byte) i33;
            i6++;
        }
        ctrAll(iArr4, bArr, bArr5);
        int i59 = bArr5[0] & UnsignedBytes.MAX_VALUE;
        int i66 = ((i59 - i) >> 31) + 1;
        int i74 = ((i59 - (i - this.tau)) >> 31) + 1;
        int i92 = this.f228900r;
        byte b7 = (byte) i66;
        bArr2[i92] = (byte) (bArr2[i92] ^ b7);
        bArr3[i92] = b7;
        bArr4[i92] = (byte) i74;
        int i96 = 1;
        while (true) {
            int i99 = this.f228900r;
            if (i96 >= i99) {
                break;
            }
            int i100 = bArr5[i96] & UnsignedBytes.MAX_VALUE;
            int i101 = ((i100 - i) >> 31) + 1;
            int i102 = ((i100 - (i - this.tau)) >> 31) + 1;
            int i103 = (i99 + i99) - i96;
            byte b13 = (byte) i101;
            bArr2[i103] = (byte) (bArr2[i103] ^ b13);
            bArr3[i99 + i96] = b13;
            bArr4[i99 + i96] = (byte) i102;
            i96++;
        }
        for (int i104 = 0; i104 < this.f228900r * 2; i104++) {
            recomputeSyndrome(bArr, i104, iArr, iArr2, bArr3[i104] != 0);
        }
    }

    private void BFIter2(byte[] bArr, byte[] bArr2, int i, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, byte[] bArr3) {
        int[] iArr5 = new int[this.f228900r * 2];
        ctrAll(iArr3, bArr, bArr3);
        int i2 = (((bArr3[0] & UnsignedBytes.MAX_VALUE) - i) >> 31) + 1;
        bArr2[0] = (byte) (bArr2[0] ^ ((byte) i2));
        iArr5[0] = i2;
        int i3 = 1;
        while (true) {
            int i5 = this.f228900r;
            if (i3 >= i5) {
                break;
            }
            int i6 = (((bArr3[i3] & UnsignedBytes.MAX_VALUE) - i) >> 31) + 1;
            int i21 = i5 - i3;
            bArr2[i21] = (byte) (bArr2[i21] ^ ((byte) i6));
            iArr5[i3] = i6;
            i3++;
        }
        ctrAll(iArr4, bArr, bArr3);
        int i22 = (((bArr3[0] & UnsignedBytes.MAX_VALUE) - i) >> 31) + 1;
        int i32 = this.f228900r;
        bArr2[i32] = (byte) (bArr2[i32] ^ ((byte) i22));
        iArr5[i32] = i22;
        int i33 = 1;
        while (true) {
            int i43 = this.f228900r;
            if (i33 >= i43) {
                break;
            }
            int i59 = (((bArr3[i33] & UnsignedBytes.MAX_VALUE) - i) >> 31) + 1;
            int i66 = (i43 + i43) - i33;
            bArr2[i66] = (byte) (bArr2[i66] ^ ((byte) i59));
            iArr5[i43 + i33] = i59;
            i33++;
        }
        for (int i74 = 0; i74 < this.f228900r * 2; i74++) {
            recomputeSyndrome(bArr, i74, iArr, iArr2, iArr5[i74] == 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v2 */
    private void BFMaskedIter(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int[] iArr5 = new int[this.f228900r * 2];
        int i2 = 0;
        while (true) {
            if (i2 >= this.f228900r) {
                break;
            }
            if (bArr3[i2] == 1) {
                ?? r4 = ctr(iArr3, bArr, i2) < i ? 0 : 1;
                updateNewErrorIndex(bArr2, i2, r4);
                iArr5[i2] = r4;
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            int i5 = this.f228900r;
            if (i3 >= i5) {
                break;
            }
            if (bArr3[i5 + i3] == 1) {
                ?? r2 = ctr(iArr4, bArr, i3) >= i ? 1 : 0;
                updateNewErrorIndex(bArr2, this.f228900r + i3, r2);
                iArr5[this.f228900r + i3] = r2;
            }
            i3++;
        }
        int i6 = 0;
        while (i6 < this.f228900r * 2) {
            int[] iArr6 = iArr;
            int[] iArr7 = iArr2;
            byte[] bArr4 = bArr;
            recomputeSyndrome(bArr4, i6, iArr6, iArr7, iArr5[i6] == 1);
            i6++;
            bArr = bArr4;
            iArr2 = iArr7;
            iArr = iArr6;
        }
    }

    private byte[] BGFDecoder(byte[] bArr, int[] iArr, int[] iArr2) {
        byte[] bArr2 = new byte[this.f228900r * 2];
        int[] columnFromCompactVersion = getColumnFromCompactVersion(iArr);
        int[] columnFromCompactVersion2 = getColumnFromCompactVersion(iArr2);
        int i = this.f228900r;
        byte[] bArr3 = new byte[i * 2];
        byte[] bArr4 = new byte[i];
        byte[] bArr5 = new byte[i * 2];
        BIKEEngine bIKEEngine = this;
        bIKEEngine.BFIter(bArr, bArr2, threshold(BIKEUtils.getHammingWeight(bArr), this.f228900r), iArr, iArr2, columnFromCompactVersion, columnFromCompactVersion2, bArr3, bArr5, bArr4);
        int i2 = 1;
        bIKEEngine.BFMaskedIter(bArr, bArr2, bArr3, ((bIKEEngine.f228899hw + 1) / 2) + 1, iArr, iArr2, columnFromCompactVersion, columnFromCompactVersion2);
        bIKEEngine.BFMaskedIter(bArr, bArr2, bArr5, ((bIKEEngine.f228899hw + 1) / 2) + 1, iArr, iArr2, columnFromCompactVersion, columnFromCompactVersion2);
        while (i2 < bIKEEngine.nbIter) {
            Arrays.fill(bArr3, (byte) 0);
            bIKEEngine.BFIter2(bArr, bArr2, threshold(BIKEUtils.getHammingWeight(bArr), bIKEEngine.f228900r), iArr, iArr2, columnFromCompactVersion, columnFromCompactVersion2, bArr4);
            i2++;
            bIKEEngine = this;
        }
        if (BIKEUtils.getHammingWeight(bArr) == 0) {
            return bArr2;
        }
        return null;
    }

    private byte[] computeSyndrome(byte[] bArr, byte[] bArr2) {
        long[] jArrCreate = this.bikeRing.create();
        long[] jArrCreate2 = this.bikeRing.create();
        this.bikeRing.decodeBytes(bArr, jArrCreate);
        this.bikeRing.decodeBytes(bArr2, jArrCreate2);
        this.bikeRing.multiply(jArrCreate, jArrCreate2, jArrCreate);
        return this.bikeRing.encodeBitsTransposed(jArrCreate);
    }

    private void convertToCompact(int[] iArr, byte[] bArr) {
        int i;
        int i2 = 0;
        for (int i3 = 0; i3 < this.R_BYTE; i3++) {
            for (int i5 = 0; i5 < 8 && (i = (i3 * 8) + i5) != this.f228900r; i5++) {
                int i6 = (bArr[i3] >> i5) & 1;
                int i21 = -i6;
                iArr[i2] = (i & i21) | ((~i21) & iArr[i2]);
                i2 = (i2 + i6) % this.f228899hw;
            }
        }
    }

    private int ctr(int[] iArr, byte[] bArr, int i) {
        int i2 = this.f228899hw - 4;
        int i3 = 0;
        int i5 = 0;
        while (i3 <= i2) {
            int i6 = iArr[i3] + i;
            int i21 = this.f228900r;
            int i22 = i6 - i21;
            int i32 = (iArr[i3 + 1] + i) - i21;
            int i33 = (iArr[i3 + 2] + i) - i21;
            int i43 = (iArr[i3 + 3] + i) - i21;
            i5 = i5 + (bArr[i22 + ((i22 >> 31) & i21)] & UnsignedBytes.MAX_VALUE) + (bArr[i32 + ((i32 >> 31) & i21)] & UnsignedBytes.MAX_VALUE) + (bArr[i33 + ((i33 >> 31) & i21)] & UnsignedBytes.MAX_VALUE) + (bArr[i43 + (i21 & (i43 >> 31))] & UnsignedBytes.MAX_VALUE);
            i3 += 4;
        }
        while (i3 < this.f228899hw) {
            int i59 = iArr[i3] + i;
            int i66 = this.f228900r;
            int i74 = i59 - i66;
            i5 += bArr[i74 + (i66 & (i74 >> 31))] & UnsignedBytes.MAX_VALUE;
            i3++;
        }
        return i5;
    }

    private void ctrAll(int[] iArr, byte[] bArr, byte[] bArr2) {
        int i = iArr[0];
        int i2 = this.f228900r - i;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        System.arraycopy(bArr, 0, bArr2, i2, i);
        for (int i3 = 1; i3 < this.f228899hw; i3++) {
            int i5 = iArr[i3];
            int i6 = this.f228900r - i5;
            int i21 = i6 - 4;
            int i22 = 0;
            while (i22 <= i21) {
                int i32 = i5 + i22;
                bArr2[i22] = (byte) (bArr2[i22] + (bArr[i32] & UnsignedBytes.MAX_VALUE));
                int i33 = i22 + 1;
                bArr2[i33] = (byte) (bArr2[i33] + (bArr[i32 + 1] & UnsignedBytes.MAX_VALUE));
                int i43 = i22 + 2;
                bArr2[i43] = (byte) (bArr2[i43] + (bArr[i32 + 2] & UnsignedBytes.MAX_VALUE));
                int i59 = i22 + 3;
                bArr2[i59] = (byte) (bArr2[i59] + (bArr[i32 + 3] & UnsignedBytes.MAX_VALUE));
                i22 += 4;
            }
            while (i22 < i6) {
                bArr2[i22] = (byte) (bArr2[i22] + (bArr[i5 + i22] & UnsignedBytes.MAX_VALUE));
                i22++;
            }
            int i66 = this.f228900r - 4;
            int i74 = i6;
            while (i74 <= i66) {
                bArr2[i74] = (byte) (bArr2[i74] + (bArr[i74 - i6] & UnsignedBytes.MAX_VALUE));
                int i92 = i74 + 1;
                bArr2[i92] = (byte) (bArr2[i92] + (bArr[i92 - i6] & UnsignedBytes.MAX_VALUE));
                int i96 = i74 + 2;
                bArr2[i96] = (byte) (bArr2[i96] + (bArr[i96 - i6] & UnsignedBytes.MAX_VALUE));
                int i99 = i74 + 3;
                bArr2[i99] = (byte) (bArr2[i99] + (bArr[i99 - i6] & UnsignedBytes.MAX_VALUE));
                i74 += 4;
            }
            while (i74 < this.f228900r) {
                bArr2[i74] = (byte) (bArr2[i74] + (bArr[i74 - i6] & UnsignedBytes.MAX_VALUE));
                i74++;
            }
        }
    }

    private byte[] functionH(byte[] bArr) {
        byte[] bArr2 = new byte[this.R_BYTE * 2];
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr, 0, bArr.length);
        BIKEUtils.generateRandomByteArray(bArr2, this.f228900r * 2, this.f228901t, sHAKEDigest);
        return bArr2;
    }

    private void functionK(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = new byte[48];
        SHA3Digest sHA3Digest = new SHA3Digest(384);
        sHA3Digest.update(bArr, 0, bArr.length);
        sHA3Digest.update(bArr2, 0, bArr2.length);
        sHA3Digest.update(bArr3, 0, bArr3.length);
        sHA3Digest.doFinal(bArr5, 0);
        System.arraycopy(bArr5, 0, bArr4, 0, this.L_BYTE);
    }

    private void functionL(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[48];
        SHA3Digest sHA3Digest = new SHA3Digest(384);
        sHA3Digest.update(bArr, 0, bArr.length);
        sHA3Digest.update(bArr2, 0, bArr2.length);
        sHA3Digest.doFinal(bArr4, 0);
        System.arraycopy(bArr4, 0, bArr3, 0, this.L_BYTE);
    }

    private int[] getColumnFromCompactVersion(int[] iArr) {
        int[] iArr2 = new int[this.f228899hw];
        int i = 0;
        if (iArr[0] != 0) {
            while (true) {
                int i2 = this.f228899hw;
                if (i >= i2) {
                    break;
                }
                iArr2[i] = this.f228900r - iArr[(i2 - 1) - i];
                i++;
            }
        } else {
            iArr2[0] = 0;
            int i3 = 1;
            while (true) {
                int i5 = this.f228899hw;
                if (i3 >= i5) {
                    break;
                }
                iArr2[i3] = this.f228900r - iArr[i5 - i3];
                i3++;
            }
        }
        return iArr2;
    }

    private void recomputeSyndrome(byte[] bArr, int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        if (i < this.f228900r) {
            while (i2 < this.f228899hw) {
                int i3 = iArr[i2];
                if (i3 <= i) {
                    int i5 = i - i3;
                    bArr[i5] = (byte) (bArr[i5] ^ (z ? 1 : 0));
                } else {
                    int i6 = (this.f228900r + i) - i3;
                    bArr[i6] = (byte) (bArr[i6] ^ (z ? 1 : 0));
                }
                i2++;
            }
            return;
        }
        while (i2 < this.f228899hw) {
            int i21 = iArr2[i2];
            int i22 = this.f228900r;
            if (i21 <= i - i22) {
                int i32 = (i - i22) - i21;
                bArr[i32] = (byte) (bArr[i32] ^ (z ? 1 : 0));
            } else {
                int i33 = (i - i22) + (i22 - i21);
                bArr[i33] = (byte) (bArr[i33] ^ (z ? 1 : 0));
            }
            i2++;
        }
    }

    private void splitEBytes(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i = this.f228900r & 7;
        int i2 = 0;
        System.arraycopy(bArr, 0, bArr2, 0, this.R_BYTE - 1);
        int i3 = this.R_BYTE;
        byte b4 = bArr[i3 - 1];
        byte b5 = (byte) ((-1) << i);
        bArr2[i3 - 1] = (byte) ((~b5) & b4);
        byte b7 = (byte) (b4 & b5);
        while (true) {
            int i5 = this.R_BYTE;
            if (i2 >= i5) {
                return;
            }
            byte b13 = bArr[i5 + i2];
            bArr3[i2] = (byte) (((b7 & UnsignedBytes.MAX_VALUE) >>> i) | (b13 << (8 - i)));
            i2++;
            b7 = b13;
        }
    }

    private int threshold(int i, int i2) {
        if (i2 == 12323) {
            return thresholdFromParameters(i, 0.0069722d, 13.53d, 36);
        }
        if (i2 == 24659) {
            return thresholdFromParameters(i, 0.005265d, 15.2588d, 52);
        }
        if (i2 == 40973) {
            return thresholdFromParameters(i, 0.00402312d, 17.8785d, 69);
        }
        throw new IllegalArgumentException();
    }

    private static int thresholdFromParameters(int i, double d, double d5, int i2) {
        return Math.max(i2, (int) Math.floor((d * ((double) i)) + d5));
    }

    private void updateNewErrorIndex(byte[] bArr, int i, boolean z) {
        int i2;
        if (i != 0 && i != (i2 = this.f228900r)) {
            i = i > i2 ? ((i2 * 2) - i) + i2 : i2 - i;
        }
        bArr[i] = (byte) ((z ? 1 : 0) ^ bArr[i]);
    }

    public void decaps(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        int i = this.f228899hw;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        convertToCompact(iArr, bArr2);
        convertToCompact(iArr2, bArr3);
        byte[] bArrBGFDecoder = BGFDecoder(computeSyndrome(bArr5, bArr2), iArr, iArr2);
        byte[] bArr7 = new byte[this.R_BYTE * 2];
        BIKEUtils.fromBitArrayToByteArray(bArr7, bArrBGFDecoder, 0, this.f228900r * 2);
        int i2 = this.R_BYTE;
        byte[] bArr8 = new byte[i2];
        byte[] bArr9 = new byte[i2];
        splitEBytes(bArr7, bArr8, bArr9);
        byte[] bArr10 = new byte[this.L_BYTE];
        functionL(bArr8, bArr9, bArr10);
        Bytes.xorTo(this.L_BYTE, bArr6, bArr10);
        if (Arrays.constantTimeAreEqual(this.R2_BYTE, bArr7, 0, functionH(bArr10), 0)) {
            functionK(bArr10, bArr5, bArr6, bArr);
        } else {
            functionK(bArr4, bArr5, bArr6, bArr);
        }
    }

    public void encaps(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, SecureRandom secureRandom) {
        byte[] bArr5 = new byte[this.L_BYTE];
        secureRandom.nextBytes(bArr5);
        byte[] bArrFunctionH = functionH(bArr5);
        int i = this.R_BYTE;
        byte[] bArr6 = new byte[i];
        byte[] bArr7 = new byte[i];
        splitEBytes(bArrFunctionH, bArr6, bArr7);
        long[] jArrCreate = this.bikeRing.create();
        long[] jArrCreate2 = this.bikeRing.create();
        this.bikeRing.decodeBytes(bArr6, jArrCreate);
        this.bikeRing.decodeBytes(bArr7, jArrCreate2);
        long[] jArrCreate3 = this.bikeRing.create();
        this.bikeRing.decodeBytes(bArr4, jArrCreate3);
        this.bikeRing.multiply(jArrCreate3, jArrCreate2, jArrCreate3);
        this.bikeRing.add(jArrCreate3, jArrCreate, jArrCreate3);
        this.bikeRing.encodeBytes(jArrCreate3, bArr);
        functionL(bArr6, bArr7, bArr2);
        Bytes.xorTo(this.L_BYTE, bArr5, bArr2);
        functionK(bArr5, bArr, bArr2, bArr3);
    }

    public void genKeyPair(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, SecureRandom secureRandom) {
        byte[] bArr5 = new byte[64];
        secureRandom.nextBytes(bArr5);
        SHAKEDigest sHAKEDigest = new SHAKEDigest(256);
        sHAKEDigest.update(bArr5, 0, this.L_BYTE);
        BIKEUtils.generateRandomByteArray(bArr, this.f228900r, this.f228899hw, sHAKEDigest);
        BIKEUtils.generateRandomByteArray(bArr2, this.f228900r, this.f228899hw, sHAKEDigest);
        long[] jArrCreate = this.bikeRing.create();
        long[] jArrCreate2 = this.bikeRing.create();
        this.bikeRing.decodeBytes(bArr, jArrCreate);
        this.bikeRing.decodeBytes(bArr2, jArrCreate2);
        long[] jArrCreate3 = this.bikeRing.create();
        this.bikeRing.inv(jArrCreate, jArrCreate3);
        this.bikeRing.multiply(jArrCreate3, jArrCreate2, jArrCreate3);
        this.bikeRing.encodeBytes(jArrCreate3, bArr4);
        System.arraycopy(bArr5, this.L_BYTE, bArr3, 0, bArr3.length);
    }

    public int getSessionKeySize() {
        return this.L_BYTE;
    }
}
