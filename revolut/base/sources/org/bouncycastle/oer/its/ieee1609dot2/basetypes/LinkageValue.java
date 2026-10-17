package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DEROctetString;

/* JADX INFO: loaded from: classes14.dex */
public class LinkageValue extends DEROctetString {
    public LinkageValue(ASN1Encodable aSN1Encodable) throws IOException {
        super(aSN1Encodable);
    }

    public static LinkageValue getInstance(Object obj2) {
        if (obj2 instanceof LinkageValue) {
            return (LinkageValue) obj2;
        }
        if (obj2 != null) {
            return new LinkageValue(ASN1OctetString.getInstance(obj2).getOctets());
        }
        return null;
    }

    public LinkageValue(byte[] bArr) {
        super(bArr);
    }
}
