package org.bouncycastle.asn1.cmp;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.Certificate;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class CertAnnContent extends CMPCertificate {
    public CertAnnContent(int i, ASN1Object aSN1Object) {
        super(i, aSN1Object);
    }

    public static CertAnnContent getInstance(Object obj2) {
        if (obj2 == null || (obj2 instanceof CertAnnContent)) {
            return (CertAnnContent) obj2;
        }
        if (obj2 instanceof CMPCertificate) {
            try {
                return getInstance((Object) ((CMPCertificate) obj2).getEncoded());
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage(), e);
            }
        }
        if (obj2 instanceof byte[]) {
            try {
                obj2 = ASN1Primitive.fromByteArray((byte[]) obj2);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Invalid encoding in CertAnnContent");
            }
        }
        if (obj2 instanceof ASN1Sequence) {
            return new CertAnnContent(Certificate.getInstance(obj2));
        }
        if (!(obj2 instanceof ASN1TaggedObject)) {
            throw new IllegalArgumentException(a.g(obj2, "Invalid object: "));
        }
        ASN1TaggedObject contextInstance = ASN1TaggedObject.getContextInstance(obj2);
        return new CertAnnContent(contextInstance.getTagNo(), contextInstance.getExplicitBaseObject());
    }

    public CertAnnContent(AttributeCertificate attributeCertificate) {
        super(attributeCertificate);
    }

    public CertAnnContent(Certificate certificate) {
        super(certificate);
    }

    public static CertAnnContent getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        if (aSN1TaggedObject == null) {
            return null;
        }
        if (z) {
            return getInstance((Object) aSN1TaggedObject.getExplicitBaseObject());
        }
        throw new IllegalArgumentException("tag must be explicit");
    }
}
