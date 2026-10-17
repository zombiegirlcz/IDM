package org.bouncycastle.asn1;

import java.io.IOException;
import okl.m;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public abstract class ASN1VisibleString extends ASN1Primitive implements ASN1String {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1VisibleString.class, 26) { // from class: org.bouncycastle.asn1.ASN1VisibleString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1VisibleString.createPrimitive(dEROctetString.getOctets());
        }
    };
    final byte[] contents;

    public ASN1VisibleString(String str) {
        this.contents = Strings.toByteArray(str);
    }

    public static ASN1VisibleString createPrimitive(byte[] bArr) {
        return new DERVisibleString(bArr, false);
    }

    public static ASN1VisibleString getInstance(Object obj2) {
        if (obj2 == null || (obj2 instanceof ASN1VisibleString)) {
            return (ASN1VisibleString) obj2;
        }
        if (obj2 instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj2).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1VisibleString) {
                return (ASN1VisibleString) aSN1Primitive;
            }
        }
        if (!(obj2 instanceof byte[])) {
            throw new IllegalArgumentException(a.g(obj2, "illegal object in getInstance: "));
        }
        try {
            return (ASN1VisibleString) TYPE.fromByteArray((byte[]) obj2);
        } catch (Exception e) {
            throw new IllegalArgumentException(m.g(e, new StringBuilder("encoding error in getInstance: ")));
        }
    }

    public static ASN1VisibleString getTagged(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1VisibleString) TYPE.getTagged(aSN1TaggedObject, z);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1VisibleString) {
            return Arrays.areEqual(this.contents, ((ASN1VisibleString) aSN1Primitive).contents);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void encode(ASN1OutputStream aSN1OutputStream, boolean z) throws IOException {
        aSN1OutputStream.writeEncodingDL(z, 26, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int encodedLength(boolean z) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, this.contents.length);
    }

    public final byte[] getOctets() {
        return Arrays.clone(this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final String getString() {
        return Strings.fromByteArray(this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    public String toString() {
        return getString();
    }

    public ASN1VisibleString(byte[] bArr, boolean z) {
        this.contents = z ? Arrays.clone(bArr) : bArr;
    }

    public static ASN1VisibleString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1VisibleString) TYPE.getContextTagged(aSN1TaggedObject, z);
    }
}
