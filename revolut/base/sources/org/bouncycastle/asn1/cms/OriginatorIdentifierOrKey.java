package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class OriginatorIdentifierOrKey extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private ASN1Encodable f228168id;

    public OriginatorIdentifierOrKey(ASN1OctetString aSN1OctetString) {
        this(new SubjectKeyIdentifier(aSN1OctetString.getOctets()));
    }

    public static OriginatorIdentifierOrKey getInstance(Object obj2) {
        if (obj2 == null || (obj2 instanceof OriginatorIdentifierOrKey)) {
            return (OriginatorIdentifierOrKey) obj2;
        }
        if (obj2 instanceof IssuerAndSerialNumber) {
            return new OriginatorIdentifierOrKey((IssuerAndSerialNumber) obj2);
        }
        if (obj2 instanceof ASN1Sequence) {
            return new OriginatorIdentifierOrKey(IssuerAndSerialNumber.getInstance(obj2));
        }
        if (obj2 instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj2;
            if (aSN1TaggedObject.hasContextTag(0)) {
                return new OriginatorIdentifierOrKey(SubjectKeyIdentifier.getInstance(aSN1TaggedObject, false));
            }
            if (aSN1TaggedObject.hasContextTag(1)) {
                return new OriginatorIdentifierOrKey(OriginatorPublicKey.getInstance(aSN1TaggedObject, false));
            }
        }
        throw new IllegalArgumentException(a.g(obj2, "Invalid OriginatorIdentifierOrKey: "));
    }

    public ASN1Encodable getId() {
        return this.f228168id;
    }

    public IssuerAndSerialNumber getIssuerAndSerialNumber() {
        ASN1Encodable aSN1Encodable = this.f228168id;
        if (aSN1Encodable instanceof IssuerAndSerialNumber) {
            return (IssuerAndSerialNumber) aSN1Encodable;
        }
        return null;
    }

    public OriginatorPublicKey getOriginatorKey() {
        ASN1TaggedObject contextOptional = ASN1TaggedObject.getContextOptional(this.f228168id, 1);
        if (contextOptional == null) {
            return null;
        }
        return OriginatorPublicKey.getInstance(contextOptional, false);
    }

    public SubjectKeyIdentifier getSubjectKeyIdentifier() {
        ASN1TaggedObject contextOptional = ASN1TaggedObject.getContextOptional(this.f228168id, 0);
        if (contextOptional == null) {
            return null;
        }
        return SubjectKeyIdentifier.getInstance(contextOptional, false);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f228168id.toASN1Primitive();
    }

    public OriginatorIdentifierOrKey(ASN1Primitive aSN1Primitive) {
        this.f228168id = aSN1Primitive;
    }

    public OriginatorIdentifierOrKey(IssuerAndSerialNumber issuerAndSerialNumber) {
        this.f228168id = issuerAndSerialNumber;
    }

    public OriginatorIdentifierOrKey(OriginatorPublicKey originatorPublicKey) {
        this.f228168id = new DERTaggedObject(false, 1, (ASN1Encodable) originatorPublicKey);
    }

    public OriginatorIdentifierOrKey(SubjectKeyIdentifier subjectKeyIdentifier) {
        this.f228168id = new DERTaggedObject(false, 0, (ASN1Encodable) subjectKeyIdentifier);
    }

    public static OriginatorIdentifierOrKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        if (z) {
            return getInstance(aSN1TaggedObject.getExplicitBaseObject());
        }
        throw new IllegalArgumentException("Can't implicitly tag OriginatorIdentifierOrKey");
    }
}
