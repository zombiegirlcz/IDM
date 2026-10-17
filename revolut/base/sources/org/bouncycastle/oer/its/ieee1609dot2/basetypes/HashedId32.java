package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1OctetString;

/* JADX INFO: loaded from: classes14.dex */
public class HashedId32 extends HashedId {
    public HashedId32(byte[] bArr) {
        super(bArr);
        if (bArr.length != 32) {
            throw new IllegalArgumentException("hash id not 32 bytes");
        }
    }

    public static HashedId32 getInstance(Object obj2) {
        if (obj2 instanceof HashedId32) {
            return (HashedId32) obj2;
        }
        if (obj2 != null) {
            return new HashedId32(ASN1OctetString.getInstance(obj2).getOctets());
        }
        return null;
    }
}
