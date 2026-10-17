package org.bouncycastle.asn1.pkcs;

import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes14.dex */
public class PKCS12PBEParams extends ASN1Object {
    ASN1Integer iterations;

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    ASN1OctetString f228203iv;

    private PKCS12PBEParams(ASN1Sequence aSN1Sequence) {
        this.f228203iv = (ASN1OctetString) aSN1Sequence.getObjectAt(0);
        this.iterations = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static PKCS12PBEParams getInstance(Object obj2) {
        if (obj2 instanceof PKCS12PBEParams) {
            return (PKCS12PBEParams) obj2;
        }
        if (obj2 != null) {
            return new PKCS12PBEParams(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public byte[] getIV() {
        return this.f228203iv.getOctets();
    }

    public BigInteger getIterations() {
        return this.iterations.getValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.f228203iv, this.iterations);
    }

    public PKCS12PBEParams(byte[] bArr, int i) {
        this.f228203iv = new DEROctetString(bArr);
        this.iterations = ASN1Integer.valueOf(i);
    }
}
