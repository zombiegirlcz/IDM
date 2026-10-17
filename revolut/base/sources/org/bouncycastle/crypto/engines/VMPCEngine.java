package org.bouncycastle.crypto.engines;

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
public class VMPCEngine implements StreamCipher {
    protected byte[] workingIV;
    protected byte[] workingKey;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected byte f228388n = 0;
    protected byte[] P = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected byte f228389s = 0;

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "VMPC";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("VMPC init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("VMPC init parameters must include a key");
        }
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        byte[] iv2 = parametersWithIV.getIV();
        this.workingIV = iv2;
        if (iv2 == null || iv2.length < 1 || iv2.length > 768) {
            throw new IllegalArgumentException("VMPC requires 1 to 768 bytes of IV");
        }
        byte[] key = keyParameter.getKey();
        this.workingKey = key;
        initKey(key, this.workingIV);
        String algorithmName = getAlgorithmName();
        byte[] bArr = this.workingKey;
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(algorithmName, bArr.length >= 32 ? 256 : bArr.length * 8, cipherParameters, Utils.getPurpose(z)));
    }

    public void initKey(byte[] bArr, byte[] bArr2) {
        this.f228389s = (byte) 0;
        this.P = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.P[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.P;
            byte b4 = this.f228389s;
            int i3 = i2 & 255;
            byte b5 = bArr3[i3];
            byte b7 = bArr3[(b4 + b5 + bArr[i2 % bArr.length]) & 255];
            this.f228389s = b7;
            bArr3[i3] = bArr3[b7 & UnsignedBytes.MAX_VALUE];
            bArr3[b7 & UnsignedBytes.MAX_VALUE] = b5;
        }
        for (int i5 = 0; i5 < 768; i5++) {
            byte[] bArr4 = this.P;
            byte b13 = this.f228389s;
            int i6 = i5 & 255;
            byte b15 = bArr4[i6];
            byte b17 = bArr4[(b13 + b15 + bArr2[i5 % bArr2.length]) & 255];
            this.f228389s = b17;
            bArr4[i6] = bArr4[b17 & UnsignedBytes.MAX_VALUE];
            bArr4[b17 & UnsignedBytes.MAX_VALUE] = b15;
        }
        this.f228388n = (byte) 0;
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
            byte[] bArr3 = this.P;
            byte b4 = this.f228389s;
            byte b5 = this.f228388n;
            byte b7 = bArr3[(b4 + bArr3[b5 & UnsignedBytes.MAX_VALUE]) & 255];
            this.f228389s = b7;
            byte b13 = bArr3[(bArr3[bArr3[b7 & UnsignedBytes.MAX_VALUE] & UnsignedBytes.MAX_VALUE] + 1) & 255];
            byte b15 = bArr3[b5 & UnsignedBytes.MAX_VALUE];
            bArr3[b5 & UnsignedBytes.MAX_VALUE] = bArr3[b7 & UnsignedBytes.MAX_VALUE];
            bArr3[b7 & UnsignedBytes.MAX_VALUE] = b15;
            this.f228388n = (byte) ((b5 + 1) & 255);
            bArr2[i5 + i3] = (byte) (bArr[i5 + i] ^ b13);
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        initKey(this.workingKey, this.workingIV);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b4) {
        byte[] bArr = this.P;
        byte b5 = this.f228389s;
        byte b7 = this.f228388n;
        byte b13 = bArr[(b5 + bArr[b7 & UnsignedBytes.MAX_VALUE]) & 255];
        this.f228389s = b13;
        byte b15 = bArr[(bArr[bArr[b13 & UnsignedBytes.MAX_VALUE] & UnsignedBytes.MAX_VALUE] + 1) & 255];
        byte b17 = bArr[b7 & UnsignedBytes.MAX_VALUE];
        bArr[b7 & UnsignedBytes.MAX_VALUE] = bArr[b13 & UnsignedBytes.MAX_VALUE];
        bArr[b13 & UnsignedBytes.MAX_VALUE] = b17;
        this.f228388n = (byte) ((b7 + 1) & 255);
        return (byte) (b4 ^ b15);
    }
}
