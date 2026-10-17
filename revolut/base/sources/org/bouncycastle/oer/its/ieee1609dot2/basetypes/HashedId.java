package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class HashedId extends ASN1Object {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final byte[] f228762id;

    public HashedId(byte[] bArr) {
        this.f228762id = Arrays.clone(bArr);
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && getClass() == obj2.getClass() && super.equals(obj2)) {
            return java.util.Arrays.equals(this.f228762id, ((HashedId) obj2).f228762id);
        }
        return false;
    }

    public byte[] getHashBytes() {
        return Arrays.clone(this.f228762id);
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return java.util.Arrays.hashCode(this.f228762id) + (super.hashCode() * 31);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DEROctetString(this.f228762id);
    }
}
