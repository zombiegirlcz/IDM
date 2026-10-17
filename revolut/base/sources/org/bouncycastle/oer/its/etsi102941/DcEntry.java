package org.bouncycastle.oer.its.etsi102941;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.oer.its.ieee1609dot2.basetypes.SequenceOfHashedId8;

/* JADX INFO: loaded from: classes14.dex */
public class DcEntry extends ASN1Object {
    private final SequenceOfHashedId8 cert;

    /* JADX INFO: renamed from: url, reason: collision with root package name */
    private final Url f228748url;

    public static class Builder {
        private SequenceOfHashedId8 cert;

        /* JADX INFO: renamed from: url, reason: collision with root package name */
        private Url f228749url;

        public DcEntry createDcEntry() {
            return new DcEntry(this.f228749url, this.cert);
        }

        public Builder setCert(SequenceOfHashedId8 sequenceOfHashedId8) {
            this.cert = sequenceOfHashedId8;
            return this;
        }

        public Builder setUrl(Url url2) {
            this.f228749url = url2;
            return this;
        }
    }

    private DcEntry(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException("expected sequence size of 2");
        }
        this.f228748url = Url.getInstance(aSN1Sequence.getObjectAt(0));
        this.cert = SequenceOfHashedId8.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DcEntry getInstance(Object obj2) {
        if (obj2 instanceof DcEntry) {
            return (DcEntry) obj2;
        }
        if (obj2 != null) {
            return new DcEntry(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public SequenceOfHashedId8 getCert() {
        return this.cert;
    }

    public Url getUrl() {
        return this.f228748url;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERSequence(new ASN1Encodable[]{this.f228748url, this.cert});
    }

    public DcEntry(Url url2, SequenceOfHashedId8 sequenceOfHashedId8) {
        this.f228748url = url2;
        this.cert = sequenceOfHashedId8;
    }
}
