package org.bouncycastle.crypto.hash2curve;

import java.math.BigInteger;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.hash2curve.impl.XmdMessageExpansion;
import org.bouncycastle.math.ec.ECCurve;

/* JADX INFO: loaded from: classes14.dex */
public class OPRFHashToScalar {
    private final int L;
    private final ECCurve curve;
    private final MessageExpansion messageExpansion;

    public OPRFHashToScalar(ECCurve eCCurve, Digest digest, int i, int i2) {
        this.curve = eCCurve;
        this.L = (int) Math.ceil((((double) eCCurve.getOrder().subtract(BigInteger.ONE).bitLength()) + ((double) i)) / 8.0d);
        this.messageExpansion = new XmdMessageExpansion(digest, i, i2);
    }

    public BigInteger process(byte[] bArr, byte[] bArr2) {
        return new BigInteger(1, this.messageExpansion.expandMessage(bArr, bArr2, this.L)).mod(this.curve.getOrder());
    }

    public OPRFHashToScalar(ECCurve eCCurve, ExtendedDigest extendedDigest, int i) {
        this.curve = eCCurve;
        this.L = (int) Math.ceil((((double) eCCurve.getOrder().subtract(BigInteger.ONE).bitLength()) + ((double) i)) / 8.0d);
        this.messageExpansion = new XmdMessageExpansion(extendedDigest, i);
    }
}
