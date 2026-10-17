package org.bouncycastle.asn1.ua;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: loaded from: classes14.dex */
public class DSTU4145BinaryField extends ASN1Object {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f228209j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f228210l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f228211m;

    public DSTU4145BinaryField(int i, int i2) {
        this(i, i2, 0, 0);
    }

    public static DSTU4145BinaryField getInstance(Object obj2) {
        if (obj2 instanceof DSTU4145BinaryField) {
            return (DSTU4145BinaryField) obj2;
        }
        if (obj2 != null) {
            return new DSTU4145BinaryField(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public int getK1() {
        return this.k;
    }

    public int getK2() {
        return this.f228209j;
    }

    public int getK3() {
        return this.f228210l;
    }

    public int getM() {
        return this.f228211m;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(ASN1Integer.valueOf(this.f228211m));
        if (this.f228209j == 0) {
            aSN1EncodableVector.add(ASN1Integer.valueOf(this.k));
        } else {
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(3);
            aSN1EncodableVector2.add(ASN1Integer.valueOf(this.k));
            aSN1EncodableVector2.add(ASN1Integer.valueOf(this.f228209j));
            aSN1EncodableVector2.add(ASN1Integer.valueOf(this.f228210l));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DSTU4145BinaryField(int i, int i2, int i3, int i5) {
        this.f228211m = i;
        this.k = i2;
        this.f228209j = i3;
        this.f228210l = i5;
    }

    private DSTU4145BinaryField(ASN1Sequence aSN1Sequence) {
        this.f228211m = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).intPositiveValueExact();
        if (aSN1Sequence.getObjectAt(1) instanceof ASN1Integer) {
            this.k = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).intPositiveValueExact();
        } else {
            if (!(aSN1Sequence.getObjectAt(1) instanceof ASN1Sequence)) {
                throw new IllegalArgumentException("object parse error");
            }
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
            this.k = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(0)).intPositiveValueExact();
            this.f228209j = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(1)).intPositiveValueExact();
            this.f228210l = ASN1Integer.getInstance(aSN1Sequence2.getObjectAt(2)).intPositiveValueExact();
        }
    }
}
