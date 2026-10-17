package org.bouncycastle.pqc.asn1;

import okl.m;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes14.dex */
public class SABERPrivateKey extends ASN1Object {
    private SABERPublicKey PublicKey;

    /* JADX INFO: renamed from: hpk, reason: collision with root package name */
    private byte[] f228779hpk;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte[] f228780s;
    private int version;
    private byte[] z;

    public SABERPrivateKey(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.version = i;
        if (i != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.z = bArr;
        this.f228780s = bArr2;
        this.f228779hpk = bArr3;
    }

    public static SABERPrivateKey getInstance(Object obj2) {
        if (obj2 instanceof SABERPrivateKey) {
            return (SABERPrivateKey) obj2;
        }
        if (obj2 != null) {
            return new SABERPrivateKey(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public byte[] getHpk() {
        return this.f228779hpk;
    }

    public SABERPublicKey getPublicKey() {
        return this.PublicKey;
    }

    public byte[] getS() {
        return this.f228780s;
    }

    public int getVersion() {
        return this.version;
    }

    public byte[] getZ() {
        return this.z;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(ASN1Integer.valueOf(this.version));
        aSN1EncodableVector.add(new DEROctetString(this.z));
        aSN1EncodableVector.add(new DEROctetString(this.f228780s));
        aSN1EncodableVector.add(new DEROctetString(this.f228779hpk));
        return new DERSequence(aSN1EncodableVector);
    }

    public SABERPrivateKey(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, SABERPublicKey sABERPublicKey) {
        this.version = i;
        if (i != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.z = bArr;
        this.f228780s = bArr2;
        this.f228779hpk = bArr3;
        this.PublicKey = sABERPublicKey;
    }

    private SABERPrivateKey(ASN1Sequence aSN1Sequence) {
        int iE = m.e(aSN1Sequence, 0);
        this.version = iE;
        if (iE != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.z = m.C(aSN1Sequence, 1);
        this.f228780s = m.C(aSN1Sequence, 2);
        this.PublicKey = SABERPublicKey.getInstance(aSN1Sequence.getObjectAt(3));
        this.f228779hpk = m.C(aSN1Sequence, 4);
    }
}
