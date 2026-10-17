package org.bouncycastle.pqc.legacy.sphincsplus;

import java.util.LinkedList;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
class Fors {
    SPHINCSPlusEngine engine;

    public Fors(SPHINCSPlusEngine sPHINCSPlusEngine) {
        this.engine = sPHINCSPlusEngine;
    }

    public static int[] message_to_idxs(byte[] bArr, int i, int i2) {
        int[] iArr = new int[i];
        int i3 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            iArr[i5] = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                iArr[i5] = iArr[i5] ^ (((bArr[i3 >> 3] >> (i3 & 7)) & 1) << i6);
                i3++;
            }
        }
        return iArr;
    }

    public byte[] pkFromSig(SIG_FORS[] sig_forsArr, byte[] bArr, byte[] bArr2, ADRS adrs) {
        int i;
        int i2 = 2;
        byte[][] bArr3 = new byte[2][];
        SPHINCSPlusEngine sPHINCSPlusEngine = this.engine;
        int i3 = sPHINCSPlusEngine.K;
        byte[][] bArr4 = new byte[i3][];
        int i5 = sPHINCSPlusEngine.T;
        int[] iArrMessage_to_idxs = message_to_idxs(bArr, i3, sPHINCSPlusEngine.A);
        int i6 = 0;
        while (i6 < this.engine.K) {
            int i21 = iArrMessage_to_idxs[i6];
            byte[] sk = sig_forsArr[i6].getSK();
            adrs.setTreeHeight(0);
            int i22 = (i6 * i5) + i21;
            adrs.setTreeIndex(i22);
            bArr3[0] = this.engine.F(bArr2, adrs, sk);
            byte[][] authPath = sig_forsArr[i6].getAuthPath();
            adrs.setTreeIndex(i22);
            int i32 = 0;
            while (i32 < this.engine.A) {
                int i33 = i32 + 1;
                adrs.setTreeHeight(i33);
                if ((i21 / (1 << i32)) % i2 == 0) {
                    adrs.setTreeIndex(adrs.getTreeIndex() / i2);
                    i = i2;
                    bArr3[1] = this.engine.H(bArr2, adrs, bArr3[0], authPath[i32]);
                } else {
                    i = i2;
                    adrs.setTreeIndex((adrs.getTreeIndex() - 1) / 2);
                    bArr3[1] = this.engine.H(bArr2, adrs, authPath[i32], bArr3[0]);
                }
                bArr3[0] = bArr3[1];
                i32 = i33;
                i2 = i;
            }
            bArr4[i6] = bArr3[0];
            i6++;
            i2 = i2;
        }
        ADRS adrs2 = new ADRS(adrs);
        adrs2.setTypeAndClear(4);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr2, adrs2, Arrays.concatenate(bArr4));
    }

    public SIG_FORS[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        Fors fors = this;
        ADRS adrs2 = new ADRS(adrs);
        SPHINCSPlusEngine sPHINCSPlusEngine = fors.engine;
        int[] iArrMessage_to_idxs = message_to_idxs(bArr, sPHINCSPlusEngine.K, sPHINCSPlusEngine.A);
        SPHINCSPlusEngine sPHINCSPlusEngine2 = fors.engine;
        SIG_FORS[] sig_forsArr = new SIG_FORS[sPHINCSPlusEngine2.K];
        int i = sPHINCSPlusEngine2.T;
        int i2 = 0;
        while (i2 < fors.engine.K) {
            int i3 = iArrMessage_to_idxs[i2];
            adrs2.setTypeAndClear(6);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setTreeHeight(0);
            int i5 = i2 * i;
            adrs2.setTreeIndex(i5 + i3);
            byte[] bArr4 = bArr2;
            byte[] bArr5 = bArr3;
            byte[] bArrPRF = fors.engine.PRF(bArr5, bArr4, adrs2);
            adrs2.changeType(3);
            byte[][] bArr6 = new byte[fors.engine.A][];
            int i6 = 0;
            while (i6 < fors.engine.A) {
                int i21 = 1 << i6;
                bArr6[i6] = fors.treehash(bArr4, (((i3 / i21) ^ 1) * i21) + i5, i6, bArr5, adrs2);
                i6++;
                fors = this;
                bArr4 = bArr2;
                bArr5 = bArr3;
            }
            sig_forsArr[i2] = new SIG_FORS(bArrPRF, bArr6);
            i2++;
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
