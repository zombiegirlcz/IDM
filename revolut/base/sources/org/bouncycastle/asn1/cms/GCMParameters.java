package org.bouncycastle.asn1.cms;

import ehe.n;
import okl.m;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class GCMParameters extends ASN1Object {
    private int icvLen;
    private byte[] nonce;

    private GCMParameters(ASN1Sequence aSN1Sequence) {
        this.nonce = n.D(aSN1Sequence, 0);
        this.icvLen = aSN1Sequence.size() == 2 ? m.e(aSN1Sequence, 1) : 12;
    }

    public static GCMParameters getInstance(Object obj2) {
        if (obj2 instanceof GCMParameters) {
            return (GCMParameters) obj2;
        }
        if (obj2 != null) {
            return new GCMParameters(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public int getIcvLen() {
        return this.icvLen;
    }

    public byte[] getNonce() {
        return Arrays.clone(this.nonce);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(new DEROctetString(this.nonce));
        int i = this.icvLen;
        if (i != 12) {
            aSN1EncodableVector.add(ASN1Integer.valueOf(i));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public GCMParameters(byte[] bArr, int i) {
        this.nonce = Arrays.clone(bArr);
        this.icvLen = i;
    }
}
