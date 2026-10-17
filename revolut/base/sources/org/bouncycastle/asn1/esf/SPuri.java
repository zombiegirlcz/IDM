package org.bouncycastle.asn1.esf;

import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Primitive;

/* JADX INFO: loaded from: classes14.dex */
public class SPuri {

    /* JADX INFO: renamed from: uri, reason: collision with root package name */
    private ASN1IA5String f228191uri;

    public SPuri(ASN1IA5String aSN1IA5String) {
        this.f228191uri = aSN1IA5String;
    }

    public static SPuri getInstance(Object obj2) {
        if (obj2 instanceof SPuri) {
            return (SPuri) obj2;
        }
        if (obj2 instanceof ASN1IA5String) {
            return new SPuri(ASN1IA5String.getInstance(obj2));
        }
        return null;
    }

    public ASN1IA5String getUriIA5() {
        return this.f228191uri;
    }

    public ASN1Primitive toASN1Primitive() {
        return this.f228191uri.toASN1Primitive();
    }
}
