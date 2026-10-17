package org.bouncycastle.asn1.sec;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes14.dex */
public class ECPrivateKey extends ASN1Object {
    private final ASN1Sequence seq;

    public ECPrivateKey(int i, BigInteger bigInteger) {
        this.seq = new DERSequence(ASN1Integer.ONE, new DEROctetString(BigIntegers.asUnsignedByteArray((i + 7) / 8, bigInteger)));
    }

    public static ECPrivateKey getInstance(Object obj2) {
        if (obj2 instanceof ECPrivateKey) {
            return (ECPrivateKey) obj2;
        }
        if (obj2 != null) {
            return new ECPrivateKey(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    private ASN1Object getObjectInTag(int i, int i2) {
        int size = this.seq.size();
        for (int i3 = 0; i3 < size; i3++) {
            ASN1TaggedObject contextOptional = ASN1TaggedObject.getContextOptional(this.seq.getObjectAt(i3), i);
            if (contextOptional != null) {
                return i2 < 0 ? contextOptional.getExplicitBaseObject().toASN1Primitive() : contextOptional.getBaseUniversal(true, i2);
            }
        }
        return null;
    }

    public static ECPrivateKey getTagged(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new ECPrivateKey(ASN1Sequence.getTagged(aSN1TaggedObject, z));
    }

    public BigInteger getKey() {
        return new BigInteger(1, getPrivateKey().getOctets());
    }

    public ASN1Object getParametersObject() {
        return getObjectInTag(0, -1);
    }

    public ASN1OctetString getPrivateKey() {
        return (ASN1OctetString) this.seq.getObjectAt(1);
    }

    public ASN1BitString getPublicKey() {
        return (ASN1BitString) getObjectInTag(1, 3);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.seq;
    }

    public ECPrivateKey(int i, BigInteger bigInteger, ASN1BitString aSN1BitString, ASN1Encodable aSN1Encodable) {
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray((i + 7) / 8, bigInteger);
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(ASN1Integer.ONE);
        aSN1EncodableVector.add(new DEROctetString(bArrAsUnsignedByteArray));
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, aSN1Encodable));
        }
        if (aSN1BitString != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, (ASN1Encodable) aSN1BitString));
        }
        this.seq = new DERSequence(aSN1EncodableVector);
    }

    public static ECPrivateKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new ECPrivateKey(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public ECPrivateKey(int i, BigInteger bigInteger, ASN1Encodable aSN1Encodable) {
        this(i, bigInteger, null, aSN1Encodable);
    }

    public ECPrivateKey(ASN1OctetString aSN1OctetString, ASN1Encodable aSN1Encodable, ASN1BitString aSN1BitString) {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(ASN1Integer.ONE);
        aSN1EncodableVector.add(aSN1OctetString);
        if (aSN1Encodable != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, aSN1Encodable));
        }
        if (aSN1BitString != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 1, (ASN1Encodable) aSN1BitString));
        }
        this.seq = new DERSequence(aSN1EncodableVector);
    }

    private ECPrivateKey(ASN1Sequence aSN1Sequence) {
        this.seq = aSN1Sequence;
    }
}
