package org.bouncycastle.crypto.signers.slhdsa;

import com.google.common.primitives.UnsignedBytes;
import java.math.BigInteger;
import java.util.LinkedList;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
class Fors {
    SLHDSAEngine engine;

    public Fors(SLHDSAEngine sLHDSAEngine) {
        this.engine = sLHDSAEngine;
    }

    public static int[] base2B(byte[] bArr, int i, int i2) {
        int[] iArr = new int[i2];
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        int i3 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            while (i5 < i) {
                bigIntegerAdd = bigIntegerAdd.shiftLeft(8).add(BigInteger.valueOf(bArr[i3] & UnsignedBytes.MAX_VALUE));
                i3++;
                i5 += 8;
            }
            i5 -= i;
            iArr[i6] = bigIntegerAdd.shiftRight(i5).mod(BigInteger.valueOf(2L).pow(i)).intValue();
        }
        return iArr;
    }

    public byte[] pkFromSig(SIG_FORS[] sig_forsArr, byte[] bArr, byte[] bArr2, ADRS adrs) {
        byte[][] bArr3 = new byte[2][];
        SLHDSAEngine sLHDSAEngine = this.engine;
        int i = sLHDSAEngine.K;
        byte[][] bArr4 = new byte[i][];
        int[] iArrBase2B = base2B(bArr, sLHDSAEngine.A, i);
        for (int i2 = 0; i2 < this.engine.K; i2++) {
            int i3 = iArrBase2B[i2];
            byte[] sk = sig_forsArr[i2].getSK();
            adrs.setTreeHeight(0);
            adrs.setTreeIndex((i2 << this.engine.A) + i3);
            bArr3[0] = this.engine.F(bArr2, adrs, sk);
            byte[][] authPath = sig_forsArr[i2].getAuthPath();
            adrs.setTreeIndex((i2 << this.engine.A) + i3);
            int i5 = 0;
            while (i5 < this.engine.A) {
                int i6 = i5 + 1;
                adrs.setTreeHeight(i6);
                if (((1 << i5) & i3) == 0) {
                    adrs.setTreeIndex(adrs.getTreeIndex() / 2);
                    bArr3[1] = this.engine.H(bArr2, adrs, bArr3[0], authPath[i5]);
                } else {
                    adrs.setTreeIndex((adrs.getTreeIndex() - 1) / 2);
                    bArr3[1] = this.engine.H(bArr2, adrs, authPath[i5], bArr3[0]);
                }
                bArr3[0] = bArr3[1];
                i5 = i6;
            }
            bArr4[i2] = bArr3[0];
        }
        ADRS adrs2 = new ADRS(adrs);
        adrs2.setTypeAndClear(4);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr2, adrs2, Arrays.concatenate(bArr4));
    }

    public SIG_FORS[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        Fors fors = this;
        ADRS adrs2 = new ADRS(adrs);
        SLHDSAEngine sLHDSAEngine = fors.engine;
        int[] iArrBase2B = base2B(bArr, sLHDSAEngine.A, sLHDSAEngine.K);
        SIG_FORS[] sig_forsArr = new SIG_FORS[fors.engine.K];
        int i = 0;
        while (i < fors.engine.K) {
            int i2 = iArrBase2B[i];
            adrs2.setTypeAndClear(6);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setTreeHeight(0);
            adrs2.setTreeIndex((i << fors.engine.A) + i2);
            byte[] bArr4 = bArr2;
            byte[] bArr5 = bArr3;
            byte[] bArrPRF = fors.engine.PRF(bArr5, bArr4, adrs2);
            adrs2.changeType(3);
            byte[][] bArr6 = new byte[fors.engine.A][];
            int i3 = 0;
            while (true) {
                int i5 = fors.engine.A;
                if (i3 < i5) {
                    bArr6[i3] = fors.treehash(bArr4, (i << i5) + (((i2 >>> i3) ^ 1) << i3), i3, bArr5, adrs2);
                    i3++;
                    fors = this;
                    bArr4 = bArr2;
                    bArr5 = bArr3;
                }
            }
            sig_forsArr[i] = new SIG_FORS(bArrPRF, bArr6);
            i++;
            fors = this;
        }
        return sig_forsArr;
    }

    public byte[] treehash(byte[] bArr, int i, int i2, byte[] bArr2, ADRS adrs) {
        if (((i >>> i2) << i2) != i) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        ADRS adrs2 = new ADRS(adrs);
        for (int i3 = 0; i3 < (1 << i2); i3++) {
            adrs2.setTypeAndClear(6);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setTreeHeight(0);
            int i5 = i + i3;
            adrs2.setTreeIndex(i5);
            byte[] bArrPRF = this.engine.PRF(bArr2, bArr, adrs2);
            adrs2.changeType(3);
            byte[] bArrF = this.engine.F(bArr2, adrs2, bArrPRF);
            adrs2.setTreeHeight(1);
            int i6 = 1;
            while (!linkedList.isEmpty() && ((NodeEntry) linkedList.get(0)).nodeHeight == i6) {
                i5 = (i5 - 1) / 2;
                adrs2.setTreeIndex(i5);
                bArrF = this.engine.H(bArr2, adrs2, ((NodeEntry) linkedList.remove(0)).nodeValue, bArrF);
                i6++;
                adrs2.setTreeHeight(i6);
            }
            linkedList.add(0, new NodeEntry(bArrF, i6));
        }
        return ((NodeEntry) linkedList.get(0)).nodeValue;
    }
}
