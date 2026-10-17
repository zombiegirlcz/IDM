package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DEROctetString;

/* JADX INFO: loaded from: classes14.dex */
public class SubjectAssurance extends DEROctetString {
    private SubjectAssurance(ASN1OctetString aSN1OctetString) {
        this(aSN1OctetString.getOctets());
    }

    public static SubjectAssurance getInstance(Object obj2) {
        if (obj2 instanceof SubjectAssurance) {
            return (SubjectAssurance) obj2;
        }
        if (obj2 != null) {
            return new SubjectAssurance(ASN1OctetString.getInstance(obj2));
        }
        return null;
    }

    public SubjectAssurance(byte[] bArr) {
        super(bArr);
        if (bArr.length != 1) {
            throw new IllegalArgumentException("length is not 1");
        }
    }
}
