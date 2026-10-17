package org.bouncycastle.pqc.crypto.ntruplus;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes14.dex */
public class NTRUPlusKeyParameters extends AsymmetricKeyParameter {
    private final NTRUPlusParameters params;

    public NTRUPlusKeyParameters(boolean z, NTRUPlusParameters nTRUPlusParameters) {
        super(z);
        this.params = nTRUPlusParameters;
    }

    public NTRUPlusParameters getParameters() {
        return this.params;
    }
}
