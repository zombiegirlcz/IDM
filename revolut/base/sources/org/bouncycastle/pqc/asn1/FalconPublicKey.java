package org.bouncycastle.pqc.asn1;

import okl.m;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes14.dex */
public class FalconPublicKey extends ASN1Object {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private byte[] f228775h;

    @Deprecated
    public FalconPublicKey(ASN1Sequence aSN1Sequence) {
        this.f228775h = m.C(aSN1Sequence, 0);
    }

    public static FalconPublicKey getInstance(Object obj2) {
        if (obj2 instanceof FalconPublicKey) {
            return (FalconPublicKey) obj2;
        }
        if (obj2 != null) {
            return new FalconPublicKey(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public byte[] getH() {
        return this.f228775h;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new DEROctetString(this.f228775h));
        return new DERSequence(aSN1EncodableVector);
    }

    public FalconPublicKey(byte[] bArr) {
        this.f228775h = bArr;
    }
}
