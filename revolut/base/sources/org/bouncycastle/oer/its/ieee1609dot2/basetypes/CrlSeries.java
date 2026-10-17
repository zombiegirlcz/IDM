package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;

/* JADX INFO: loaded from: classes14.dex */
public class CrlSeries extends UINT16 {
    public CrlSeries(int i) {
        super(i);
    }

    public static CrlSeries getInstance(Object obj2) {
        if (obj2 instanceof CrlSeries) {
            return (CrlSeries) obj2;
        }
        if (obj2 != null) {
            return new CrlSeries(ASN1Integer.getInstance(obj2).getValue());
        }
        return null;
    }

    public CrlSeries(BigInteger bigInteger) {
        super(bigInteger);
    }
}
