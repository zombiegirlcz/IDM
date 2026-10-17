package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Integer;

/* JADX INFO: loaded from: classes14.dex */
public class UnknownLatitude extends Latitude {
    public static UnknownLatitude INSTANCE = new UnknownLatitude();

    private UnknownLatitude() {
        super(900000001L);
    }

    public static UnknownLatitude getInstance(Object obj2) {
        if (obj2 instanceof UnknownLatitude) {
            return (UnknownLatitude) obj2;
        }
        if (obj2 == null) {
            return null;
        }
        ASN1Integer aSN1Integer = ASN1Integer.getInstance(obj2);
        if (aSN1Integer.getValue().intValue() == 900000001) {
            return INSTANCE;
        }
        throw new IllegalArgumentException("value " + aSN1Integer.getValue() + " is not unknown value of 900000001");
    }
}
