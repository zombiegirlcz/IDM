package org.bouncycastle.crypto.engines;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes14.dex */
public class VMPCKSA3Engine extends VMPCEngine {
    @Override // org.bouncycastle.crypto.engines.VMPCEngine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "VMPC-KSA3";
    }

    @Override // org.bouncycastle.crypto.engines.VMPCEngine
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
        for (int i21 = 0; i21 < 768; i21++) {
            byte[] bArr5 = this.P;
            byte b40 = this.f228389s;
            int i22 = i21 & 255;
            byte b61 = bArr5[i22];
            byte b64 = bArr5[(b40 + b61 + bArr[i21 % bArr.length]) & 255];
            this.f228389s = b64;
            bArr5[i22] = bArr5[b64 & UnsignedBytes.MAX_VALUE];
            bArr5[b64 & UnsignedBytes.MAX_VALUE] = b61;
        }
        this.f228388n = (byte) 0;
    }
}
