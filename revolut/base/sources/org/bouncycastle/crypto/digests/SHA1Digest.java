package org.bouncycastle.crypto.digests;

import a10.b;
import org.bouncycastle.crypto.CryptoServiceProperties;
import org.bouncycastle.crypto.CryptoServicePurpose;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.util.Memoable;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class SHA1Digest extends GeneralDigest implements EncodableDigest {
    private static final int DIGEST_LENGTH = 20;
    private static final int Y1 = 1518500249;
    private static final int Y2 = 1859775393;
    private static final int Y3 = -1894007588;
    private static final int Y4 = -899497514;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int[] X;
    private int xOff;

    public SHA1Digest() {
        this(CryptoServicePurpose.ANY);
    }

    private void copyIn(SHA1Digest sHA1Digest) {
        this.H1 = sHA1Digest.H1;
        this.H2 = sHA1Digest.H2;
        this.H3 = sHA1Digest.H3;
        this.H4 = sHA1Digest.H4;
        this.H5 = sHA1Digest.H5;
        int[] iArr = sHA1Digest.X;
        System.arraycopy(iArr, 0, this.X, 0, iArr.length);
        this.xOff = sHA1Digest.xOff;
    }

    private int f(int i, int i2, int i3) {
        return ((~i) & i3) | (i2 & i);
    }

    private int g(int i, int i2, int i3) {
        return (i & (i2 | i3)) | (i2 & i3);
    }

    private int h(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    @Override // org.bouncycastle.util.Memoable
    public Memoable copy() {
        return new SHA1Digest(this);
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public CryptoServiceProperties cryptoServiceProperties() {
        return Utils.getDefaultProperties(this, 128, this.purpose);
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i) {
        finish();
        Pack.intToBigEndian(this.H1, bArr, i);
        Pack.intToBigEndian(this.H2, bArr, i + 4);
        Pack.intToBigEndian(this.H3, bArr, i + 8);
        Pack.intToBigEndian(this.H4, bArr, i + 12);
        Pack.intToBigEndian(this.H5, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "SHA-1";
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.digests.EncodableDigest, org.bouncycastle.crypto.EncodableService
    public byte[] getEncodedState() {
        int i = this.xOff * 4;
        byte[] bArr = new byte[i + 41];
        super.populateState(bArr);
        Pack.intToBigEndian(this.H1, bArr, 16);
        Pack.intToBigEndian(this.H2, bArr, 20);
        Pack.intToBigEndian(this.H3, bArr, 24);
        Pack.intToBigEndian(this.H4, bArr, 28);
        Pack.intToBigEndian(this.H5, bArr, 32);
        Pack.intToBigEndian(this.xOff, bArr, 36);
        for (int i2 = 0; i2 != this.xOff; i2++) {
            Pack.intToBigEndian(this.X[i2], bArr, (i2 * 4) + 40);
        }
        bArr[i + 40] = (byte) this.purpose.ordinal();
        return bArr;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processBlock() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.X;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int iC = this.H1;
        int iC2 = this.H2;
        int i3 = this.H3;
        int i5 = this.H4;
        int i6 = this.H5;
        int i21 = 0;
        for (int i22 = 0; i22 < 4; i22++) {
            int iC3 = b.C(((iC << 5) | (iC >>> 27)) + f(iC2, i3, i5), this.X[i21], Y1, i6);
            int i32 = (iC2 >>> 2) | (iC2 << 30);
            int iC4 = b.C(((iC3 << 5) | (iC3 >>> 27)) + f(iC, i32, i3), this.X[i21 + 1], Y1, i5);
            int i33 = (iC >>> 2) | (iC << 30);
            int iC5 = b.C(((iC4 << 5) | (iC4 >>> 27)) + f(iC3, i33, i32), this.X[i21 + 2], Y1, i3);
            i6 = (iC3 >>> 2) | (iC3 << 30);
            int i43 = i21 + 4;
            iC2 = b.C(((iC5 << 5) | (iC5 >>> 27)) + f(iC4, i6, i33), this.X[i21 + 3], Y1, i32);
            i5 = (iC4 >>> 2) | (iC4 << 30);
            i21 += 5;
            iC = b.C(((iC2 << 5) | (iC2 >>> 27)) + f(iC5, i5, i6), this.X[i43], Y1, i33);
            i3 = (iC5 >>> 2) | (iC5 << 30);
        }
        for (int i59 = 0; i59 < 4; i59++) {
            int iC6 = b.C(((iC << 5) | (iC >>> 27)) + h(iC2, i3, i5), this.X[i21], Y2, i6);
            int i66 = (iC2 >>> 2) | (iC2 << 30);
            int iC7 = b.C(((iC6 << 5) | (iC6 >>> 27)) + h(iC, i66, i3), this.X[i21 + 1], Y2, i5);
            int i74 = (iC >>> 2) | (iC << 30);
            int iC8 = b.C(((iC7 << 5) | (iC7 >>> 27)) + h(iC6, i74, i66), this.X[i21 + 2], Y2, i3);
            i6 = (iC6 >>> 2) | (iC6 << 30);
            int i92 = i21 + 4;
            iC2 = b.C(((iC8 << 5) | (iC8 >>> 27)) + h(iC7, i6, i74), this.X[i21 + 3], Y2, i66);
            i5 = (iC7 >>> 2) | (iC7 << 30);
            i21 += 5;
            iC = b.C(((iC2 << 5) | (iC2 >>> 27)) + h(iC8, i5, i6), this.X[i92], Y2, i74);
            i3 = (iC8 >>> 2) | (iC8 << 30);
        }
        for (int i96 = 0; i96 < 4; i96++) {
            int iC9 = b.C(((iC << 5) | (iC >>> 27)) + g(iC2, i3, i5), this.X[i21], Y3, i6);
            int i99 = (iC2 >>> 2) | (iC2 << 30);
            int iC10 = b.C(((iC9 << 5) | (iC9 >>> 27)) + g(iC, i99, i3), this.X[i21 + 1], Y3, i5);
            int i100 = (iC >>> 2) | (iC << 30);
            int iC11 = b.C(((iC10 << 5) | (iC10 >>> 27)) + g(iC9, i100, i99), this.X[i21 + 2], Y3, i3);
            i6 = (iC9 >>> 2) | (iC9 << 30);
            int i101 = i21 + 4;
            iC2 = b.C(((iC11 << 5) | (iC11 >>> 27)) + g(iC10, i6, i100), this.X[i21 + 3], Y3, i99);
            i5 = (iC10 >>> 2) | (iC10 << 30);
            i21 += 5;
            iC = b.C(((iC2 << 5) | (iC2 >>> 27)) + g(iC11, i5, i6), this.X[i101], Y3, i100);
            i3 = (iC11 >>> 2) | (iC11 << 30);
        }
        for (int i102 = 0; i102 <= 3; i102++) {
            int iC12 = b.C(((iC << 5) | (iC >>> 27)) + h(iC2, i3, i5), this.X[i21], Y4, i6);
            int i103 = (iC2 >>> 2) | (iC2 << 30);
            int iC13 = b.C(((iC12 << 5) | (iC12 >>> 27)) + h(iC, i103, i3), this.X[i21 + 1], Y4, i5);
            int i104 = (iC >>> 2) | (iC << 30);
            int iC14 = b.C(((iC13 << 5) | (iC13 >>> 27)) + h(iC12, i104, i103), this.X[i21 + 2], Y4, i3);
            i6 = (iC12 >>> 2) | (iC12 << 30);
            int i105 = i21 + 4;
            iC2 = b.C(((iC14 << 5) | (iC14 >>> 27)) + h(iC13, i6, i104), this.X[i21 + 3], Y4, i103);
            i5 = (iC13 >>> 2) | (iC13 << 30);
            i21 += 5;
            iC = b.C(((iC2 << 5) | (iC2 >>> 27)) + h(iC14, i5, i6), this.X[i105], Y4, i104);
            i3 = (iC14 >>> 2) | (iC14 << 30);
        }
        this.H1 += iC;
        this.H2 += iC2;
        this.H3 += i3;
        this.H4 += i5;
        this.H5 += i6;
        this.xOff = 0;
        for (int i106 = 0; i106 < 16; i106++) {
            this.X[i106] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processLength(long j2) {
        if (this.xOff > 14) {
            processBlock();
        }
        int[] iArr = this.X;
        iArr[14] = (int) (j2 >>> 32);
        iArr[15] = (int) j2;
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest
    public void processWord(byte[] bArr, int i) {
        this.X[this.xOff] = Pack.bigEndianToInt(bArr, i);
        int i2 = this.xOff + 1;
        this.xOff = i2;
        if (i2 == 16) {
            processBlock();
        }
    }

    @Override // org.bouncycastle.crypto.digests.GeneralDigest, org.bouncycastle.crypto.Digest
    public void reset() {
        super.reset();
        this.H1 = 1732584193;
        this.H2 = -271733879;
        this.H3 = -1732584194;
        this.H4 = 271733878;
        this.H5 = -1009589776;
        this.xOff = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.X;
            if (i == iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }

    public SHA1Digest(CryptoServicePurpose cryptoServicePurpose) {
        super(cryptoServicePurpose);
        this.X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        reset();
    }

    @Override // org.bouncycastle.util.Memoable
    public void reset(Memoable memoable) {
        SHA1Digest sHA1Digest = (SHA1Digest) memoable;
        super.copyIn((GeneralDigest) sHA1Digest);
        copyIn(sHA1Digest);
    }

    public SHA1Digest(SHA1Digest sHA1Digest) {
        super(sHA1Digest);
        this.X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        copyIn(sHA1Digest);
    }

    public SHA1Digest(byte[] bArr) {
        super(bArr);
        this.X = new int[80];
        CryptoServicesRegistrar.checkConstraints(cryptoServiceProperties());
        this.H1 = Pack.bigEndianToInt(bArr, 16);
        this.H2 = Pack.bigEndianToInt(bArr, 20);
        this.H3 = Pack.bigEndianToInt(bArr, 24);
        this.H4 = Pack.bigEndianToInt(bArr, 28);
        this.H5 = Pack.bigEndianToInt(bArr, 32);
        this.xOff = Pack.bigEndianToInt(bArr, 36);
        for (int i = 0; i != this.xOff; i++) {
            this.X[i] = Pack.bigEndianToInt(bArr, (i * 4) + 40);
        }
    }
}
