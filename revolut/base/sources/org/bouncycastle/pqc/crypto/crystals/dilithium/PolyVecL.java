package org.bouncycastle.pqc.crypto.crystals.dilithium;

import a0.d;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
class PolyVecL {
    private int dilithiumK;
    private int dilithiumL;
    private DilithiumEngine engine;
    private int mode;
    private int polyVecBytes;

    /* JADX INFO: renamed from: vec, reason: collision with root package name */
    Poly[] f228792vec;

    public PolyVecL() throws Exception {
        throw new Exception("Requires Parameter");
    }

    public void addPolyVecL(PolyVecL polyVecL) {
        for (int i = 0; i < this.dilithiumL; i++) {
            getVectorIndex(i).addPoly(polyVecL.getVectorIndex(i));
        }
    }

    public boolean checkNorm(int i) {
        for (int i2 = 0; i2 < this.dilithiumL; i2++) {
            if (getVectorIndex(i2).checkNorm(i)) {
                return true;
            }
        }
        return false;
    }

    public void copyPolyVecL(PolyVecL polyVecL) {
        for (int i = 0; i < this.dilithiumL; i++) {
            for (int i2 = 0; i2 < 256; i2++) {
                polyVecL.getVectorIndex(i).setCoeffIndex(i2, getVectorIndex(i).getCoeffIndex(i2));
            }
        }
    }

    public void expandMatrix(byte[] bArr, int i) {
        for (int i2 = 0; i2 < this.dilithiumL; i2++) {
            this.f228792vec[i2].uniformBlocks(bArr, (short) ((i << 8) + i2));
        }
    }

    public Poly getVectorIndex(int i) {
        return this.f228792vec[i];
    }

    public void invNttToMont() {
        for (int i = 0; i < this.dilithiumL; i++) {
            getVectorIndex(i).invNttToMont();
        }
    }

    public void pointwisePolyMontgomery(Poly poly, PolyVecL polyVecL) {
        for (int i = 0; i < this.dilithiumL; i++) {
            getVectorIndex(i).pointwiseMontgomery(poly, polyVecL.getVectorIndex(i));
        }
    }

    public void polyVecNtt() {
        for (int i = 0; i < this.dilithiumL; i++) {
            this.f228792vec[i].polyNtt();
        }
    }

    public void reduce() {
        for (int i = 0; i < this.dilithiumL; i++) {
            getVectorIndex(i).reduce();
        }
    }

    public String toString() {
        String strR = "\n[";
        for (int i = 0; i < this.dilithiumL; i++) {
            strR = strR + "Inner Matrix " + i + " " + getVectorIndex(i).toString();
            if (i != this.dilithiumL - 1) {
                strR = d.r(strR, ",\n");
            }
        }
        return d.r(strR, "]");
    }

    public void uniformEta(byte[] bArr, short s2) {
        int i = 0;
        while (i < this.dilithiumL) {
            getVectorIndex(i).uniformEta(bArr, s2);
            i++;
            s2 = (short) (s2 + 1);
        }
    }

    public void uniformGamma1(byte[] bArr, short s2) {
        for (int i = 0; i < this.dilithiumL; i++) {
            getVectorIndex(i).uniformGamma1(bArr, (short) ((this.dilithiumL * s2) + i));
        }
    }

    public PolyVecL(DilithiumEngine dilithiumEngine) {
        this.engine = dilithiumEngine;
        this.mode = dilithiumEngine.getDilithiumMode();
        this.dilithiumL = dilithiumEngine.getDilithiumL();
        this.dilithiumK = dilithiumEngine.getDilithiumK();
        this.f228792vec = new Poly[this.dilithiumL];
        for (int i = 0; i < this.dilithiumL; i++) {
            this.f228792vec[i] = new Poly(dilithiumEngine);
        }
    }

    public String toString(String str) {
        StringBuilder sbL = a.l(str, ": ");
        sbL.append(toString());
        return sbL.toString();
    }
}
