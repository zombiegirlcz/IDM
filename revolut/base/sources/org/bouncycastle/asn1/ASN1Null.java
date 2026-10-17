package org.bouncycastle.asn1;

import java.io.IOException;
import okl.m;

/* JADX INFO: loaded from: classes14.dex */
public abstract class ASN1Null extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1Null.class, 5) { // from class: org.bouncycastle.asn1.ASN1Null.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            ASN1Null.checkContentsLength(dEROctetString.getOctetsLength());
            return ASN1Null.createPrimitive();
        }
    };

    public static void checkContentsLength(int i) {
        if (i != 0) {
            throw new IllegalStateException("malformed NULL encoding encountered");
        }
    }

    public static ASN1Null createPrimitive() {
        return DERNull.INSTANCE;
    }

    public static ASN1Null getInstance(Object obj2) {
        if (obj2 instanceof ASN1Null) {
            return (ASN1Null) obj2;
        }
        if (obj2 == null) {
            return null;
        }
        try {
            return (ASN1Null) TYPE.fromByteArray((byte[]) obj2);
        } catch (IOException e) {
            throw new IllegalArgumentException(m.f(e, new StringBuilder("failed to construct NULL from byte[]: ")));
        }
    }

    public static ASN1Null getTagged(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1Null) TYPE.getTagged(aSN1TaggedObject, z);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        return aSN1Primitive instanceof ASN1Null;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return -1;
    }

    public String toString() {
        return "NULL";
    }

    public static ASN1Null getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1Null) TYPE.getContextTagged(aSN1TaggedObject, z);
    }
}
