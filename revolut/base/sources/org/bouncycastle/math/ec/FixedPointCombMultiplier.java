package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Nat;

/* JADX INFO: loaded from: classes14.dex */
public class FixedPointCombMultiplier extends AbstractECMultiplier {
    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECCurve curve = eCPoint.getCurve();
        if (bigInteger.bitLength() > FixedPointUtil.getCombSize(curve)) {
            throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        FixedPointPreCompInfo fixedPointPreCompInfoPrecompute = FixedPointUtil.precompute(eCPoint);
        ECLookupTable lookupTable = fixedPointPreCompInfoPrecompute.getLookupTable();
        int width = fixedPointPreCompInfoPrecompute.getWidth();
        int i = ((r1 + width) - 1) / width;
        ECPoint infinity = curve.getInfinity();
        int i2 = width * i;
        int[] iArrFromBigInteger = Nat.fromBigInteger(i2, bigInteger);
        int i3 = i2 - 1;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = 0;
            for (int i21 = i3 - i5; i21 >= 0; i21 -= i) {
                int i22 = iArrFromBigInteger[i21 >>> 5] >>> (i21 & 31);
                i6 = ((i6 ^ (i22 >>> 1)) << 1) ^ i22;
            }
            infinity = infinity.twicePlus(lookupTable.lookup(i6));
        }
        return infinity.add(fixedPointPreCompInfoPrecompute.getOffset());
    }
}
