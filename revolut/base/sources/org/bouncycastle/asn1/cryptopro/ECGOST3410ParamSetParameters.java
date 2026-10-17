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
public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ASN1Integer f228177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ASN1Integer f228178b;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ASN1Integer f228179p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ASN1Integer f228180q;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    ASN1Integer f228181x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    ASN1Integer f228182y;

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i, BigInteger bigInteger5) {
        this.f228177a = new ASN1Integer(bigInteger);
        this.f228178b = new ASN1Integer(bigInteger2);
        this.f228179p = new ASN1Integer(bigInteger3);
        this.f228180q = new ASN1Integer(bigInteger4);
        this.f228181x = ASN1Integer.valueOf(i);
        this.f228182y = new ASN1Integer(bigInteger5);
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj2) {
        if (obj2 == null || (obj2 instanceof ECGOST3410ParamSetParameters)) {
            return (ECGOST3410ParamSetParameters) obj2;
        }
        if (obj2 instanceof ASN1Sequence) {
            return new ECGOST3410ParamSetParameters((ASN1Sequence) obj2);
        }
        throw new IllegalArgumentException(a.g(obj2, "Invalid GOST3410Parameter: "));
    }

    public BigInteger getA() {
        return this.f228177a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f228179p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f228180q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.f228177a);
        aSN1EncodableVector.add(this.f228178b);
        aSN1EncodableVector.add(this.f228179p);
        aSN1EncodableVector.add(this.f228180q);
        aSN1EncodableVector.add(this.f228181x);
        aSN1EncodableVector.add(this.f228182y);
        return new DERSequence(aSN1EncodableVector);
    }

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f228177a = (ASN1Integer) objects.nextElement();
        this.f228178b = (ASN1Integer) objects.nextElement();
        this.f228179p = (ASN1Integer) objects.nextElement();
        this.f228180q = (ASN1Integer) objects.nextElement();
        this.f228181x = (ASN1Integer) objects.nextElement();
        this.f228182y = (ASN1Integer) objects.nextElement();
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }
}
