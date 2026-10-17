package org.bouncycastle.asn1.cms;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes14.dex */
public class RsaKemParameters extends ASN1Object {
    private final AlgorithmIdentifier keyDerivationFunction;
    private final BigInteger keyLength;

    private RsaKemParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("ASN.1 SEQUENCE should be of length 2");
        }
        this.keyDerivationFunction = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.keyLength = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1)).getValue();
    }

    public static RsaKemParameters getInstance(Object obj2) {
        if (obj2 instanceof RsaKemParameters) {
            return (RsaKemParameters) obj2;
        }
        if (obj2 != null) {
            return new RsaKemParameters(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public AlgorithmIdentifier getKeyDerivationFunction() {
        return this.keyDerivationFunction;
    }

    public BigInteger getKeyLength() {
        return this.keyLength;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.keyDerivationFunction, new ASN1Integer(this.keyLength));
    }

    public RsaKemParameters(AlgorithmIdentifier algorithmIdentifier, int i) {
        this.keyDerivationFunction = algorithmIdentifier;
        this.keyLength = BigInteger.valueOf(i);
    }
}
