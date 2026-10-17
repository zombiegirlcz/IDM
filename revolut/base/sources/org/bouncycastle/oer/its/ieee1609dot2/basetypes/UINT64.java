package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

/* JADX INFO: loaded from: classes14.dex */
public class UINT64 extends UintBase {
    private static final BigInteger MAX = new BigInteger("18446744073709551615");

    public UINT64(int i) {
        super(i);
    }

    public static UINT64 getInstance(Object obj2) {
        if (obj2 instanceof UINT64) {
            return (UINT64) obj2;
        }
        if (obj2 != null) {
            return new UINT64(ASN1Integer.getInstance(obj2));
        }
        return null;
    }

    @Override // org.bouncycastle.oer.its.ieee1609dot2.basetypes.UintBase
    public void assertLimit() {
        if (this.value.signum() < 0) {
            throw new IllegalArgumentException("value must not be negative");
        }
        BigInteger bigInteger = this.value;
        BigInteger bigInteger2 = MAX;
        if (bigInteger.compareTo(bigInteger2) <= 0) {
            return;
        }
        throw new IllegalArgumentException("value must not exceed " + bigInteger2.toString(16));
    }

    public UINT64(long j2) {
        super(j2);
    }

    public UINT64(BigInteger bigInteger) {
        super(bigInteger);
    }

    public UINT64(ASN1Integer aSN1Integer) {
        super(aSN1Integer);
    }
}
