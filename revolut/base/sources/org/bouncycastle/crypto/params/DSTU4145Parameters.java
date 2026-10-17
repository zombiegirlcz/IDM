package org.bouncycastle.crypto.params;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class DSTU4145Parameters extends ECDomainParameters {

    /* JADX INFO: renamed from: dke, reason: collision with root package name */
    private final byte[] f228497dke;

    public DSTU4145Parameters(ECDomainParameters eCDomainParameters, byte[] bArr) {
        super(eCDomainParameters.getCurve(), eCDomainParameters.getG(), eCDomainParameters.getN(), eCDomainParameters.getH(), eCDomainParameters.getSeed());
        this.f228497dke = Arrays.clone(bArr);
    }

    public byte[] getDKE() {
        return Arrays.clone(this.f228497dke);
    }
}
