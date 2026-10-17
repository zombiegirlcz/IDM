package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;

/* JADX INFO: loaded from: classes14.dex */
public class PreSharedKeyRecipientInfo extends HashedId8 {
    public PreSharedKeyRecipientInfo(byte[] bArr) {
        super(bArr);
    }

    public static PreSharedKeyRecipientInfo getInstance(Object obj2) {
        if (obj2 instanceof PreSharedKeyRecipientInfo) {
            return (PreSharedKeyRecipientInfo) obj2;
        }
        if (obj2 != null) {
            return obj2 instanceof HashedId ? new PreSharedKeyRecipientInfo(((HashedId) obj2).getHashBytes()) : new PreSharedKeyRecipientInfo(ASN1OctetString.getInstance(obj2).getOctets());
        }
        return null;
    }
}
