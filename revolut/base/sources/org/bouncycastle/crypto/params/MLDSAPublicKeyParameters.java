package org.bouncycastle.crypto.params;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class MLDSAPublicKeyParameters extends MLDSAKeyParameters {
    final byte[] rho;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    final byte[] f228527t1;

    public MLDSAPublicKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr) {
        super(false, mLDSAParameters);
        this.rho = Arrays.copyOfRange(bArr, 0, 32);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 32, bArr.length);
        this.f228527t1 = bArrCopyOfRange;
        if (bArrCopyOfRange.length == 0) {
            throw new IllegalArgumentException("encoding too short");
        }
    }

    public byte[] getEncoded() {
        return getEncoded(this.rho, this.f228527t1);
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getT1() {
        return Arrays.clone(this.f228527t1);
    }

    public MLDSAPublicKeyParameters(MLDSAParameters mLDSAParameters, byte[] bArr, byte[] bArr2) {
        super(false, mLDSAParameters);
        if (bArr == null) {
            throw new NullPointerException("rho cannot be null");
        }
        if (bArr2 == null) {
            throw new NullPointerException("t1 cannot be null");
        }
        this.rho = Arrays.clone(bArr);
        this.f228527t1 = Arrays.clone(bArr2);
    }

    public static byte[] getEncoded(byte[] bArr, byte[] bArr2) {
        return Arrays.concatenate(bArr, bArr2);
    }
}
