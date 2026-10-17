package org.bouncycastle.crypto.hash2curve.impl;

import java.math.BigInteger;
import org.bouncycastle.crypto.hash2curve.CurveProcessor;
import org.bouncycastle.crypto.hash2curve.data.AffineXY;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes14.dex */
public class NistCurveProcessor implements CurveProcessor {
    @Override // org.bouncycastle.crypto.hash2curve.CurveProcessor
    public ECPoint add(ECPoint eCPoint, ECPoint eCPoint2) {
        return eCPoint.add(eCPoint2);
    }

    @Override // org.bouncycastle.crypto.hash2curve.CurveProcessor
    public ECPoint clearCofactor(ECPoint eCPoint) {
        return eCPoint.multiply(BigInteger.ONE);
    }

    @Override // org.bouncycastle.crypto.hash2curve.CurveProcessor
    public AffineXY mapToAffineXY(ECPoint eCPoint) {
        return new AffineXY(eCPoint);
    }
}
