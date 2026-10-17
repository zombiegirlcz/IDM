package org.bouncycastle.oer.its.ieee1609dot2dot1;

import a0.d;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes14.dex */
public class ButterflyExpansion extends ASN1Object implements ASN1Choice {
    public static final int aes128 = 0;
    protected final ASN1Encodable butterflyExpansion;
    protected final int choice;

    public ButterflyExpansion(int i, ASN1Encodable aSN1Encodable) {
        this.choice = i;
        this.butterflyExpansion = aSN1Encodable;
    }

    public static ButterflyExpansion aes128(ASN1OctetString aSN1OctetString) {
        return aes128(aSN1OctetString.getOctets());
    }

    public static ButterflyExpansion getInstance(Object obj2) {
        if (obj2 instanceof ButterflyExpansion) {
            return (ButterflyExpansion) obj2;
        }
        if (obj2 != null) {
            return new ButterflyExpansion(ASN1TaggedObject.getContextInstance(obj2));
        }
        return null;
    }

    public ASN1Encodable getButterflyExpansion() {
        return this.butterflyExpansion;
    }

    public int getChoice() {
        return this.choice;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.butterflyExpansion);
    }

    private ButterflyExpansion(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.choice = tagNo;
        if (tagNo != 0) {
            throw new IllegalArgumentException(d.n("invalid choice value ", tagNo));
        }
        this.butterflyExpansion = ASN1OctetString.getInstance(aSN1TaggedObject.getExplicitBaseObject());
    }

    public static ButterflyExpansion aes128(byte[] bArr) {
        if (bArr.length == 16) {
            return new ButterflyExpansion(0, new DEROctetString(bArr));
        }
        throw new IllegalArgumentException("length must be 16");
    }
}
