package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

/* JADX INFO: loaded from: classes14.dex */
public class KnownLatitude extends NinetyDegreeInt {
    public KnownLatitude(long j2) {
        super(j2);
    }

    public static KnownLatitude getInstance(Object obj2) {
        if (obj2 instanceof KnownLatitude) {
            return (KnownLatitude) obj2;
        }
        if (obj2 != null) {
            return new KnownLatitude(ASN1Integer.getInstance(obj2));
        }
        return null;
    }

    public KnownLatitude(BigInteger bigInteger) {
        super(bigInteger);
    }

    private KnownLatitude(ASN1Integer aSN1Integer) {
        this(aSN1Integer.getValue());
    }
}
