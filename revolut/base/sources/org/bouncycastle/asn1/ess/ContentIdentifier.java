package org.bouncycastle.asn1.ess;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;

/* JADX INFO: loaded from: classes14.dex */
public class ContentIdentifier extends ASN1Object {
    ASN1OctetString value;

    private ContentIdentifier(ASN1OctetString aSN1OctetString) {
        this.value = aSN1OctetString;
    }

    public static ContentIdentifier getInstance(Object obj2) {
        if (obj2 instanceof ContentIdentifier) {
            return (ContentIdentifier) obj2;
        }
        if (obj2 != null) {
            return new ContentIdentifier(ASN1OctetString.getInstance(obj2));
        }
        return null;
    }

    public ASN1OctetString getValue() {
        return this.value;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.value;
    }

    public ContentIdentifier(byte[] bArr) {
        this(new DEROctetString(bArr));
    }
}
