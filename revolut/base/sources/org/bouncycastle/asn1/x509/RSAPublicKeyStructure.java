package org.bouncycastle.asn1.x509;

import java.math.BigInteger;
import java.util.Enumeration;
import okl.m;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class RSAPublicKeyStructure extends ASN1Object {
    private BigInteger modulus;
    private BigInteger publicExponent;

    public RSAPublicKeyStructure(BigInteger bigInteger, BigInteger bigInteger2) {
        this.modulus = bigInteger;
        this.publicExponent = bigInteger2;
    }

    public static RSAPublicKeyStructure getInstance(Object obj2) {
        if (obj2 == null || (obj2 instanceof RSAPublicKeyStructure)) {
            return (RSAPublicKeyStructure) obj2;
        }
        if (obj2 instanceof ASN1Sequence) {
            return new RSAPublicKeyStructure((ASN1Sequence) obj2);
        }
        throw new IllegalArgumentException(a.g(obj2, "Invalid RSAPublicKeyStructure: "));
    }

    public BigInteger getModulus() {
        return this.modulus;
    }

    public BigInteger getPublicExponent() {
        return this.publicExponent;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Integer(getModulus()), new ASN1Integer(getPublicExponent()));
    }

    public RSAPublicKeyStructure(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(m.n(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.modulus = ASN1Integer.getInstance(objects.nextElement()).getPositiveValue();
        this.publicExponent = ASN1Integer.getInstance(objects.nextElement()).getPositiveValue();
    }

    public static RSAPublicKeyStructure getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }
}
