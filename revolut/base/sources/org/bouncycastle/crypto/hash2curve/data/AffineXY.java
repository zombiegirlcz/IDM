package org.bouncycastle.crypto.hash2curve.data;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes14.dex */
public final class AffineXY {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final BigInteger f228405x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final BigInteger f228406y;

    public AffineXY(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f228405x = bigInteger;
        this.f228406y = bigInteger2;
    }

    public BigInteger getX() {
        return this.f228405x;
    }

    public BigInteger getY() {
        return this.f228406y;
    }

    public ECPoint toPoint(ECCurve eCCurve) {
        return eCCurve.createPoint(getX(), getY()).normalize();
    }

    public AffineXY(ECPoint eCPoint) {
        this(eCPoint, true);
    }

    public AffineXY(ECPoint eCPoint, boolean z) {
        if (eCPoint.isInfinity()) {
            throw new IllegalArgumentException("Cannot extract affine coordinates from point at infinity");
        }
        eCPoint = z ? eCPoint.normalize() : eCPoint;
        this.f228405x = eCPoint.getAffineXCoord().toBigInteger();
        this.f228406y = eCPoint.getAffineYCoord().toBigInteger();
    }
}
