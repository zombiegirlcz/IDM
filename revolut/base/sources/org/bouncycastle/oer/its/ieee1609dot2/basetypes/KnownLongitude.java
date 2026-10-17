package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

/* JADX INFO: loaded from: classes14.dex */
public class KnownLongitude extends Longitude {
    public KnownLongitude(long j2) {
        super(j2);
    }

    public static KnownLongitude getInstance(Object obj2) {
        if (obj2 instanceof KnownLongitude) {
            return (KnownLongitude) obj2;
        }
        if (obj2 != null) {
            return new KnownLongitude(ASN1Integer.getInstance(obj2));
        }
        return null;
    }

    public KnownLongitude(BigInteger bigInteger) {
        super(bigInteger);
    }

    private KnownLongitude(ASN1Integer aSN1Integer) {
        this(aSN1Integer.getValue());
    }
}
