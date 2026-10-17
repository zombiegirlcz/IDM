package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes14.dex */
public class ProtectedPart extends ASN1Object {
    private final PKIBody body;
    private final PKIHeader header;

    private ProtectedPart(ASN1Sequence aSN1Sequence) {
        this.header = PKIHeader.getInstance(aSN1Sequence.getObjectAt(0));
        this.body = PKIBody.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static ProtectedPart getInstance(Object obj2) {
        if (obj2 instanceof ProtectedPart) {
            return (ProtectedPart) obj2;
        }
        if (obj2 != null) {
            return new ProtectedPart(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public PKIBody getBody() {
        return this.body;
    }

    public PKIHeader getHeader() {
        return this.header;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.header, this.body);
    }

    public ProtectedPart(PKIHeader pKIHeader, PKIBody pKIBody) {
        this.header = pKIHeader;
        this.body = pKIBody;
    }
}
