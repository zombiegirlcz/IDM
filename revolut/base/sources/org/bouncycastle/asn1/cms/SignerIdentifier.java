package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class SignerIdentifier extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private ASN1Encodable f228170id;

    public SignerIdentifier(ASN1OctetString aSN1OctetString) {
        this.f228170id = new DERTaggedObject(false, 0, (ASN1Encodable) aSN1OctetString);
    }

    public static SignerIdentifier getInstance(Object obj2) {
        if (obj2 == null || (obj2 instanceof SignerIdentifier)) {
            return (SignerIdentifier) obj2;
        }
        if (obj2 instanceof IssuerAndSerialNumber) {
            return new SignerIdentifier((IssuerAndSerialNumber) obj2);
        }
        if (obj2 instanceof ASN1OctetString) {
            return new SignerIdentifier((ASN1OctetString) obj2);
        }
        if (obj2 instanceof ASN1Primitive) {
            return new SignerIdentifier((ASN1Primitive) obj2);
        }
        throw new IllegalArgumentException(a.g(obj2, "Illegal object in SignerIdentifier: "));
    }

    public ASN1Encodable getId() {
        ASN1Encodable aSN1Encodable = this.f228170id;
        return aSN1Encodable instanceof ASN1TaggedObject ? ASN1OctetString.getInstance((ASN1TaggedObject) aSN1Encodable, false) : aSN1Encodable;
    }

    public boolean isTagged() {
        return this.f228170id instanceof ASN1TaggedObject;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f228170id.toASN1Primitive();
    }

    public SignerIdentifier(ASN1Primitive aSN1Primitive) {
        this.f228170id = aSN1Primitive;
    }

    public SignerIdentifier(IssuerAndSerialNumber issuerAndSerialNumber) {
        this.f228170id = issuerAndSerialNumber;
    }
}
