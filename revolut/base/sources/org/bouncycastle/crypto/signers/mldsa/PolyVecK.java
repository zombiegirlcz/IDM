package org.bouncycastle.crypto.signers.mldsa;

import a0.d;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
class PolyVecK {

    /* JADX INFO: renamed from: vec, reason: collision with root package name */
    private final Poly[] f228570vec;

    public PolyVecK(MLDSAEngine mLDSAEngine) {
        int dilithiumK = mLDSAEngine.getDilithiumK();
        this.f228570vec = new Poly[dilithiumK];
        for (int i = 0; i < dilithiumK; i++) {
            this.f228570vec[i] = new Poly(mLDSAEngine);
        }
    }

    public void addPolyVecK(PolyVecK polyVecK) {
        for (int i = 0; i < this.f228570vec.length; i++) {
            getVectorIndex(i).addPoly(polyVecK.getVectorIndex(i));
        }
    }

    public boolean checkNorm(int i) {
        for (int i2 = 0; i2 < this.f228570vec.length; i2++) {
            if (getVectorIndex(i2).checkNorm(i)) {
                return true;
            }
        }
        return false;
    }

    public void conditionalAddQ() {
        for (int i = 0; i < this.f228570vec.length; i++) {
            getVectorIndex(i).conditionalAddQ();
        }
    }

    public void decompose(PolyVecK polyVecK) {
        for (int i = 0; i < this.f228570vec.length; i++) {
            getVectorIndex(i).decompose(polyVecK.getVectorIndex(i));
        }
    }

    public Poly getVectorIndex(int i) {
        return this.f228570vec[i];
    }

    public void invNttToMont() {
        for (int i = 0; i < this.f228570vec.length; i++) {
            getVectorIndex(i).invNttToMont();
        }
    }

    public int makeHint(PolyVecK polyVecK, PolyVecK polyVecK2) {
        int iPolyMakeHint = 0;
        for (int i = 0; i < this.f228570vec.length; i++) {
            iPolyMakeHint += getVectorIndex(i).polyMakeHint(polyVecK.getVectorIndex(i), polyVecK2.getVectorIndex(i));
        }
        return iPolyMakeHint;
    }

    public void packW1(MLDSAEngine mLDSAEngine, byte[] bArr, int i) {
        for (int i2 = 0; i2 < this.f228570vec.length; i2++) {
            getVectorIndex(i2).packW1(bArr, (mLDSAEngine.getDilithiumPolyW1PackedBytes() * i2) + i);
        }
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecK polyVecK) {
        for (int i = 0; i < this.f228570vec.length; i++) {
            getVectorIndex(i).pointwiseMontgomery(poly, polyVecK.getVectorIndex(i));
        }
    }

    public void polyVecNtt() {
        int i = 0;
        while (true) {
            Poly[] polyArr = this.f228570vec;
            if (i >= polyArr.length) {
                return;
            }
            polyArr[i].polyNtt();
            i++;
        }
    }

    public void power2Round(PolyVecK polyVecK) {
        for (int i = 0; i < this.f228570vec.length; i++) {
            getVectorIndex(i).power2Round(polyVecK.getVectorIndex(i));
        }
    }

    public void reduce() {
        for (int i = 0; i < this.f228570vec.length; i++) {
            getVectorIndex(i).reduce();
        }
    }

    public void setVectorIndex(int i, Poly poly) {
        this.f228570vec[i] = poly;
    }

    public void shiftLeft() {
        for (int i = 0; i < this.f228570vec.length; i++) {
            getVectorIndex(i).shiftLeft();
        }
    }

    public void subtract(PolyVecK polyVecK) {
        for (int i = 0; i < this.f228570vec.length; i++) {
            getVectorIndex(i).subtract(polyVecK.getVectorIndex(i));
        }
    }

    public String toString() {
        String strR = "[";
        for (int i = 0; i < this.f228570vec.length; i++) {
            strR = strR + i + " " + getVectorIndex(i).toString();
            if (i != this.f228570vec.length - 1) {
                strR = d.r(strR, ",\n");
            }
        }
        return d.r(strR, "]");
    }

    public void uniformEta(byte[] bArr, short s2) {
        int i = 0;
        while (true) {
            Poly[] polyArr = this.f228570vec;
            if (i >= polyArr.length) {
                return;
            }
            polyArr[i].uniformEta(bArr, s2);
            i++;
            s2 = (short) (s2 + 1);
        }
    }

    public void useHint(PolyVecK polyVecK, PolyVecK polyVecK2) {
        for (int i = 0; i < this.f228570vec.length; i++) {
            getVectorIndex(i).polyUseHint(polyVecK.getVectorIndex(i), polyVecK2.getVectorIndex(i));
        }
    }

    public String toString(String str) {
        StringBuilder sbL = a.l(str, ": ");
        sbL.append(toString());
        return sbL.toString();
    }
}
