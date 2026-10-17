package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes14.dex */
public class DHPrivateKeyParameters extends DHKeyParameters {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private BigInteger f228488x;

    public DHPrivateKeyParameters(BigInteger bigInteger, DHParameters dHParameters) {
        super(true, dHParameters);
        this.f228488x = bigInteger;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public boolean equals(Object obj2) {
        return (obj2 instanceof DHPrivateKeyParameters) && ((DHPrivateKeyParameters) obj2).getX().equals(this.f228488x) && super.equals(obj2);
    }

    public BigInteger getX() {
        return this.f228488x;
    }

    @Override // org.bouncycastle.crypto.params.DHKeyParameters
    public int hashCode() {
        return this.f228488x.hashCode() ^ super.hashCode();
    }
}
