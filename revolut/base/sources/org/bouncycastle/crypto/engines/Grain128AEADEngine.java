package org.bouncycastle.crypto.engines;

import com.google.common.base.Ascii;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.AEADBaseEngine;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class Grain128AEADEngine extends AEADBaseEngine {
    private static final int STATE_SIZE = 4;
    private final int[] authAcc;
    private final int[] authSr;
    private final int[] lfsr;
    private final int[] nfsr;
    private byte[] workingIV;
    private byte[] workingKey;

    public Grain128AEADEngine() {
        this.algorithmName = "Grain-128 AEAD";
        this.KEY_SIZE = 16;
        this.IV_SIZE = 12;
        this.MAC_SIZE = 8;
        this.lfsr = new int[4];
        this.nfsr = new int[4];
        this.authAcc = new int[2];
        this.authSr = new int[2];
        setInnerMembers(AEADBaseEngine.ProcessingBufferType.Immediate, AEADBaseEngine.AADOperatorType.Stream, AEADBaseEngine.DataOperatorType.StreamCipher);
    }

    private void absorbAadData(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            byte b4 = bArr[i + i3];
            for (int i5 = 0; i5 < 8; i5++) {
                shift();
                updateInternalState((b4 >> i5) & 1);
            }
        }
    }

    private int getByteKeyStream() {
        int output = getOutput();
        shift();
        return output;
    }

    private int getOutput() {
        int[] iArr = this.nfsr;
        int i = iArr[0];
        int i2 = i >>> 12;
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i6 = i5 >>> 9;
        int i21 = i5 >>> 25;
        int i22 = i5 >>> 31;
        int[] iArr2 = this.lfsr;
        int i32 = iArr2[0];
        int i33 = iArr2[1];
        int i43 = iArr2[2];
        int i59 = (i32 >>> 20) & (i32 >>> 13);
        return (((i5 ^ (((((((((i59 ^ ((i32 >>> 8) & i2)) ^ (i22 & (i33 >>> 10))) ^ ((i33 >>> 28) & (i43 >>> 15))) ^ ((i2 & i22) & (i43 >>> 30))) ^ (i43 >>> 29)) ^ (i >>> 2)) ^ (i >>> 15)) ^ (i3 >>> 4)) ^ (i3 >>> 13))) ^ i6) ^ i21) & 1;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i = iArr[0];
        int i2 = iArr[1] >>> 6;
        int i3 = iArr[2];
        return (iArr[3] ^ ((((i ^ (i >>> 7)) ^ i2) ^ (i3 >>> 6)) ^ (i3 >>> 17))) & 1;
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i = iArr[0];
        int i2 = i >>> 25;
        int i3 = iArr[1];
        int i5 = iArr[2];
        int i6 = ((i >>> 26) ^ i) ^ (i3 >>> 24);
        return (((((((((((iArr[3] ^ (i6 ^ (i5 >>> 27))) ^ ((i & i5) >>> 3)) ^ ((i >>> 11) & (i >>> 13))) ^ ((i >>> 17) & (i >>> 18))) ^ ((i & i3) >>> 27)) ^ ((i3 >>> 8) & (i3 >>> 16))) ^ ((i3 >>> 29) & (i5 >>> 1))) ^ ((i5 >>> 4) & (i5 >>> 20))) ^ (((i >>> 22) & (i >>> 24)) & i2)) ^ (((i5 >>> 6) & (i5 >>> 14)) & (i5 >>> 18))) ^ ((((i5 >>> 24) & (i5 >>> 28)) & (i5 >>> 29)) & (i5 >>> 31))) & 1;
    }

    private void initGrain(int[] iArr) {
        for (int i = 0; i < 2; i++) {
            for (int i2 = 0; i2 < 32; i2++) {
                iArr[i] = iArr[i] | (getByteKeyStream() << i2);
            }
        }
    }

    private void shift() {
        shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) & 1);
        shift(this.lfsr, getOutputLFSR() & 1);
    }

    private void updateInternalState(int i) {
        int i2 = -i;
        int[] iArr = this.authAcc;
        int i3 = iArr[0];
        int[] iArr2 = this.authSr;
        iArr[0] = i3 ^ (iArr2[0] & i2);
        iArr[1] = (i2 & iArr2[1]) ^ iArr[1];
        int byteKeyStream = getByteKeyStream();
        int[] iArr3 = this.authSr;
        int i5 = iArr3[0] >>> 1;
        int i6 = iArr3[1];
        iArr3[0] = i5 | (i6 << 31);
        iArr3[1] = (byteKeyStream << 31) | (i6 >>> 1);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ int doFinal(byte[] bArr, int i) throws InvalidCipherTextException, IllegalStateException {
        return super.doFinal(bArr, i);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void finishAAD(AEADBaseEngine.State state, boolean z) {
        finishAAD1(state);
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
    public int getUpdateOutputSize(int i) {
        return getTotalBytesForUpdate(i);
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
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferDecrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        int len = this.dataOperator.getLen();
        for (int i3 = 0; i3 < len; i3++) {
            byte b4 = bArr[i + i3];
            byte byteKeyStream = 0;
            for (int i5 = 0; i5 < 8; i5++) {
                byteKeyStream = (byte) (byteKeyStream | ((((b4 >> i5) & 1) ^ getByteKeyStream()) << i5));
                updateInternalState((byteKeyStream >> i5) & 1);
            }
            bArr2[i2 + i3] = byteKeyStream;
        }
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processBufferEncrypt(byte[] bArr, int i, byte[] bArr2, int i2) {
        int len = this.dataOperator.getLen();
        for (int i3 = 0; i3 < len; i3++) {
            byte b4 = bArr[i + i3];
            byte byteKeyStream = 0;
            for (int i5 = 0; i5 < 8; i5++) {
                int i6 = (b4 >> i5) & 1;
                byteKeyStream = (byte) (byteKeyStream | ((getByteKeyStream() ^ i6) << i5));
                updateInternalState(i6);
            }
            bArr2[i2 + i3] = byteKeyStream;
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
        int i;
        int i2;
        int len = this.aadOperator.getLen();
        byte[] bytes = ((AEADBaseEngine.StreamAADOperator) this.aadOperator).getBytes();
        byte[] bArr = new byte[5];
        if (len < 128) {
            i2 = 4;
            bArr[4] = (byte) len;
        } else {
            int i3 = len;
            int i5 = 5;
            while (true) {
                i = i5 - 1;
                bArr[i] = (byte) i3;
                i3 >>>= 8;
                if (i3 == 0) {
                    break;
                } else {
                    i5 = i;
                }
            }
            int i6 = i5 - 2;
            bArr[i6] = (byte) ((5 - i) | 128);
            i2 = i6;
        }
        absorbAadData(bArr, i2, 5 - i2);
        absorbAadData(bytes, 0, len);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void processFinalBlock(byte[] bArr, int i) {
        int[] iArr = this.authAcc;
        int i2 = iArr[0];
        int[] iArr2 = this.authSr;
        iArr[0] = i2 ^ iArr2[0];
        iArr[1] = iArr2[1] ^ iArr[1];
        Pack.intToLittleEndian(iArr, this.mac, 0);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine, org.bouncycastle.crypto.modes.AEADCipher
    public /* bridge */ /* synthetic */ void reset() {
        super.reset();
    }

    private void shift(int[] iArr, int i) {
        int i2 = iArr[0] >>> 1;
        int i3 = iArr[1];
        iArr[0] = i2 | (i3 << 31);
        int i5 = i3 >>> 1;
        int i6 = iArr[2];
        iArr[1] = i5 | (i6 << 31);
        int i21 = iArr[3];
        iArr[2] = (i6 >>> 1) | (i21 << 31);
        iArr[3] = (i << 31) | (i21 >>> 1);
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void init(byte[] bArr, byte[] bArr2) throws IllegalArgumentException {
        byte[] bArr3 = new byte[16];
        this.workingIV = bArr3;
        this.workingKey = bArr;
        System.arraycopy(bArr2, 0, bArr3, 0, this.IV_SIZE);
        byte[] bArr4 = this.workingIV;
        bArr4[12] = -1;
        bArr4[13] = -1;
        bArr4[14] = -1;
        bArr4[15] = Ascii.DEL;
    }

    @Override // org.bouncycastle.crypto.engines.AEADBaseEngine
    public void reset(boolean z) {
        super.reset(z);
        Pack.littleEndianToInt(this.workingKey, 0, this.nfsr);
        Pack.littleEndianToInt(this.workingIV, 0, this.lfsr);
        Arrays.clear(this.authAcc);
        Arrays.clear(this.authSr);
        for (int i = 0; i < 320; i++) {
            int output = getOutput();
            shift(this.nfsr, ((getOutputNFSR() ^ this.lfsr[0]) ^ output) & 1);
            shift(this.lfsr, (output ^ getOutputLFSR()) & 1);
        }
        for (int i2 = 0; i2 < 8; i2++) {
            for (int i3 = 0; i3 < 8; i3++) {
                int output2 = getOutput();
                shift(this.nfsr, (((getOutputNFSR() ^ this.lfsr[0]) ^ output2) ^ (this.workingKey[i2] >> i3)) & 1);
                shift(this.lfsr, ((output2 ^ getOutputLFSR()) ^ (this.workingKey[i2 + 8] >> i3)) & 1);
            }
        }
        initGrain(this.authAcc);
        initGrain(this.authSr);
    }
}
