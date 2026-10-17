package org.bouncycastle.asn1.misc;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class CAST5CBCParameters extends ASN1Object {

    /* JADX INFO: renamed from: iv, reason: collision with root package name */
    ASN1OctetString f228195iv;
    ASN1Integer keyLength;

    private CAST5CBCParameters(ASN1Sequence aSN1Sequence) {
        this.f228195iv = (ASN1OctetString) aSN1Sequence.getObjectAt(0);
        this.keyLength = (ASN1Integer) aSN1Sequence.getObjectAt(1);
    }

    public static CAST5CBCParameters getInstance(Object obj2) {
        if (obj2 instanceof CAST5CBCParameters) {
            return (CAST5CBCParameters) obj2;
        }
        if (obj2 != null) {
            return new CAST5CBCParameters(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public byte[] getIV() {
        return Arrays.clone(this.f228195iv.getOctets());
    }

    public int getKeyLength() {
        return this.keyLength.intValueExact();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(this.f228195iv, this.keyLength);
    }

    public CAST5CBCParameters(byte[] bArr, int i) {
        this.f228195iv = new DEROctetString(Arrays.clone(bArr));
        this.keyLength = ASN1Integer.valueOf(i);
    }
}
