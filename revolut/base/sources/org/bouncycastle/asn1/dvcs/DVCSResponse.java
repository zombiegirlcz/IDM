package org.bouncycastle.asn1.dvcs;

import java.io.IOException;
import okl.m;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class DVCSResponse extends ASN1Object implements ASN1Choice {
    private DVCSCertInfo dvCertInfo;
    private DVCSErrorNotice dvErrorNote;

    public DVCSResponse(DVCSCertInfo dVCSCertInfo) {
        this.dvCertInfo = dVCSCertInfo;
    }

    public static DVCSResponse getInstance(Object obj2) {
        if (obj2 == null || (obj2 instanceof DVCSResponse)) {
            return (DVCSResponse) obj2;
        }
        if (obj2 instanceof byte[]) {
            try {
                return getInstance(ASN1Primitive.fromByteArray((byte[]) obj2));
            } catch (IOException e) {
                throw new IllegalArgumentException(m.f(e, new StringBuilder("failed to construct sequence from byte[]: ")));
            }
        }
        if (obj2 instanceof ASN1Sequence) {
            return new DVCSResponse(DVCSCertInfo.getInstance(obj2));
        }
        if (obj2 instanceof ASN1TaggedObject) {
            return new DVCSResponse(DVCSErrorNotice.getInstance(ASN1TaggedObject.getInstance(obj2), false));
        }
        throw new IllegalArgumentException(a.g(obj2, "Couldn't convert from object to DVCSResponse: "));
    }

    public DVCSCertInfo getCertInfo() {
        return this.dvCertInfo;
    }

    public DVCSErrorNotice getErrorNotice() {
        return this.dvErrorNote;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        DVCSCertInfo dVCSCertInfo = this.dvCertInfo;
        return dVCSCertInfo != null ? dVCSCertInfo.toASN1Primitive() : new DERTaggedObject(false, 0, (ASN1Encodable) this.dvErrorNote);
    }

    public String toString() {
        StringBuilder sb6;
        String string;
        if (this.dvCertInfo != null) {
            sb6 = new StringBuilder("DVCSResponse {\ndvCertInfo: ");
            string = this.dvCertInfo.toString();
        } else {
            sb6 = new StringBuilder("DVCSResponse {\ndvErrorNote: ");
            string = this.dvErrorNote.toString();
        }
        sb6.append(string);
        sb6.append("}\n");
        return sb6.toString();
    }

    public DVCSResponse(DVCSErrorNotice dVCSErrorNotice) {
        this.dvErrorNote = dVCSErrorNotice;
    }

    public static DVCSResponse getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }
}
