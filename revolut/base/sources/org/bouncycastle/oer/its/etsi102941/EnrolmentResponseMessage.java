package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097DataSignedAndEncryptedUnicast;
import org.bouncycastle.oer.its.ieee1609dot2.Ieee1609Dot2Content;

/* JADX INFO: loaded from: classes14.dex */
public class EnrolmentResponseMessage extends EtsiTs103097DataSignedAndEncryptedUnicast {
    public EnrolmentResponseMessage(ASN1Sequence aSN1Sequence) {
        super(aSN1Sequence);
    }

    public static EnrolmentResponseMessage getInstance(Object obj2) {
        if (obj2 instanceof EnrolmentResponseMessage) {
            return (EnrolmentResponseMessage) obj2;
        }
        if (obj2 != null) {
            return new EnrolmentResponseMessage(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public EnrolmentResponseMessage(Ieee1609Dot2Content ieee1609Dot2Content) {
        super(ieee1609Dot2Content);
    }
}
