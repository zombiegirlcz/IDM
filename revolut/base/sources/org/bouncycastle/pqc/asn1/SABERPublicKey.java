package org.bouncycastle.pqc.asn1;

import okl.m;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes14.dex */
public class SABERPublicKey extends ASN1Object {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f228781b;
    private byte[] seed_A;

    private SABERPublicKey(ASN1Sequence aSN1Sequence) {
        this.seed_A = m.C(aSN1Sequence, 0);
        this.f228781b = m.C(aSN1Sequence, 1);
    }

    public static SABERPublicKey getInstance(Object obj2) {
        if (obj2 instanceof SABERPublicKey) {
            return (SABERPublicKey) obj2;
        }
        if (obj2 != null) {
            return new SABERPublicKey(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public byte[] getB() {
        return this.f228781b;
    }

    public byte[] getSeed_A() {
        return this.seed_A;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new DEROctetString(this.seed_A));
        aSN1EncodableVector.add(new DEROctetString(this.f228781b));
        return new DERSequence(aSN1EncodableVector);
    }

    public SABERPublicKey(byte[] bArr, byte[] bArr2) {
        this.seed_A = bArr;
        this.f228781b = bArr2;
    }
}
