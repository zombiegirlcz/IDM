package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;

/* JADX INFO: loaded from: classes14.dex */
public class CertPolicyId extends ASN1Object {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private ASN1ObjectIdentifier f228224id;

    private CertPolicyId(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f228224id = aSN1ObjectIdentifier;
    }

    public static CertPolicyId getInstance(Object obj2) {
        if (obj2 instanceof CertPolicyId) {
            return (CertPolicyId) obj2;
        }
        if (obj2 != null) {
            return new CertPolicyId(ASN1ObjectIdentifier.getInstance(obj2));
        }
        return null;
    }

    public String getId() {
        return this.f228224id.getId();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f228224id;
    }
}
