package org.bouncycastle.crypto.hash2curve;

import org.bouncycastle.crypto.hash2curve.data.AffineXY;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes14.dex */
public interface CurveProcessor {
    ECPoint add(ECPoint eCPoint, ECPoint eCPoint2);

    ECPoint clearCofactor(ECPoint eCPoint);

    AffineXY mapToAffineXY(ECPoint eCPoint);
}
