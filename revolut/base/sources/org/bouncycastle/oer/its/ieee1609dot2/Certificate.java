package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Signature;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.UINT8;

/* JADX INFO: loaded from: classes14.dex */
public class Certificate extends CertificateBase {
    public Certificate(ASN1Sequence aSN1Sequence) {
        super(aSN1Sequence);
    }

    public static Certificate getInstance(Object obj2) {
        if (obj2 instanceof Certificate) {
            return (Certificate) obj2;
        }
        if (obj2 != null) {
            return new Certificate(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public Certificate(CertificateBase certificateBase) {
        this(certificateBase.getVersion(), certificateBase.getType(), certificateBase.getIssuer(), certificateBase.getToBeSigned(), certificateBase.getSignature());
    }

    public Certificate(UINT8 uint8, CertificateType certificateType, IssuerIdentifier issuerIdentifier, ToBeSignedCertificate toBeSignedCertificate, Signature signature) {
        super(uint8, certificateType, issuerIdentifier, toBeSignedCertificate, signature);
    }
}
