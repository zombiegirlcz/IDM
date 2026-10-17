package org.bouncycastle.asn1.ua;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.ec.ECPoint;

/* JADX INFO: loaded from: classes14.dex */
public class DSTU4145PublicKey extends ASN1Object {
    private ASN1OctetString pubKey;

    private DSTU4145PublicKey(ASN1OctetString aSN1OctetString) {
        this.pubKey = aSN1OctetString;
    }

    public static DSTU4145PublicKey getInstance(Object obj2) {
        if (obj2 instanceof DSTU4145PublicKey) {
            return (DSTU4145PublicKey) obj2;
        }
        if (obj2 != null) {
            return new DSTU4145PublicKey(ASN1OctetString.getInstance(obj2));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.pubKey;
    }

    public DSTU4145PublicKey(ECPoint eCPoint) {
        this.pubKey = new DEROctetString(DSTU4145PointEncoder.encodePoint(eCPoint));
    }
}
