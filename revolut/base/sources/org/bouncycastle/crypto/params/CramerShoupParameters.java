package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Memoable;

/* JADX INFO: loaded from: classes14.dex */
public class CramerShoupParameters implements CipherParameters {
    private Digest H;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private BigInteger f228474g1;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    private BigInteger f228475g2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f228476p;

    public CramerShoupParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest) {
        this.f228476p = bigInteger;
        this.f228474g1 = bigInteger2;
        this.f228475g2 = bigInteger3;
        Digest digest2 = (Digest) ((Memoable) digest).copy();
        this.H = digest2;
        digest2.reset();
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof CramerShoupParameters)) {
            return false;
        }
        CramerShoupParameters cramerShoupParameters = (CramerShoupParameters) obj2;
        return cramerShoupParameters.getP().equals(this.f228476p) && cramerShoupParameters.getG1().equals(this.f228474g1) && cramerShoupParameters.getG2().equals(this.f228475g2);
    }

    public BigInteger getG1() {
        return this.f228474g1;
    }

    public BigInteger getG2() {
        return this.f228475g2;
    }

    public Digest getH() {
        return (Digest) ((Memoable) this.H).copy();
    }

    public BigInteger getP() {
        return this.f228476p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG1().hashCode()) ^ getG2().hashCode();
    }
}
