package org.bouncycastle.asn1.x9;

import a0.d;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes14.dex */
public class OtherInfo extends ASN1Object {
    private final KeySpecificInfo keyInfo;
    private final ASN1OctetString partyAInfo;
    private final ASN1OctetString suppPubInfo;

    private OtherInfo(ASN1Sequence aSN1Sequence) {
        ASN1OctetString tagged;
        int i;
        ASN1TaggedObject contextOptional;
        int size = aSN1Sequence.size();
        if (size < 2 || size > 3) {
            throw new IllegalArgumentException(d.n("Bad sequence size: ", size));
        }
        this.keyInfo = KeySpecificInfo.getInstance(aSN1Sequence.getObjectAt(0));
        if (1 >= size || (contextOptional = ASN1TaggedObject.getContextOptional(aSN1Sequence.getObjectAt(1), 0)) == null) {
            tagged = null;
            i = 1;
        } else {
            tagged = ASN1OctetString.getTagged(contextOptional, true);
            i = 2;
        }
        this.partyAInfo = tagged;
        int i2 = i + 1;
        this.suppPubInfo = ASN1OctetString.getTagged(ASN1TaggedObject.getContextInstance(aSN1Sequence.getObjectAt(i), 2), true);
        if (i2 != size) {
            throw new IllegalArgumentException("Unexpected elements in sequence");
        }
    }

    public static OtherInfo getInstance(Object obj2) {
        if (obj2 instanceof OtherInfo) {
            return (OtherInfo) obj2;
        }
        if (obj2 != null) {
            return new OtherInfo(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public static OtherInfo getTagged(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new OtherInfo(ASN1Sequence.getTagged(aSN1TaggedObject, z));
    }

    public KeySpecificInfo getKeyInfo() {
        return this.keyInfo;
    }

    public ASN1OctetString getPartyAInfo() {
        return this.partyAInfo;
    }

    public ASN1OctetString getSuppPubInfo() {
        return this.suppPubInfo;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.keyInfo);
        ASN1OctetString aSN1OctetString = this.partyAInfo;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, aSN1OctetString));
        }
        aSN1EncodableVector.add(new DERTaggedObject(2, this.suppPubInfo));
        return new DERSequence(aSN1EncodableVector);
    }

    public static OtherInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new OtherInfo(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public OtherInfo(KeySpecificInfo keySpecificInfo, ASN1OctetString aSN1OctetString, ASN1OctetString aSN1OctetString2) {
        if (keySpecificInfo == null) {
            throw new NullPointerException("'keyInfo' cannot be null");
        }
        if (aSN1OctetString2 == null) {
            throw new NullPointerException("'suppPubInfo' cannot be null");
        }
        this.keyInfo = keySpecificInfo;
        this.partyAInfo = aSN1OctetString;
        this.suppPubInfo = aSN1OctetString2;
    }
}
