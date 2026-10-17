package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;

/* JADX INFO: loaded from: classes14.dex */
public class Url extends ASN1Object {

    /* JADX INFO: renamed from: url, reason: collision with root package name */
    private final String f228751url;

    public Url(String str) {
        this.f228751url = str;
    }

    public static Url getInstance(Object obj2) {
        if (obj2 instanceof Url) {
            return (Url) obj2;
        }
        if (obj2 != null) {
            return new Url(ASN1IA5String.getInstance(obj2));
        }
        return null;
    }

    public String getUrl() {
        return this.f228751url;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERIA5String(this.f228751url);
    }

    private Url(ASN1IA5String aSN1IA5String) {
        this.f228751url = aSN1IA5String.getString();
    }
}
