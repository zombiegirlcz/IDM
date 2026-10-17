package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes14.dex */
public class GenericHybridParameters extends ASN1Object {

    /* JADX INFO: renamed from: dem, reason: collision with root package name */
    private final AlgorithmIdentifier f228160dem;

    /* JADX INFO: renamed from: kem, reason: collision with root package name */
    private final AlgorithmIdentifier f228161kem;

    private GenericHybridParameters(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("ASN.1 SEQUENCE should be of length 2");
        }
        this.f228161kem = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.f228160dem = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static GenericHybridParameters getInstance(Object obj2) {
        if (obj2 instanceof GenericHybridParameters) {
            return (GenericHybridParameters) obj2;
        }
        if (obj2 != null) {
            return new GenericHybridParameters(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public AlgorithmIdentifier getDem() {
        return this.f228160dem;
    }

    public AlgorithmIdentifier getKem() {
        return this.f228161kem;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.f228161kem, this.f228160dem);
    }

    public GenericHybridParameters(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2) {
        this.f228161kem = algorithmIdentifier;
        this.f228160dem = algorithmIdentifier2;
    }
}
