package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097DataEncryptedUnicast;
import org.bouncycastle.oer.its.ieee1609dot2.Ieee1609Dot2Content;

/* JADX INFO: loaded from: classes14.dex */
public class AuthorizationResponseMessage extends EtsiTs103097DataEncryptedUnicast {
    public AuthorizationResponseMessage(ASN1Sequence aSN1Sequence) {
        super(aSN1Sequence);
    }

    public static AuthorizationResponseMessage getInstance(Object obj2) {
        if (obj2 instanceof AuthorizationResponseMessage) {
            return (AuthorizationResponseMessage) obj2;
        }
        if (obj2 != null) {
            return new AuthorizationResponseMessage(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public AuthorizationResponseMessage(Ieee1609Dot2Content ieee1609Dot2Content) {
        super(ieee1609Dot2Content);
    }
}
