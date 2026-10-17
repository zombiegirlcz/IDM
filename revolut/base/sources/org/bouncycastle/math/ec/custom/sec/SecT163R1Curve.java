package org.bouncycastle.math.ec.custom.sec;

import com.youTransactor.uCube.rpc.Constants;
import java.math.BigInteger;
import org.bouncycastle.math.ec.AbstractECLookupTable;
import org.bouncycastle.math.ec.ECConstants;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECLookupTable;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.raw.Nat192;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes14.dex */
public class SecT163R1Curve extends ECCurve.AbstractF2m {
    private static final ECFieldElement[] SECT163R1_AFFINE_ZS = {new SecT163FieldElement(ECConstants.ONE)};
    private static final int SECT163R1_DEFAULT_COORDS = 6;
    protected SecT163R1Point infinity;

    public SecT163R1Curve() {
        super(Constants.TAG_ACE_LAYER_VERSION, 3, 6, 7);
        this.infinity = new SecT163R1Point(this, null, null);
        this.f228666a = fromBigInteger(new BigInteger(1, Hex.decodeStrict("07B6882CAAEFA84F9554FF8428BD88E246D2782AE2")));
        this.f228667b = fromBigInteger(new BigInteger(1, Hex.decodeStrict("0713612DCDDCB40AAB946BDA29CA91F73AF958AFD9")));
        this.order = new BigInteger(1, Hex.decodeStrict("03FFFFFFFFFFFFFFFFFFFF48AAB689C29CA710279B"));
        this.cofactor = BigInteger.valueOf(2L);
        this.coord = 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECCurve cloneCurve() {
        return new SecT163R1Curve();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i, final int i2) {
        final long[] jArr = new long[i2 * 6];
        int i3 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            ECPoint eCPoint = eCPointArr[i + i5];
            Nat192.copy64(((SecT163FieldElement) eCPoint.getRawXCoord()).f228710x, 0, jArr, i3);
            Nat192.copy64(((SecT163FieldElement) eCPoint.getRawYCoord()).f228710x, 0, jArr, i3 + 3);
            i3 += 6;
        }
        return new AbstractECLookupTable(this) { // from class: org.bouncycastle.math.ec.custom.sec.SecT163R1Curve.1
            final /* synthetic */ SecT163R1Curve this$0;

            {
                this.this$0 = this;
            }

            private ECPoint createPoint(long[] jArr2, long[] jArr3) {
                return this.this$0.createRawPoint(new SecT163FieldElement(jArr2), new SecT163FieldElement(jArr3), SecT163R1Curve.SECT163R1_AFFINE_ZS);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i2;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i6) {
                long[] jArrCreate64 = Nat192.create64();
                long[] jArrCreate642 = Nat192.create64();
                int i21 = 0;
                for (int i22 = 0; i22 < i2; i22++) {
                    long j2 = ((i22 ^ i6) - 1) >> 31;
                    for (int i32 = 0; i32 < 3; i32++) {
                        long j3 = jArrCreate64[i32];
                        long[] jArr2 = jArr;
                        jArrCreate64[i32] = j3 ^ (jArr2[i21 + i32] & j2);
                        jArrCreate642[i32] = jArrCreate642[i32] ^ (jArr2[(i21 + 3) + i32] & j2);
                    }
                    i21 += 6;
                }
                return createPoint(jArrCreate64, jArrCreate642);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i6) {
                long[] jArrCreate64 = Nat192.create64();
                long[] jArrCreate642 = Nat192.create64();
                int i21 = i6 * 6;
                for (int i22 = 0; i22 < 3; i22++) {
                    long[] jArr2 = jArr;
                    jArrCreate64[i22] = jArr2[i21 + i22];
                    jArrCreate642[i22] = jArr2[3 + i21 + i22];
                }
                return createPoint(jArrCreate64, jArrCreate642);
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
        return new SecT163R1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECFieldElement fromBigInteger(BigInteger bigInteger) {
        return new SecT163FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return Constants.TAG_ACE_LAYER_VERSION;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint getInfinity() {
        return this.infinity;
    }

    public int getK1() {
        return 3;
    }

    public int getK2() {
        return 6;
    }

    public int getK3() {
        return 7;
    }

    public int getM() {
        return Constants.TAG_ACE_LAYER_VERSION;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return false;
    }

    public boolean isTrinomial() {
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
        return new SecT163R1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }
}
