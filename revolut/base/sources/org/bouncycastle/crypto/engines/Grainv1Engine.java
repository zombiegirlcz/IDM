package org.bouncycastle.crypto.engines;

import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes14.dex */
public class Grainv1Engine implements StreamCipher {
    private static final int STATE_SIZE = 5;
    private int index = 2;
    private boolean initialised = false;
    private int[] lfsr;
    private int[] nfsr;
    private byte[] out;
    private int output;
    private byte[] workingIV;
    private byte[] workingKey;

    private byte getKeyStream() {
        if (this.index > 1) {
            oneRound();
            this.index = 0;
        }
        byte[] bArr = this.out;
        int i = this.index;
        this.index = i + 1;
        return bArr[i];
    }

    private int getOutput() {
        int[] iArr = this.nfsr;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 1) | (i2 << 15);
        int i5 = (i >>> 2) | (i2 << 14);
        int i6 = (i >>> 4) | (i2 << 12);
        int i21 = (i >>> 10) | (i2 << 6);
        int i22 = iArr[2];
        int i32 = (i2 >>> 15) | (i22 << 1);
        int i33 = iArr[3];
        int i43 = (i22 >>> 11) | (i33 << 5);
        int i59 = iArr[4];
        int i66 = (i33 >>> 8) | (i59 << 8);
        int i74 = (i59 << 1) | (i33 >>> 15);
        int[] iArr2 = this.lfsr;
        int i92 = iArr2[0] >>> 3;
        int i96 = iArr2[1];
        int i99 = i92 | (i96 << 13);
        int i100 = iArr2[2];
        int i101 = (i96 >>> 9) | (i100 << 7);
        int i102 = (iArr2[3] << 2) | (i100 >>> 14);
        int i103 = iArr2[4];
        int i104 = i102 & i103;
        int i105 = ((((i101 ^ i74) ^ (i99 & i103)) ^ i104) ^ (i103 & i74)) ^ ((i99 & i101) & i102);
        int i106 = i99 & i102;
        return (((((((((i74 & i104) ^ (((i106 & i74) ^ ((i103 & i106) ^ i105)) ^ ((i101 & i102) & i74))) ^ i3) ^ i5) ^ i6) ^ i21) ^ i32) ^ i43) ^ i66) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 13) | (i2 << 3);
        int i5 = iArr[2];
        int i6 = (i2 >>> 7) | (i5 << 9);
        int i21 = iArr[3];
        int i22 = (i5 >>> 6) | (i21 << 10);
        int i32 = iArr[4];
        int i33 = (i21 >>> 3) | (i32 << 13);
        return (((i32 << 2) | (i21 >>> 14)) ^ ((((i ^ i3) ^ i6) ^ i22) ^ i33)) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 9) | (i2 << 7);
        int i5 = (i >>> 14) | (i2 << 2);
        int i6 = (i >>> 15) | (i2 << 1);
        int i21 = iArr[2];
        int i22 = (i2 >>> 5) | (i21 << 11);
        int i32 = (i2 >>> 12) | (i21 << 4);
        int i33 = iArr[3];
        int i43 = (i21 >>> 1) | (i33 << 15);
        int i59 = (i21 >>> 5) | (i33 << 11);
        int i66 = (i21 >>> 13) | (i33 << 3);
        int i74 = iArr[4];
        int i92 = (i33 >>> 4) | (i74 << 12);
        int i96 = (i33 >>> 12) | (i74 << 4);
        int i99 = (i33 >>> 14) | (i74 << 2);
        int i100 = (i74 << 1) | (i33 >>> 15);
        int i101 = i100 & i96;
        int i102 = (((i ^ (((((((((i99 ^ i96) ^ i92) ^ i66) ^ i59) ^ i43) ^ i32) ^ i22) ^ i5) ^ i3)) ^ i101) ^ (i59 & i43)) ^ (i6 & i3);
        int i103 = i96 & i92;
        int i104 = i43 & i32 & i22;
        return (((((((((i100 & i66) & i32) & i3) ^ ((i102 ^ (i103 & i66)) ^ i104)) ^ ((i103 & i59) & i43)) ^ ((i101 & i22) & i6)) ^ (((i101 & i92) & i66) & i59)) ^ ((i104 & i6) & i3)) ^ (((((i92 & i66) & i59) & i43) & i32) & i22)) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
    }

    private void initGrain() {
        for (int i = 0; i < 10; i++) {
            this.output = getOutput();
            this.nfsr = shift(this.nfsr, (getOutputNFSR() ^ this.lfsr[0]) ^ this.output);
            this.lfsr = shift(this.lfsr, getOutputLFSR() ^ this.output);
        }
        this.initialised = true;
    }

    private void oneRound() {
        int output = getOutput();
        this.output = output;
        byte[] bArr = this.out;
        bArr[0] = (byte) output;
        bArr[1] = (byte) (output >> 8);
        this.nfsr = shift(this.nfsr, getOutputNFSR() ^ this.lfsr[0]);
        this.lfsr = shift(this.lfsr, getOutputLFSR());
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        bArr2[8] = -1;
        bArr2[9] = -1;
        this.workingKey = bArr;
        this.workingIV = bArr2;
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.nfsr;
            if (i >= iArr.length) {
                return;
            }
            byte[] bArr3 = this.workingKey;
            int i3 = i2 + 1;
            iArr[i] = ((bArr3[i2] & UnsignedBytes.MAX_VALUE) | (bArr3[i3] << 8)) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
            int[] iArr2 = this.lfsr;
            byte[] bArr4 = this.workingIV;
            iArr2[i] = ((bArr4[i2] & UnsignedBytes.MAX_VALUE) | (bArr4[i3] << 8)) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH;
            i2 += 2;
            i++;
        }
    }

    private int[] shift(int[] iArr, int i) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = iArr[4];
        iArr[4] = i;
        return iArr;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Grain v1";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Grain v1 init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv2 = parametersWithIV.getIV();
        if (iv2 == null || iv2.length != 8) {
            throw new IllegalArgumentException("Grain v1 requires exactly 8 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("Grain v1 init parameters must include a key");
        }
        byte[] key = ((KeyParameter) parametersWithIV.getParameters()).getKey();
        if (key.length != 10) {
            throw new IllegalArgumentException("Grain v1 key must be 80 bits long");
        }
        byte[] bArr = new byte[key.length];
        this.workingIV = bArr;
        this.workingKey = new byte[key.length];
        this.lfsr = new int[5];
        this.nfsr = new int[5];
        this.out = new byte[2];
        System.arraycopy(iv2, 0, bArr, 0, iv2.length);
        System.arraycopy(key, 0, this.workingKey, 0, key.length);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 80, cipherParameters, Utils.getPurpose(z)));
        reset();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
        if (!this.initialised) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i5 = 0; i5 < i2; i5++) {
            bArr2[i3 + i5] = (byte) (bArr[i + i5] ^ getKeyStream());
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        this.index = 2;
        setKey(this.workingKey, this.workingIV);
        initGrain();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b4) {
        if (this.initialised) {
            return (byte) (b4 ^ getKeyStream());
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }
}
