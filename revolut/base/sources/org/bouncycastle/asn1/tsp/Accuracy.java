package org.bouncycastle.asn1.tsp;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;

/* JADX INFO: loaded from: classes14.dex */
public class Accuracy extends ASN1Object {
    protected static final int MAX_MICROS = 999;
    protected static final int MAX_MILLIS = 999;
    protected static final int MIN_MICROS = 1;
    protected static final int MIN_MILLIS = 1;
    private final ASN1Integer micros;
    private final ASN1Integer millis;
    private final ASN1Integer seconds;

    public Accuracy() {
        this.seconds = null;
        this.millis = null;
        this.micros = null;
    }

    public static Accuracy getInstance(Object obj2) {
        if (obj2 instanceof Accuracy) {
            return (Accuracy) obj2;
        }
        if (obj2 != null) {
            return new Accuracy(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public static Accuracy getTagged(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new Accuracy(ASN1Sequence.getTagged(aSN1TaggedObject, z));
    }

    private void validate() {
        int iIntValueExact;
        ASN1Integer aSN1Integer = this.millis;
        if (aSN1Integer != null && ((iIntValueExact = aSN1Integer.intValueExact()) < 1 || iIntValueExact > 999)) {
            throw new IllegalArgumentException("Invalid millis field : not in (1..999)");
        }
        ASN1Integer aSN1Integer2 = this.micros;
        if (aSN1Integer2 != null) {
            int iIntValueExact2 = aSN1Integer2.intValueExact();
            if (iIntValueExact2 < 1 || iIntValueExact2 > 999) {
                throw new IllegalArgumentException("Invalid micros field : not in (1..999)");
            }
        }
    }

    public ASN1Integer getMicros() {
        return this.micros;
    }

    public ASN1Integer getMillis() {
        return this.millis;
    }

    public ASN1Integer getSeconds() {
        return this.seconds;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        ASN1Integer aSN1Integer = this.seconds;
        if (aSN1Integer != null) {
            aSN1EncodableVector.add(aSN1Integer);
        }
        ASN1Integer aSN1Integer2 = this.millis;
        if (aSN1Integer2 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 0, (ASN1Encodable) aSN1Integer2));
        }
        ASN1Integer aSN1Integer3 = this.micros;
        if (aSN1Integer3 != null) {
            aSN1EncodableVector.add(new DERTaggedObject(false, 1, (ASN1Encodable) aSN1Integer3));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public Accuracy(ASN1Integer aSN1Integer, ASN1Integer aSN1Integer2, ASN1Integer aSN1Integer3) {
        this.seconds = aSN1Integer;
        this.millis = aSN1Integer2;
        this.micros = aSN1Integer3;
        validate();
    }

    public static Accuracy getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return new Accuracy(ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private Accuracy(org.bouncycastle.asn1.ASN1Sequence r7) {
        /*
            r6 = this;
            r6.<init>()
            int r0 = r7.size()
            if (r0 < 0) goto L59
            r1 = 3
            if (r0 > r1) goto L59
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 <= 0) goto L1d
            org.bouncycastle.asn1.ASN1Encodable r4 = r7.getObjectAt(r3)
            boolean r5 = r4 instanceof org.bouncycastle.asn1.ASN1Integer
            if (r5 == 0) goto L1d
            org.bouncycastle.asn1.ASN1Integer r4 = (org.bouncycastle.asn1.ASN1Integer) r4
            r5 = r2
            goto L1f
        L1d:
            r4 = r1
            r5 = r3
        L1f:
            r6.seconds = r4
            if (r5 >= r0) goto L34
            org.bouncycastle.asn1.ASN1Encodable r4 = r7.getObjectAt(r5)
            org.bouncycastle.asn1.ASN1TaggedObject r4 = org.bouncycastle.asn1.ASN1TaggedObject.getContextOptional(r4, r3)
            if (r4 == 0) goto L34
            int r5 = r5 + 1
            org.bouncycastle.asn1.ASN1Integer r4 = org.bouncycastle.asn1.ASN1Integer.getInstance(r4, r3)
            goto L35
        L34:
            r4 = r1
        L35:
            r6.millis = r4
            if (r5 >= r0) goto L49
            org.bouncycastle.asn1.ASN1Encodable r7 = r7.getObjectAt(r5)
            org.bouncycastle.asn1.ASN1TaggedObject r7 = org.bouncycastle.asn1.ASN1TaggedObject.getContextOptional(r7, r2)
            if (r7 == 0) goto L49
            int r5 = r5 + 1
            org.bouncycastle.asn1.ASN1Integer r1 = org.bouncycastle.asn1.ASN1Integer.getInstance(r7, r3)
        L49:
            r6.micros = r1
            if (r5 != r0) goto L51
            r6.validate()
            return
        L51:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unexpected elements in sequence"
            r7.<init>(r0)
            throw r7
        L59:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Bad sequence size: "
            java.lang.String r0 = a0.d.n(r1, r0)
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.tsp.Accuracy.<init>(org.bouncycastle.asn1.ASN1Sequence):void");
    }
}
