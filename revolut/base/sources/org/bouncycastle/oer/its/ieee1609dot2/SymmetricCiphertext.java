package org.bouncycastle.oer.its.ieee1609dot2;

import a0.d;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes14.dex */
public class SymmetricCiphertext extends ASN1Object implements ASN1Choice {
    public static final int aes128ccm = 0;
    private final int choice;
    private final ASN1Encodable symmetricCiphertext;

    public SymmetricCiphertext(int i, ASN1Encodable aSN1Encodable) {
        this.choice = i;
        this.symmetricCiphertext = aSN1Encodable;
    }

    public static SymmetricCiphertext aes128ccm(AesCcmCiphertext aesCcmCiphertext) {
        return new SymmetricCiphertext(0, aesCcmCiphertext);
    }

    public static SymmetricCiphertext getInstance(Object obj2) {
        if (obj2 instanceof SymmetricCiphertext) {
            return (SymmetricCiphertext) obj2;
        }
        if (obj2 != null) {
            return new SymmetricCiphertext(ASN1TaggedObject.getContextInstance(obj2));
        }
        return null;
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getSymmetricCiphertext() {
        return this.symmetricCiphertext;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.symmetricCiphertext);
    }

    private SymmetricCiphertext(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.choice = tagNo;
        if (tagNo != 0) {
            throw new IllegalArgumentException(d.n("invalid choice value ", tagNo));
        }
        this.symmetricCiphertext = AesCcmCiphertext.getInstance(aSN1TaggedObject.getExplicitBaseObject());
    }
}
