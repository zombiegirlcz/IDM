package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1UTF8String;
import org.bouncycastle.asn1.DERUTF8String;

/* JADX INFO: loaded from: classes14.dex */
public class Hostname extends ASN1Object {
    private final String hostName;

    public Hostname(String str) {
        this.hostName = str;
    }

    public static Hostname getInstance(Object obj2) {
        if (obj2 instanceof Hostname) {
            return (Hostname) obj2;
        }
        if (obj2 != null) {
            return new Hostname(ASN1UTF8String.getInstance(obj2));
        }
        return null;
    }

    public String getHostName() {
        return this.hostName;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERUTF8String(this.hostName);
    }

    private Hostname(ASN1String aSN1String) {
        this.hostName = aSN1String.getString();
    }
}
