package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes14.dex */
public class ElGamalPublicKeyParameters extends ElGamalKeyParameters {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private BigInteger f228509y;

    public ElGamalPublicKeyParameters(BigInteger bigInteger, ElGamalParameters elGamalParameters) {
        super(false, elGamalParameters);
        this.f228509y = bigInteger;
    }

    @Override // org.bouncycastle.crypto.params.ElGamalKeyParameters
    public boolean equals(Object obj2) {
        return (obj2 instanceof ElGamalPublicKeyParameters) && ((ElGamalPublicKeyParameters) obj2).getY().equals(this.f228509y) && super.equals(obj2);
    }

    public BigInteger getY() {
        return this.f228509y;
    }

    @Override // org.bouncycastle.crypto.params.ElGamalKeyParameters
    public int hashCode() {
        return this.f228509y.hashCode() ^ super.hashCode();
    }
}
