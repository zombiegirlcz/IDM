package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class LinkageSeed extends ASN1Object {
    private final byte[] linkageSeed;

    private LinkageSeed(ASN1OctetString aSN1OctetString) {
        this(aSN1OctetString.getOctets());
    }

    public static LinkageSeed getInstance(Object obj2) {
        if (obj2 instanceof LinkageSeed) {
            return (LinkageSeed) obj2;
        }
        if (obj2 != null) {
            return new LinkageSeed(ASN1OctetString.getInstance(obj2));
        }
        return null;
    }

    public byte[] getLinkageSeed() {
        return this.linkageSeed;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DEROctetString(this.linkageSeed);
    }

    public LinkageSeed(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("linkage seed not 16 bytes");
        }
        this.linkageSeed = Arrays.clone(bArr);
    }
}
