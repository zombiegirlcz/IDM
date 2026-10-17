package org.bouncycastle.crypto.hash2curve;

import java.math.BigInteger;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes14.dex */
public interface MapToCurve {
    ECPoint process(BigInteger bigInteger);
}
