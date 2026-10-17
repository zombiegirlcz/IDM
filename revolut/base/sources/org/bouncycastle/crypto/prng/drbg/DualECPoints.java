package org.bouncycastle.crypto.prng.drbg;

import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes14.dex */
public class DualECPoints {
    private final int cofactor;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ECPoint f228555p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ECPoint f228556q;
    private final int securityStrength;

    public DualECPoints(int i, ECPoint eCPoint, ECPoint eCPoint2, int i2) {
        if (!eCPoint.getCurve().equals(eCPoint2.getCurve())) {
            throw new IllegalArgumentException("points need to be on the same curve");
        }
        this.securityStrength = i;
        this.f228555p = eCPoint;
        this.f228556q = eCPoint2;
        this.cofactor = i2;
    }

    private static int log2(int i) {
        int i2 = 0;
        while (true) {
            i >>= 1;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public int getCofactor() {
        return this.cofactor;
    }

    public int getMaxOutlen() {
        return ((this.f228555p.getCurve().getFieldSize() - (log2(this.cofactor) + 13)) / 8) * 8;
    }

    public ECPoint getP() {
        return this.f228555p;
    }

    public ECPoint getQ() {
        return this.f228556q;
    }

    public int getSecurityStrength() {
        return this.securityStrength;
    }

    public int getSeedLen() {
        return this.f228555p.getCurve().getFieldSize();
    }
}
