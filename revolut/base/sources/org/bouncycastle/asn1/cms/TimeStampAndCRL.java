package org.bouncycastle.asn1.cms;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x509.CertificateList;

/* JADX INFO: loaded from: classes14.dex */
public class TimeStampAndCRL extends ASN1Object {

    /* JADX INFO: renamed from: crl, reason: collision with root package name */
    private CertificateList f228172crl;
    private ContentInfo timeStamp;

    private TimeStampAndCRL(ASN1Sequence aSN1Sequence) {
        this.timeStamp = ContentInfo.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() == 2) {
            this.f228172crl = CertificateList.getInstance(aSN1Sequence.getObjectAt(1));
        }
    }

    public static TimeStampAndCRL getInstance(Object obj2) {
        if (obj2 instanceof TimeStampAndCRL) {
            return (TimeStampAndCRL) obj2;
        }
        if (obj2 != null) {
            return new TimeStampAndCRL(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public CertificateList getCRL() {
        return this.f228172crl;
    }

    public CertificateList getCertificateList() {
        return this.f228172crl;
    }

    public ContentInfo getTimeStampToken() {
        return this.timeStamp;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.timeStamp);
        CertificateList certificateList = this.f228172crl;
        if (certificateList != null) {
            aSN1EncodableVector.add(certificateList);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public TimeStampAndCRL(ContentInfo contentInfo) {
        this(contentInfo, null);
    }

    public TimeStampAndCRL(ContentInfo contentInfo, CertificateList certificateList) {
        this.timeStamp = contentInfo;
        this.f228172crl = certificateList;
    }
}
