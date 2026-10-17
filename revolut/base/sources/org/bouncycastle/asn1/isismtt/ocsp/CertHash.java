package org.bouncycastle.asn1.isismtt.ocsp;

import ehe.n;
import okl.m;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.util.Arrays;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class CertHash extends ASN1Object {
    private byte[] certificateHash;
    private AlgorithmIdentifier hashAlgorithm;

    private CertHash(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(m.n(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        this.hashAlgorithm = AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
        this.certificateHash = n.D(aSN1Sequence, 1);
    }

    public static CertHash getInstance(Object obj2) {
        if (obj2 == null || (obj2 instanceof CertHash)) {
            return (CertHash) obj2;
        }
        if (obj2 instanceof ASN1Sequence) {
            return new CertHash((ASN1Sequence) obj2);
        }
        throw new IllegalArgumentException(a.g(obj2, "illegal object in getInstance: "));
    }

    public byte[] getCertificateHash() {
        return Arrays.clone(this.certificateHash);
    }

    public AlgorithmIdentifier getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.hashAlgorithm, new DEROctetString(this.certificateHash));
    }

    public CertHash(AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        this.hashAlgorithm = algorithmIdentifier;
        byte[] bArr2 = new byte[bArr.length];
        this.certificateHash = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }
}
