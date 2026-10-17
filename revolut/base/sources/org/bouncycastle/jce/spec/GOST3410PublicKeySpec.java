package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes14.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f228662a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f228663p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f228664q;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private BigInteger f228665y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f228665y = bigInteger;
        this.f228663p = bigInteger2;
        this.f228664q = bigInteger3;
        this.f228662a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f228662a;
    }

    public BigInteger getP() {
        return this.f228663p;
    }

    public BigInteger getQ() {
        return this.f228664q;
    }

    public BigInteger getY() {
        return this.f228665y;
    }
}
