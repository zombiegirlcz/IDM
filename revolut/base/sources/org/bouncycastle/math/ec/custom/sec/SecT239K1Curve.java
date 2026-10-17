package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECMultiplier;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.WTauNafMultiplier;
import org.bouncycastle.math.raw.Nat256;
import org.bouncycastle.util.encoders.Hex;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes14.dex */
public class SecT239K1Curve extends ECCurve.AbstractF2m {
    private static final ECFieldElement[] SECT239K1_AFFINE_ZS = {new SecT239FieldElement(ECConstants.ONE)};
    private static final int SECT239K1_DEFAULT_COORDS = 6;
    protected SecT239K1Point infinity;

    public SecT239K1Curve() {
        super(239, ISO781611.SMT_DO_DS, 0, 0);
        this.infinity = new SecT239K1Point(this, null, null);
        this.f228666a = fromBigInteger(BigInteger.valueOf(0L));
        this.f228667b = fromBigInteger(BigInteger.valueOf(1L));
        this.order = new BigInteger(1, Hex.decodeStrict("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
        this.cofactor = BigInteger.valueOf(4L);
        this.coord = 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecT239K1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i, final int i2) {
        final long[] jArr = new long[i2 * 8];
        int i3 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            ECPoint eCPoint = eCPointArr[i + i5];
            Nat256.copy64(((SecT239FieldElement) eCPoint.getRawXCoord()).f228713x, 0, jArr, i3);
            Nat256.copy64(((SecT239FieldElement) eCPoint.getRawYCoord()).f228713x, 0, jArr, i3 + 4);
            i3 += 8;
        }
        return new AbstractECLookupTable(this) { // from class: org.bouncycastle.math.ec.custom.sec.SecT239K1Curve.1
            final /* synthetic */ SecT239K1Curve this$0;

            {
                this.this$0 = this;
            }

            private ECPoint createPoint(long[] jArr2, long[] jArr3) {
                return this.this$0.createRawPoint(new SecT239FieldElement(jArr2), new SecT239FieldElement(jArr3), SecT239K1Curve.SECT239K1_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i2;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i6) {
                long[] jArrCreate64 = Nat256.create64();
                long[] jArrCreate642 = Nat256.create64();
                int i21 = 0;
                for (int i22 = 0; i22 < i2; i22++) {
                    long j2 = ((i22 ^ i6) - 1) >> 31;
                    for (int i32 = 0; i32 < 4; i32++) {
                        long j3 = jArrCreate64[i32];
                        long[] jArr2 = jArr;
                        jArrCreate64[i32] = j3 ^ (jArr2[i21 + i32] & j2);
                        jArrCreate642[i32] = jArrCreate642[i32] ^ (jArr2[(i21 + 4) + i32] & j2);
                    }
                    i21 += 8;
                }
                return createPoint(jArrCreate64, jArrCreate642);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i6) {
                long[] jArrCreate64 = Nat256.create64();
                long[] jArrCreate642 = Nat256.create64();
                int i21 = i6 * 8;
                for (int i22 = 0; i22 < 4; i22++) {
                    long[] jArr2 = jArr;
                    jArrCreate64[i22] = jArr2[i21 + i22];
                    jArrCreate642[i22] = jArr2[4 + i21 + i22];
                }
                return createPoint(jArrCreate64, jArrCreate642);
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECMultiplier createDefaultMultiplier() {
        return new WTauNafMultiplier();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecT239K1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT239FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return 239;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return ISO781611.SMT_DO_DS;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 239;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return true;
    }

    public boolean isTrinomial() {
        return true;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecT239K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
