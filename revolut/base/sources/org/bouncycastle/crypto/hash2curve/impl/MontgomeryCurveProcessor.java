package org.bouncycastle.crypto.hash2curve.impl;

import java.math.BigInteger;
import org.bouncycastle.crypto.hash2curve.CurveProcessor;
import org.bouncycastle.crypto.hash2curve.data.AffineXY;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes14.dex */
public class MontgomeryCurveProcessor implements CurveProcessor {
    private final int J;
    private final int K;
    private final ECCurve curve;
    private final BigInteger hEff;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final BigInteger f228412p;

    public MontgomeryCurveProcessor(ECCurve eCCurve, int i, int i2, int i3) {
        this.J = i;
        this.K = i2;
        this.curve = eCCurve;
        this.f228412p = eCCurve.getField().getCharacteristic();
        this.hEff = BigInteger.valueOf(i3);
    }

    private AffineXY Fmtow(BigInteger bigInteger, BigInteger bigInteger2) {
        return new AffineXY(bigInteger.mod(this.f228412p).add(BigInteger.valueOf(this.J).mod(this.f228412p).multiply(BigInteger.valueOf(this.K).mod(this.f228412p).modInverse(this.f228412p)).mod(this.f228412p).multiply(BigInteger.valueOf(3L).modInverse(this.f228412p)).mod(this.f228412p)).mod(this.f228412p), bigInteger2.mod(this.f228412p).multiply(BigInteger.valueOf(this.K).mod(this.f228412p).modInverse(this.f228412p)).mod(this.f228412p));
    }

    private AffineXY Fwtom(BigInteger bigInteger, BigInteger bigInteger2) {
        return new AffineXY(bigInteger.mod(this.f228412p).subtract(BigInteger.valueOf(this.J).mod(this.f228412p).multiply(BigInteger.valueOf(this.K).mod(this.f228412p).modInverse(this.f228412p)).mod(this.f228412p).multiply(BigInteger.valueOf(3L).modInverse(this.f228412p)).mod(this.f228412p)).mod(this.f228412p), bigInteger2.mod(this.f228412p).multiply(BigInteger.valueOf(this.K).mod(this.f228412p)).mod(this.f228412p));
    }

    @Override // org.bouncycastle.crypto.hash2curve.CurveProcessor
    public ECPoint add(ECPoint eCPoint, ECPoint eCPoint2) {
        return Fwtom(Fmtow(eCPoint).toPoint(this.curve).add(Fmtow(eCPoint2).toPoint(this.curve)).normalize()).toPoint(this.curve);
    }

    @Override // org.bouncycastle.crypto.hash2curve.CurveProcessor
    public ECPoint clearCofactor(ECPoint eCPoint) {
        return eCPoint.isInfinity() ? eCPoint : Fmtow(eCPoint).toPoint(this.curve).multiply(this.hEff).normalize();
    }

    @Override // org.bouncycastle.crypto.hash2curve.CurveProcessor
    public AffineXY mapToAffineXY(ECPoint eCPoint) {
        return Fwtom(eCPoint.normalize());
    }

    private AffineXY Fmtow(ECPoint eCPoint) {
        if (eCPoint.isInfinity()) {
            BigInteger bigInteger = BigInteger.ZERO;
            return new AffineXY(bigInteger, bigInteger);
        }
        ECPoint eCPointNormalize = eCPoint.normalize();
        return Fmtow(eCPointNormalize.getAffineXCoord().toBigInteger(), eCPointNormalize.getAffineYCoord().toBigInteger());
    }

    private AffineXY Fwtom(ECPoint eCPoint) {
        if (eCPoint.isInfinity()) {
            BigInteger bigInteger = BigInteger.ZERO;
            return new AffineXY(bigInteger, bigInteger);
        }
        ECPoint eCPointNormalize = eCPoint.normalize();
        return Fwtom(eCPointNormalize.getAffineXCoord().toBigInteger(), eCPointNormalize.getAffineYCoord().toBigInteger());
    }
}
