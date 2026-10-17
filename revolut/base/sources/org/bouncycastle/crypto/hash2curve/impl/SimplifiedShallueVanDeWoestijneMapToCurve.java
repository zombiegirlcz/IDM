package org.bouncycastle.crypto.hash2curve.impl;

import java.math.BigInteger;
import org.bouncycastle.crypto.hash2curve.H2cUtils;
import org.bouncycastle.crypto.hash2curve.MapToCurve;
import org.bouncycastle.crypto.hash2curve.SqrtRatioCalculator;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes14.dex */
public class SimplifiedShallueVanDeWoestijneMapToCurve implements MapToCurve {
    private final ECCurve curve;
    private final SqrtRatioCalculator sqrtRatioCalculator;
    private final BigInteger z;

    public SimplifiedShallueVanDeWoestijneMapToCurve(ECCurve eCCurve, BigInteger bigInteger) {
        this.curve = eCCurve;
        this.z = bigInteger;
        this.sqrtRatioCalculator = new GenericSqrtRatioCalculator(eCCurve, bigInteger);
    }

    @Override // org.bouncycastle.crypto.hash2curve.MapToCurve
    public ECPoint process(BigInteger bigInteger) {
        BigInteger bigInteger2 = this.curve.getA().toBigInteger();
        BigInteger bigInteger3 = this.curve.getB().toBigInteger();
        BigInteger characteristic = this.curve.getField().getCharacteristic();
        BigInteger bigIntegerMod = this.z.multiply(bigInteger.modPow(BigInteger.valueOf(2L), characteristic)).mod(characteristic);
        BigInteger bigIntegerMod2 = bigIntegerMod.modPow(BigInteger.valueOf(2L), characteristic).add(bigIntegerMod).mod(characteristic);
        BigInteger bigInteger4 = BigInteger.ONE;
        BigInteger bigIntegerMod3 = bigInteger3.multiply(bigIntegerMod2.add(bigInteger4).mod(characteristic)).mod(characteristic);
        BigInteger bigIntegerMod4 = bigInteger2.multiply(H2cUtils.cmov(this.z, bigIntegerMod2.negate(), !bigIntegerMod2.equals(BigInteger.ZERO))).mod(characteristic);
        BigInteger bigIntegerModPow = bigIntegerMod3.modPow(BigInteger.valueOf(2L), characteristic);
        BigInteger bigIntegerModPow2 = bigIntegerMod4.modPow(BigInteger.valueOf(2L), characteristic);
        BigInteger bigIntegerMod5 = bigIntegerModPow.add(bigInteger2.multiply(bigIntegerModPow2).mod(characteristic)).mod(characteristic).multiply(bigIntegerMod3).mod(characteristic);
        BigInteger bigIntegerMod6 = bigIntegerModPow2.multiply(bigIntegerMod4).mod(characteristic);
        BigInteger bigIntegerMod7 = bigIntegerMod5.add(bigInteger3.multiply(bigIntegerMod6).mod(characteristic)).mod(characteristic);
        BigInteger bigIntegerMod8 = bigIntegerMod.multiply(bigIntegerMod3).mod(characteristic);
        SqrtRatio sqrtRatio = this.sqrtRatioCalculator.sqrtRatio(bigIntegerMod7, bigIntegerMod6);
        boolean zIsQR = sqrtRatio.isQR();
        BigInteger ratio = sqrtRatio.getRatio();
        BigInteger bigIntegerMod9 = bigIntegerMod.multiply(bigInteger).mod(characteristic).multiply(ratio).mod(characteristic);
        BigInteger bigIntegerCmov = H2cUtils.cmov(bigIntegerMod8, bigIntegerMod3, zIsQR);
        BigInteger bigIntegerCmov2 = H2cUtils.cmov(bigIntegerMod9, ratio, zIsQR);
        return this.curve.createPoint(bigIntegerCmov.multiply(bigIntegerMod4.modPow(bigInteger4.negate(), characteristic)).mod(characteristic), H2cUtils.cmov(bigIntegerCmov2.negate(), bigIntegerCmov2, H2cUtils.sgn0(bigInteger, this.curve) == H2cUtils.sgn0(bigIntegerCmov2, this.curve)).mod(characteristic));
    }
}
