package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.math.ntru.Polynomial;

/* JADX INFO: loaded from: classes14.dex */
class PolynomialPair {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Polynomial f228849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Polynomial f228850b;

    public PolynomialPair(Polynomial polynomial, Polynomial polynomial2) {
        this.f228849a = polynomial;
        this.f228850b = polynomial2;
    }

    public Polynomial f() {
        return this.f228849a;
    }

    public Polynomial g() {
        return this.f228850b;
    }

    public Polynomial m() {
        return this.f228850b;
    }

    public Polynomial r() {
        return this.f228849a;
    }
}
