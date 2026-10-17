package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* JADX INFO: loaded from: classes14.dex */
public class GOST3410PrivateKeySpec implements KeySpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BigInteger f228655a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f228656p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f228657q;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private BigInteger f228658x;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f228658x = bigInteger;
        this.f228656p = bigInteger2;
        this.f228657q = bigInteger3;
        this.f228655a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f228655a;
    }

    public BigInteger getP() {
        return this.f228656p;
    }

    public BigInteger getQ() {
        return this.f228657q;
    }

    public BigInteger getX() {
        return this.f228658x;
    }
}
