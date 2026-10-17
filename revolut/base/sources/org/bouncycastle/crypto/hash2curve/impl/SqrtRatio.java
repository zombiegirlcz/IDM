package org.bouncycastle.crypto.hash2curve.impl;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes14.dex */
public class SqrtRatio {
    private final boolean isQR;
    private final BigInteger ratio;

    public SqrtRatio(boolean z, BigInteger bigInteger) {
        this.isQR = z;
        this.ratio = bigInteger;
    }

    public BigInteger getRatio() {
        return this.ratio;
    }

    public boolean isQR() {
        return this.isQR;
    }
}
