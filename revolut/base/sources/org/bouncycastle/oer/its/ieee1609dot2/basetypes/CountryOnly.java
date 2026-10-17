package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

/* JADX INFO: loaded from: classes14.dex */
public class CountryOnly extends UINT16 implements RegionInterface {
    public CountryOnly(int i) {
        super(i);
    }

    public static CountryOnly getInstance(Object obj2) {
        if (obj2 instanceof CountryOnly) {
            return (CountryOnly) obj2;
        }
        if (obj2 != null) {
            return new CountryOnly(ASN1Integer.getInstance(obj2).getValue());
        }
        return null;
    }

    public CountryOnly(BigInteger bigInteger) {
        super(bigInteger);
    }
}
