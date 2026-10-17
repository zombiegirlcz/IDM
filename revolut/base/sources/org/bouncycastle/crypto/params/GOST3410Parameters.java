package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* JADX INFO: loaded from: classes14.dex */
public class GOST3410Parameters implements CipherParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f228510a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f228511p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f228512q;
    private GOST3410ValidationParameters validation;

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f228511p = bigInteger;
        this.f228512q = bigInteger2;
        this.f228510a = bigInteger3;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof GOST3410Parameters)) {
            return false;
        }
        GOST3410Parameters gOST3410Parameters = (GOST3410Parameters) obj2;
        return gOST3410Parameters.getP().equals(this.f228511p) && gOST3410Parameters.getQ().equals(this.f228512q) && gOST3410Parameters.getA().equals(this.f228510a);
    }

    public BigInteger getA() {
        return this.f228510a;
    }

    public BigInteger getP() {
        return this.f228511p;
    }

    public BigInteger getQ() {
        return this.f228512q;
    }

    public GOST3410ValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (this.f228511p.hashCode() ^ this.f228512q.hashCode()) ^ this.f228510a.hashCode();
    }

    public GOST3410Parameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, GOST3410ValidationParameters gOST3410ValidationParameters) {
        this.f228510a = bigInteger3;
        this.f228511p = bigInteger;
        this.f228512q = bigInteger2;
        this.validation = gOST3410ValidationParameters;
    }
}
