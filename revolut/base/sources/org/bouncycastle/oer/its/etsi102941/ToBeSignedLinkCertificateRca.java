package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ieee1609dot2.HashedData;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Time32;

/* JADX INFO: loaded from: classes14.dex */
public class ToBeSignedLinkCertificateRca extends ToBeSignedLinkCertificate {
    public ToBeSignedLinkCertificateRca(ASN1Sequence aSN1Sequence) {
        super(aSN1Sequence);
    }

    public static ToBeSignedLinkCertificateRca getInstance(Object obj2) {
        if (obj2 instanceof ToBeSignedLinkCertificateRca) {
            return (ToBeSignedLinkCertificateRca) obj2;
        }
        if (obj2 instanceof ToBeSignedLinkCertificate) {
            return new ToBeSignedLinkCertificateRca((ToBeSignedLinkCertificate) obj2);
        }
        if (obj2 != null) {
            return new ToBeSignedLinkCertificateRca(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    private ToBeSignedLinkCertificateRca(ToBeSignedLinkCertificate toBeSignedLinkCertificate) {
        super(toBeSignedLinkCertificate.getExpiryTime(), toBeSignedLinkCertificate.getCertificateHash());
    }

    public ToBeSignedLinkCertificateRca(Time32 time32, HashedData hashedData) {
        super(time32, hashedData);
    }
}
