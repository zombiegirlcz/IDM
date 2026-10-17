package org.bouncycastle.pqc.crypto.slhdsa;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class SLHDSAPublicKeyParameters extends SLHDSAKeyParameters {
    private final PK pk;

    public SLHDSAPublicKeyParameters(SLHDSAParameters sLHDSAParameters, PK pk) {
        super(false, sLHDSAParameters);
        this.pk = pk;
    }

    public byte[] getEncoded() {
        PK pk = this.pk;
        return Arrays.concatenate(pk.seed, pk.root);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.pk.root);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.pk.seed);
    }

    public SLHDSAPublicKeyParameters(SLHDSAParameters sLHDSAParameters, byte[] bArr) {
        super(false, sLHDSAParameters);
        int n3 = sLHDSAParameters.getN();
        int i = n3 * 2;
        if (bArr.length != i) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.pk = new PK(Arrays.copyOfRange(bArr, 0, n3), Arrays.copyOfRange(bArr, n3, i));
    }
}
