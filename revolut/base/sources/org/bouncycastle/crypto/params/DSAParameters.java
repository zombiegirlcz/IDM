package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes14.dex */
public class DSAParameters implements CipherParameters {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f228492g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f228493p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f228494q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f228492g = bigInteger3;
        this.f228493p = bigInteger;
        this.f228494q = bigInteger2;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof DSAParameters)) {
            return false;
        }
        DSAParameters dSAParameters = (DSAParameters) obj2;
        return dSAParameters.getP().equals(this.f228493p) && dSAParameters.getQ().equals(this.f228494q) && dSAParameters.getG().equals(this.f228492g);
    }

    public BigInteger getG() {
        return this.f228492g;
    }

    public BigInteger getP() {
        return this.f228493p;
    }

    public BigInteger getQ() {
        return this.f228494q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f228492g = bigInteger3;
        this.f228493p = bigInteger;
        this.f228494q = bigInteger2;
        this.validation = dSAValidationParameters;
    }
}
