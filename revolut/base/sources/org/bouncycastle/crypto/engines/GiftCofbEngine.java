package org.bouncycastle.crypto.engines;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.youTransactor.uCube.rpc.Constants;
import net.sf.scuba.smartcards.ISO7816;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.util.Bytes;

/* JADX INFO: loaded from: classes14.dex */
public class GiftCofbEngine extends AEADBaseEngine {
    private static final byte[] GIFT_RC = {1, 3, 7, 15, Ascii.US, 62, 61, 59, 55, 47, 30, 60, 57, 51, 39, 14, 29, 58, 53, 43, Ascii.SYN, ISO7816.INS_UNBLOCK_CHV, Ascii.CAN, ISO7816.INS_DECREASE, Constants.NFC_READER, 2, 5, 11, Ascii.ETB, 46, 28, 56, Constants.INQUIRY, 35, 6, 13, Ascii.ESC, 54, 45, Ascii.SUB};
    private byte[] Y;
    private byte[] input;
    private byte[] k;
    private byte[] npub;
    private byte[] offset;

    public GiftCofbEngine() {
        this.KEY_SIZE = 16;
        this.IV_SIZE = 16;
        this.MAC_SIZE = 16;
        this.BlockSize = 16;
        this.AADBufferSize = 16;
        this.algorithmName = "GIFT-COFB AEAD";
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Buffered, AEADBaseEngine.AADOperatorType.Default, AEADBaseEngine.DataOperatorType.Counter);
    }

    private void double_half_block(byte[] bArr) {
        int i = 0;
        int i2 = ((bArr[0] & UnsignedBytes.MAX_VALUE) >>> 7) * 27;
        while (i < 7) {
            int i3 = i + 1;
            bArr[i] = (byte) (((bArr[i] & UnsignedBytes.MAX_VALUE) << 1) | ((bArr[i3] & UnsignedBytes.MAX_VALUE) >>> 7));
            i = i3;
        }
        bArr[7] = (byte) (((bArr[7] & UnsignedBytes.MAX_VALUE) << 1) ^ i2);
    }

    private void giftb128(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        char c2 = 0;
        int[] iArr = {((bArr[0] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[2] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[3] & UnsignedBytes.MAX_VALUE), ((bArr[4] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[5] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[6] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[7] & UnsignedBytes.MAX_VALUE), ((bArr[8] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[9] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[10] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[11] & UnsignedBytes.MAX_VALUE), ((bArr[13] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[12] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[14] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[15] & UnsignedBytes.MAX_VALUE)};
        short[] sArr = {(short) (((bArr2[0] & UnsignedBytes.MAX_VALUE) << 8) | (bArr2[1] & UnsignedBytes.MAX_VALUE)), (short) (((bArr2[2] & UnsignedBytes.MAX_VALUE) << 8) | (bArr2[3] & UnsignedBytes.MAX_VALUE)), (short) (((bArr2[4] & UnsignedBytes.MAX_VALUE) << 8) | (bArr2[5] & UnsignedBytes.MAX_VALUE)), (short) (((bArr2[6] & UnsignedBytes.MAX_VALUE) << 8) | (bArr2[7] & UnsignedBytes.MAX_VALUE)), (short) (((bArr2[8] & UnsignedBytes.MAX_VALUE) << 8) | (bArr2[9] & UnsignedBytes.MAX_VALUE)), (short) (((bArr2[10] & UnsignedBytes.MAX_VALUE) << 8) | (bArr2[11] & UnsignedBytes.MAX_VALUE)), (short) (((bArr2[12] & UnsignedBytes.MAX_VALUE) << 8) | (bArr2[13] & UnsignedBytes.MAX_VALUE)), (short) (((bArr2[14] & UnsignedBytes.MAX_VALUE) << 8) | (bArr2[15] & UnsignedBytes.MAX_VALUE))};
        int i = 0;
        while (i < 40) {
            int i2 = iArr[1];
            int i3 = iArr[c2];
            int i5 = iArr[2];
            int i6 = i2 ^ (i3 & i5);
            iArr[1] = i6;
            int i21 = iArr[3];
            int i22 = i3 ^ (i6 & i21);
            iArr[c2] = i22;
            int i32 = i5 ^ (i22 | i6);
            iArr[2] = i32;
            char c3 = c2;
            int i33 = i21 ^ i32;
            iArr[3] = i33;
            int i43 = i6 ^ i33;
            iArr[1] = i43;
            int i59 = ~i33;
            iArr[3] = i59;
            iArr[2] = i32 ^ (i22 & i43);
            iArr[c3] = i59;
            iArr[3] = i22;
            iArr[c3] = rowperm(i59, 0, 3, 2, 1);
            iArr[1] = rowperm(iArr[1], 1, 0, 3, 2);
            iArr[2] = rowperm(iArr[2], 2, 1, 0, 3);
            int iRowperm = rowperm(iArr[3], 3, 2, 1, 0);
            iArr[3] = iRowperm;
            int i66 = iArr[2];
            short s2 = sArr[2];
            int i74 = (s2 & HPKE.aead_EXPORT_ONLY) << 16;
            short s3 = sArr[3];
            iArr[2] = i66 ^ (i74 | (s3 & HPKE.aead_EXPORT_ONLY));
            int i92 = iArr[1];
            short s4 = sArr[6];
            int i96 = (s4 & HPKE.aead_EXPORT_ONLY) << 16;
            short s6 = sArr[7];
            iArr[1] = i92 ^ (i96 | (s6 & HPKE.aead_EXPORT_ONLY));
            iArr[3] = iRowperm ^ ((GIFT_RC[i] & UnsignedBytes.MAX_VALUE) ^ Integer.MIN_VALUE);
            short s11 = (short) (((s4 & HPKE.aead_EXPORT_ONLY) >>> 2) | ((s4 & HPKE.aead_EXPORT_ONLY) << 14));
            short s27 = (short) (((s6 & HPKE.aead_EXPORT_ONLY) >>> 12) | ((s6 & HPKE.aead_EXPORT_ONLY) << 4));
            sArr[7] = sArr[5];
            sArr[6] = sArr[4];
            sArr[5] = s3;
            sArr[4] = s2;
            sArr[3] = sArr[1];
            sArr[2] = sArr[c3];
            sArr[1] = s27;
            sArr[c3] = s11;
            i++;
            c2 = c3;
        }
        char c5 = c2;
        int i99 = iArr[c5];
        bArr3[c5] = (byte) (i99 >>> 24);
        bArr3[1] = (byte) (i99 >>> 16);
        bArr3[2] = (byte) (i99 >>> 8);
        bArr3[3] = (byte) i99;
        int i100 = iArr[1];
        bArr3[4] = (byte) (i100 >>> 24);
        bArr3[5] = (byte) (i100 >>> 16);
        bArr3[6] = (byte) (i100 >>> 8);
        bArr3[7] = (byte) i100;
        int i101 = iArr[2];
        bArr3[8] = (byte) (i101 >>> 24);
        bArr3[9] = (byte) (i101 >>> 16);
        bArr3[10] = (byte) (i101 >>> 8);
        bArr3[11] = (byte) i101;
        int i102 = iArr[3];
        bArr3[12] = (byte) (i102 >>> 24);
        bArr3[13] = (byte) (i102 >>> 16);
        bArr3[14] = (byte) (i102 >>> 8);
        bArr3[15] = (byte) i102;
    }

    private void pho1(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2) {
        byte[] bArr4 = new byte[16];
        byte[] bArr5 = new byte[16];
        if (i2 == 0) {
            bArr4[0] = -128;
        } else {
            System.arraycopy(bArr3, i, bArr4, 0, i2);
            if (i2 < 16) {
                bArr4[i2] = -128;
            }
        }
        System.arraycopy(bArr2, 8, bArr5, 0, 8);
        int i3 = 0;
        while (i3 < 7) {
            int i5 = i3 + 8;
            int i6 = (bArr2[i3] & UnsignedBytes.MAX_VALUE) << 1;
            i3++;
            bArr5[i5] = (byte) (((bArr2[i3] & UnsignedBytes.MAX_VALUE) >>> 7) | i6);
        }
        bArr5[15] = (byte) (((bArr2[7] & UnsignedBytes.MAX_VALUE) << 1) | ((bArr2[0] & UnsignedBytes.MAX_VALUE) >>> 7));
        System.arraycopy(bArr5, 0, bArr2, 0, 16);
        Bytes.xor(16, bArr2, bArr4, bArr);
    }

    private int rowperm(int i, int i2, int i3, int i5, int i6) {
        int i21 = 0;
        for (int i22 = 0; i22 < 8; i22++) {
            int i32 = i22 * 4;
            i21 = i21 | (((i >>> i32) & 1) << ((i2 * 8) + i22)) | (((i >>> (i32 + 1)) & 1) << ((i3 * 8) + i22)) | (((i >>> (i32 + 2)) & 1) << ((i5 * 8) + i22)) | (((i >>> (i32 + 3)) & 1) << ((8 * i6) + i22));
        }
        return i21;
    }

    private void triple_half_block(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        int i = 0;
        while (i < 7) {
            int i2 = i + 1;
            bArr2[i] = (byte) (((bArr[i2] & UnsignedBytes.MAX_VALUE) >>> 7) | ((bArr[i] & UnsignedBytes.MAX_VALUE) << 1));
            i = i2;
        }
        bArr2[7] = (byte) ((((bArr[0] & UnsignedBytes.MAX_VALUE) >>> 7) * 27) ^ ((bArr[7] & UnsignedBytes.MAX_VALUE) << 1));
        Bytes.xorTo(8, bArr2, bArr);
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
        pho1(this.input, this.Y, bArr, i, 16);
        double_half_block(this.offset);
        Bytes.xorTo(8, this.offset, this.input);
        giftb128(this.input, this.k, this.Y);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        double_half_block(this.offset);
        Bytes.xor(this.BlockSize, this.Y, bArr, i, bArr2, i2);
        pho1(this.input, this.Y, bArr2, i2, this.BlockSize);
        Bytes.xorTo(8, this.offset, this.input);
        giftb128(this.input, this.k, this.Y);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        double_half_block(this.offset);
        Bytes.xor(this.BlockSize, this.Y, bArr, i, bArr2, i2);
        pho1(this.input, this.Y, bArr, i, this.BlockSize);
        Bytes.xorTo(8, this.offset, this.input);
        giftb128(this.input, this.k, this.Y);
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
        AEADBaseEngine.State state;
        int len = this.dataOperator.getLen() - (this.forEncryption ? 0 : this.MAC_SIZE);
        triple_half_block(this.offset);
        if ((this.m_aadPos & 15) != 0 || (state = this.m_state) == AEADBaseEngine.State.DecInit || state == AEADBaseEngine.State.EncInit) {
            triple_half_block(this.offset);
        }
        if (len == 0) {
            triple_half_block(this.offset);
            triple_half_block(this.offset);
        }
        pho1(this.input, this.Y, this.m_aad, 0, this.m_aadPos);
        Bytes.xorTo(8, this.offset, this.input);
        giftb128(this.input, this.k, this.Y);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i) {
        GiftCofbEngine giftCofbEngine;
        int len = this.dataOperator.getLen() - (this.forEncryption ? 0 : this.MAC_SIZE);
        if (len != 0) {
            triple_half_block(this.offset);
            if ((len & 15) != 0) {
                triple_half_block(this.offset);
            }
            Bytes.xor(this.m_bufPos, this.Y, this.m_buf, 0, bArr, i);
            if (this.forEncryption) {
                giftCofbEngine = this;
                giftCofbEngine.pho1(this.input, this.Y, this.m_buf, 0, this.m_bufPos);
            } else {
                giftCofbEngine = this;
                giftCofbEngine.pho1(giftCofbEngine.input, giftCofbEngine.Y, bArr, i, giftCofbEngine.m_bufPos);
            }
            Bytes.xorTo(8, giftCofbEngine.offset, giftCofbEngine.input);
            giftb128(giftCofbEngine.input, giftCofbEngine.k, giftCofbEngine.Y);
        } else {
            giftCofbEngine = this;
        }
        System.arraycopy(giftCofbEngine.Y, 0, giftCofbEngine.mac, 0, giftCofbEngine.BlockSize);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void init(byte[] bArr, byte[] bArr2) {
        this.npub = bArr2;
        this.k = bArr;
        this.Y = new byte[this.BlockSize];
        this.input = new byte[16];
        this.offset = new byte[8];
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z) {
        super.reset(z);
        System.arraycopy(this.npub, 0, this.input, 0, this.IV_SIZE);
        giftb128(this.input, this.k, this.Y);
        System.arraycopy(this.Y, 0, this.offset, 0, 8);
    }
}
