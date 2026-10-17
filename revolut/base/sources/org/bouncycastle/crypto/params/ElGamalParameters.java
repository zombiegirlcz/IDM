package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes14.dex */
public class ElGamalParameters implements CipherParameters {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f228505g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f228506l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f228507p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof ElGamalParameters)) {
            return false;
        }
        ElGamalParameters elGamalParameters = (ElGamalParameters) obj2;
        return elGamalParameters.getP().equals(this.f228507p) && elGamalParameters.getG().equals(this.f228505g) && elGamalParameters.getL() == this.f228506l;
    }

    public BigInteger getG() {
        return this.f228505g;
    }

    public int getL() {
        return this.f228506l;
    }

    public BigInteger getP() {
        return this.f228507p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f228506l;
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f228505g = bigInteger2;
        this.f228507p = bigInteger;
        this.f228506l = i;
    }
}
