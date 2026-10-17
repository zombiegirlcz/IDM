package org.bouncycastle.crypto.engines;

import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.digests.SparkleDigest;
import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class SparkleEngine extends AEADBaseEngine {
    private static final int[] RCON = {-1209970334, -1083090816, 951376470, 844003128, -1156479509, 1333558103, -809524792, -1028445891};
    private final int CAP_MASK;
    private final int KEY_WORDS;
    private final int RATE_WORDS;
    private final int SPARKLE_STEPS_BIG;
    private final int SPARKLE_STEPS_SLIM;
    private final int STATE_WORDS;
    private final int TAG_WORDS;
    private final int _A0;
    private final int _A1;
    private final int _M2;
    private final int _M3;
    private boolean encrypted;
    private final int[] k;
    private final int[] npub;
    private final int[] state;

    public enum SparkleParameters {
        SCHWAEMM128_128,
        SCHWAEMM256_128,
        SCHWAEMM192_192,
        SCHWAEMM256_256
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SparkleEngine(org.bouncycastle.crypto.engines.SparkleEngine.SparkleParameters r8) {
        /*
            r7 = this;
            r7.<init>()
            int r8 = r8.ordinal()
            r0 = 7
            r1 = 1
            r2 = 3
            r3 = 256(0x100, float:3.59E-43)
            r4 = 128(0x80, float:1.8E-43)
            if (r8 == 0) goto L4d
            r5 = 11
            r6 = 384(0x180, float:5.38E-43)
            if (r8 == r1) goto L41
            r4 = 2
            if (r8 == r4) goto L36
            if (r8 != r2) goto L2e
            r8 = 8
            r7.SPARKLE_STEPS_SLIM = r8
            r8 = 12
            r7.SPARKLE_STEPS_BIG = r8
            java.lang.String r8 = "SCHWAEMM256-256"
            r7.algorithmName = r8
            r8 = 512(0x200, float:7.17E-43)
            r6 = r8
        L2a:
            r8 = r3
            r0 = r8
            r4 = r0
            goto L5b
        L2e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid definition of SCHWAEMM instance"
            r8.<init>(r0)
            throw r8
        L36:
            r7.SPARKLE_STEPS_SLIM = r0
            r7.SPARKLE_STEPS_BIG = r5
            java.lang.String r8 = "SCHWAEMM192-192"
            r7.algorithmName = r8
            r3 = 192(0xc0, float:2.69E-43)
            goto L2a
        L41:
            r7.SPARKLE_STEPS_SLIM = r0
            r7.SPARKLE_STEPS_BIG = r5
            java.lang.String r8 = "SCHWAEMM256-128"
            r7.algorithmName = r8
            r8 = r3
            r0 = r4
        L4b:
            r3 = r0
            goto L5b
        L4d:
            r7.SPARKLE_STEPS_SLIM = r0
            r8 = 10
            r7.SPARKLE_STEPS_BIG = r8
            java.lang.String r8 = "SCHWAEMM128-128"
            r7.algorithmName = r8
            r6 = r3
            r8 = r4
            r0 = r8
            goto L4b
        L5b:
            int r5 = r3 >>> 5
            r7.KEY_WORDS = r5
            int r3 = r3 >>> r2
            r7.KEY_SIZE = r3
            int r3 = r4 >>> 5
            r7.TAG_WORDS = r3
            int r3 = r4 >>> 3
            r7.MAC_SIZE = r3
            int r3 = r6 >>> 5
            r7.STATE_WORDS = r3
            int r4 = r8 >>> 5
            r7.RATE_WORDS = r4
            int r8 = r8 >>> r2
            r7.IV_SIZE = r8
            int r6 = r0 >>> 6
            int r0 = r0 >>> 5
            if (r4 <= r0) goto L7d
            int r0 = r0 - r1
            goto L7e
        L7d:
            r0 = -1
        L7e:
            r7.CAP_MASK = r0
            int r0 = r1 << r6
            int r1 = r0 << 24
            r7._A0 = r1
            r1 = r0 ^ 1
            int r1 = r1 << 24
            r7._A1 = r1
            r1 = r0 ^ 2
            int r1 = r1 << 24
            r7._M2 = r1
            r0 = r0 ^ r2
            int r0 = r0 << 24
            r7._M3 = r0
            int[] r0 = new int[r3]
            r7.state = r0
            int[] r0 = new int[r5]
            r7.k = r0
            int[] r0 = new int[r4]
            r7.npub = r0
            r7.BlockSize = r8
            r7.AADBufferSize = r8
            org.bouncycastle.crypto.engines.AEADBaseEngine$ProcessingBufferType r8 = org.bouncycastle.crypto.engines.AEADBaseEngine.ProcessingBufferType.Buffered
            org.bouncycastle.crypto.engines.AEADBaseEngine$AADOperatorType r0 = org.bouncycastle.crypto.engines.AEADBaseEngine.AADOperatorType.Default
            org.bouncycastle.crypto.engines.AEADBaseEngine$DataOperatorType r1 = org.bouncycastle.crypto.engines.AEADBaseEngine.DataOperatorType.Default
            r7.setInnerMembers(r8, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.crypto.engines.SparkleEngine.<init>(org.bouncycastle.crypto.engines.SparkleEngine$SparkleParameters):void");
    }

    private static int ELL(int i) {
        return (i & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) ^ Integers.rotateRight(i, 16);
    }

    private static void sparkle_opt(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            sparkle_opt8(iArr, i);
        } else if (length == 12) {
            sparkle_opt12(iArr, i);
        } else {
            if (length != 16) {
                throw new IllegalStateException();
            }
            sparkle_opt16(iArr, i);
        }
    }

    public static void sparkle_opt12(SparkleDigest.Friend friend, int[] iArr, int i) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by SparkleDigest");
        }
        sparkle_opt12(iArr, i);
    }

    public static void sparkle_opt16(SparkleDigest.Friend friend, int[] iArr, int i) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by SparkleDigest");
        }
        sparkle_opt16(iArr, i);
    }

    public static void sparkle_opt8(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        char c2 = 2;
        int i5 = iArr[2];
        char c3 = 3;
        int i6 = iArr[3];
        char c5 = 4;
        int i21 = iArr[4];
        char c6 = 5;
        int i22 = iArr[5];
        int i32 = iArr[6];
        int i33 = iArr[7];
        int i43 = 0;
        while (i43 < i) {
            int[] iArr2 = RCON;
            int i59 = i3 ^ iArr2[i43 & 7];
            int i66 = i6 ^ i43;
            int i74 = iArr2[0];
            char c7 = c2;
            int iRotateRight = Integers.rotateRight(i59, 31) + i2;
            char c16 = c3;
            int iRotateRight2 = i59 ^ Integers.rotateRight(iRotateRight, 24);
            char c26 = c5;
            int iRotateRight3 = Integers.rotateRight(iRotateRight2, 17) + (iRotateRight ^ i74);
            int iRotateRight4 = iRotateRight2 ^ Integers.rotateRight(iRotateRight3, 17);
            int i92 = (iRotateRight3 ^ i74) + iRotateRight4;
            int iRotateRight5 = iRotateRight4 ^ Integers.rotateRight(i92, 31);
            int iRotateRight6 = Integers.rotateRight(iRotateRight5, 24) + (i92 ^ i74);
            char c28 = c6;
            int iRotateRight7 = iRotateRight5 ^ Integers.rotateRight(iRotateRight6, 16);
            int i96 = iRotateRight6 ^ i74;
            int i99 = iArr2[1];
            int iRotateRight8 = Integers.rotateRight(i66, 31) + i5;
            int iRotateRight9 = i66 ^ Integers.rotateRight(iRotateRight8, 24);
            int iRotateRight10 = Integers.rotateRight(iRotateRight9, 17) + (iRotateRight8 ^ i99);
            int iRotateRight11 = iRotateRight9 ^ Integers.rotateRight(iRotateRight10, 17);
            int i100 = (iRotateRight10 ^ i99) + iRotateRight11;
            int iRotateRight12 = iRotateRight11 ^ Integers.rotateRight(i100, 31);
            int iRotateRight13 = Integers.rotateRight(iRotateRight12, 24) + (i100 ^ i99);
            int iRotateRight14 = iRotateRight12 ^ Integers.rotateRight(iRotateRight13, 16);
            int i101 = iRotateRight13 ^ i99;
            int i102 = iArr2[c7];
            int iRotateRight15 = Integers.rotateRight(i22, 31) + i21;
            int iRotateRight16 = i22 ^ Integers.rotateRight(iRotateRight15, 24);
            int iRotateRight17 = Integers.rotateRight(iRotateRight16, 17) + (iRotateRight15 ^ i102);
            int iRotateRight18 = iRotateRight16 ^ Integers.rotateRight(iRotateRight17, 17);
            int i103 = (iRotateRight17 ^ i102) + iRotateRight18;
            int iRotateRight19 = iRotateRight18 ^ Integers.rotateRight(i103, 31);
            int iRotateRight20 = Integers.rotateRight(iRotateRight19, 24) + (i103 ^ i102);
            int iRotateRight21 = iRotateRight19 ^ Integers.rotateRight(iRotateRight20, 16);
            int i104 = iArr2[c16];
            int iRotateRight22 = Integers.rotateRight(i33, 31) + i32;
            int iRotateRight23 = i33 ^ Integers.rotateRight(iRotateRight22, 24);
            int iRotateRight24 = Integers.rotateRight(iRotateRight23, 17) + (iRotateRight22 ^ i104);
            int iRotateRight25 = Integers.rotateRight(iRotateRight24, 17) ^ iRotateRight23;
            int i105 = (iRotateRight24 ^ i104) + iRotateRight25;
            int iRotateRight26 = Integers.rotateRight(i105, 31) ^ iRotateRight25;
            int iRotateRight27 = Integers.rotateRight(iRotateRight26, 24) + (i105 ^ i104);
            int iRotateRight28 = iRotateRight26 ^ Integers.rotateRight(iRotateRight27, 16);
            int iELL = ELL(i96 ^ i101);
            int iELL2 = ELL(iRotateRight7 ^ iRotateRight14);
            int i106 = ((iRotateRight27 ^ i104) ^ i101) ^ iELL2;
            int i107 = (iRotateRight28 ^ iRotateRight14) ^ iELL;
            int i108 = iELL ^ (iRotateRight21 ^ iRotateRight7);
            i43++;
            i22 = iRotateRight7;
            i3 = i107;
            i32 = i101;
            i33 = iRotateRight14;
            i6 = i108;
            i5 = ((iRotateRight20 ^ i102) ^ i96) ^ iELL2;
            c2 = c7;
            c5 = c26;
            c6 = c28;
            i21 = i96;
            i2 = i106;
            c3 = c16;
        }
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[c2] = i5;
        iArr[c3] = i6;
        iArr[c5] = i21;
        iArr[c6] = i22;
        iArr[6] = i32;
        iArr[7] = i33;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException {
        return super.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void finishAAD(AEADBaseEngine.State state, boolean z) {
        finishAAD2(state);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ String getAlgorithmName() {
        return super.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getIVBytesSize() {
        return super.getIVBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public /* bridge */ /* synthetic */ int getKeyBytesSize() {
        return super.getKeyBytesSize();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ byte[] getMac() {
        return super.getMac();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getOutputSize(int i) {
        return super.getOutputSize(i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int getUpdateOutputSize(int i) {
        return super.getUpdateOutputSize(i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void init(boolean z, CipherParameters cipherParameters) {
        super.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADByte(byte b4) {
        super.processAADByte(b4);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void processAADBytes(byte[] bArr, int i, int i2) {
        super.processAADBytes(bArr, i, i2);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferAAD(byte[] bArr, int i) {
        int i2 = 0;
        while (true) {
            int i3 = this.RATE_WORDS;
            if (i2 >= i3 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                return;
            }
            int i5 = (i3 / 2) + i2;
            int[] iArr = this.state;
            int i6 = iArr[i2];
            int i21 = iArr[i5];
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, (i2 * 4) + i);
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, (i5 * 4) + i);
            int[] iArr2 = this.state;
            int i22 = this.RATE_WORDS;
            iArr2[i2] = (iLittleEndianToInt ^ i21) ^ iArr2[i22 + i2];
            iArr2[i5] = ((i21 ^ i6) ^ iLittleEndianToInt2) ^ iArr2[i22 + (this.CAP_MASK & i5)];
            i2++;
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 0;
        while (true) {
            int i5 = this.RATE_WORDS;
            if (i3 >= i5 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                this.encrypted = true;
                return;
            }
            int i6 = (i5 / 2) + i3;
            int[] iArr = this.state;
            int i21 = iArr[i3];
            int i22 = iArr[i6];
            int i32 = i3 * 4;
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i + i32);
            int i33 = i6 * 4;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i + i33);
            int[] iArr2 = this.state;
            int i43 = this.RATE_WORDS;
            iArr2[i3] = ((i21 ^ i22) ^ iLittleEndianToInt) ^ iArr2[i43 + i3];
            iArr2[i6] = (i21 ^ iLittleEndianToInt2) ^ iArr2[i43 + (this.CAP_MASK & i6)];
            Pack.intToLittleEndian(iLittleEndianToInt ^ i21, bArr2, i2 + i32);
            Pack.intToLittleEndian(iLittleEndianToInt2 ^ i22, bArr2, i2 + i33);
            i3++;
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3 = 0;
        while (true) {
            int i5 = this.RATE_WORDS;
            if (i3 >= i5 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_SLIM);
                this.encrypted = true;
                return;
            }
            int i6 = (i5 / 2) + i3;
            int[] iArr = this.state;
            int i21 = iArr[i3];
            int i22 = iArr[i6];
            int i32 = i3 * 4;
            int iLittleEndianToInt = Pack.littleEndianToInt(bArr, i + i32);
            int i33 = i6 * 4;
            int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, i + i33);
            int[] iArr2 = this.state;
            int i43 = this.RATE_WORDS;
            iArr2[i3] = (i22 ^ iLittleEndianToInt) ^ iArr2[i43 + i3];
            iArr2[i6] = ((i21 ^ i22) ^ iLittleEndianToInt2) ^ iArr2[i43 + (this.CAP_MASK & i6)];
            Pack.intToLittleEndian(iLittleEndianToInt ^ i21, bArr2, i2 + i32);
            Pack.intToLittleEndian(iLittleEndianToInt2 ^ i22, bArr2, i2 + i33);
            i3++;
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processByte(byte b4, byte[] bArr, int i) throws DataLengthException {
        return super.processByte(b4, bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        return super.processBytes(bArr, i, i2, bArr2, i3);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalAAD() {
        int i = this.m_aadPos;
        int i2 = this.BlockSize;
        int i3 = 0;
        if (i < i2) {
            int[] iArr = this.state;
            int i5 = this.STATE_WORDS - 1;
            iArr[i5] = iArr[i5] ^ this._A0;
            byte[] bArr = this.m_aad;
            int i6 = i + 1;
            this.m_aadPos = i6;
            bArr[i] = -128;
            Arrays.fill(bArr, i6, i2, (byte) 0);
        } else {
            int[] iArr2 = this.state;
            int i21 = this.STATE_WORDS - 1;
            iArr2[i21] = iArr2[i21] ^ this._A1;
        }
        while (true) {
            int i22 = this.RATE_WORDS;
            if (i3 >= i22 / 2) {
                sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
                return;
            }
            int i32 = (i22 / 2) + i3;
            int[] iArr3 = this.state;
            int i33 = iArr3[i3];
            int i43 = iArr3[i32];
            int iLittleEndianToInt = Pack.littleEndianToInt(this.m_aad, i3 * 4);
            int iLittleEndianToInt2 = Pack.littleEndianToInt(this.m_aad, i32 * 4);
            int[] iArr4 = this.state;
            int i59 = this.RATE_WORDS;
            iArr4[i3] = (iLittleEndianToInt ^ i43) ^ iArr4[i59 + i3];
            iArr4[i32] = ((i43 ^ i33) ^ iLittleEndianToInt2) ^ iArr4[i59 + (this.CAP_MASK & i32)];
            i3++;
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i) {
        int i2;
        if (this.encrypted || this.m_bufPos > 0) {
            int[] iArr = this.state;
            int i3 = this.STATE_WORDS - 1;
            iArr[i3] = iArr[i3] ^ (this.m_bufPos < this.IV_SIZE ? this._M2 : this._M3);
            int[] iArr2 = new int[this.RATE_WORDS];
            int i5 = 0;
            while (true) {
                i2 = this.m_bufPos;
                if (i5 >= i2) {
                    break;
                }
                int i6 = i5 >>> 2;
                iArr2[i6] = iArr2[i6] | ((this.m_buf[i5] & UnsignedBytes.MAX_VALUE) << ((i5 & 3) << 3));
                i5++;
            }
            if (i2 < this.IV_SIZE) {
                if (!this.forEncryption) {
                    int i21 = (i2 & 3) << 3;
                    int i22 = i2 >>> 2;
                    int i32 = iArr2[i22];
                    int[] iArr3 = this.state;
                    iArr2[i22] = ((iArr3[i2 >>> 2] >>> i21) << i21) | i32;
                    int i33 = (i2 >>> 2) + 1;
                    System.arraycopy(iArr3, i33, iArr2, i33, this.RATE_WORDS - i33);
                }
                int i43 = this.m_bufPos;
                int i59 = i43 >>> 2;
                iArr2[i59] = (128 << ((i43 & 3) << 3)) ^ iArr2[i59];
            }
            int i66 = 0;
            while (true) {
                int i74 = this.RATE_WORDS;
                if (i66 >= i74 / 2) {
                    break;
                }
                int i92 = (i74 / 2) + i66;
                int[] iArr4 = this.state;
                int i96 = iArr4[i66];
                int i99 = iArr4[i92];
                if (this.forEncryption) {
                    iArr4[i66] = (iArr2[i66] ^ i99) ^ iArr4[i74 + i66];
                    iArr4[i92] = iArr4[i74 + (this.CAP_MASK & i92)] ^ ((i96 ^ i99) ^ iArr2[i92]);
                } else {
                    iArr4[i66] = ((i96 ^ i99) ^ iArr2[i66]) ^ iArr4[i74 + i66];
                    iArr4[i92] = iArr4[i74 + (this.CAP_MASK & i92)] ^ (iArr2[i92] ^ i96);
                }
                iArr2[i66] = iArr2[i66] ^ i96;
                iArr2[i92] = iArr2[i92] ^ i99;
                i66++;
            }
            int i100 = 0;
            while (i100 < this.m_bufPos) {
                bArr[i] = (byte) (iArr2[i100 >>> 2] >>> ((i100 & 3) << 3));
                i100++;
                i++;
            }
            sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
        }
        for (int i101 = 0; i101 < this.KEY_WORDS; i101++) {
            int[] iArr5 = this.state;
            int i102 = this.RATE_WORDS + i101;
            iArr5[i102] = iArr5[i102] ^ this.k[i101];
        }
        Pack.intToLittleEndian(this.state, this.RATE_WORDS, this.TAG_WORDS, this.mac, 0);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    public static void sparkle_opt12(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char c2 = 4;
        int i21 = iArr[4];
        char c3 = 5;
        int i22 = iArr[5];
        char c5 = 6;
        int i32 = iArr[6];
        char c6 = 7;
        int i33 = iArr[7];
        int i43 = iArr[8];
        int i59 = iArr[9];
        int i66 = iArr[10];
        int i74 = iArr[11];
        int i92 = 0;
        int i96 = i59;
        while (i92 < i) {
            int[] iArr2 = RCON;
            int i99 = i3 ^ iArr2[i92 & 7];
            int i100 = i6 ^ i92;
            int i101 = iArr2[0];
            char c7 = c2;
            int iRotateRight = Integers.rotateRight(i99, 31) + i2;
            char c16 = c3;
            int iRotateRight2 = i99 ^ Integers.rotateRight(iRotateRight, 24);
            char c26 = c5;
            int iRotateRight3 = Integers.rotateRight(iRotateRight2, 17) + (iRotateRight ^ i101);
            int iRotateRight4 = iRotateRight2 ^ Integers.rotateRight(iRotateRight3, 17);
            int i102 = (iRotateRight3 ^ i101) + iRotateRight4;
            int iRotateRight5 = iRotateRight4 ^ Integers.rotateRight(i102, 31);
            int iRotateRight6 = Integers.rotateRight(iRotateRight5, 24) + (i102 ^ i101);
            char c28 = c6;
            int iRotateRight7 = iRotateRight5 ^ Integers.rotateRight(iRotateRight6, 16);
            int i103 = iRotateRight6 ^ i101;
            int i104 = iArr2[1];
            int iRotateRight8 = Integers.rotateRight(i100, 31) + i5;
            int iRotateRight9 = i100 ^ Integers.rotateRight(iRotateRight8, 24);
            int iRotateRight10 = Integers.rotateRight(iRotateRight9, 17) + (iRotateRight8 ^ i104);
            int iRotateRight11 = iRotateRight9 ^ Integers.rotateRight(iRotateRight10, 17);
            int i105 = (iRotateRight10 ^ i104) + iRotateRight11;
            int iRotateRight12 = iRotateRight11 ^ Integers.rotateRight(i105, 31);
            int iRotateRight13 = Integers.rotateRight(iRotateRight12, 24) + (i105 ^ i104);
            int iRotateRight14 = iRotateRight12 ^ Integers.rotateRight(iRotateRight13, 16);
            int i106 = iRotateRight13 ^ i104;
            int i107 = iArr2[2];
            int iRotateRight15 = Integers.rotateRight(i22, 31) + i21;
            int iRotateRight16 = i22 ^ Integers.rotateRight(iRotateRight15, 24);
            int iRotateRight17 = Integers.rotateRight(iRotateRight16, 17) + (iRotateRight15 ^ i107);
            int iRotateRight18 = iRotateRight16 ^ Integers.rotateRight(iRotateRight17, 17);
            int i108 = (iRotateRight17 ^ i107) + iRotateRight18;
            int iRotateRight19 = iRotateRight18 ^ Integers.rotateRight(i108, 31);
            int iRotateRight20 = Integers.rotateRight(iRotateRight19, 24) + (i108 ^ i107);
            int iRotateRight21 = iRotateRight19 ^ Integers.rotateRight(iRotateRight20, 16);
            int i109 = iRotateRight20 ^ i107;
            int i110 = iArr2[3];
            int iRotateRight22 = Integers.rotateRight(i33, 31) + i32;
            int iRotateRight23 = i33 ^ Integers.rotateRight(iRotateRight22, 24);
            int iRotateRight24 = Integers.rotateRight(iRotateRight23, 17) + (iRotateRight22 ^ i110);
            int iRotateRight25 = iRotateRight23 ^ Integers.rotateRight(iRotateRight24, 17);
            int i111 = (iRotateRight24 ^ i110) + iRotateRight25;
            int iRotateRight26 = iRotateRight25 ^ Integers.rotateRight(i111, 31);
            int iRotateRight27 = Integers.rotateRight(iRotateRight26, 24) + (i111 ^ i110);
            int iRotateRight28 = iRotateRight26 ^ Integers.rotateRight(iRotateRight27, 16);
            int i112 = iRotateRight27 ^ i110;
            int i113 = iArr2[c7];
            int iRotateRight29 = Integers.rotateRight(i96, 31) + i43;
            int iRotateRight30 = i96 ^ Integers.rotateRight(iRotateRight29, 24);
            int iRotateRight31 = Integers.rotateRight(iRotateRight30, 17) + (iRotateRight29 ^ i113);
            int iRotateRight32 = iRotateRight30 ^ Integers.rotateRight(iRotateRight31, 17);
            int i114 = (iRotateRight31 ^ i113) + iRotateRight32;
            int iRotateRight33 = iRotateRight32 ^ Integers.rotateRight(i114, 31);
            int iRotateRight34 = Integers.rotateRight(iRotateRight33, 24) + (i114 ^ i113);
            int iRotateRight35 = iRotateRight33 ^ Integers.rotateRight(iRotateRight34, 16);
            int i115 = iRotateRight34 ^ i113;
            int i116 = iArr2[c16];
            int iRotateRight36 = Integers.rotateRight(i74, 31) + i66;
            int iRotateRight37 = i74 ^ Integers.rotateRight(iRotateRight36, 24);
            int iRotateRight38 = Integers.rotateRight(iRotateRight37, 17) + (iRotateRight36 ^ i116);
            int iRotateRight39 = iRotateRight37 ^ Integers.rotateRight(iRotateRight38, 17);
            int i117 = (iRotateRight38 ^ i116) + iRotateRight39;
            int iRotateRight40 = iRotateRight39 ^ Integers.rotateRight(i117, 31);
            int iRotateRight41 = Integers.rotateRight(iRotateRight40, 24) + (i117 ^ i116);
            int iRotateRight42 = iRotateRight40 ^ Integers.rotateRight(iRotateRight41, 16);
            int i118 = iRotateRight41 ^ i116;
            int iELL = ELL((i103 ^ i106) ^ i109);
            int iELL2 = ELL((iRotateRight7 ^ iRotateRight14) ^ iRotateRight21);
            int i119 = (i115 ^ i106) ^ iELL2;
            int i120 = (iRotateRight35 ^ iRotateRight14) ^ iELL;
            int i121 = (iRotateRight42 ^ iRotateRight21) ^ iELL;
            int i122 = iELL ^ (iRotateRight28 ^ iRotateRight7);
            i92++;
            i33 = iRotateRight7;
            i43 = i106;
            i5 = (i118 ^ i109) ^ iELL2;
            i66 = i109;
            i21 = (i112 ^ i103) ^ iELL2;
            c2 = c7;
            c6 = c28;
            i3 = i120;
            i32 = i103;
            i96 = iRotateRight14;
            i2 = i119;
            c5 = c26;
            i6 = i121;
            i74 = iRotateRight21;
            i22 = i122;
            c3 = c16;
        }
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i5;
        iArr[3] = i6;
        iArr[c2] = i21;
        iArr[c3] = i22;
        iArr[c5] = i32;
        iArr[c6] = i33;
        iArr[8] = i43;
        iArr[9] = i96;
        iArr[10] = i66;
        iArr[11] = i74;
    }

    public static void sparkle_opt16(int[] iArr, int i) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        int i21 = iArr[4];
        int i22 = iArr[5];
        char c2 = 6;
        int i32 = iArr[6];
        char c3 = 7;
        int i33 = iArr[7];
        int i43 = iArr[8];
        int i59 = iArr[9];
        int i66 = iArr[10];
        int i74 = iArr[11];
        int i92 = iArr[12];
        int i96 = iArr[13];
        int i99 = iArr[14];
        int i100 = i74;
        int i101 = i96;
        int i102 = iArr[15];
        int i103 = 0;
        int i104 = i59;
        while (i103 < i) {
            int[] iArr2 = RCON;
            int i105 = i3 ^ iArr2[i103 & 7];
            int i106 = i6 ^ i103;
            int i107 = iArr2[0];
            char c5 = c2;
            int iRotateRight = Integers.rotateRight(i105, 31) + i2;
            char c6 = c3;
            int iRotateRight2 = i105 ^ Integers.rotateRight(iRotateRight, 24);
            int iRotateRight3 = Integers.rotateRight(iRotateRight2, 17) + (iRotateRight ^ i107);
            int iRotateRight4 = iRotateRight2 ^ Integers.rotateRight(iRotateRight3, 17);
            int i108 = (iRotateRight3 ^ i107) + iRotateRight4;
            int iRotateRight5 = iRotateRight4 ^ Integers.rotateRight(i108, 31);
            int iRotateRight6 = Integers.rotateRight(iRotateRight5, 24) + (i108 ^ i107);
            int iRotateRight7 = iRotateRight5 ^ Integers.rotateRight(iRotateRight6, 16);
            int i109 = iRotateRight6 ^ i107;
            int i110 = iArr2[1];
            int iRotateRight8 = Integers.rotateRight(i106, 31) + i5;
            int iRotateRight9 = i106 ^ Integers.rotateRight(iRotateRight8, 24);
            int iRotateRight10 = Integers.rotateRight(iRotateRight9, 17) + (iRotateRight8 ^ i110);
            int iRotateRight11 = iRotateRight9 ^ Integers.rotateRight(iRotateRight10, 17);
            int i111 = (iRotateRight10 ^ i110) + iRotateRight11;
            int iRotateRight12 = iRotateRight11 ^ Integers.rotateRight(i111, 31);
            int iRotateRight13 = Integers.rotateRight(iRotateRight12, 24) + (i111 ^ i110);
            int iRotateRight14 = iRotateRight12 ^ Integers.rotateRight(iRotateRight13, 16);
            int i112 = iRotateRight13 ^ i110;
            int i113 = iArr2[2];
            int iRotateRight15 = Integers.rotateRight(i22, 31) + i21;
            int iRotateRight16 = i22 ^ Integers.rotateRight(iRotateRight15, 24);
            int iRotateRight17 = Integers.rotateRight(iRotateRight16, 17) + (iRotateRight15 ^ i113);
            int iRotateRight18 = iRotateRight16 ^ Integers.rotateRight(iRotateRight17, 17);
            int i114 = (iRotateRight17 ^ i113) + iRotateRight18;
            int iRotateRight19 = iRotateRight18 ^ Integers.rotateRight(i114, 31);
            int iRotateRight20 = Integers.rotateRight(iRotateRight19, 24) + (i114 ^ i113);
            int iRotateRight21 = iRotateRight19 ^ Integers.rotateRight(iRotateRight20, 16);
            int i115 = iRotateRight20 ^ i113;
            int i116 = iArr2[3];
            int iRotateRight22 = Integers.rotateRight(i33, 31) + i32;
            int iRotateRight23 = i33 ^ Integers.rotateRight(iRotateRight22, 24);
            int iRotateRight24 = Integers.rotateRight(iRotateRight23, 17) + (iRotateRight22 ^ i116);
            int iRotateRight25 = iRotateRight23 ^ Integers.rotateRight(iRotateRight24, 17);
            int i117 = (iRotateRight24 ^ i116) + iRotateRight25;
            int iRotateRight26 = iRotateRight25 ^ Integers.rotateRight(i117, 31);
            int iRotateRight27 = Integers.rotateRight(iRotateRight26, 24) + (i117 ^ i116);
            int iRotateRight28 = iRotateRight26 ^ Integers.rotateRight(iRotateRight27, 16);
            int i118 = i116 ^ iRotateRight27;
            int i119 = iArr2[4];
            int iRotateRight29 = Integers.rotateRight(i104, 31) + i43;
            int iRotateRight30 = i104 ^ Integers.rotateRight(iRotateRight29, 24);
            int iRotateRight31 = Integers.rotateRight(iRotateRight30, 17) + (iRotateRight29 ^ i119);
            int iRotateRight32 = iRotateRight30 ^ Integers.rotateRight(iRotateRight31, 17);
            int i120 = (iRotateRight31 ^ i119) + iRotateRight32;
            int iRotateRight33 = iRotateRight32 ^ Integers.rotateRight(i120, 31);
            int iRotateRight34 = Integers.rotateRight(iRotateRight33, 24) + (i120 ^ i119);
            int iRotateRight35 = iRotateRight33 ^ Integers.rotateRight(iRotateRight34, 16);
            int i121 = iRotateRight34 ^ i119;
            int i122 = iArr2[5];
            int iRotateRight36 = Integers.rotateRight(i100, 31) + i66;
            int iRotateRight37 = i100 ^ Integers.rotateRight(iRotateRight36, 24);
            int iRotateRight38 = Integers.rotateRight(iRotateRight37, 17) + (iRotateRight36 ^ i122);
            int iRotateRight39 = iRotateRight37 ^ Integers.rotateRight(iRotateRight38, 17);
            int i123 = (iRotateRight38 ^ i122) + iRotateRight39;
            int iRotateRight40 = iRotateRight39 ^ Integers.rotateRight(i123, 31);
            int iRotateRight41 = Integers.rotateRight(iRotateRight40, 24) + (i123 ^ i122);
            int iRotateRight42 = iRotateRight40 ^ Integers.rotateRight(iRotateRight41, 16);
            int i124 = iRotateRight41 ^ i122;
            int i125 = iArr2[c5];
            int iRotateRight43 = Integers.rotateRight(i101, 31) + i92;
            int iRotateRight44 = i101 ^ Integers.rotateRight(iRotateRight43, 24);
            int iRotateRight45 = Integers.rotateRight(iRotateRight44, 17) + (iRotateRight43 ^ i125);
            int iRotateRight46 = iRotateRight44 ^ Integers.rotateRight(iRotateRight45, 17);
            int i126 = (iRotateRight45 ^ i125) + iRotateRight46;
            int iRotateRight47 = iRotateRight46 ^ Integers.rotateRight(i126, 31);
            int iRotateRight48 = Integers.rotateRight(iRotateRight47, 24) + (i126 ^ i125);
            int iRotateRight49 = iRotateRight47 ^ Integers.rotateRight(iRotateRight48, 16);
            int i127 = iRotateRight48 ^ i125;
            int i128 = iArr2[c6];
            int iRotateRight50 = Integers.rotateRight(i102, 31) + i99;
            int iRotateRight51 = i102 ^ Integers.rotateRight(iRotateRight50, 24);
            int iRotateRight52 = Integers.rotateRight(iRotateRight51, 17) + (iRotateRight50 ^ i128);
            int iRotateRight53 = iRotateRight51 ^ Integers.rotateRight(iRotateRight52, 17);
            int i129 = (iRotateRight52 ^ i128) + iRotateRight53;
            int iRotateRight54 = iRotateRight53 ^ Integers.rotateRight(i129, 31);
            int iRotateRight55 = Integers.rotateRight(iRotateRight54, 24) + (i129 ^ i128);
            int iRotateRight56 = iRotateRight54 ^ Integers.rotateRight(iRotateRight55, 16);
            int i130 = iRotateRight55 ^ i128;
            int iELL = ELL(((i109 ^ i112) ^ i115) ^ i118);
            int iELL2 = ELL(((iRotateRight7 ^ iRotateRight14) ^ iRotateRight21) ^ iRotateRight28);
            int i131 = iRotateRight14 ^ iRotateRight42;
            int i132 = (i124 ^ i112) ^ iELL2;
            int i133 = (i127 ^ i115) ^ iELL2;
            int i134 = (iRotateRight21 ^ iRotateRight49) ^ iELL;
            int i135 = (i130 ^ i118) ^ iELL2;
            int i136 = (i109 ^ i121) ^ iELL2;
            i33 = (iRotateRight7 ^ iRotateRight35) ^ iELL;
            i103++;
            i22 = (iRotateRight56 ^ iRotateRight28) ^ iELL;
            i104 = iRotateRight7;
            i3 = i131 ^ iELL;
            i66 = i112;
            i5 = i133;
            i101 = iRotateRight21;
            i32 = i136;
            i2 = i132;
            i100 = iRotateRight14;
            i99 = i118;
            i6 = i134;
            c2 = c5;
            i43 = i109;
            i92 = i115;
            i21 = i135;
            i102 = iRotateRight28;
            c3 = c6;
        }
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i5;
        iArr[3] = i6;
        iArr[4] = i21;
        iArr[5] = i22;
        iArr[c2] = i32;
        iArr[c3] = i33;
        iArr[8] = i43;
        iArr[9] = i104;
        iArr[10] = i66;
        iArr[11] = i100;
        iArr[12] = i92;
        iArr[13] = i101;
        iArr[14] = i99;
        iArr[15] = i102;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void init(byte[] bArr, byte[] bArr2) throws IllegalArgumentException {
        Pack.littleEndianToInt(bArr, 0, this.k);
        Pack.littleEndianToInt(bArr2, 0, this.npub);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z) {
        this.encrypted = false;
        System.arraycopy(this.npub, 0, this.state, 0, this.RATE_WORDS);
        System.arraycopy(this.k, 0, this.state, this.RATE_WORDS, this.KEY_WORDS);
        sparkle_opt(this.state, this.SPARKLE_STEPS_BIG);
        super.reset(z);
    }
}
