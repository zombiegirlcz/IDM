package org.bouncycastle.pqc.crypto.ntruplus;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class NTRUPlusPublicKeyParameters extends NTRUPlusKeyParameters {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final byte[] f228854p;

    public NTRUPlusPublicKeyParameters(NTRUPlusParameters nTRUPlusParameters, byte[] bArr) {
        super(false, nTRUPlusParameters);
        this.f228854p = Arrays.clone(bArr);
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.f228854p);
    }
}
