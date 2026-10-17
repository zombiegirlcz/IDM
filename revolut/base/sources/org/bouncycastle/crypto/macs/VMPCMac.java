package org.bouncycastle.crypto.macs;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes14.dex */
public class VMPCMac implements Mac {
    private byte[] T;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte f228456g;
    private byte[] workingIV;
    private byte[] workingKey;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private byte f228459x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private byte f228460x2;
    private byte x3;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private byte f228461x4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private byte f228457n = 0;
    private byte[] P = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte f228458s = 0;

    private void initKey(byte[] bArr, byte[] bArr2) {
        this.f228458s = (byte) 0;
        this.P = new byte[256];
        for (int i = 0; i < 256; i++) {
            this.P[i] = (byte) i;
        }
        for (int i2 = 0; i2 < 768; i2++) {
            byte[] bArr3 = this.P;
            byte b4 = this.f228458s;
            int i3 = i2 & 255;
            byte b5 = bArr3[i3];
            byte b7 = bArr3[(b4 + b5 + bArr[i2 % bArr.length]) & 255];
            this.f228458s = b7;
            bArr3[i3] = bArr3[b7 & UnsignedBytes.MAX_VALUE];
            bArr3[b7 & UnsignedBytes.MAX_VALUE] = b5;
        }
        for (int i5 = 0; i5 < 768; i5++) {
            byte[] bArr4 = this.P;
            byte b13 = this.f228458s;
            int i6 = i5 & 255;
            byte b15 = bArr4[i6];
            byte b17 = bArr4[(b13 + b15 + bArr2[i5 % bArr2.length]) & 255];
            this.f228458s = b17;
            bArr4[i6] = bArr4[b17 & UnsignedBytes.MAX_VALUE];
            bArr4[b17 & UnsignedBytes.MAX_VALUE] = b15;
        }
        this.f228457n = (byte) 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i) throws IllegalStateException, DataLengthException {
        for (int i2 = 1; i2 < 25; i2++) {
            byte[] bArr2 = this.P;
            byte b4 = this.f228458s;
            byte b5 = this.f228457n;
            byte b7 = bArr2[(b4 + bArr2[b5 & UnsignedBytes.MAX_VALUE]) & 255];
            this.f228458s = b7;
            byte b13 = this.f228461x4;
            byte b15 = this.x3;
            byte b17 = bArr2[(b13 + b15 + i2) & 255];
            this.f228461x4 = b17;
            byte b40 = this.f228460x2;
            byte b61 = bArr2[(b15 + b40 + i2) & 255];
            this.x3 = b61;
            byte b64 = this.f228459x1;
            byte b69 = bArr2[(b40 + b64 + i2) & 255];
            this.f228460x2 = b69;
            byte b76 = bArr2[(b64 + b7 + i2) & 255];
            this.f228459x1 = b76;
            byte[] bArr3 = this.T;
            byte b86 = this.f228456g;
            bArr3[b86 & Ascii.US] = (byte) (b76 ^ bArr3[b86 & Ascii.US]);
            bArr3[(b86 + 1) & 31] = (byte) (b69 ^ bArr3[(b86 + 1) & 31]);
            bArr3[(b86 + 2) & 31] = (byte) (b61 ^ bArr3[(b86 + 2) & 31]);
            bArr3[(b86 + 3) & 31] = (byte) (b17 ^ bArr3[(b86 + 3) & 31]);
            this.f228456g = (byte) ((b86 + 4) & 31);
            byte b91 = bArr2[b5 & UnsignedBytes.MAX_VALUE];
            bArr2[b5 & UnsignedBytes.MAX_VALUE] = bArr2[b7 & UnsignedBytes.MAX_VALUE];
            bArr2[b7 & UnsignedBytes.MAX_VALUE] = b91;
            this.f228457n = (byte) ((b5 + 1) & 255);
        }
        for (int i3 = 0; i3 < 768; i3++) {
            byte[] bArr4 = this.P;
            byte b98 = this.f228458s;
            int i5 = i3 & 255;
            byte b100 = bArr4[i5];
            byte b101 = bArr4[(b98 + b100 + this.T[i3 & 31]) & 255];
            this.f228458s = b101;
            bArr4[i5] = bArr4[b101 & UnsignedBytes.MAX_VALUE];
            bArr4[b101 & UnsignedBytes.MAX_VALUE] = b100;
        }
        byte[] bArr5 = new byte[20];
        for (int i6 = 0; i6 < 20; i6++) {
            byte[] bArr6 = this.P;
            int i21 = i6 & 255;
            byte b102 = bArr6[(this.f228458s + bArr6[i21]) & 255];
            this.f228458s = b102;
            bArr5[i6] = bArr6[(bArr6[bArr6[b102 & UnsignedBytes.MAX_VALUE] & UnsignedBytes.MAX_VALUE] + 1) & 255];
            byte b103 = bArr6[i21];
            bArr6[i21] = bArr6[b102 & UnsignedBytes.MAX_VALUE];
            bArr6[b102 & UnsignedBytes.MAX_VALUE] = b103;
        }
        System.arraycopy(bArr5, 0, bArr, i, 20);
        reset();
        return 20;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return "VMPC-MAC";
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 20;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include an IV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        KeyParameter keyParameter = (KeyParameter) parametersWithIV.getParameters();
        if (!(parametersWithIV.getParameters() instanceof KeyParameter)) {
            throw new IllegalArgumentException("VMPC-MAC Init parameters must include a key");
        }
        byte[] iv2 = parametersWithIV.getIV();
        this.workingIV = iv2;
        if (iv2 == null || iv2.length < 1 || iv2.length > 768) {
            throw new IllegalArgumentException("VMPC-MAC requires 1 to 768 bytes of IV");
        }
        this.workingKey = keyParameter.getKey();
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        initKey(this.workingKey, this.workingIV);
        this.f228457n = (byte) 0;
        this.f228461x4 = (byte) 0;
        this.x3 = (byte) 0;
        this.f228460x2 = (byte) 0;
        this.f228459x1 = (byte) 0;
        this.f228456g = (byte) 0;
        this.T = new byte[32];
        for (int i = 0; i < 32; i++) {
            this.T[i] = 0;
        }
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b4) throws IllegalStateException {
        byte[] bArr = this.P;
        byte b5 = this.f228458s;
        byte b7 = this.f228457n;
        byte b13 = bArr[(b5 + bArr[b7 & UnsignedBytes.MAX_VALUE]) & 255];
        this.f228458s = b13;
        byte b15 = (byte) (b4 ^ bArr[(bArr[bArr[b13 & UnsignedBytes.MAX_VALUE] & UnsignedBytes.MAX_VALUE] + 1) & 255]);
        byte b17 = this.f228461x4;
        byte b40 = this.x3;
        byte b61 = bArr[(b17 + b40) & 255];
        this.f228461x4 = b61;
        byte b64 = this.f228460x2;
        byte b69 = bArr[(b40 + b64) & 255];
        this.x3 = b69;
        byte b76 = this.f228459x1;
        byte b86 = bArr[(b64 + b76) & 255];
        this.f228460x2 = b86;
        byte b91 = bArr[(b76 + b13 + b15) & 255];
        this.f228459x1 = b91;
        byte[] bArr2 = this.T;
        byte b98 = this.f228456g;
        bArr2[b98 & Ascii.US] = (byte) (b91 ^ bArr2[b98 & Ascii.US]);
        bArr2[(b98 + 1) & 31] = (byte) (b86 ^ bArr2[(b98 + 1) & 31]);
        bArr2[(b98 + 2) & 31] = (byte) (b69 ^ bArr2[(b98 + 2) & 31]);
        bArr2[(b98 + 3) & 31] = (byte) (b61 ^ bArr2[(b98 + 3) & 31]);
        this.f228456g = (byte) ((b98 + 4) & 31);
        byte b100 = bArr[b7 & UnsignedBytes.MAX_VALUE];
        bArr[b7 & UnsignedBytes.MAX_VALUE] = bArr[b13 & UnsignedBytes.MAX_VALUE];
        bArr[b13 & UnsignedBytes.MAX_VALUE] = b100;
        this.f228457n = (byte) ((b7 + 1) & 255);
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i, int i2) throws IllegalStateException, DataLengthException {
        if (i + i2 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        for (int i3 = 0; i3 < i2; i3++) {
            update(bArr[i + i3]);
        }
    }
}
