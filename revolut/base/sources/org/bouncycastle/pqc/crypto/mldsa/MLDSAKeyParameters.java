package org.bouncycastle.pqc.crypto.mldsa;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class MLDSAKeyParameters extends AsymmetricKeyParameter {
    private final MLDSAParameters params;

    public MLDSAKeyParameters(boolean z, MLDSAParameters mLDSAParameters) {
        super(z);
        this.params = mLDSAParameters;
    }

    public MLDSAParameters getParameters() {
        return this.params;
    }
}
