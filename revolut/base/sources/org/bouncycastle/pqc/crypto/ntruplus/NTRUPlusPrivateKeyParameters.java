package org.bouncycastle.pqc.crypto.ntruplus;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class NTRUPlusPrivateKeyParameters extends NTRUPlusKeyParameters {
    private final byte[] sk;

    public NTRUPlusPrivateKeyParameters(NTRUPlusParameters nTRUPlusParameters, byte[] bArr) {
        super(true, nTRUPlusParameters);
        this.sk = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.sk);
    }
}
