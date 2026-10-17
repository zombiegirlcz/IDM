package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

/* JADX INFO: loaded from: classes14.dex */
public class Latitude extends NinetyDegreeInt {
    public Latitude(long j2) {
        super(j2);
    }

    public static Latitude getInstance(Object obj2) {
        if (obj2 instanceof Latitude) {
            return (Latitude) obj2;
        }
        if (obj2 != null) {
            return new Latitude(ASN1Integer.getInstance(obj2));
        }
        return null;
    }

    public Latitude(BigInteger bigInteger) {
        super(bigInteger);
    }

    private Latitude(ASN1Integer aSN1Integer) {
        this(aSN1Integer.getValue());
    }
}
