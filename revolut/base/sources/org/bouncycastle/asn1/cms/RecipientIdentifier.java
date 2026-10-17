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
public class RecipientIdentifier extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private ASN1Encodable f228169id;

    public RecipientIdentifier(ASN1OctetString aSN1OctetString) {
        this.f228169id = new DERTaggedObject(false, 0, (ASN1Encodable) aSN1OctetString);
    }

    public static RecipientIdentifier getInstance(Object obj2) {
        if (obj2 == null || (obj2 instanceof RecipientIdentifier)) {
            return (RecipientIdentifier) obj2;
        }
        if (obj2 instanceof IssuerAndSerialNumber) {
            return new RecipientIdentifier((IssuerAndSerialNumber) obj2);
        }
        if (obj2 instanceof ASN1OctetString) {
            return new RecipientIdentifier((ASN1OctetString) obj2);
        }
        if (obj2 instanceof ASN1Primitive) {
            return new RecipientIdentifier((ASN1Primitive) obj2);
        }
        throw new IllegalArgumentException(a.g(obj2, "Illegal object in RecipientIdentifier: "));
    }

    public ASN1Encodable getId() {
        ASN1Encodable aSN1Encodable = this.f228169id;
        return aSN1Encodable instanceof ASN1TaggedObject ? ASN1OctetString.getInstance((ASN1TaggedObject) aSN1Encodable, false) : IssuerAndSerialNumber.getInstance(aSN1Encodable);
    }

    public boolean isTagged() {
        return this.f228169id instanceof ASN1TaggedObject;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f228169id.toASN1Primitive();
    }

    public RecipientIdentifier(ASN1Primitive aSN1Primitive) {
        this.f228169id = aSN1Primitive;
    }

    public RecipientIdentifier(IssuerAndSerialNumber issuerAndSerialNumber) {
        this.f228169id = issuerAndSerialNumber;
    }
}
