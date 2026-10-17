package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes14.dex */
public class ParametersWithID implements CipherParameters {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private byte[] f228534id;
    private CipherParameters parameters;

    public ParametersWithID(CipherParameters cipherParameters, byte[] bArr) {
        this.parameters = cipherParameters;
        this.f228534id = bArr;
    }

    public byte[] getID() {
        return this.f228534id;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }
}
