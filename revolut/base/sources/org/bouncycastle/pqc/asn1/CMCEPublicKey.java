package org.bouncycastle.pqc.asn1;

import okl.m;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class CMCEPublicKey extends ASN1Object {
    private byte[] T;

    @Deprecated
    public CMCEPublicKey(ASN1Sequence aSN1Sequence) {
        this.T = m.C(aSN1Sequence, 0);
    }

    public static CMCEPublicKey getInstance(Object obj2) {
        if (obj2 instanceof CMCEPublicKey) {
            return (CMCEPublicKey) obj2;
        }
        if (obj2 != null) {
            return new CMCEPublicKey(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public byte[] getT() {
        return Arrays.clone(this.T);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new DEROctetString(this.T));
        return new DERSequence(aSN1EncodableVector);
    }

    public CMCEPublicKey(byte[] bArr) {
        this.T = bArr;
    }
}
