package org.bouncycastle.asn1.x9;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes14.dex */
public class X9FieldID extends ASN1Object implements X9ObjectIdentifiers {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private ASN1ObjectIdentifier f228252id;
    private ASN1Primitive parameters;

    public X9FieldID(int i, int i2) {
        this(i, i2, 0, 0);
    }

    public static X9FieldID getInstance(Object obj2) {
        if (obj2 instanceof X9FieldID) {
            return (X9FieldID) obj2;
        }
        if (obj2 != null) {
            return new X9FieldID(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public ASN1ObjectIdentifier getIdentifier() {
        return this.f228252id;
    }

    public ASN1Primitive getParameters() {
        return this.parameters;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.f228252id, this.parameters);
    }

    public X9FieldID(int i, int i2, int i3, int i5) {
        this.f228252id = X9ObjectIdentifiers.characteristic_two_field;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(ASN1Integer.valueOf(i));
        if (i3 == 0) {
            if (i5 != 0) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            aSN1EncodableVector.add(X9ObjectIdentifiers.tpBasis);
            aSN1EncodableVector.add(ASN1Integer.valueOf(i2));
        } else {
            if (i3 <= i2 || i5 <= i3) {
                throw new IllegalArgumentException("inconsistent k values");
            }
            aSN1EncodableVector.add(X9ObjectIdentifiers.ppBasis);
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(3);
            aSN1EncodableVector2.add(ASN1Integer.valueOf(i2));
            aSN1EncodableVector2.add(ASN1Integer.valueOf(i3));
            aSN1EncodableVector2.add(ASN1Integer.valueOf(i5));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        this.parameters = new DERSequence(aSN1EncodableVector);
    }

    public X9FieldID(BigInteger bigInteger) {
        this.f228252id = X9ObjectIdentifiers.prime_field;
        this.parameters = new ASN1Integer(bigInteger);
    }

    private X9FieldID(ASN1Sequence aSN1Sequence) {
        this.f228252id = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.parameters = aSN1Sequence.getObjectAt(1).toASN1Primitive();
    }
}
