package org.bouncycastle.crypto.signers.mldsa;

import a0.d;
import p.a;

/* JADX INFO: loaded from: classes14.dex */
class PolyVecMatrix {
    private final PolyVecL[] matrix;

    public PolyVecMatrix(MLDSAEngine mLDSAEngine) {
        int dilithiumK = mLDSAEngine.getDilithiumK();
        this.matrix = new PolyVecL[dilithiumK];
        for (int i = 0; i < dilithiumK; i++) {
            this.matrix[i] = new PolyVecL(mLDSAEngine);
        }
    }

    private String addString() {
        String strR = "[";
        int i = 0;
        while (i < this.matrix.length) {
            StringBuilder sbS = a.s(strR + "Outer Matrix " + i + " [");
            sbS.append(this.matrix[i].toString());
            String string = sbS.toString();
            strR = i == this.matrix.length + (-1) ? d.r(string, "]\n") : d.r(string, "],\n");
            i++;
        }
        return d.r(strR, "]\n");
    }

    public void expandMatrix(byte[] bArr) {
        int i = 0;
        while (true) {
            PolyVecL[] polyVecLArr = this.matrix;
            if (i >= polyVecLArr.length) {
                return;
            }
            polyVecLArr[i].uniformBlocks(bArr, i << 8);
            i++;
        }
    }

    public void pointwiseMontgomery(PolyVecK polyVecK, PolyVecL polyVecL) {
        for (int i = 0; i < this.matrix.length; i++) {
            polyVecK.getVectorIndex(i).pointwiseAccountMontgomery(this.matrix[i], polyVecL);
        }
    }

    public String toString(String str) {
        return str.concat(": \n" + addString());
    }
}
