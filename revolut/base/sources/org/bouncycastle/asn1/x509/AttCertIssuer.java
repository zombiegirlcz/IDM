package org.bouncycastle.asn1.x509;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class AttCertIssuer extends ASN1Object implements ASN1Choice {
    ASN1Primitive choiceObj;

    /* JADX INFO: renamed from: obj, reason: collision with root package name */
    ASN1Encodable f228223obj;

    public AttCertIssuer(GeneralNames generalNames) {
        this.f228223obj = generalNames;
        this.choiceObj = generalNames.toASN1Primitive();
    }

    public static AttCertIssuer getInstance(Object obj2) {
        if (obj2 == null || (obj2 instanceof AttCertIssuer)) {
            return (AttCertIssuer) obj2;
        }
        if (obj2 instanceof V2Form) {
            return new AttCertIssuer(V2Form.getInstance(obj2));
        }
        if (obj2 instanceof GeneralNames) {
            return new AttCertIssuer((GeneralNames) obj2);
        }
        if (obj2 instanceof ASN1TaggedObject) {
            return new AttCertIssuer(V2Form.getInstance((ASN1TaggedObject) obj2, false));
        }
        if (obj2 instanceof ASN1Sequence) {
            return new AttCertIssuer(GeneralNames.getInstance(obj2));
        }
        throw new IllegalArgumentException(a.g(obj2, "unknown object in factory: "));
    }

    public ASN1Encodable getIssuer() {
        return this.f228223obj;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.choiceObj;
    }

    public AttCertIssuer(V2Form v2Form) {
        this.f228223obj = v2Form;
        this.choiceObj = new DERTaggedObject(false, 0, (ASN1Encodable) v2Form);
    }

    public static AttCertIssuer getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(aSN1TaggedObject.getExplicitBaseObject());
    }
}
