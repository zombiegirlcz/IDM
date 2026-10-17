package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes14.dex */
public class ElGamalParameterSpec implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f228651g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f228652p;

    public ElGamalParameterSpec(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f228652p = bigInteger;
        this.f228651g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f228651g;
    }

    public BigInteger getP() {
        return this.f228652p;
    }
}
