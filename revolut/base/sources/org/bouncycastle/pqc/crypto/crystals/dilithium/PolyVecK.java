package org.bouncycastle.pqc.crypto.crystals.dilithium;

import a0.d;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
class PolyVecK {
    private int dilithiumK;
    private int dilithiumL;
    private DilithiumEngine engine;
    private int mode;
    private int polyVecBytes;

    /* JADX INFO: renamed from: vec, reason: collision with root package name */
    Poly[] f228791vec;

    public PolyVecK() throws Exception {
        throw new Exception("Requires Parameter");
    }

    public void addPolyVecK(PolyVecK polyVecK) {
        for (int i = 0; i < this.dilithiumK; i++) {
            getVectorIndex(i).addPoly(polyVecK.getVectorIndex(i));
        }
    }

    public boolean checkNorm(int i) {
        for (int i2 = 0; i2 < this.dilithiumK; i2++) {
            if (getVectorIndex(i2).checkNorm(i)) {
                return true;
            }
        }
        return false;
    }

    public void conditionalAddQ() {
        for (int i = 0; i < this.dilithiumK; i++) {
            getVectorIndex(i).conditionalAddQ();
        }
    }

    public void decompose(PolyVecK polyVecK) {
        for (int i = 0; i < this.dilithiumK; i++) {
            getVectorIndex(i).decompose(polyVecK.getVectorIndex(i));
        }
    }

    public Poly getVectorIndex(int i) {
        return this.f228791vec[i];
    }

    public void invNttToMont() {
        for (int i = 0; i < this.dilithiumK; i++) {
            getVectorIndex(i).invNttToMont();
        }
    }

    public int makeHint(PolyVecK polyVecK, PolyVecK polyVecK2) {
        int iPolyMakeHint = 0;
        for (int i = 0; i < this.dilithiumK; i++) {
            iPolyMakeHint += getVectorIndex(i).polyMakeHint(polyVecK.getVectorIndex(i), polyVecK2.getVectorIndex(i));
        }
        return iPolyMakeHint;
    }

    public byte[] packW1() {
        byte[] bArr = new byte[this.dilithiumK * this.engine.getDilithiumPolyW1PackedBytes()];
        for (int i = 0; i < this.dilithiumK; i++) {
            System.arraycopy(getVectorIndex(i).w1Pack(), 0, bArr, this.engine.getDilithiumPolyW1PackedBytes() * i, this.engine.getDilithiumPolyW1PackedBytes());
        }
        return bArr;
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecK polyVecK) {
        for (int i = 0; i < this.dilithiumK; i++) {
            getVectorIndex(i).pointwiseMontgomery(poly, polyVecK.getVectorIndex(i));
        }
    }

    public void polyVecNtt() {
        for (int i = 0; i < this.dilithiumK; i++) {
            this.f228791vec[i].polyNtt();
        }
    }

    public void power2Round(PolyVecK polyVecK) {
        for (int i = 0; i < this.dilithiumK; i++) {
            getVectorIndex(i).power2Round(polyVecK.getVectorIndex(i));
        }
    }

    public void reduce() {
        for (int i = 0; i < this.dilithiumK; i++) {
            getVectorIndex(i).reduce();
        }
    }

    public void setVectorIndex(int i, Poly poly) {
        this.f228791vec[i] = poly;
    }

    public void shiftLeft() {
        for (int i = 0; i < this.dilithiumK; i++) {
            getVectorIndex(i).shiftLeft();
        }
    }

    public void subtract(PolyVecK polyVecK) {
        for (int i = 0; i < this.dilithiumK; i++) {
            getVectorIndex(i).subtract(polyVecK.getVectorIndex(i));
        }
    }

    public String toString() {
        String strR = "[";
        for (int i = 0; i < this.dilithiumK; i++) {
            strR = strR + i + " " + getVectorIndex(i).toString();
            if (i != this.dilithiumK - 1) {
                strR = d.r(strR, ",\n");
            }
        }
        return d.r(strR, "]");
    }

    public void uniformEta(byte[] bArr, short s2) {
        int i = 0;
        while (i < this.dilithiumK) {
            getVectorIndex(i).uniformEta(bArr, s2);
            i++;
            s2 = (short) (s2 + 1);
        }
    }

    public void useHint(PolyVecK polyVecK, PolyVecK polyVecK2) {
        for (int i = 0; i < this.dilithiumK; i++) {
            getVectorIndex(i).polyUseHint(polyVecK.getVectorIndex(i), polyVecK2.getVectorIndex(i));
        }
    }

    public PolyVecK(DilithiumEngine dilithiumEngine) {
        this.engine = dilithiumEngine;
        this.mode = dilithiumEngine.getDilithiumMode();
        this.dilithiumK = dilithiumEngine.getDilithiumK();
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.f228791vec = new Poly[this.dilithiumK];
        for (int i = 0; i < this.dilithiumK; i++) {
            this.f228791vec[i] = new Poly(dilithiumEngine);
        }
    }

    public String toString(String str) {
        StringBuilder sbL = a.l(str, ": ");
        sbL.append(toString());
        return sbL.toString();
    }
}
