package org.bouncycastle.asn1.cms;

import a0.d;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes14.dex */
public class SCVPReqRes extends ASN1Object {
    private final ContentInfo request;
    private final ContentInfo response;

    private SCVPReqRes(ASN1Sequence aSN1Sequence) {
        ContentInfo tagged;
        ASN1TaggedObject contextOptional;
        int size = aSN1Sequence.size();
        int i = 1;
        if (size < 1 || size > 2) {
            throw new IllegalArgumentException(d.n("Bad sequence size: ", size));
        }
        if (size <= 0 || (contextOptional = ASN1TaggedObject.getContextOptional(aSN1Sequence.getObjectAt(0), 0)) == null) {
            tagged = null;
            i = 0;
        } else {
            tagged = ContentInfo.getTagged(contextOptional, true);
        }
        this.request = tagged;
        int i2 = i + 1;
        this.response = ContentInfo.getInstance(aSN1Sequence.getObjectAt(i));
        if (i2 != size) {
            throw new IllegalArgumentException("Unexpected elements in sequence");
        }
    }

    public static SCVPReqRes getInstance(Object obj2) {
        if (obj2 instanceof SCVPReqRes) {
            return (SCVPReqRes) obj2;
        }
        if (obj2 != null) {
            return new SCVPReqRes(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public static SCVPReqRes getTagged(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new SCVPReqRes(ASN1Sequence.getTagged(aSN1TaggedObject, z));
    }

    public ContentInfo getRequest() {
        return this.request;
    }

    public ContentInfo getResponse() {
        return this.response;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.request == null ? new DERSequence(this.response) : new DERSequence(new DERTaggedObject(true, 0, (ASN1Encodable) this.request), this.response);
    }

    public static SCVPReqRes getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new SCVPReqRes(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public SCVPReqRes(ContentInfo contentInfo) {
        this(null, contentInfo);
    }

    public SCVPReqRes(ContentInfo contentInfo, ContentInfo contentInfo2) {
        if (contentInfo2 == null) {
            throw new NullPointerException("'response' cannot be null");
        }
        this.request = contentInfo;
        this.response = contentInfo2;
    }
}
