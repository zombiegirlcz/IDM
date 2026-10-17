package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1OctetString;

/* JADX INFO: loaded from: classes14.dex */
public class HashedId10 extends HashedId {
    public HashedId10(byte[] bArr) {
        super(bArr);
        if (bArr.length != 10) {
            throw new IllegalArgumentException("hash id not 10 bytes");
        }
    }

    public static HashedId10 getInstance(Object obj2) {
        if (obj2 instanceof HashedId10) {
            return (HashedId10) obj2;
        }
        if (obj2 != null) {
            return new HashedId10(ASN1OctetString.getInstance(obj2).getOctets());
        }
        return null;
    }
}
