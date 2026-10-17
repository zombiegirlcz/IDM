package org.bouncycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes14.dex */
public class FixedPointUtil {
    public static final String PRECOMP_NAME = "bc_fixed_point";

    public static int getCombSize(ECCurve eCCurve) {
        BigInteger order = eCCurve.getOrder();
        return order == null ? eCCurve.getFieldSize() + 1 : order.bitLength();
    }

    public static FixedPointPreCompInfo getFixedPointPreCompInfo(PreCompInfo preCompInfo) {
        if (preCompInfo instanceof FixedPointPreCompInfo) {
            return (FixedPointPreCompInfo) preCompInfo;
        }
        return null;
    }

    public static FixedPointPreCompInfo precompute(final ECPoint eCPoint) {
        final ECCurve curve = eCPoint.getCurve();
        return (FixedPointPreCompInfo) curve.precompute(eCPoint, "bc_fixed_point", new PreCompCallback() { // from class: org.bouncycastle.math.ec.FixedPointUtil.1
            private boolean checkExisting(FixedPointPreCompInfo fixedPointPreCompInfo, int i) {
                return fixedPointPreCompInfo != null && checkTable(fixedPointPreCompInfo.getLookupTable(), i);
            }

            private boolean checkTable(ECLookupTable eCLookupTable, int i) {
                return eCLookupTable != null && eCLookupTable.getSize() >= i;
            }

            @Override // org.bouncycastle.math.ec.PreCompCallback
            public PreCompInfo precompute(PreCompInfo preCompInfo) {
                FixedPointPreCompInfo fixedPointPreCompInfo = preCompInfo instanceof FixedPointPreCompInfo ? (FixedPointPreCompInfo) preCompInfo : null;
                int combSize = FixedPointUtil.getCombSize(curve);
                int i = combSize > 250 ? 6 : 5;
                int i2 = 1 << i;
                if (checkExisting(fixedPointPreCompInfo, i2)) {
                    return fixedPointPreCompInfo;
                }
                int i3 = ((combSize + i) - 1) / i;
                ECPoint[] eCPointArr = new ECPoint[i + 1];
                eCPointArr[0] = eCPoint;
                for (int i5 = 1; i5 < i; i5++) {
                    eCPointArr[i5] = eCPointArr[i5 - 1].timesPow2(i3);
                }
                eCPointArr[i] = eCPointArr[0].subtract(eCPointArr[1]);
                curve.normalizeAll(eCPointArr);
                ECPoint[] eCPointArr2 = new ECPoint[i2];
                eCPointArr2[0] = eCPointArr[0];
                for (int i6 = i - 1; i6 >= 0; i6--) {
                    ECPoint eCPoint2 = eCPointArr[i6];
                    int i21 = 1 << i6;
                    for (int i22 = i21; i22 < i2; i22 += i21 << 1) {
                        eCPointArr2[i22] = eCPointArr2[i22 - i21].add(eCPoint2);
                    }
                }
                curve.normalizeAll(eCPointArr2);
                FixedPointPreCompInfo fixedPointPreCompInfo2 = new FixedPointPreCompInfo();
                fixedPointPreCompInfo2.setLookupTable(curve.createCacheSafeLookupTable(eCPointArr2, 0, i2));
                fixedPointPreCompInfo2.setOffset(eCPointArr[i]);
                fixedPointPreCompInfo2.setWidth(i);
                return fixedPointPreCompInfo2;
            }
        });
    }
}
