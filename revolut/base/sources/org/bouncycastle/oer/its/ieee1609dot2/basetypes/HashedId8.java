package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1OctetString;

/* JADX INFO: loaded from: classes14.dex */
public class HashedId8 extends HashedId {
    public HashedId8(byte[] bArr) {
        super(bArr);
        if (bArr.length != 8) {
            throw new IllegalArgumentException("hash id not 8 bytes");
        }
    }

    public static HashedId8 getInstance(Object obj2) {
        if (obj2 instanceof HashedId8) {
            return (HashedId8) obj2;
        }
        if (obj2 != null) {
            return new HashedId8(ASN1OctetString.getInstance(obj2).getOctets());
        }
        return null;
    }
}
