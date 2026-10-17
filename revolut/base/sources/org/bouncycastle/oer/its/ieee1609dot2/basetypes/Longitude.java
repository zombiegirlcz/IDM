package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

/* JADX INFO: loaded from: classes14.dex */
public class Longitude extends OneEightyDegreeInt {
    public Longitude(long j2) {
        super(j2);
    }

    public static Longitude getInstance(Object obj2) {
        if (obj2 instanceof Longitude) {
            return (Longitude) obj2;
        }
        if (obj2 != null) {
            return new Longitude(ASN1Integer.getInstance(obj2));
        }
        return null;
    }

    public Longitude(BigInteger bigInteger) {
        super(bigInteger);
    }

    private Longitude(ASN1Integer aSN1Integer) {
        this(aSN1Integer.getValue());
    }
}
