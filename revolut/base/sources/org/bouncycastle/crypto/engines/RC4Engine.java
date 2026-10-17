package org.bouncycastle.crypto.engines;

import com.google.common.primitives.UnsignedBytes;
import okl.m;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;

/* JADX INFO: loaded from: classes14.dex */
public class RC4Engine implements StreamCipher {
    private static final int STATE_LENGTH = 256;
    private boolean forEncryption;
    private byte[] engineState = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f228375x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f228376y = 0;
    private byte[] workingKey = null;

    public RC4Engine() {
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 20));
    }

    private void setKey(byte[] bArr) {
        this.workingKey = bArr;
        this.f228375x = 0;
        this.f228376y = 0;
        if (this.engineState == null) {
            this.engineState = new byte[256];
        }
        for (int i = 0; i < 256; i++) {
            this.engineState[i] = (byte) i;
        }
        int length = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            int i5 = bArr[length] & UnsignedBytes.MAX_VALUE;
            byte[] bArr2 = this.engineState;
            byte b4 = bArr2[i3];
            i2 = (i5 + b4 + i2) & 255;
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b4;
            length = (length + 1) % bArr.length;
        }
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "RC4";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(m.l("invalid parameter passed to RC4 init - ", cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        this.workingKey = key;
        this.forEncryption = z;
        setKey(key);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), 20, cipherParameters, Utils.getPurpose(z)));
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i3 + i2 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i5 = 0; i5 < i2; i5++) {
            int i6 = (this.f228375x + 1) & 255;
            this.f228375x = i6;
            byte[] bArr3 = this.engineState;
            byte b4 = bArr3[i6];
            int i21 = (this.f228376y + b4) & 255;
            this.f228376y = i21;
            bArr3[i6] = bArr3[i21];
            bArr3[i21] = b4;
            bArr2[i5 + i3] = (byte) (bArr3[(bArr3[i6] + b4) & 255] ^ bArr[i5 + i]);
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        setKey(this.workingKey);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b4) {
        int i = (this.f228375x + 1) & 255;
        this.f228375x = i;
        byte[] bArr = this.engineState;
        byte b5 = bArr[i];
        int i2 = (this.f228376y + b5) & 255;
        this.f228376y = i2;
        bArr[i] = bArr[i2];
        bArr[i2] = b5;
        return (byte) (b4 ^ bArr[(bArr[i] + b5) & 255]);
    }
}
