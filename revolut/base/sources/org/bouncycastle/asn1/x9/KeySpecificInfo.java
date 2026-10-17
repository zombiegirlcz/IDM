package org.bouncycastle.asn1.x9;

import a0.d;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes14.dex */
public class KeySpecificInfo extends ASN1Object {
    private final ASN1ObjectIdentifier algorithm;
    private final ASN1OctetString counter;

    public KeySpecificInfo(ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1OctetString aSN1OctetString) {
        if (aSN1ObjectIdentifier == null) {
            throw new NullPointerException("'algorithm' cannot be null");
        }
        if (aSN1OctetString == null) {
            throw new NullPointerException("'counter' cannot be null");
        }
        this.algorithm = aSN1ObjectIdentifier;
        this.counter = aSN1OctetString;
    }

    public static KeySpecificInfo getInstance(Object obj2) {
        if (obj2 instanceof KeySpecificInfo) {
            return (KeySpecificInfo) obj2;
        }
        if (obj2 != null) {
            return new KeySpecificInfo(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public static KeySpecificInfo getTagged(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new KeySpecificInfo(ASN1Sequence.getTagged(aSN1TaggedObject, z));
    }

    public ASN1ObjectIdentifier getAlgorithm() {
        return this.algorithm;
    }

    public ASN1OctetString getCounter() {
        return this.counter;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.algorithm, this.counter);
    }

    private KeySpecificInfo(ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        if (size != 2) {
            throw new IllegalArgumentException(d.n("Bad sequence size: ", size));
        }
        this.algorithm = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.counter = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static KeySpecificInfo getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new KeySpecificInfo(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }
}
