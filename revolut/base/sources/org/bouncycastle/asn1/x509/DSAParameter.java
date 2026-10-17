package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import okl.m;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes14.dex */
public class DSAParameter extends ASN1Object {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ASN1Integer f228227g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ASN1Integer f228228p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ASN1Integer f228229q;

    public DSAParameter(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f228228p = new ASN1Integer(bigInteger);
        this.f228229q = new ASN1Integer(bigInteger2);
        this.f228227g = new ASN1Integer(bigInteger3);
    }

    public static DSAParameter getInstance(Object obj2) {
        if (obj2 instanceof DSAParameter) {
            return (DSAParameter) obj2;
        }
        if (obj2 != null) {
            return new DSAParameter(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f228227g.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f228228p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f228229q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f228228p);
        aSN1EncodableVector.add(this.f228229q);
        aSN1EncodableVector.add(this.f228227g);
        return new DERSequence(aSN1EncodableVector);
    }

    private DSAParameter(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException(m.n(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.f228228p = ASN1Integer.getInstance(objects.nextElement());
        this.f228229q = ASN1Integer.getInstance(objects.nextElement());
        this.f228227g = ASN1Integer.getInstance(objects.nextElement());
    }

    public static DSAParameter getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }
}
