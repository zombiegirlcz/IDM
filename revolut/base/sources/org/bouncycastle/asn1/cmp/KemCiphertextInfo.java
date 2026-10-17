package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* JADX INFO: loaded from: classes14.dex */
public class KemCiphertextInfo extends ASN1Object {

    /* JADX INFO: renamed from: ct, reason: collision with root package name */
    private final ASN1OctetString f228154ct;

    /* JADX INFO: renamed from: kem, reason: collision with root package name */
    private final AlgorithmIdentifier f228155kem;

    private KemCiphertextInfo(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("sequence size should 2");
        }
        this.f228155kem = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.f228154ct = ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static KemCiphertextInfo getInstance(Object obj2) {
        if (obj2 instanceof KemCiphertextInfo) {
            return (KemCiphertextInfo) obj2;
        }
        if (obj2 != null) {
            return new KemCiphertextInfo(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public ASN1OctetString getCt() {
        return this.f228154ct;
    }

    public AlgorithmIdentifier getKem() {
        return this.f228155kem;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.f228155kem, this.f228154ct);
    }

    public KemCiphertextInfo(AlgorithmIdentifier algorithmIdentifier, ASN1OctetString aSN1OctetString) {
        this.f228155kem = algorithmIdentifier;
        this.f228154ct = aSN1OctetString;
    }
}
