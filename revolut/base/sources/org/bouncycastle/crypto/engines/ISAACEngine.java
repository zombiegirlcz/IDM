package org.bouncycastle.crypto.engines;

import okl.m;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
public class ISAACEngine implements StreamCipher {
    private final int sizeL = 8;
    private final int stateArraySize = 256;
    private int[] engineState = null;
    private int[] results = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f228367a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f228368b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f228369c = 0;
    private int index = 0;
    private byte[] keyStream = new byte[1024];
    private byte[] workingKey = null;
    private boolean initialised = false;

    private void isaac() {
        int i;
        int i2;
        int i3 = this.f228368b;
        int i5 = this.f228369c + 1;
        this.f228369c = i5;
        this.f228368b = i3 + i5;
        for (int i6 = 0; i6 < 256; i6++) {
            int[] iArr = this.engineState;
            int i21 = iArr[i6];
            int i22 = i6 & 3;
            if (i22 == 0) {
                i = this.f228367a;
                i2 = i << 13;
            } else if (i22 == 1) {
                i = this.f228367a;
                i2 = i >>> 6;
            } else if (i22 == 2) {
                i = this.f228367a;
                i2 = i << 2;
            } else if (i22 != 3) {
                int i32 = this.f228367a + iArr[(i6 + 128) & 255];
                this.f228367a = i32;
                int i33 = iArr[(i21 >>> 2) & 255] + i32 + this.f228368b;
                iArr[i6] = i33;
                int[] iArr2 = this.results;
                int i43 = iArr[(i33 >>> 10) & 255] + i21;
                this.f228368b = i43;
                iArr2[i6] = i43;
            } else {
                i = this.f228367a;
                i2 = i >>> 16;
            }
            this.f228367a = i ^ i2;
            int i322 = this.f228367a + iArr[(i6 + 128) & 255];
            this.f228367a = i322;
            int i332 = iArr[(i21 >>> 2) & 255] + i322 + this.f228368b;
            iArr[i6] = i332;
            int[] iArr22 = this.results;
            int i432 = iArr[(i332 >>> 10) & 255] + i21;
            this.f228368b = i432;
            iArr22[i6] = i432;
        }
    }

    private void mix(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = i ^ (i2 << 11);
        iArr[0] = i3;
        int i5 = iArr[3] + i3;
        iArr[3] = i5;
        int i6 = iArr[2];
        int i21 = i2 + i6;
        iArr[1] = i21;
        int i22 = i21 ^ (i6 >>> 2);
        iArr[1] = i22;
        int i32 = iArr[4] + i22;
        iArr[4] = i32;
        int i33 = i6 + i5;
        iArr[2] = i33;
        int i43 = i33 ^ (i5 << 8);
        iArr[2] = i43;
        int i59 = iArr[5] + i43;
        iArr[5] = i59;
        int i66 = i5 + i32;
        iArr[3] = i66;
        int i74 = i66 ^ (i32 >>> 16);
        iArr[3] = i74;
        int i92 = iArr[6] + i74;
        iArr[6] = i92;
        int i96 = i32 + i59;
        iArr[4] = i96;
        int i99 = (i59 << 10) ^ i96;
        iArr[4] = i99;
        int i100 = iArr[7] + i99;
        iArr[7] = i100;
        int i101 = i59 + i92;
        iArr[5] = i101;
        int i102 = (i92 >>> 4) ^ i101;
        iArr[5] = i102;
        int i103 = i3 + i102;
        iArr[0] = i103;
        int i104 = i92 + i100;
        iArr[6] = i104;
        int i105 = (i100 << 8) ^ i104;
        iArr[6] = i105;
        int i106 = i22 + i105;
        iArr[1] = i106;
        int i107 = i100 + i103;
        iArr[7] = i107;
        int i108 = (i103 >>> 9) ^ i107;
        iArr[7] = i108;
        iArr[2] = i43 + i108;
        iArr[0] = i103 + i106;
    }

    private void setKey(byte[] bArr) {
        this.workingKey = bArr;
        if (this.engineState == null) {
            this.engineState = new int[256];
        }
        if (this.results == null) {
            this.results = new int[256];
        }
        for (int i = 0; i < 256; i++) {
            int[] iArr = this.engineState;
            this.results[i] = 0;
            iArr[i] = 0;
        }
        this.f228369c = 0;
        this.f228368b = 0;
        this.f228367a = 0;
        this.index = 0;
        int length = bArr.length + (bArr.length & 3);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i2 = 0; i2 < length; i2 += 4) {
            this.results[i2 >>> 2] = Pack.littleEndianToInt(bArr2, i2);
        }
        int[] iArr2 = new int[8];
        for (int i3 = 0; i3 < 8; i3++) {
            iArr2[i3] = -1640531527;
        }
        for (int i5 = 0; i5 < 4; i5++) {
            mix(iArr2);
        }
        int i6 = 0;
        while (i6 < 2) {
            for (int i21 = 0; i21 < 256; i21 += 8) {
                for (int i22 = 0; i22 < 8; i22++) {
                    iArr2[i22] = iArr2[i22] + (i6 < 1 ? this.results[i21 + i22] : this.engineState[i21 + i22]);
                }
                mix(iArr2);
                for (int i32 = 0; i32 < 8; i32++) {
                    this.engineState[i21 + i32] = iArr2[i32];
                }
            }
            i6++;
        }
        isaac();
        this.initialised = true;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "ISAAC";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(m.l("invalid parameter passed to ISAAC init - ", cipherParameters));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        setKey(key);
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), key.length < 32 ? key.length * 8 : 256, cipherParameters, Utils.getPurpose(z)));
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
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
            if (this.index == 0) {
                isaac();
                this.keyStream = Pack.intToBigEndian(this.results);
            }
            byte[] bArr3 = this.keyStream;
            int i6 = this.index;
            bArr2[i5 + i3] = (byte) (bArr3[i6] ^ bArr[i5 + i]);
            this.index = (i6 + 1) & 1023;
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        setKey(this.workingKey);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b4) {
        if (this.index == 0) {
            isaac();
            this.keyStream = Pack.intToBigEndian(this.results);
        }
        byte[] bArr = this.keyStream;
        int i = this.index;
        byte b5 = (byte) (b4 ^ bArr[i]);
        this.index = (i + 1) & 1023;
        return b5;
    }
}
