package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Null;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class PKIConfirmContent extends ASN1Object {

    /* JADX INFO: renamed from: val, reason: collision with root package name */
    private final ASN1Null f228158val;

    public PKIConfirmContent() {
        this.f228158val = DERNull.INSTANCE;
    }

    public static PKIConfirmContent getInstance(Object obj2) {
        if (obj2 == null || (obj2 instanceof PKIConfirmContent)) {
            return (PKIConfirmContent) obj2;
        }
        if (obj2 instanceof ASN1Null) {
            return new PKIConfirmContent((ASN1Null) obj2);
        }
        throw new IllegalArgumentException(a.g(obj2, "Invalid object: "));
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f228158val;
    }

    private PKIConfirmContent(ASN1Null aSN1Null) {
        this.f228158val = aSN1Null;
    }
}
