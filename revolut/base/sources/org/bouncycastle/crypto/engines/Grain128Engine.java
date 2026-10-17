package org.bouncycastle.crypto.engines;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes14.dex */
public class Grain128Engine implements StreamCipher {
    private static final int STATE_SIZE = 4;
    private int index = 4;
    private boolean initialised = false;
    private int[] lfsr;
    private int[] nfsr;
    private byte[] out;
    private int output;
    private byte[] workingIV;
    private byte[] workingKey;

    private byte getKeyStream() {
        if (this.index > 3) {
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
        int i3 = (i >>> 2) | (i2 << 30);
        int i5 = (i >>> 12) | (i2 << 20);
        int i6 = (i >>> 15) | (i2 << 17);
        int i21 = iArr[2];
        int i22 = (i2 >>> 4) | (i21 << 28);
        int i32 = (i2 >>> 13) | (i21 << 19);
        int i33 = iArr[3];
        int i43 = (i21 >>> 9) | (i33 << 23);
        int i59 = (i21 >>> 25) | (i33 << 7);
        int i66 = (i33 << 1) | (i21 >>> 31);
        int[] iArr2 = this.lfsr;
        int i74 = iArr2[0];
        int i92 = iArr2[1];
        int i96 = (i74 >>> 8) | (i92 << 24);
        int i99 = (i74 >>> 13) | (i92 << 19);
        int i100 = (i74 >>> 20) | (i92 << 12);
        int i101 = iArr2[2];
        int i102 = iArr2[3];
        int i103 = i99 & i100;
        return ((((((((((i66 & i5) & ((i101 >>> 30) | (i102 << 2))) ^ (((i103 ^ (i5 & i96)) ^ (i66 & ((i92 >>> 10) | (i101 << 22)))) ^ (((i92 >>> 28) | (i101 << 4)) & ((i101 >>> 15) | (i102 << 17))))) ^ ((i101 >>> 29) | (i102 << 3))) ^ i3) ^ i6) ^ i22) ^ i32) ^ i21) ^ i43) ^ i59;
    }

    private int getOutputLFSR() {
        int[] iArr = this.lfsr;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 7) | (i2 << 25);
        int i5 = iArr[2];
        int i6 = iArr[3];
        int i21 = (i5 >>> 6) | (i6 << 26);
        return i6 ^ ((((i ^ i3) ^ ((i2 >>> 6) | (i5 << 26))) ^ i21) ^ ((i5 >>> 17) | (i6 << 15)));
    }

    private int getOutputNFSR() {
        int[] iArr = this.nfsr;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = (i >>> 3) | (i2 << 29);
        int i5 = (i >>> 11) | (i2 << 21);
        int i6 = (i >>> 13) | (i2 << 19);
        int i21 = (i >>> 17) | (i2 << 15);
        int i22 = (i >>> 18) | (i2 << 14);
        int i32 = (i >>> 26) | (i2 << 6);
        int i33 = (i >>> 27) | (i2 << 5);
        int i43 = iArr[2];
        int i59 = (i2 >>> 8) | (i43 << 24);
        int i66 = (i2 >>> 16) | (i43 << 16);
        int i74 = (i2 >>> 24) | (i43 << 8);
        int i92 = (i2 >>> 27) | (i43 << 5);
        int i96 = (i2 >>> 29) | (i43 << 3);
        int i99 = iArr[3];
        return (((((((i99 ^ (((i ^ i32) ^ i74) ^ ((i43 >>> 27) | (i99 << 5)))) ^ (i3 & ((i43 >>> 3) | (i99 << 29)))) ^ (i5 & i6)) ^ (i21 & i22)) ^ (i33 & i92)) ^ (i59 & i66)) ^ (i96 & ((i43 >>> 1) | (i99 << 31)))) ^ (((i43 >>> 4) | (i99 << 28)) & ((i43 >>> 20) | (i99 << 12)));
    }

    private void initGrain() {
        for (int i = 0; i < 8; i++) {
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
        bArr[2] = (byte) (output >> 16);
        bArr[3] = (byte) (output >> 24);
        this.nfsr = shift(this.nfsr, getOutputNFSR() ^ this.lfsr[0]);
        this.lfsr = shift(this.lfsr, getOutputLFSR());
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = -1;
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
            int i3 = i2 + 3;
            int i5 = i2 + 2;
            int i6 = i2 + 1;
            iArr[i] = (bArr3[i2] & UnsignedBytes.MAX_VALUE) | (bArr3[i3] << Ascii.CAN) | ((bArr3[i5] << 16) & 16711680) | ((bArr3[i6] << 8) & 65280);
            int[] iArr2 = this.lfsr;
            byte[] bArr4 = this.workingIV;
            iArr2[i] = (bArr4[i2] & UnsignedBytes.MAX_VALUE) | (bArr4[i3] << Ascii.CAN) | ((bArr4[i5] << 16) & 16711680) | ((bArr4[i6] << 8) & 65280);
            i2 += 4;
            i++;
        }
    }

    private int[] shift(int[] iArr, int i) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = i;
        return iArr;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "Grain-128";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("Grain-128 Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] iv2 = parametersWithIV.getIV();
        if (iv2 == null || iv2.length != 12) {
            throw new IllegalArgumentException("Grain-128 requires exactly 12 bytes of IV");
        }
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("Grain-128 init parameters must include a key");
        }
        byte[] key = ((KeyParameter) parametersWithIV.getParameters()).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException("Grain-128 key must be 128 bits long");
        }
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 128, cipherParameters, Utils.getPurpose(z)));
        byte[] bArr = new byte[key.length];
        this.workingIV = bArr;
        this.workingKey = new byte[key.length];
        this.lfsr = new int[4];
        this.nfsr = new int[4];
        this.out = new byte[4];
        System.arraycopy(iv2, 0, bArr, 0, iv2.length);
        System.arraycopy(key, 0, this.workingKey, 0, key.length);
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
        this.index = 4;
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
