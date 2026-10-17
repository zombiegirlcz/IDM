package org.bouncycastle.asn1.cmp;

import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;

/* JADX INFO: loaded from: classes14.dex */
public class CertConfirmContent extends ASN1Object {
    private final ASN1Sequence content;

    private CertConfirmContent(ASN1Sequence aSN1Sequence) {
        this.content = aSN1Sequence;
    }

    public static CertConfirmContent getInstance(Object obj2) {
        if (obj2 instanceof CertConfirmContent) {
            return (CertConfirmContent) obj2;
        }
        if (obj2 != null) {
            return new CertConfirmContent(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.content;
    }

    public CertStatus[] toCertStatusArray() {
        int size = this.content.size();
        CertStatus[] certStatusArr = new CertStatus[size];
        for (int i = 0; i != size; i++) {
            certStatusArr[i] = CertStatus.getInstance(this.content.getObjectAt(i));
        }
        return certStatusArr;
    }
}
