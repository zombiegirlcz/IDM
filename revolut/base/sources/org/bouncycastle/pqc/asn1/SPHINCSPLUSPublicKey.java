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
public class SPHINCSPLUSPublicKey extends ASN1Object {
    private byte[] pkroot;
    private byte[] pkseed;

    @Deprecated
    public SPHINCSPLUSPublicKey(ASN1Sequence aSN1Sequence) {
        this.pkseed = m.C(aSN1Sequence, 0);
        this.pkroot = m.C(aSN1Sequence, 1);
    }

    public static SPHINCSPLUSPublicKey getInstance(Object obj2) {
        if (obj2 instanceof SPHINCSPLUSPublicKey) {
            return (SPHINCSPLUSPublicKey) obj2;
        }
        if (obj2 != null) {
            return new SPHINCSPLUSPublicKey(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public byte[] getPkroot() {
        return Arrays.clone(this.pkroot);
    }

    public byte[] getPkseed() {
        return Arrays.clone(this.pkseed);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new DEROctetString(this.pkseed));
        aSN1EncodableVector.add(new DEROctetString(this.pkroot));
        return new DERSequence(aSN1EncodableVector);
    }

    public SPHINCSPLUSPublicKey(byte[] bArr, byte[] bArr2) {
        this.pkseed = bArr;
        this.pkroot = bArr2;
    }
}
