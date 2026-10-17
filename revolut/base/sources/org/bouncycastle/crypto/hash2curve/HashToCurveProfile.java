package org.bouncycastle.crypto.hash2curve;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes14.dex */
public enum HashToCurveProfile {
    P256_XMD_SHA_256(BigInteger.valueOf(-10), 48, 128, 1, null, null),
    P384_XMD_SHA_384(BigInteger.valueOf(-12), 72, 192, 1, null, null),
    P521_XMD_SHA_512(BigInteger.valueOf(-4), 98, 256, 1, null, null),
    CURVE25519W_XMD_SHA_512_ELL2(BigInteger.valueOf(2), 48, 128, 8, 486662, 1);

    private final int L;
    private final BigInteger Z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f228402h;
    private final int k;
    private final Integer mJ;
    private final Integer mK;

    HashToCurveProfile(BigInteger bigInteger, int i, int i2, int i3, Integer num, Integer num2) {
        this.Z = bigInteger;
        this.L = i;
        this.k = i2;
        this.f228402h = i3;
        this.mJ = num;
        this.mK = num2;
    }

    public int getH() {
        return this.f228402h;
    }

    public int getK() {
        return this.k;
    }

    public int getL() {
        return this.L;
    }

    public BigInteger getZ() {
        return this.Z;
    }

    public Integer getmJ() {
        return this.mJ;
    }

    public Integer getmK() {
        return this.mK;
    }
}
