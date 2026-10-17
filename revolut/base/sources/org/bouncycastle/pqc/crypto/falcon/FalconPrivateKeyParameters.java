package org.bouncycastle.pqc.crypto.falcon;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class FalconPrivateKeyParameters extends FalconKeyParameters {
    private final byte[] F;
    private final byte[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f228793g;
    private final byte[] pk;

    public FalconPrivateKeyParameters(FalconParameters falconParameters, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(true, falconParameters);
        this.f = Arrays.clone(bArr);
        this.f228793g = Arrays.clone(bArr2);
        this.F = Arrays.clone(bArr3);
        this.pk = Arrays.clone(bArr4);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(this.f, this.f228793g, this.F);
    }

    public byte[] getG() {
        return Arrays.clone(this.f228793g);
    }

    public byte[] getPublicKey() {
        return Arrays.clone(this.pk);
    }

    public byte[] getSpolyF() {
        return Arrays.clone(this.F);
    }

    public byte[] getSpolyf() {
        return Arrays.clone(this.f);
    }
}
