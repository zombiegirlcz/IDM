package org.bouncycastle.asn1.x509;

import j6.a;
import okl.m;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes14.dex */
public class DistributionPoint extends ASN1Object {
    GeneralNames cRLIssuer;
    DistributionPointName distributionPoint;
    ReasonFlags reasons;

    public DistributionPoint(ASN1Sequence aSN1Sequence) {
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            ASN1TaggedObject aSN1TaggedObject = ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i));
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.distributionPoint = DistributionPointName.getInstance(aSN1TaggedObject, true);
            } else if (tagNo == 1) {
                this.reasons = new ReasonFlags(ASN1BitString.getInstance(aSN1TaggedObject, false));
            } else {
                if (tagNo != 2) {
                    throw new IllegalArgumentException(m.o(aSN1TaggedObject, new StringBuilder("Unknown tag encountered in structure: ")));
                }
                this.cRLIssuer = GeneralNames.getInstance(aSN1TaggedObject, false);
            }
        }
    }

    private void appendObject(StringBuilder sb6, String str, String str2, String str3) {
        a.D(sb6, "    ", str2, ":", str);
        a.D(sb6, "    ", "    ", str3, str);
    }

    public static DistributionPoint getInstance(Object obj2) {
        if (obj2 == null || (obj2 instanceof DistributionPoint)) {
            return (DistributionPoint) obj2;
        }
        if (obj2 instanceof ASN1Sequence) {
            return new DistributionPoint((ASN1Sequence) obj2);
        }
        throw new IllegalArgumentException(v0.a.g(obj2, "Invalid DistributionPoint: "));
    }

    public GeneralNames getCRLIssuer() {
        return this.cRLIssuer;
    }

    public DistributionPointName getDistributionPoint() {
        return this.distributionPoint;
    }

    public ReasonFlags getReasons() {
        return this.reasons;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        DistributionPointName distributionPointName = this.distributionPoint;
        if (distributionPointName != null) {
            aSN1EncodableVector.add(new DERTaggedObject(0, distributionPointName));
        }
        ReasonFlags reasonFlags = this.reasons;
        if (reasonFlags != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, (ASN1Encodable) reasonFlags));
        }
        GeneralNames generalNames = this.cRLIssuer;
        if (generalNames != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 2, (ASN1Encodable) generalNames));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public String toString() {
        String strLineSeparator = Strings.lineSeparator();
        StringBuilder sbL = v0.a.l("DistributionPoint: [", strLineSeparator);
        DistributionPointName distributionPointName = this.distributionPoint;
        if (distributionPointName != null) {
            appendObject(sbL, strLineSeparator, "distributionPoint", distributionPointName.toString());
        }
        ReasonFlags reasonFlags = this.reasons;
        if (reasonFlags != null) {
            appendObject(sbL, strLineSeparator, "reasons", reasonFlags.toString());
        }
        GeneralNames generalNames = this.cRLIssuer;
        if (generalNames != null) {
            appendObject(sbL, strLineSeparator, "cRLIssuer", generalNames.toString());
        }
        return v0.a.i(sbL, "]", strLineSeparator);
    }

    public DistributionPoint(DistributionPointName distributionPointName, ReasonFlags reasonFlags, GeneralNames generalNames) {
        this.distributionPoint = distributionPointName;
        this.reasons = reasonFlags;
        this.cRLIssuer = generalNames;
    }

    public static DistributionPoint getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }
}
