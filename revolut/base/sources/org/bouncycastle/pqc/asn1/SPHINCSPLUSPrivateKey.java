package org.bouncycastle.pqc.asn1;

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
public class SPHINCSPLUSPrivateKey extends ASN1Object {
    private SPHINCSPLUSPublicKey PublicKey;
    private byte[] skprf;
    private byte[] skseed;
    private int version;

    public SPHINCSPLUSPrivateKey(int i, byte[] bArr, byte[] bArr2) {
        this(i, bArr, bArr2, null);
    }

    public static SPHINCSPLUSPrivateKey getInstance(Object obj2) {
        if (obj2 instanceof SPHINCSPLUSPrivateKey) {
            return (SPHINCSPLUSPrivateKey) obj2;
        }
        if (obj2 != null) {
            return new SPHINCSPLUSPrivateKey(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public SPHINCSPLUSPublicKey getPublicKey() {
        return this.PublicKey;
    }

    public byte[] getSkprf() {
        return Arrays.clone(this.skprf);
    }

    public byte[] getSkseed() {
        return Arrays.clone(this.skseed);
    }

    public int getVersion() {
        return this.version;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(ASN1Integer.valueOf(this.version));
        aSN1EncodableVector.add(new DEROctetString(this.skseed));
        aSN1EncodableVector.add(new DEROctetString(this.skprf));
        SPHINCSPLUSPublicKey sPHINCSPLUSPublicKey = this.PublicKey;
        if (sPHINCSPLUSPublicKey != null) {
            aSN1EncodableVector.add(new SPHINCSPLUSPublicKey(sPHINCSPLUSPublicKey.getPkseed(), this.PublicKey.getPkroot()));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public SPHINCSPLUSPrivateKey(int i, byte[] bArr, byte[] bArr2, SPHINCSPLUSPublicKey sPHINCSPLUSPublicKey) {
        this.version = i;
        this.skseed = bArr;
        this.skprf = bArr2;
        this.PublicKey = sPHINCSPLUSPublicKey;
    }

    @Deprecated
    public SPHINCSPLUSPrivateKey(ASN1Sequence aSN1Sequence) {
        int iE = m.e(aSN1Sequence, 0);
        this.version = iE;
        if (iE != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.skseed = m.C(aSN1Sequence, 1);
        this.skprf = m.C(aSN1Sequence, 2);
        if (aSN1Sequence.size() == 4) {
            this.PublicKey = SPHINCSPLUSPublicKey.getInstance(aSN1Sequence.getObjectAt(3));
        }
    }
}
