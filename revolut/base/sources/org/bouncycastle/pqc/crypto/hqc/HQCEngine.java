package org.bouncycastle.pqc.crypto.hqc;

import com.google.common.primitives.UnsignedBytes;
import java.security.SecureRandom;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
class HQCEngine {
    private static final int SALT_BYTES = 16;
    private static final int SEED_BYTES = 32;
    private final int N1N2_BYTE;
    private final int N1N2_BYTE_64;
    private final int N_BYTE;
    private final int cipherTextBytes;
    private final int delta;
    private final int fft;
    private final int[] generatorPoly;
    private final GF2x gf2x;
    private final int k;
    private final int mulParam;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f228807n;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private final int f228808n1;
    private final int nMu;
    private final int pkSize;
    private final int rejectionThreshold;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f228809w;

    /* JADX INFO: renamed from: wr, reason: collision with root package name */
    private final int f228810wr;

    public HQCEngine(int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32, int i33, int i43, int[] iArr) {
        this.f228807n = i;
        this.k = i5;
        this.delta = i6;
        this.f228809w = i21;
        this.f228810wr = i22;
        this.f228808n1 = i2;
        this.generatorPoly = iArr;
        this.fft = i32;
        this.nMu = i33;
        this.pkSize = i43;
        this.mulParam = i3 >> 7;
        int byteSizeFromBitSize = Utils.getByteSizeFromBitSize(i);
        this.N_BYTE = byteSizeFromBitSize;
        int i59 = i2 * i3;
        this.N1N2_BYTE_64 = Utils.getByte64SizeFromBitSize(i59);
        int byteSizeFromBitSize2 = Utils.getByteSizeFromBitSize(i59);
        this.N1N2_BYTE = byteSizeFromBitSize2;
        this.gf2x = new GF2x(i);
        this.rejectionThreshold = (16777216 / i) * i;
        this.cipherTextBytes = byteSizeFromBitSize + byteSizeFromBitSize2 + 16;
    }

    private int barrettReduce(int i) {
        int i2 = (int) ((((long) i) * ((long) this.nMu)) >>> 32);
        int i3 = this.f228807n;
        int i5 = (i - i3) - (i2 * i3);
        return i5 + ((i5 >> 31) & i3);
    }

    private static int cdiff(int i, int i2) {
        return ((i - i2) | (i2 - i)) >> 31;
    }

    private void generateRandomSupport(int[] iArr, int i, Shake256RandomGenerator shake256RandomGenerator) {
        int i2 = i * 3;
        byte[] bArr = new byte[i2];
        int i3 = i2;
        int i5 = 0;
        while (i5 < i) {
            if (i3 == i2) {
                shake256RandomGenerator.xofGetBytes(bArr, i2);
                i3 = 0;
            }
            int i6 = i3 + 2;
            int i21 = ((bArr[i3 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i3] & UnsignedBytes.MAX_VALUE) << 16);
            i3 += 3;
            int i22 = i21 | (bArr[i6] & UnsignedBytes.MAX_VALUE);
            if (i22 < this.rejectionThreshold) {
                int iBarrettReduce = barrettReduce(i22);
                int i32 = 0;
                while (true) {
                    if (i32 >= i5) {
                        iArr[i5] = iBarrettReduce;
                        i5++;
                        break;
                    } else if (iArr[i32] == iBarrettReduce) {
                        break;
                    } else {
                        i32++;
                    }
                }
            }
        }
    }

    private static void hashGJ(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2, int i3, byte[] bArr4, int i5, int i6, byte b4) {
        SHA3Digest sHA3Digest = new SHA3Digest(i);
        sHA3Digest.update(bArr2, 0, bArr2.length);
        sHA3Digest.update(bArr3, i2, i3);
        sHA3Digest.update(bArr4, i5, i6);
        sHA3Digest.update(b4);
        sHA3Digest.doFinal(bArr, 0);
    }

    private static void hashHI(byte[] bArr, int i, byte[] bArr2, int i2, byte b4) {
        SHA3Digest sHA3Digest = new SHA3Digest(i);
        sHA3Digest.update(bArr2, 0, i2);
        sHA3Digest.update(b4);
        sHA3Digest.doFinal(bArr, 0);
    }

    private void pkeEncrypt(long[] jArr, long[] jArr2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        long[] jArrCreate = this.gf2x.create();
        long[] jArrCreate2 = this.gf2x.create();
        int i2 = this.f228808n1;
        byte[] bArr4 = new byte[i2];
        ReedSolomon.encode(bArr4, bArr2, i2, this.k, this.generatorPoly);
        ReedMuller.encode(jArr2, bArr4, this.f228808n1, this.mulParam);
        Shake256RandomGenerator shake256RandomGenerator = new Shake256RandomGenerator(bArr, 0, 32, (byte) 1);
        this.gf2x.random(shake256RandomGenerator, jArrCreate2);
        shake256RandomGenerator.init(bArr3, i, 32, (byte) 1);
        vectSampleFixedWeights2(shake256RandomGenerator, jArrCreate, this.f228810wr);
        this.gf2x.mul(jArrCreate2, jArrCreate, jArr);
        Utils.fromByteArrayToLongArray(jArrCreate2, bArr, 32, this.pkSize - 32);
        this.gf2x.mul(jArrCreate2, jArrCreate, jArrCreate2);
        vectSampleFixedWeights2(shake256RandomGenerator, jArrCreate, this.f228810wr);
        this.gf2x.addTo(jArrCreate, jArrCreate2);
        vectTruncate(jArrCreate2);
        Nat.xorTo64(this.N1N2_BYTE_64, jArrCreate2, jArr2);
        vectSampleFixedWeights2(shake256RandomGenerator, jArrCreate2, this.f228810wr);
        this.gf2x.addTo(jArrCreate2, jArr);
        this.gf2x.clear(jArrCreate);
        this.gf2x.clear(jArrCreate2);
        Arrays.clear(bArr4);
    }

    private void vectSampleFixedWeight1(long[] jArr, Shake256RandomGenerator shake256RandomGenerator, int i) {
        int[] iArr = new int[this.f228810wr];
        generateRandomSupport(iArr, i, shake256RandomGenerator);
        writeSupportToVector(jArr, iArr, i);
    }

    private void vectSampleFixedWeights2(Shake256RandomGenerator shake256RandomGenerator, long[] jArr, int i) {
        int i2 = this.f228810wr << 2;
        byte[] bArr = new byte[i2];
        shake256RandomGenerator.xofGetBytes(bArr, i2);
        int[] iArr = new int[this.f228810wr];
        Pack.littleEndianToInt(bArr, 0, iArr);
        int i3 = i;
        while (true) {
            int i5 = i3 - 1;
            if (i5 < 0) {
                writeSupportToVector(jArr, iArr, i);
                return;
            }
            int i6 = ((int) (((((long) iArr[i5]) & BodyPartID.bodyIdMax) * ((long) (this.f228807n - i5))) >> 32)) + i5;
            int iCdiff = -1;
            while (i3 < i) {
                iCdiff &= cdiff(i6, iArr[i3]);
                i3++;
            }
            iArr[i5] = ((~iCdiff) & i5) ^ (i6 & iCdiff);
            i3 = i5;
        }
    }

    private void vectTruncate(long[] jArr) {
        Arrays.fill(jArr, this.N1N2_BYTE_64, (this.f228807n + 63) >> 6, 0L);
    }

    private void writeSupportToVector(long[] jArr, int[] iArr, int i) {
        int i2 = this.f228810wr;
        int[] iArr2 = new int[i2];
        long[] jArr2 = new long[i2];
        for (int i3 = 0; i3 < i; i3++) {
            iArr2[i3] = iArr[i3] >>> 6;
            jArr2[i3] = 1 << (iArr[i3] & 63);
        }
        for (int i5 = 0; i5 < jArr.length; i5++) {
            long j2 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i21 = i5 - iArr2[i6];
                j2 |= jArr2[i6] & ((long) (~((i21 | (-i21)) >> 31)));
            }
            jArr[i5] = j2;
        }
    }

    public int decaps(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        long[] jArrCreate = this.gf2x.create();
        long[] jArrCreate2 = this.gf2x.create();
        long[] jArrCreate3 = this.gf2x.create();
        long[] jArrCreate4 = this.gf2x.create();
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[64];
        int i = this.k;
        byte[] bArr6 = new byte[i];
        byte[] bArr7 = new byte[32];
        byte[] bArr8 = new byte[this.f228808n1];
        vectSampleFixedWeight1(jArrCreate4, new Shake256RandomGenerator(bArr3, this.pkSize, 32, (byte) 1), this.f228809w);
        Utils.fromByteArrayToLongArray(jArrCreate, bArr2, 0, this.N_BYTE);
        Utils.fromByteArrayToLongArray(jArrCreate2, bArr2, this.N_BYTE, this.N1N2_BYTE);
        this.gf2x.mul(jArrCreate4, jArrCreate, jArrCreate3);
        vectTruncate(jArrCreate3);
        this.gf2x.addTo(jArrCreate2, jArrCreate3);
        ReedMuller.decode(bArr8, jArrCreate3, this.f228808n1, this.mulParam);
        ReedSolomon.decode(bArr6, bArr8, this.f228808n1, this.fft, this.delta, this.k, this.generatorPoly.length);
        hashHI(bArr4, 256, bArr3, this.pkSize, (byte) 1);
        hashGJ(bArr5, 512, bArr4, bArr6, 0, i, bArr2, this.N_BYTE + this.N1N2_BYTE, 16, (byte) 0);
        System.arraycopy(bArr5, 0, bArr, 0, 32);
        Arrays.fill(jArrCreate4, 0L);
        pkeEncrypt(jArrCreate3, jArrCreate4, bArr3, bArr6, bArr5, 32);
        hashGJ(bArr7, 256, bArr4, bArr3, this.pkSize + 32, this.k, bArr2, 0, bArr2.length, (byte) 3);
        int iEqualTo = (int) (this.gf2x.equalTo(jArrCreate, jArrCreate3) & this.gf2x.equalTo(jArrCreate2, jArrCreate4));
        for (int i2 = 0; i2 < this.k; i2++) {
            bArr[i2] = (byte) (((bArr[i2] & iEqualTo) ^ (bArr7[i2] & (~iEqualTo))) & 255);
        }
        this.gf2x.clear(jArrCreate);
        this.gf2x.clear(jArrCreate2);
        this.gf2x.clear(jArrCreate3);
        this.gf2x.clear(jArrCreate4);
        Arrays.clear(bArr4);
        Arrays.clear(bArr5);
        Arrays.clear(bArr6);
        Arrays.clear(bArr7);
        Arrays.clear(bArr8);
        return -iEqualTo;
    }

    public void encaps(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, SecureRandom secureRandom) {
        int i = this.k;
        byte[] bArr6 = new byte[i];
        byte[] bArr7 = new byte[32];
        long[] jArrCreate = this.gf2x.create();
        long[] jArr = new long[this.N1N2_BYTE_64];
        secureRandom.nextBytes(bArr6);
        secureRandom.nextBytes(bArr5);
        hashHI(bArr7, 256, bArr4, bArr4.length, (byte) 1);
        hashGJ(bArr3, 512, bArr7, bArr6, 0, i, bArr5, 0, 16, (byte) 0);
        pkeEncrypt(jArrCreate, jArr, bArr4, bArr6, bArr3, 32);
        Utils.fromLongArrayToByteArray(bArr, 0, bArr.length, jArrCreate);
        Utils.fromLongArrayToByteArray(bArr2, 0, bArr2.length, jArr);
        this.gf2x.clear(jArrCreate);
        Arrays.clear(jArr);
        Arrays.clear(bArr6);
        Arrays.clear(bArr7);
    }

    public void genKeyPair(byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        byte[] bArr3 = new byte[32];
        byte[] bArr4 = new byte[64];
        long[] jArrCreate = this.gf2x.create();
        long[] jArrCreate2 = this.gf2x.create();
        long[] jArrCreate3 = this.gf2x.create();
        secureRandom.nextBytes(bArr3);
        Shake256RandomGenerator shake256RandomGenerator = new Shake256RandomGenerator(bArr3, (byte) 1);
        System.arraycopy(bArr3, 0, bArr2, this.pkSize + 32 + this.k, 32);
        shake256RandomGenerator.nextBytes(bArr3);
        shake256RandomGenerator.nextBytes(bArr2, this.pkSize + 32, this.k);
        hashHI(bArr4, 512, bArr3, 32, (byte) 2);
        shake256RandomGenerator.init(bArr4, 0, 32, (byte) 1);
        vectSampleFixedWeight1(jArrCreate2, shake256RandomGenerator, this.f228809w);
        vectSampleFixedWeight1(jArrCreate, shake256RandomGenerator, this.f228809w);
        System.arraycopy(bArr4, 32, bArr, 0, 32);
        shake256RandomGenerator.init(bArr4, 32, 32, (byte) 1);
        this.gf2x.random(shake256RandomGenerator, jArrCreate3);
        this.gf2x.mul(jArrCreate3, jArrCreate2, jArrCreate3);
        this.gf2x.addTo(jArrCreate, jArrCreate3);
        Utils.fromLongArrayToByteArray(bArr, 32, bArr.length - 32, jArrCreate3);
        System.arraycopy(bArr4, 0, bArr2, this.pkSize, 32);
        System.arraycopy(bArr, 0, bArr2, 0, this.pkSize);
        Arrays.clear(bArr4);
        this.gf2x.clear(jArrCreate);
        this.gf2x.clear(jArrCreate2);
        this.gf2x.clear(jArrCreate3);
    }

    public int getCipherTextBytes() {
        return this.cipherTextBytes;
    }
}
