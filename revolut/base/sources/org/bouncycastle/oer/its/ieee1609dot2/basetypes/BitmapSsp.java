package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class BitmapSsp extends ASN1Object {
    private final DEROctetString string;

    public BitmapSsp(DEROctetString dEROctetString) {
        this.string = dEROctetString;
    }

    public static BitmapSsp getInstance(Object obj2) {
        if (obj2 instanceof BitmapSsp) {
            return (BitmapSsp) obj2;
        }
        if (obj2 != null) {
            return new BitmapSsp(ASN1OctetString.getInstance(obj2).getOctets());
        }
        return null;
    }

    public DEROctetString getString() {
        return this.string;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.string;
    }

    public BitmapSsp(byte[] bArr) {
        this.string = new DEROctetString(Arrays.clone(bArr));
    }
}
