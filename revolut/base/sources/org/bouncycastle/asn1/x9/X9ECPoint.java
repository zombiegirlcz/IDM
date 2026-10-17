package org.bouncycastle.asn1.x9;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class X9ECPoint extends ASN1Object {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ECCurve f228250c;
    private final ASN1OctetString encoding;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ECPoint f228251p;

    public X9ECPoint(ECCurve eCCurve, ASN1OctetString aSN1OctetString) {
        this(eCCurve, aSN1OctetString.getOctets());
    }

    public synchronized ECPoint getPoint() {
        try {
            if (this.f228251p == null) {
                this.f228251p = this.f228250c.decodePoint(this.encoding.getOctets()).normalize();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.f228251p;
    }

    public byte[] getPointEncoding() {
        return Arrays.clone(this.encoding.getOctets());
    }

    public boolean isPointCompressed() {
        byte b4;
        byte[] octets = this.encoding.getOctets();
        return octets != null && octets.length > 0 && ((b4 = octets[0]) == 2 || b4 == 3);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.encoding;
    }

    public X9ECPoint(ECCurve eCCurve, byte[] bArr) {
        this.f228250c = eCCurve;
        this.encoding = new DEROctetString(Arrays.clone(bArr));
    }

    public X9ECPoint(ECPoint eCPoint, boolean z) {
        this.f228251p = eCPoint.normalize();
        this.encoding = new DEROctetString(eCPoint.getEncoded(z));
    }
}
