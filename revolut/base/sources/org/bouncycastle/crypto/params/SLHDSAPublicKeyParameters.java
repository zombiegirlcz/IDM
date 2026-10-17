package org.bouncycastle.crypto.params;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class SLHDSAPublicKeyParameters extends SLHDSAKeyParameters {
    private final byte[] pkRoot;
    private final byte[] pkSeed;

    public SLHDSAPublicKeyParameters(SLHDSAParameters sLHDSAParameters, byte[] bArr) {
        super(false, sLHDSAParameters);
        int n3 = sLHDSAParameters.getN();
        int i = n3 * 2;
        if (bArr.length != i) {
            throw new IllegalArgumentException("public key encoding does not match parameters");
        }
        this.pkSeed = Arrays.copyOfRange(bArr, 0, n3);
        this.pkRoot = Arrays.copyOfRange(bArr, n3, i);
    }

    public byte[] getEncoded() {
        return Arrays.concatenate(this.pkSeed, this.pkRoot);
    }

    public byte[] getRoot() {
        return Arrays.clone(this.pkRoot);
    }

    public byte[] getSeed() {
        return Arrays.clone(this.pkSeed);
    }
}
