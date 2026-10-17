package org.bouncycastle.oer.its.ieee1609dot2;

import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERBitString;

/* JADX INFO: loaded from: classes14.dex */
public class EndEntityType extends ASN1Object {
    public static final int app = 128;
    public static final int enrol = 64;
    private final ASN1BitString type;

    public EndEntityType(int i) {
        this(new DERBitString(i));
    }

    public static EndEntityType getInstance(Object obj2) {
        if (obj2 instanceof EndEntityType) {
            return (EndEntityType) obj2;
        }
        if (obj2 != null) {
            return new EndEntityType(ASN1BitString.getInstance(obj2));
        }
        return null;
    }

    public ASN1BitString getType() {
        return this.type;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.type;
    }

    private EndEntityType(ASN1BitString aSN1BitString) {
        this.type = aSN1BitString;
    }
}
