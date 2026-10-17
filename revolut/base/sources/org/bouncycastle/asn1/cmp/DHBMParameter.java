package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes14.dex */
public class DHBMParameter extends ASN1Object {
    private final AlgorithmIdentifier mac;

    /* JADX INFO: renamed from: owf, reason: collision with root package name */
    private final AlgorithmIdentifier f228152owf;

    private DHBMParameter(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("expecting sequence size of 2");
        }
        this.f228152owf = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.mac = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static DHBMParameter getInstance(Object obj2) {
        if (obj2 instanceof DHBMParameter) {
            return (DHBMParameter) obj2;
        }
        if (obj2 != null) {
            return new DHBMParameter(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public AlgorithmIdentifier getMac() {
        return this.mac;
    }

    public AlgorithmIdentifier getOwf() {
        return this.f228152owf;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{this.f228152owf, this.mac});
    }

    public DHBMParameter(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2) {
        this.f228152owf = algorithmIdentifier;
        this.mac = algorithmIdentifier2;
    }
}
