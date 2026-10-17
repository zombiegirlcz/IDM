package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Integer;

/* JADX INFO: loaded from: classes14.dex */
public class UnknownLongitude extends Longitude {
    public static final UnknownLongitude INSTANCE = new UnknownLongitude();

    public UnknownLongitude() {
        super(1800000001L);
    }

    public static UnknownLongitude getInstance(Object obj2) {
        if (obj2 instanceof UnknownLongitude) {
            return (UnknownLongitude) obj2;
        }
        if (obj2 == null) {
            return null;
        }
        ASN1Integer aSN1Integer = ASN1Integer.getInstance(obj2);
        if (aSN1Integer.getValue().intValue() == 1800000001) {
            return INSTANCE;
        }
        throw new IllegalArgumentException("value " + aSN1Integer.getValue() + " is not 1800000001");
    }
}
