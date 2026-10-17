package org.bouncycastle.crypto.hash2curve;

import java.math.BigInteger;
import org.bouncycastle.crypto.hash2curve.impl.SqrtRatio;

/* JADX INFO: loaded from: classes14.dex */
public interface SqrtRatioCalculator {
    SqrtRatio sqrtRatio(BigInteger bigInteger, BigInteger bigInteger2);
}
