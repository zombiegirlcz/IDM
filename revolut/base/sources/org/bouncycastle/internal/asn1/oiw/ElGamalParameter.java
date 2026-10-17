package org.bouncycastle.internal.asn1.oiw;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes14.dex */
public class ElGamalParameter extends ASN1Object {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ASN1Integer f228585g;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ASN1Integer f228586p;

    public ElGamalParameter(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f228586p = new ASN1Integer(bigInteger);
        this.f228585g = new ASN1Integer(bigInteger2);
    }

    public static ElGamalParameter getInstance(Object obj2) {
        if (obj2 instanceof ElGamalParameter) {
            return (ElGamalParameter) obj2;
        }
        if (obj2 != null) {
            return new ElGamalParameter(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f228585g.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f228586p.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.f228586p, this.f228585g);
    }

    private ElGamalParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f228586p = (ASN1Integer) objects.nextElement();
        this.f228585g = (ASN1Integer) objects.nextElement();
    }
}
