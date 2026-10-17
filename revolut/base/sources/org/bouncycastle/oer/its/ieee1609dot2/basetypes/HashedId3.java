package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1OctetString;

/* JADX INFO: loaded from: classes14.dex */
public class HashedId3 extends HashedId {
    public HashedId3(byte[] bArr) {
        super(bArr);
        if (bArr.length != 3) {
            throw new IllegalArgumentException("hash id not 3 bytes");
        }
    }

    public static HashedId3 getInstance(Object obj2) {
        if (obj2 instanceof HashedId3) {
            return (HashedId3) obj2;
        }
        if (obj2 != null) {
            return new HashedId3(ASN1OctetString.getInstance(obj2).getOctets());
        }
        return null;
    }
}
