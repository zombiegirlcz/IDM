package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ieee1609dot2.HashedData;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Time32;

/* JADX INFO: loaded from: classes14.dex */
public class ToBeSignedLinkCertificateTlm extends ToBeSignedLinkCertificate {
    public ToBeSignedLinkCertificateTlm(ASN1Sequence aSN1Sequence) {
        super(aSN1Sequence);
    }

    public static ToBeSignedLinkCertificateTlm getInstance(Object obj2) {
        if (obj2 instanceof ToBeSignedLinkCertificateTlm) {
            return (ToBeSignedLinkCertificateTlm) obj2;
        }
        if (obj2 instanceof ToBeSignedLinkCertificate) {
            return new ToBeSignedLinkCertificateTlm((ToBeSignedLinkCertificate) obj2);
        }
        if (obj2 != null) {
            return new ToBeSignedLinkCertificateTlm(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    private ToBeSignedLinkCertificateTlm(ToBeSignedLinkCertificate toBeSignedLinkCertificate) {
        super(toBeSignedLinkCertificate.getExpiryTime(), toBeSignedLinkCertificate.getCertificateHash());
    }

    public ToBeSignedLinkCertificateTlm(Time32 time32, HashedData hashedData) {
        super(time32, hashedData);
    }
}
