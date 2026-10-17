package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.digests.XoodyakDigest;
import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Bytes;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class XoodyakEngine extends AEADBaseEngine {
    private static final int ModeHash = 1;
    private static final int ModeKeyed = 0;
    private static final int PhaseDown = 1;
    private static final int PhaseUp = 2;
    private static final int[] RC = {88, 56, 960, 208, 288, 20, 96, 44, 896, 240, 416, 18};
    private static final int f_bPrime_1 = 47;
    private byte[] K;
    private byte aadcd;
    private boolean encrypted;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f228390iv;
    private int mode;
    private int phase;
    private final byte[] state;

    public XoodyakEngine() {
        this.algorithmName = "Xoodyak AEAD";
        this.MAC_SIZE = 16;
        this.IV_SIZE = 16;
        this.KEY_SIZE = 16;
        this.BlockSize = 24;
        this.AADBufferSize = 44;
        this.state = new byte[48];
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.Default, AEADBaseEngine.DataOperatorType.Counter);
    }

    private void AbsorbAny(byte[] bArr, int i, int i2, int i3) {
        if (this.phase != 2) {
            up(this.mode, this.state, 0);
        }
        int i5 = i;
        int i6 = i3;
        while (true) {
            int iMin = Math.min(i2, this.AADBufferSize);
            byte[] bArr2 = bArr;
            down(this.mode, this.state, bArr2, i5, iMin, i6);
            this.phase = 1;
            i5 += iMin;
            i2 -= iMin;
            if (i2 == 0) {
                return;
            }
            i6 = 0;
            bArr = bArr2;
        }
    }

    private static void down(int i, byte[] bArr, byte[] bArr2, int i2, int i3, int i5) {
        Bytes.xorTo(i3, bArr2, i2, bArr);
        bArr[i3] = (byte) (bArr[i3] ^ 1);
        int i6 = bArr[47];
        if (i == 1) {
            i5 &= 1;
        }
        bArr[47] = (byte) (i6 ^ i5);
    }

    private static void up(int i, byte[] bArr, int i2) {
        if (i != 1) {
            bArr[47] = (byte) (bArr[47] ^ i2);
        }
        int iLittleEndianToInt = Pack.littleEndianToInt(bArr, 0);
        int iLittleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
        int iLittleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
        int i3 = 12;
        int iLittleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
        int iLittleEndianToInt5 = Pack.littleEndianToInt(bArr, 16);
        int iLittleEndianToInt6 = Pack.littleEndianToInt(bArr, 20);
        int iLittleEndianToInt7 = Pack.littleEndianToInt(bArr, 24);
        int iLittleEndianToInt8 = Pack.littleEndianToInt(bArr, 28);
        int iLittleEndianToInt9 = Pack.littleEndianToInt(bArr, 32);
        int i5 = 0;
        int i6 = iLittleEndianToInt8;
        int iRotateLeft = iLittleEndianToInt9;
        int iLittleEndianToInt10 = Pack.littleEndianToInt(bArr, 36);
        int iLittleEndianToInt11 = Pack.littleEndianToInt(bArr, 40);
        int iLittleEndianToInt12 = Pack.littleEndianToInt(bArr, 44);
        while (i5 < i3) {
            int i21 = (iLittleEndianToInt ^ iLittleEndianToInt5) ^ iRotateLeft;
            int i22 = (iLittleEndianToInt2 ^ iLittleEndianToInt6) ^ iLittleEndianToInt10;
            int i32 = i5;
            int i33 = (iLittleEndianToInt3 ^ iLittleEndianToInt7) ^ iLittleEndianToInt11;
            int i43 = iLittleEndianToInt12;
            int i59 = (iLittleEndianToInt4 ^ i6) ^ i43;
            int i66 = iLittleEndianToInt11;
            int iRotateLeft2 = Integers.rotateLeft(i59, 5) ^ Integers.rotateLeft(i59, 14);
            int iRotateLeft3 = Integers.rotateLeft(i21, 5) ^ Integers.rotateLeft(i21, 14);
            int iRotateLeft4 = Integers.rotateLeft(i22, 5) ^ Integers.rotateLeft(i22, 14);
            int iRotateLeft5 = Integers.rotateLeft(i33, 5) ^ Integers.rotateLeft(i33, 14);
            int i74 = iLittleEndianToInt ^ iRotateLeft2;
            int i92 = iLittleEndianToInt5 ^ iRotateLeft2;
            int i96 = iRotateLeft ^ iRotateLeft2;
            int i99 = iLittleEndianToInt2 ^ iRotateLeft3;
            int i100 = iLittleEndianToInt6 ^ iRotateLeft3;
            int i101 = iRotateLeft3 ^ iLittleEndianToInt10;
            int i102 = iLittleEndianToInt3 ^ iRotateLeft4;
            int i103 = iLittleEndianToInt7 ^ iRotateLeft4;
            int i104 = iLittleEndianToInt4 ^ iRotateLeft5;
            int i105 = i6 ^ iRotateLeft5;
            int iRotateLeft6 = Integers.rotateLeft(i96, 11);
            int iRotateLeft7 = Integers.rotateLeft(i101, 11);
            int iRotateLeft8 = Integers.rotateLeft(i66 ^ iRotateLeft4, 11);
            int iRotateLeft9 = Integers.rotateLeft(i43 ^ iRotateLeft5, 11);
            int i106 = i74 ^ RC[i32];
            int i107 = ((~i105) & iRotateLeft6) ^ i106;
            int i108 = ((~i92) & iRotateLeft7) ^ i99;
            int i109 = ((~i100) & iRotateLeft8) ^ i102;
            int i110 = ((~i103) & iRotateLeft9) ^ i104;
            int i111 = ((~iRotateLeft6) & i106) ^ i105;
            int i112 = i92 ^ ((~iRotateLeft7) & i99);
            int i113 = ((~iRotateLeft8) & i102) ^ i100;
            int i114 = ((~iRotateLeft9) & i104) ^ i103;
            int i115 = iRotateLeft6 ^ ((~i106) & i105);
            int i116 = iRotateLeft7 ^ ((~i99) & i92);
            int i117 = iRotateLeft8 ^ ((~i102) & i100);
            int i118 = iRotateLeft9 ^ ((~i104) & i103);
            iLittleEndianToInt5 = Integers.rotateLeft(i111, 1);
            int iRotateLeft10 = Integers.rotateLeft(i112, 1);
            int iRotateLeft11 = Integers.rotateLeft(i113, 1);
            int iRotateLeft12 = Integers.rotateLeft(i114, 1);
            iRotateLeft = Integers.rotateLeft(i117, 8);
            iLittleEndianToInt10 = Integers.rotateLeft(i118, 8);
            iLittleEndianToInt11 = Integers.rotateLeft(i115, 8);
            iLittleEndianToInt12 = Integers.rotateLeft(i116, 8);
            iLittleEndianToInt = i107;
            iLittleEndianToInt6 = iRotateLeft10;
            iLittleEndianToInt3 = i109;
            i3 = 12;
            iLittleEndianToInt7 = iRotateLeft11;
            i5 = i32 + 1;
            iLittleEndianToInt2 = i108;
            i6 = iRotateLeft12;
            iLittleEndianToInt4 = i110;
        }
        Pack.intToLittleEndian(iLittleEndianToInt, bArr, 0);
        Pack.intToLittleEndian(iLittleEndianToInt2, bArr, 4);
        Pack.intToLittleEndian(iLittleEndianToInt3, bArr, 8);
        Pack.intToLittleEndian(iLittleEndianToInt4, bArr, 12);
        Pack.intToLittleEndian(iLittleEndianToInt5, bArr, 16);
        Pack.intToLittleEndian(iLittleEndianToInt6, bArr, 20);
        Pack.intToLittleEndian(iLittleEndianToInt7, bArr, 24);
        Pack.intToLittleEndian(i6, bArr, 28);
        Pack.intToLittleEndian(iRotateLeft, bArr, 32);
        Pack.intToLittleEndian(iLittleEndianToInt10, bArr, 36);
        Pack.intToLittleEndian(iLittleEndianToInt11, bArr, 40);
        Pack.intToLittleEndian(iLittleEndianToInt12, bArr, 44);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException {
        return super.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void finishAAD(AEADBaseEngine.State state, boolean z) {
        finishAAD3(state, z);
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
        AbsorbAny(bArr, i, this.AADBufferSize, this.aadcd);
        this.aadcd = (byte) 0;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        up(this.mode, this.state, this.encrypted ? 0 : 128);
        Bytes.xor(this.BlockSize, this.state, bArr, i, bArr2, i2);
        down(this.mode, this.state, bArr2, i2, this.BlockSize, 0);
        this.phase = 1;
        this.encrypted = true;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        up(this.mode, this.state, this.encrypted ? 0 : 128);
        Bytes.xor(this.BlockSize, this.state, bArr, i, bArr2, i2);
        down(this.mode, this.state, bArr, i, this.BlockSize, 0);
        this.phase = 1;
        this.encrypted = true;
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
        AbsorbAny(this.m_aad, 0, this.m_aadPos, this.aadcd);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i) {
        if (this.m_bufPos != 0 || !this.encrypted) {
            up(this.mode, this.state, this.encrypted ? 0 : 128);
            Bytes.xor(this.m_bufPos, this.state, this.m_buf, 0, bArr, i);
            if (this.forEncryption) {
                down(this.mode, this.state, this.m_buf, 0, this.m_bufPos, 0);
            } else {
                down(this.mode, this.state, bArr, i, this.m_bufPos, 0);
            }
            this.phase = 1;
        }
        up(this.mode, this.state, 64);
        System.arraycopy(this.state, 0, this.mac, 0, this.MAC_SIZE);
        this.phase = 2;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    public static void down(XoodyakDigest.Friend friend, int i, byte[] bArr, byte[] bArr2, int i2, int i3, int i5) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by XoodyakDigest");
        }
        down(i, bArr, bArr2, i2, i3, i5);
    }

    public static void up(XoodyakDigest.Friend friend, int i, byte[] bArr, int i2) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by XoodyakDigest");
        }
        up(i, bArr, i2);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void init(byte[] bArr, byte[] bArr2) throws IllegalArgumentException {
        this.K = bArr;
        this.f228390iv = bArr2;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z) {
        super.reset(z);
        Arrays.fill(this.state, (byte) 0);
        this.encrypted = false;
        this.phase = 2;
        this.aadcd = (byte) 3;
        byte[] bArr = this.K;
        int length = bArr.length;
        int length2 = this.f228390iv.length;
        byte[] bArr2 = new byte[this.AADBufferSize];
        this.mode = 0;
        System.arraycopy(bArr, 0, bArr2, 0, length);
        System.arraycopy(this.f228390iv, 0, bArr2, length, length2);
        int i = length + length2;
        bArr2[i] = (byte) length2;
        AbsorbAny(bArr2, 0, i + 1, 2);
    }
}
