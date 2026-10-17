package org.bouncycastle.asn1.cryptopro;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class GOST3410ParamSetParameters extends ASN1Object {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ASN1Integer f228184a;
    int keySize;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ASN1Integer f228185p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ASN1Integer f228186q;

    public GOST3410ParamSetParameters(int i, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.keySize = i;
        this.f228185p = new ASN1Integer(bigInteger);
        this.f228186q = new ASN1Integer(bigInteger2);
        this.f228184a = new ASN1Integer(bigInteger3);
    }

    public static GOST3410ParamSetParameters getInstance(Object obj2) {
        if (obj2 == null || (obj2 instanceof GOST3410ParamSetParameters)) {
            return (GOST3410ParamSetParameters) obj2;
        }
        if (obj2 instanceof ASN1Sequence) {
            return new GOST3410ParamSetParameters((ASN1Sequence) obj2);
        }
        throw new IllegalArgumentException(a.g(obj2, "Invalid GOST3410Parameter: "));
    }

    public BigInteger getA() {
        return this.f228184a.getPositiveValue();
    }

    public int getKeySize() {
        return this.keySize;
    }

    public int getLKeySize() {
        return this.keySize;
    }

    public BigInteger getP() {
        return this.f228185p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f228186q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(ASN1Integer.valueOf(this.keySize));
        aSN1EncodableVector.add(this.f228185p);
        aSN1EncodableVector.add(this.f228186q);
        aSN1EncodableVector.add(this.f228184a);
        return new DERSequence(aSN1EncodableVector);
    }

    public GOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.keySize = ((ASN1Integer) objects.nextElement()).intValueExact();
        this.f228185p = (ASN1Integer) objects.nextElement();
        this.f228186q = (ASN1Integer) objects.nextElement();
        this.f228184a = (ASN1Integer) objects.nextElement();
    }

    public static GOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }
}
