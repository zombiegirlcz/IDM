package org.bouncycastle.oer.its.ieee1609dot2;

import a0.d;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.HashedId8;

/* JADX INFO: loaded from: classes14.dex */
public class SignerIdentifier extends ASN1Object implements ASN1Choice {
    public static final int certificate = 1;
    public static final int digest = 0;
    public static final int self = 2;
    private final int choice;
    private final ASN1Encodable signerIdentifier;

    public SignerIdentifier(int i, ASN1Encodable aSN1Encodable) {
        this.choice = i;
        this.signerIdentifier = aSN1Encodable;
    }

    public static SignerIdentifier certificate(SequenceOfCertificate sequenceOfCertificate) {
        return new SignerIdentifier(1, sequenceOfCertificate);
    }

    public static SignerIdentifier digest(HashedId8 hashedId8) {
        return new SignerIdentifier(0, hashedId8);
    }

    public static SignerIdentifier getInstance(Object obj2) {
        if (obj2 instanceof SignerIdentifier) {
            return (SignerIdentifier) obj2;
        }
        if (obj2 != null) {
            return new SignerIdentifier(ASN1TaggedObject.getContextInstance(obj2));
        }
        return null;
    }

    public static SignerIdentifier self() {
        return new SignerIdentifier(2, DERNull.INSTANCE);
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getSignerIdentifier() {
        return this.signerIdentifier;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.signerIdentifier);
    }

    private SignerIdentifier(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.choice = tagNo;
        if (tagNo == 0) {
            this.signerIdentifier = HashedId8.getInstance(aSN1TaggedObject.getExplicitBaseObject());
        } else if (tagNo == 1) {
            this.signerIdentifier = SequenceOfCertificate.getInstance(aSN1TaggedObject.getExplicitBaseObject());
        } else {
            if (tagNo != 2) {
                throw new IllegalArgumentException(d.n("invalid choice value ", tagNo));
            }
            this.signerIdentifier = ASN1Null.getInstance(aSN1TaggedObject.getExplicitBaseObject());
        }
    }
}
