package org.bouncycastle.crypto.hash2curve.impl;

import java.math.BigInteger;
import org.bouncycastle.crypto.hash2curve.H2cUtils;
import org.bouncycastle.crypto.hash2curve.SqrtRatioCalculator;
import org.bouncycastle.math.ec.ECCurve;

/* JADX INFO: loaded from: classes14.dex */
public class GenericSqrtRatioCalculator implements SqrtRatioCalculator {

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private final int f228409c1;
    private final BigInteger c2;
    private final BigInteger c3;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private final BigInteger f228410c4;
    private final BigInteger c5;
    private final BigInteger c6;
    private final BigInteger c7;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final BigInteger f228411q;

    public GenericSqrtRatioCalculator(ECCurve eCCurve, BigInteger bigInteger) {
        BigInteger characteristic = eCCurve.getField().getCharacteristic();
        this.f228411q = characteristic;
        int iCalculateC1 = calculateC1();
        this.f228409c1 = iCalculateC1;
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger bigIntegerDivide = characteristic.subtract(bigInteger2).divide(BigInteger.valueOf(2L).pow(iCalculateC1));
        this.c2 = bigIntegerDivide;
        this.c3 = bigIntegerDivide.subtract(bigInteger2).divide(BigInteger.valueOf(2L));
        this.f228410c4 = BigInteger.valueOf(2L).pow(iCalculateC1).subtract(bigInteger2);
        this.c5 = BigInteger.valueOf(2L).pow(iCalculateC1 - 1);
        this.c6 = bigInteger.modPow(bigIntegerDivide, characteristic);
        this.c7 = bigInteger.modPow(bigIntegerDivide.add(bigInteger2).divide(BigInteger.valueOf(2L)), characteristic);
    }

    private int calculateC1() {
        BigInteger bigIntegerSubtract = this.f228411q.subtract(BigInteger.ONE);
        int i = 0;
        while (bigIntegerSubtract.mod(BigInteger.valueOf(2L)).equals(BigInteger.ZERO)) {
            bigIntegerSubtract = bigIntegerSubtract.divide(BigInteger.valueOf(2L));
            i++;
        }
        return i;
    }

    @Override // org.bouncycastle.crypto.hash2curve.SqrtRatioCalculator
    public SqrtRatio sqrtRatio(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger bigIntegerMod = this.c6;
        BigInteger bigIntegerModPow = bigInteger2.modPow(this.f228410c4, this.f228411q);
        BigInteger bigIntegerMod2 = bigInteger.multiply(bigIntegerModPow.modPow(BigInteger.valueOf(2L), this.f228411q).multiply(bigInteger2).mod(this.f228411q)).mod(this.f228411q).modPow(this.c3, this.f228411q).multiply(bigIntegerModPow).mod(this.f228411q);
        BigInteger bigIntegerMod3 = bigIntegerMod2.multiply(bigInteger2).mod(this.f228411q);
        BigInteger bigIntegerMod4 = bigIntegerMod2.multiply(bigInteger).mod(this.f228411q);
        BigInteger bigIntegerMod5 = bigIntegerMod4.multiply(bigIntegerMod3).mod(this.f228411q);
        boolean zEquals = bigIntegerMod5.modPow(this.c5, this.f228411q).equals(BigInteger.ONE);
        BigInteger bigIntegerMod6 = bigIntegerMod4.multiply(this.c7).mod(this.f228411q);
        BigInteger bigIntegerMod7 = bigIntegerMod5.multiply(bigIntegerMod).mod(this.f228411q);
        BigInteger bigIntegerCmov = H2cUtils.cmov(bigIntegerMod6, bigIntegerMod4, zEquals);
        BigInteger bigIntegerCmov2 = H2cUtils.cmov(bigIntegerMod7, bigIntegerMod5, zEquals);
        for (int i = this.f228409c1; i >= 2; i--) {
            boolean zEquals2 = bigIntegerCmov2.modPow(BigInteger.valueOf(2L).pow(BigInteger.valueOf(i - 2).intValue()), this.f228411q).equals(BigInteger.ONE);
            BigInteger bigIntegerMod8 = bigIntegerCmov.multiply(bigIntegerMod).mod(this.f228411q);
            bigIntegerMod = bigIntegerMod.multiply(bigIntegerMod).mod(this.f228411q);
            BigInteger bigIntegerMod9 = bigIntegerCmov2.multiply(bigIntegerMod).mod(this.f228411q);
            bigIntegerCmov = H2cUtils.cmov(bigIntegerMod8, bigIntegerCmov, zEquals2);
            bigIntegerCmov2 = H2cUtils.cmov(bigIntegerMod9, bigIntegerCmov2, zEquals2);
        }
        return new SqrtRatio(zEquals, bigIntegerCmov);
    }
}
