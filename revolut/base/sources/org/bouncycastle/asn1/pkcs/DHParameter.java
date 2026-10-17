package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes14.dex */
public class DHParameter extends ASN1Object {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ASN1Integer f228199g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ASN1Integer f228200l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ASN1Integer f228201p;

    public DHParameter(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f228201p = new ASN1Integer(bigInteger);
        this.f228199g = new ASN1Integer(bigInteger2);
        this.f228200l = i != 0 ? ASN1Integer.valueOf(i) : null;
    }

    public static DHParameter getInstance(Object obj2) {
        if (obj2 instanceof DHParameter) {
            return (DHParameter) obj2;
        }
        if (obj2 != null) {
            return new DHParameter(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f228199g.getPositiveValue();
    }

    public BigInteger getL() {
        ASN1Integer aSN1Integer = this.f228200l;
        if (aSN1Integer == null) {
            return null;
        }
        return aSN1Integer.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f228201p.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f228201p);
        aSN1EncodableVector.add(this.f228199g);
        if (getL() != null) {
            aSN1EncodableVector.add(this.f228200l);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    private DHParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f228201p = ASN1Integer.getInstance(objects.nextElement());
        this.f228199g = ASN1Integer.getInstance(objects.nextElement());
        this.f228200l = objects.hasMoreElements() ? (ASN1Integer) objects.nextElement() : null;
    }
}
