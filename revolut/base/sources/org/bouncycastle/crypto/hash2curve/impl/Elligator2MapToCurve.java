package org.bouncycastle.crypto.hash2curve.impl;

import java.math.BigInteger;
import org.bouncycastle.crypto.hash2curve.H2cUtils;
import org.bouncycastle.crypto.hash2curve.MapToCurve;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes14.dex */
public class Elligator2MapToCurve implements MapToCurve {
    private final BigInteger K;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private final BigInteger f228407c1;
    private final BigInteger c2;
    private final ECCurve curve;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final BigInteger f228408p;
    private final BigInteger z;

    public Elligator2MapToCurve(ECCurve eCCurve, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.curve = eCCurve;
        this.z = bigInteger;
        this.K = bigInteger3;
        BigInteger characteristic = eCCurve.getField().getCharacteristic();
        this.f228408p = characteristic;
        BigInteger bigIntegerModInverse = bigInteger3.modInverse(characteristic);
        this.f228407c1 = bigInteger2.multiply(bigIntegerModInverse).mod(characteristic);
        this.c2 = bigIntegerModInverse.multiply(bigIntegerModInverse).mod(characteristic);
    }

    @Override // org.bouncycastle.crypto.hash2curve.MapToCurve
    public ECPoint process(BigInteger bigInteger) {
        BigInteger bigIntegerMod = this.z.multiply(bigInteger.multiply(bigInteger).mod(this.f228408p)).mod(this.f228408p);
        BigInteger bigInteger2 = this.f228408p;
        BigInteger bigInteger3 = BigInteger.ONE;
        BigInteger bigIntegerCmov = H2cUtils.cmov(bigIntegerMod, BigInteger.ZERO, bigIntegerMod.equals(bigInteger2.subtract(bigInteger3)));
        BigInteger bigIntegerMod2 = H2cUtils.inv0(bigIntegerCmov.add(bigInteger3).mod(this.f228408p), this.f228408p).multiply(this.f228407c1).negate().mod(this.f228408p);
        BigInteger bigIntegerMod3 = bigIntegerMod2.add(this.f228407c1).mod(this.f228408p).multiply(bigIntegerMod2).mod(this.f228408p).add(this.c2).mod(this.f228408p).multiply(bigIntegerMod2).mod(this.f228408p);
        BigInteger bigIntegerMod4 = bigIntegerMod2.negate().subtract(this.f228407c1).mod(this.f228408p);
        BigInteger bigIntegerMod5 = bigIntegerCmov.multiply(bigIntegerMod3).mod(this.f228408p);
        boolean zIsSquare = H2cUtils.isSquare(bigIntegerMod3, this.f228408p);
        BigInteger bigIntegerCmov2 = H2cUtils.cmov(bigIntegerMod4, bigIntegerMod2, zIsSquare);
        BigInteger bigIntegerSqrt = H2cUtils.sqrt(H2cUtils.cmov(bigIntegerMod5, bigIntegerMod3, zIsSquare), this.f228408p);
        return this.curve.createPoint(bigIntegerCmov2.multiply(this.K).mod(this.f228408p), H2cUtils.cmov(bigIntegerSqrt, bigIntegerSqrt.negate().mod(this.f228408p), zIsSquare ^ (H2cUtils.sgn0(bigIntegerSqrt, this.curve) == 1)).multiply(this.K).mod(this.f228408p));
    }
}
