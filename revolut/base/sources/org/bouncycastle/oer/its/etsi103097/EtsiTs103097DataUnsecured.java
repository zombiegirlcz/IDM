package org.bouncycastle.oer.its.etsi103097;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ieee1609dot2.Ieee1609Dot2Content;

/* JADX INFO: loaded from: classes14.dex */
public class EtsiTs103097DataUnsecured extends EtsiTs103097Data {
    public EtsiTs103097DataUnsecured(ASN1Sequence aSN1Sequence) {
        super(aSN1Sequence);
    }

    public static EtsiTs103097DataUnsecured getInstance(Object obj2) {
        if (obj2 instanceof EtsiTs103097DataUnsecured) {
            return (EtsiTs103097DataUnsecured) obj2;
        }
        if (obj2 != null) {
            return new EtsiTs103097DataUnsecured(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public EtsiTs103097DataUnsecured(Ieee1609Dot2Content ieee1609Dot2Content) {
        super(ieee1609Dot2Content);
    }
}
