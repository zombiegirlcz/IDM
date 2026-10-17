package org.bouncycastle.pqc.crypto.mldsa;

import a0.d;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
class PolyVecL {

    /* JADX INFO: renamed from: vec, reason: collision with root package name */
    private final Poly[] f228841vec;

    public PolyVecL() throws Exception {
        throw new Exception("Requires Parameter");
    }

    public void addPolyVecL(PolyVecL polyVecL) {
        for (int i = 0; i < this.f228841vec.length; i++) {
            getVectorIndex(i).addPoly(polyVecL.getVectorIndex(i));
        }
    }

    public boolean checkNorm(int i) {
        for (int i2 = 0; i2 < this.f228841vec.length; i2++) {
            if (getVectorIndex(i2).checkNorm(i)) {
                return true;
            }
        }
        return false;
    }

    public void copyTo(PolyVecL polyVecL) {
        int i = 0;
        while (true) {
            Poly[] polyArr = this.f228841vec;
            if (i >= polyArr.length) {
                return;
            }
            polyArr[i].copyTo(polyVecL.f228841vec[i]);
            i++;
        }
    }

    public Poly getVectorIndex(int i) {
        return this.f228841vec[i];
    }

    public void invNttToMont() {
        for (int i = 0; i < this.f228841vec.length; i++) {
            getVectorIndex(i).invNttToMont();
        }
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecL polyVecL) {
        for (int i = 0; i < this.f228841vec.length; i++) {
            getVectorIndex(i).pointwiseMontgomery(poly, polyVecL.getVectorIndex(i));
        }
    }

    public void polyVecNtt() {
        int i = 0;
        while (true) {
            Poly[] polyArr = this.f228841vec;
            if (i >= polyArr.length) {
                return;
            }
            polyArr[i].polyNtt();
            i++;
        }
    }

    public void reduce() {
        for (int i = 0; i < this.f228841vec.length; i++) {
            getVectorIndex(i).reduce();
        }
    }

    public String toString() {
        String strR = "\n[";
        for (int i = 0; i < this.f228841vec.length; i++) {
            strR = strR + "Inner Matrix " + i + " " + getVectorIndex(i).toString();
            if (i != this.f228841vec.length - 1) {
                strR = d.r(strR, ",\n");
            }
        }
        return d.r(strR, "]");
    }

    public void uniformBlocks(byte[] bArr, int i) {
        int i2 = 0;
        while (true) {
            Poly[] polyArr = this.f228841vec;
            if (i2 >= polyArr.length) {
                return;
            }
            polyArr[i2].uniformBlocks(bArr, (short) (i + i2));
            i2++;
        }
    }

    public void uniformEta(byte[] bArr, short s2) {
        int i = 0;
        while (i < this.f228841vec.length) {
            getVectorIndex(i).uniformEta(bArr, s2);
            i++;
            s2 = (short) (s2 + 1);
        }
    }

    public void uniformGamma1(byte[] bArr, short s2) {
        for (int i = 0; i < this.f228841vec.length; i++) {
            getVectorIndex(i).uniformGamma1(bArr, (short) ((this.f228841vec.length * s2) + i));
        }
    }

    public PolyVecL(MLDSAEngine mLDSAEngine) {
        int dilithiumL = mLDSAEngine.getDilithiumL();
        this.f228841vec = new Poly[dilithiumL];
        for (int i = 0; i < dilithiumL; i++) {
            this.f228841vec[i] = new Poly(mLDSAEngine);
        }
    }

    public String toString(String str) {
        StringBuilder sbL = a.l(str, ": ");
        sbL.append(toString());
        return sbL.toString();
    }
}
