package org.bouncycastle.crypto.digests;

import a10.b;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class SM3Digest extends GeneralDigest {
    private static final int BLOCK_SIZE = 16;
    private static final int DIGEST_LENGTH = 32;
    private static final int[] T = new int[64];
    private int[] V;
    private int[] W;
    private int[] inwords;
    private int xOff;

    static {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            T[i2] = (2043430169 >>> (32 - i2)) | (2043430169 << i2);
            i2++;
        }
        for (i = 16; i < 64; i++) {
            int i3 = i % 32;
            T[i] = (2055708042 >>> (32 - i3)) | (2055708042 << i3);
        }
    }

    public SM3Digest() {
        this(CryptoServicePurpose.ANY);
    }

    private int FF0(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int FF1(int i, int i2, int i3) {
        return (i & (i2 | i3)) | (i2 & i3);
    }

    private int GG0(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int GG1(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    private int P0(int i) {
        return (i ^ ((i << 9) | (i >>> 23))) ^ ((i << 17) | (i >>> 15));
    }

    private int P1(int i) {
        return (i ^ ((i << 15) | (i >>> 17))) ^ ((i << 23) | (i >>> 9));
    }

    private void copyIn(SM3Digest sM3Digest) {
        int[] iArr = sM3Digest.V;
        int[] iArr2 = this.V;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = sM3Digest.inwords;
        int[] iArr4 = this.inwords;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.xOff = sM3Digest.xOff;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SM3Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 256, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.V, bArr, i);
        reset();
        return 32;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SM3";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 32;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        int i;
        int i2 = 0;
        while (true) {
            i = 16;
            if (i2 >= 16) {
                break;
            }
            this.W[i2] = this.inwords[i2];
            i2++;
        }
        for (int i3 = 16; i3 < 68; i3++) {
            int[] iArr = this.W;
            int i5 = iArr[i3 - 3];
            int i6 = iArr[i3 - 13];
            iArr[i3] = (P1(((i5 >>> 17) | (i5 << 15)) ^ (iArr[i3 - 16] ^ iArr[i3 - 9])) ^ ((i6 >>> 25) | (i6 << 7))) ^ this.W[i3 - 6];
        }
        int[] iArr2 = this.V;
        int i21 = iArr2[0];
        int i22 = iArr2[1];
        int i32 = iArr2[2];
        char c2 = 3;
        int i33 = iArr2[3];
        char c3 = 4;
        int iP0 = iArr2[4];
        char c5 = 5;
        int i43 = iArr2[5];
        char c6 = 6;
        int i59 = iArr2[6];
        int i66 = iArr2[7];
        int i74 = i59;
        int i92 = 0;
        while (i92 < i) {
            int i96 = (i21 << 12) | (i21 >>> 20);
            int i99 = i96 + iP0 + T[i92];
            int i100 = (i99 << 7) | (i99 >>> 25);
            char c7 = c2;
            int i101 = i100 ^ i96;
            char c16 = c3;
            int[] iArr3 = this.W;
            char c26 = c5;
            int i102 = iArr3[i92];
            int iC = b.C(FF0(i21, i22, i32), i33, i101, iArr3[i92 + 4] ^ i102);
            int iC2 = b.C(GG0(iP0, i43, i74), i66, i100, i102);
            int i103 = (i22 << 9) | (i22 >>> 23);
            int i104 = (i43 << 19) | (i43 >>> 13);
            i92++;
            i33 = i32;
            i43 = iP0;
            c3 = c16;
            c5 = c26;
            c6 = c6;
            iP0 = P0(iC2);
            i32 = i103;
            i66 = i74;
            i74 = i104;
            i = 16;
            i22 = i21;
            i21 = iC;
            c2 = c7;
        }
        char c28 = c2;
        char c29 = c3;
        char c33 = c5;
        char c39 = c6;
        int i105 = i66;
        int i106 = i74;
        int i107 = i21;
        int i108 = 16;
        while (i108 < 64) {
            int i109 = (i107 << 12) | (i107 >>> 20);
            int i110 = i109 + iP0 + T[i108];
            int i111 = (i110 >>> 25) | (i110 << 7);
            int[] iArr4 = this.W;
            int i112 = iArr4[i108];
            int iC3 = b.C(FF1(i107, i22, i32), i33, i109 ^ i111, iArr4[i108 + 4] ^ i112);
            int iC4 = b.C(GG1(iP0, i43, i106), i105, i111, i112);
            int i113 = (i43 << 19) | (i43 >>> 13);
            i108++;
            i33 = i32;
            i43 = iP0;
            iP0 = P0(iC4);
            i32 = (i22 >>> 23) | (i22 << 9);
            i105 = i106;
            i22 = i107;
            i107 = iC3;
            i106 = i113;
        }
        int[] iArr5 = this.V;
        iArr5[0] = i107 ^ iArr5[0];
        iArr5[1] = iArr5[1] ^ i22;
        iArr5[2] = iArr5[2] ^ i32;
        iArr5[c28] = iArr5[c28] ^ i33;
        iArr5[c29] = iArr5[c29] ^ iP0;
        iArr5[c33] = iArr5[c33] ^ i43;
        iArr5[c39] = i106 ^ iArr5[c39];
        iArr5[7] = iArr5[7] ^ i105;
        this.xOff = 0;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j2) {
        int i = this.xOff;
        if (i > 14) {
            this.inwords[i] = 0;
            this.xOff = i + 1;
            processBlock();
        }
        while (true) {
            int i2 = this.xOff;
            if (i2 >= 14) {
                int[] iArr = this.inwords;
                int i3 = i2 + 1;
                this.xOff = i3;
                iArr[i2] = (int) (j2 >>> 32);
                this.xOff = i2 + 2;
                iArr[i3] = (int) j2;
                return;
            }
            this.inwords[i2] = 0;
            this.xOff = i2 + 1;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        int[] iArr = this.inwords;
        int i2 = this.xOff;
        this.xOff = i2 + 1;
        iArr[i2] = Pack.bigEndianToInt(bArr, i);
        if (this.xOff >= 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        int[] iArr = this.V;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.xOff = 0;
    }

    public SM3Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SM3Digest sM3Digest = (SM3Digest) memoable;
        super.copyIn((GeneralDigest) sM3Digest);
        copyIn(sM3Digest);
    }

    public SM3Digest(SM3Digest sM3Digest) {
        super(sM3Digest);
        this.V = new int[8];
        this.inwords = new int[16];
        this.W = new int[68];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        copyIn(sM3Digest);
    }
}
