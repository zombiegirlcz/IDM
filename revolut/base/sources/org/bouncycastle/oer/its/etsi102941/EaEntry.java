package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.OEROptional;
import org.bouncycastle.oer.its.etsi103097.EtsiTs103097Certificate;

/* JADX INFO: loaded from: classes14.dex */
public class EaEntry extends ASN1Object {
    private final Url aaAccessPoint;
    private final EtsiTs103097Certificate eaCertificate;
    private final Url itsAccessPoint;

    public static class Builder {
        private Url aaAccessPoint;
        private EtsiTs103097Certificate eaCertificate;
        private Url itsAccessPoint;

        public EaEntry createEaEntry() {
            return new EaEntry(this.eaCertificate, this.aaAccessPoint, this.itsAccessPoint);
        }

        public Builder setAaAccessPoint(Url url2) {
            this.aaAccessPoint = url2;
            return this;
        }

        public Builder setEaCertificate(EtsiTs103097Certificate etsiTs103097Certificate) {
            this.eaCertificate = etsiTs103097Certificate;
            return this;
        }

        public Builder setItsAccessPoint(Url url2) {
            this.itsAccessPoint = url2;
            return this;
        }
    }

    private EaEntry(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException("expected sequence size of 3");
        }
        this.eaCertificate = EtsiTs103097Certificate.getInstance((Object) aSN1Sequence.getObjectAt(0));
        this.aaAccessPoint = Url.getInstance(aSN1Sequence.getObjectAt(1));
        this.itsAccessPoint = (Url) OEROptional.getValue(Url.class, aSN1Sequence.getObjectAt(2));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EaEntry getInstance(Object obj2) {
        if (obj2 instanceof EaEntry) {
            return (EaEntry) obj2;
        }
        if (obj2 != null) {
            return new EaEntry(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public Url getAaAccessPoint() {
        return this.aaAccessPoint;
    }

    public EtsiTs103097Certificate getEaCertificate() {
        return this.eaCertificate;
    }

    public Url getItsAccessPoint() {
        return this.itsAccessPoint;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{this.eaCertificate, this.aaAccessPoint, OEROptional.getInstance(this.itsAccessPoint)});
    }

    public EaEntry(EtsiTs103097Certificate etsiTs103097Certificate, Url url2, Url url3) {
        this.eaCertificate = etsiTs103097Certificate;
        this.aaAccessPoint = url2;
        this.itsAccessPoint = url3;
    }
}
