package org.bouncycastle.asn1.cms;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes14.dex */
public class TimeStampTokenEvidence extends ASN1Object {
    private TimeStampAndCRL[] timeStampAndCRLs;

    private TimeStampTokenEvidence(ASN1Sequence aSN1Sequence) {
        this.timeStampAndCRLs = new TimeStampAndCRL[aSN1Sequence.size()];
        Enumeration objects = aSN1Sequence.getObjects();
        int i = 0;
        while (objects.hasMoreElements()) {
            this.timeStampAndCRLs[i] = TimeStampAndCRL.getInstance(objects.nextElement());
            i++;
        }
    }

    private TimeStampAndCRL[] copy(TimeStampAndCRL[] timeStampAndCRLArr) {
        int length = timeStampAndCRLArr.length;
        TimeStampAndCRL[] timeStampAndCRLArr2 = new TimeStampAndCRL[length];
        System.arraycopy(timeStampAndCRLArr, 0, timeStampAndCRLArr2, 0, length);
        return timeStampAndCRLArr2;
    }

    public static TimeStampTokenEvidence getInstance(Object obj2) {
        if (obj2 instanceof TimeStampTokenEvidence) {
            return (TimeStampTokenEvidence) obj2;
        }
        if (obj2 != null) {
            return new TimeStampTokenEvidence(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(this.timeStampAndCRLs.length);
        int i = 0;
        while (true) {
            TimeStampAndCRL[] timeStampAndCRLArr = this.timeStampAndCRLs;
            if (i == timeStampAndCRLArr.length) {
                return new DERSequence(aSN1EncodableVector);
            }
            aSN1EncodableVector.add(timeStampAndCRLArr[i]);
            i++;
        }
    }

    public TimeStampAndCRL[] toTimeStampAndCRLArray() {
        return copy(this.timeStampAndCRLs);
    }

    public TimeStampTokenEvidence(TimeStampAndCRL timeStampAndCRL) {
        this.timeStampAndCRLs = new TimeStampAndCRL[]{timeStampAndCRL};
    }

    public static TimeStampTokenEvidence getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public TimeStampTokenEvidence(TimeStampAndCRL[] timeStampAndCRLArr) {
        this.timeStampAndCRLs = copy(timeStampAndCRLArr);
    }
}
