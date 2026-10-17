package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

/* JADX INFO: loaded from: classes14.dex */
public class Elevation extends UINT16 {
    public Elevation(int i) {
        super(i);
    }

    public static Elevation getInstance(Object obj2) {
        if (obj2 instanceof Elevation) {
            return (Elevation) obj2;
        }
        if (obj2 != null) {
            return new Elevation(UINT16.getInstance(obj2));
        }
        return null;
    }

    public Elevation(long j2) {
        super(j2);
    }

    public Elevation(BigInteger bigInteger) {
        super(bigInteger);
    }

    public Elevation(ASN1Integer aSN1Integer) {
        super(aSN1Integer);
    }

    public Elevation(UINT16 uint16) {
        super(uint16.getValue());
    }
}
