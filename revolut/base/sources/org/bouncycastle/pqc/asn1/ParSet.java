package org.bouncycastle.pqc.asn1;

import a0.d;
import okl.m;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class ParSet extends ASN1Object {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f228776h;
    private int[] k;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f228777t;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int[] f228778w;

    public ParSet(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        this.f228777t = i;
        this.f228776h = iArr;
        this.f228778w = iArr2;
        this.k = iArr3;
    }

    private static int checkBigIntegerInIntRangeAndPositive(ASN1Encodable aSN1Encodable) {
        int iIntValueExact = ((ASN1Integer) aSN1Encodable).intValueExact();
        if (iIntValueExact > 0) {
            return iIntValueExact;
        }
        throw new IllegalArgumentException(d.n("BigInteger not in Range: ", iIntValueExact));
    }

    public static ParSet getInstance(Object obj2) {
        if (obj2 instanceof ParSet) {
            return (ParSet) obj2;
        }
        if (obj2 != null) {
            return new ParSet(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public int[] getH() {
        return Arrays.clone(this.f228776h);
    }

    public int[] getK() {
        return Arrays.clone(this.k);
    }

    public int getT() {
        return this.f228777t;
    }

    public int[] getW() {
        return Arrays.clone(this.f228778w);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        int i = 0;
        while (true) {
            int[] iArr = this.f228776h;
            if (i >= iArr.length) {
                ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
                aSN1EncodableVector4.add(ASN1Integer.valueOf(this.f228777t));
                aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector));
                aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector2));
                aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector3));
                return new DERSequence(aSN1EncodableVector4);
            }
            aSN1EncodableVector.add(ASN1Integer.valueOf(iArr[i]));
            aSN1EncodableVector2.add(ASN1Integer.valueOf(this.f228778w[i]));
            aSN1EncodableVector3.add(ASN1Integer.valueOf(this.k[i]));
            i++;
        }
    }

    private ParSet(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 4) {
            throw new IllegalArgumentException(m.n(aSN1Sequence, new StringBuilder("sie of seqOfParams = ")));
        }
        this.f228777t = checkBigIntegerInIntRangeAndPositive(aSN1Sequence.getObjectAt(0));
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        if (aSN1Sequence2.size() != this.f228777t || aSN1Sequence3.size() != this.f228777t || aSN1Sequence4.size() != this.f228777t) {
            throw new IllegalArgumentException("invalid size of sequences");
        }
        this.f228776h = new int[aSN1Sequence2.size()];
        this.f228778w = new int[aSN1Sequence3.size()];
        this.k = new int[aSN1Sequence4.size()];
        for (int i = 0; i < this.f228777t; i++) {
            this.f228776h[i] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence2.getObjectAt(i));
            this.f228778w[i] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence3.getObjectAt(i));
            this.k[i] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence4.getObjectAt(i));
        }
    }
}
