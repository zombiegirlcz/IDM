package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes14.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f228659a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f228660p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f228661q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f228660p = bigInteger;
        this.f228661q = bigInteger2;
        this.f228659a = bigInteger3;
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof GOST3410PublicKeyParameterSetSpec) {
            GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj2;
            if (this.f228659a.equals(gOST3410PublicKeyParameterSetSpec.f228659a) && this.f228660p.equals(gOST3410PublicKeyParameterSetSpec.f228660p) && this.f228661q.equals(gOST3410PublicKeyParameterSetSpec.f228661q)) {
                return true;
            }
        }
        return false;
    }

    public BigInteger getA() {
        return this.f228659a;
    }

    public BigInteger getP() {
        return this.f228660p;
    }

    public BigInteger getQ() {
        return this.f228661q;
    }

    public int hashCode() {
        return (this.f228659a.hashCode() ^ this.f228660p.hashCode()) ^ this.f228661q.hashCode();
    }
}
