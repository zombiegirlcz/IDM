package org.bouncycastle.crypto.engines;

import com.google.android.material.internal.ViewUtils;
import com.google.common.primitives.UnsignedBytes;
import okl.m;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.constraints.DefaultServiceProperties;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;

/* JADX INFO: loaded from: classes14.dex */
public class HC256Engine implements StreamCipher {
    private boolean initialised;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    private byte[] f228363iv;
    private byte[] key;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int[] f228364p = new int[1024];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int[] f228365q = new int[1024];
    private int cnt = 0;

    /* JADX INFO: renamed from: buf, reason: collision with root package name */
    private byte[] f228362buf = new byte[4];
    private int idx = 0;

    private byte getByte() {
        if (this.idx == 0) {
            int iStep = step();
            byte[] bArr = this.f228362buf;
            bArr[0] = (byte) (iStep & 255);
            bArr[1] = (byte) ((iStep >> 8) & 255);
            bArr[2] = (byte) ((iStep >> 16) & 255);
            bArr[3] = (byte) ((iStep >> 24) & 255);
        }
        byte[] bArr2 = this.f228362buf;
        int i = this.idx;
        byte b4 = bArr2[i];
        this.idx = 3 & (i + 1);
        return b4;
    }

    private void init() {
        byte[] bArr = this.key;
        if (bArr.length != 32 && bArr.length != 16) {
            throw new IllegalArgumentException("The key must be 128/256 bits long");
        }
        if (this.f228363iv.length < 16) {
            throw new IllegalArgumentException("The IV must be at least 128 bits long");
        }
        if (bArr.length != 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArr3 = this.key;
            System.arraycopy(bArr3, 0, bArr2, 16, bArr3.length);
            this.key = bArr2;
        }
        byte[] bArr4 = this.f228363iv;
        if (bArr4.length < 32) {
            byte[] bArr5 = new byte[32];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
            byte[] bArr6 = this.f228363iv;
            System.arraycopy(bArr6, 0, bArr5, bArr6.length, 32 - bArr6.length);
            this.f228363iv = bArr5;
        }
        this.idx = 0;
        this.cnt = 0;
        int[] iArr = new int[2560];
        for (int i = 0; i < 32; i++) {
            int i2 = i >> 2;
            iArr[i2] = iArr[i2] | ((this.key[i] & UnsignedBytes.MAX_VALUE) << ((i & 3) * 8));
        }
        for (int i3 = 0; i3 < 32; i3++) {
            int i5 = (i3 >> 2) + 8;
            iArr[i5] = iArr[i5] | ((this.f228363iv[i3] & UnsignedBytes.MAX_VALUE) << ((i3 & 3) * 8));
        }
        for (int i6 = 16; i6 < 2560; i6++) {
            int i21 = iArr[i6 - 2];
            int i22 = iArr[i6 - 15];
            iArr[i6] = ((i21 >>> 10) ^ (rotateRight(i21, 17) ^ rotateRight(i21, 19))) + iArr[i6 - 7] + ((i22 >>> 3) ^ (rotateRight(i22, 7) ^ rotateRight(i22, 18))) + iArr[i6 - 16] + i6;
        }
        System.arraycopy(iArr, 512, this.f228364p, 0, 1024);
        System.arraycopy(iArr, 1536, this.f228365q, 0, 1024);
        for (int i32 = 0; i32 < 4096; i32++) {
            step();
        }
        this.cnt = 0;
    }

    private static int rotateRight(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    private int step() {
        int i;
        int i2;
        int i3 = this.cnt;
        int i5 = i3 & 1023;
        if (i3 < 1024) {
            int[] iArr = this.f228364p;
            int i6 = iArr[(i5 - 3) & 1023];
            int i21 = iArr[(i5 - 1023) & 1023];
            int i22 = iArr[i5];
            int iRotateRight = iArr[(i5 - 10) & 1023] + (rotateRight(i21, 23) ^ rotateRight(i6, 10));
            int[] iArr2 = this.f228365q;
            iArr[i5] = iRotateRight + iArr2[(i6 ^ i21) & 1023] + i22;
            int[] iArr3 = this.f228364p;
            int i32 = iArr3[(i5 - 12) & 1023];
            i = iArr2[i32 & 255] + iArr2[((i32 >> 8) & 255) + 256] + iArr2[((i32 >> 16) & 255) + 512] + iArr2[((i32 >> 24) & 255) + ViewUtils.EDGE_TO_EDGE_FLAGS];
            i2 = iArr3[i5];
        } else {
            int[] iArr4 = this.f228365q;
            int i33 = iArr4[(i5 - 3) & 1023];
            int i43 = iArr4[(i5 - 1023) & 1023];
            int i59 = iArr4[i5];
            int iRotateRight2 = iArr4[(i5 - 10) & 1023] + (rotateRight(i43, 23) ^ rotateRight(i33, 10));
            int[] iArr5 = this.f228364p;
            iArr4[i5] = iRotateRight2 + iArr5[(i33 ^ i43) & 1023] + i59;
            int[] iArr6 = this.f228365q;
            int i66 = iArr6[(i5 - 12) & 1023];
            i = iArr5[i66 & 255] + iArr5[((i66 >> 8) & 255) + 256] + iArr5[((i66 >> 16) & 255) + 512] + iArr5[((i66 >> 24) & 255) + ViewUtils.EDGE_TO_EDGE_FLAGS];
            i2 = iArr6[i5];
        }
        int i74 = i2 ^ i;
        this.cnt = (this.cnt + 1) & 2047;
        return i74;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "HC-256";
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
            bArr2[i3 + i5] = (byte) (bArr[i + i5] ^ getByte());
        }
        return i2;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        init();
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b4) {
        return (byte) (b4 ^ getByte());
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z, CipherParameters cipherParameters) throws IllegalArgumentException {
        CipherParameters parameters;
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.f228363iv = parametersWithIV.getIV();
            parameters = parametersWithIV.getParameters();
        } else {
            this.f228363iv = new byte[0];
            parameters = cipherParameters;
        }
        if (!(parameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(m.l("Invalid parameter passed to HC256 init - ", cipherParameters));
        }
        this.key = ((KeyParameter) parameters).getKey();
        init();
        CryptoServicesRegistrar.checkConstraints(new DefaultServiceProperties(getAlgorithmName(), this.key.length * 8, cipherParameters, Utils.getPurpose(z)));
        this.initialised = true;
    }
}
