package org.bouncycastle.asn1.cms;

import a0.d;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.BERTaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DLSequence;
import org.bouncycastle.asn1.DLTaggedObject;

/* JADX INFO: loaded from: classes14.dex */
public class ContentInfo extends ASN1Object implements CMSObjectIdentifiers {
    private final ASN1Encodable content;
    private final ASN1ObjectIdentifier contentType;
    private final boolean isDefiniteLength;

    public ContentInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1Encodable aSN1Encodable) {
        if (aSN1ObjectIdentifier == null) {
            throw new NullPointerException("'contentType' cannot be null");
        }
        this.contentType = aSN1ObjectIdentifier;
        this.content = aSN1Encodable;
        boolean z = true;
        if (aSN1Encodable == null) {
            this.isDefiniteLength = true;
            return;
        }
        ASN1Primitive aSN1Primitive = aSN1Encodable.toASN1Primitive();
        if (!(aSN1Primitive instanceof DEROctetString) && !(aSN1Primitive instanceof DLSequence) && !(aSN1Primitive instanceof DERSequence)) {
            z = false;
        }
        this.isDefiniteLength = z;
    }

    public static ContentInfo getInstance(Object obj2) {
        if (obj2 instanceof ContentInfo) {
            return (ContentInfo) obj2;
        }
        if (obj2 != null) {
            return new ContentInfo(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public static ContentInfo getTagged(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new ContentInfo(ASN1Sequence.getTagged(aSN1TaggedObject, z));
    }

    public ASN1Encodable getContent() {
        return this.content;
    }

    public ASN1ObjectIdentifier getContentType() {
        return this.contentType;
    }

    public boolean isDefiniteLength() {
        return this.isDefiniteLength;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.isDefiniteLength ? this.content == null ? new DLSequence(this.contentType) : new DLSequence(this.contentType, new DLTaggedObject(0, this.content)) : this.content == null ? new BERSequence(this.contentType) : new BERSequence(this.contentType, new BERTaggedObject(0, this.content));
    }

    private ContentInfo(ASN1Sequence aSN1Sequence) {
        ASN1Object explicitBaseObject;
        int size = aSN1Sequence.size();
        if (size < 1 || size > 2) {
            throw new IllegalArgumentException(d.n("Bad sequence size: ", size));
        }
        this.contentType = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        if (size > 1) {
            ASN1TaggedObject contextInstance = ASN1TaggedObject.getContextInstance(aSN1Sequence.getObjectAt(1));
            if (!contextInstance.isExplicit() || contextInstance.getTagNo() != 0) {
                throw new IllegalArgumentException("Bad tag for 'content'");
            }
            explicitBaseObject = contextInstance.getExplicitBaseObject();
        } else {
            explicitBaseObject = null;
        }
        this.content = explicitBaseObject;
        this.isDefiniteLength = !(aSN1Sequence instanceof BERSequence);
    }

    public static ContentInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new ContentInfo(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }
}
