package org.bouncycastle.crypto.agreement.ecjpake;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes14.dex */
public class ECJPAKECurve {
    private final ECCurve.AbstractFp curve;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ECPoint f228258g;

    public ECJPAKECurve(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7) {
        ECJPAKEUtil.validateNotNull(bigInteger2, "a");
        ECJPAKEUtil.validateNotNull(bigInteger3, "b");
        ECJPAKEUtil.validateNotNull(bigInteger, "q");
        ECJPAKEUtil.validateNotNull(bigInteger4, "n");
        ECJPAKEUtil.validateNotNull(bigInteger5, "h");
        ECJPAKEUtil.validateNotNull(bigInteger6, "g_x");
        ECJPAKEUtil.validateNotNull(bigInteger7, "g_y");
        if (!bigInteger.isProbablePrime(20)) {
            throw new IllegalArgumentException("Field size q must be prime");
        }
        BigInteger bigInteger8 = BigInteger.ZERO;
        if (bigInteger2.compareTo(bigInteger8) < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
            throw new IllegalArgumentException("The parameter 'a' is not in the field [0, q-1]");
        }
        if (bigInteger3.compareTo(bigInteger8) < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
            throw new IllegalArgumentException("The parameter 'b' is not in the field [0, q-1]");
        }
        if (calculateDeterminant(bigInteger, bigInteger2, bigInteger3).equals(bigInteger8)) {
            throw new IllegalArgumentException("The curve is singular, i.e the discriminant is equal to 0 mod q.");
        }
        if (!bigInteger4.isProbablePrime(20)) {
            throw new IllegalArgumentException("The order n must be prime");
        }
        ECCurve.Fp fp2 = new ECCurve.Fp(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5);
        this.curve = fp2;
        this.f228258g = fp2.validatePoint(bigInteger6, bigInteger7);
    }

    private static BigInteger calculateDeterminant(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger2.multiply(bigInteger2).mod(bigInteger).multiply(bigInteger2).mod(bigInteger).shiftLeft(2).add(bigInteger3.multiply(bigInteger3).mod(bigInteger).multiply(BigInteger.valueOf(27L))).mod(bigInteger);
    }

    public BigInteger getA() {
        return this.curve.getA().toBigInteger();
    }

    public BigInteger getB() {
        return this.curve.getB().toBigInteger();
    }

    public ECCurve.AbstractFp getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.f228258g;
    }

    public BigInteger getH() {
        return this.curve.getCofactor();
    }

    public BigInteger getN() {
        return this.curve.getOrder();
    }

    public BigInteger getQ() {
        return this.curve.getQ();
    }

    public ECJPAKECurve(ECCurve.AbstractFp abstractFp, ECPoint eCPoint) {
        ECJPAKEUtil.validateNotNull(abstractFp, "curve");
        ECJPAKEUtil.validateNotNull(eCPoint, "g");
        ECJPAKEUtil.validateNotNull(abstractFp.getOrder(), "n");
        ECJPAKEUtil.validateNotNull(abstractFp.getCofactor(), "h");
        this.curve = abstractFp;
        this.f228258g = eCPoint;
    }
}
