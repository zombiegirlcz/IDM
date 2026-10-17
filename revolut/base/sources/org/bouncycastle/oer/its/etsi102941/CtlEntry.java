package org.bouncycastle.oer.its.etsi102941;

import a0.d;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes14.dex */
public class CtlEntry extends ASN1Object implements ASN1Choice {

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    public static final int f228743aa = 2;
    public static final int dc = 3;

    /* JADX INFO: renamed from: ea, reason: collision with root package name */
    public static final int f228744ea = 1;

    /* JADX INFO: renamed from: rca, reason: collision with root package name */
    public static final int f228745rca = 0;

    /* JADX INFO: renamed from: tlm, reason: collision with root package name */
    public static final int f228746tlm = 4;
    private final int choice;
    private final ASN1Encodable ctlEntry;

    public CtlEntry(int i, ASN1Encodable aSN1Encodable) {
        this.choice = i;
        this.ctlEntry = aSN1Encodable;
    }

    public static CtlEntry aa(AaEntry aaEntry) {
        return new CtlEntry(2, aaEntry);
    }

    public static CtlEntry dc(DcEntry dcEntry) {
        return new CtlEntry(3, dcEntry);
    }

    public static CtlEntry ea(EaEntry eaEntry) {
        return new CtlEntry(1, eaEntry);
    }

    public static CtlEntry getInstance(Object obj2) {
        if (obj2 instanceof CtlEntry) {
            return (CtlEntry) obj2;
        }
        if (obj2 != null) {
            return new CtlEntry(ASN1TaggedObject.getContextInstance(obj2));
        }
        return null;
    }

    public static CtlEntry rca(RootCaEntry rootCaEntry) {
        return new CtlEntry(0, rootCaEntry);
    }

    public static CtlEntry tlm(TlmEntry tlmEntry) {
        return new CtlEntry(4, tlmEntry);
    }

    public int getChoice() {
        return this.choice;
    }

    public ASN1Encodable getCtlEntry() {
        return this.ctlEntry;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return new DERTaggedObject(this.choice, this.ctlEntry);
    }

    private CtlEntry(ASN1TaggedObject aSN1TaggedObject) {
        int tagNo = aSN1TaggedObject.getTagNo();
        this.choice = tagNo;
        if (tagNo == 0) {
            this.ctlEntry = RootCaEntry.getInstance(aSN1TaggedObject.getExplicitBaseObject());
            return;
        }
        if (tagNo == 1) {
            this.ctlEntry = EaEntry.getInstance(aSN1TaggedObject.getExplicitBaseObject());
            return;
        }
        if (tagNo == 2) {
            this.ctlEntry = AaEntry.getInstance(aSN1TaggedObject.getExplicitBaseObject());
        } else if (tagNo == 3) {
            this.ctlEntry = DcEntry.getInstance(aSN1TaggedObject.getExplicitBaseObject());
        } else {
            if (tagNo != 4) {
                throw new IllegalArgumentException(d.n("invalid choice value ", tagNo));
            }
            this.ctlEntry = TlmEntry.getInstance(aSN1TaggedObject.getExplicitBaseObject());
        }
    }
}
