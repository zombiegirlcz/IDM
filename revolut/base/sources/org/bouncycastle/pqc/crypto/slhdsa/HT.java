package org.bouncycastle.pqc.crypto.slhdsa;

import java.util.LinkedList;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
class HT {
    SLHDSAEngine engine;
    final byte[] htPubKey;
    private final byte[] pkSeed;
    private final byte[] skSeed;
    WotsPlus wots;

    public HT(SLHDSAEngine sLHDSAEngine, byte[] bArr, byte[] bArr2) {
        this.skSeed = bArr;
        this.pkSeed = bArr2;
        this.engine = sLHDSAEngine;
        this.wots = new WotsPlus(sLHDSAEngine);
        ADRS adrs = new ADRS();
        adrs.setLayerAddress(sLHDSAEngine.D - 1);
        adrs.setTreeAddress(0L);
        if (bArr != null) {
            this.htPubKey = xmss_PKgen(bArr, bArr2, adrs);
        } else {
            this.htPubKey = null;
        }
    }

    public byte[] sign(byte[] bArr, long j2, int i) {
        ADRS adrs = new ADRS();
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j2);
        HT ht5 = this;
        SIG_XMSS sig_xmssXmss_sign = ht5.xmss_sign(bArr, this.skSeed, i, this.pkSeed, adrs);
        int i2 = ht5.engine.D;
        SIG_XMSS[] sig_xmssArr = new SIG_XMSS[i2];
        sig_xmssArr[0] = sig_xmssXmss_sign;
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j2);
        byte[] bArrXmss_pkFromSig = ht5.xmss_pkFromSig(i, sig_xmssXmss_sign, bArr, ht5.pkSeed, adrs);
        int i3 = 1;
        while (true) {
            SLHDSAEngine sLHDSAEngine = ht5.engine;
            if (i3 >= sLHDSAEngine.D) {
                break;
            }
            int i5 = sLHDSAEngine.H_PRIME;
            int i6 = (int) (((long) ((1 << i5) - 1)) & j2);
            j2 >>>= i5;
            adrs.setLayerAddress(i3);
            adrs.setTreeAddress(j2);
            SIG_XMSS sig_xmssXmss_sign2 = ht5.xmss_sign(bArrXmss_pkFromSig, ht5.skSeed, i6, ht5.pkSeed, adrs);
            sig_xmssArr[i3] = sig_xmssXmss_sign2;
            if (i3 < ht5.engine.D - 1) {
                bArrXmss_pkFromSig = ht5.xmss_pkFromSig(i6, sig_xmssXmss_sign2, bArrXmss_pkFromSig, ht5.pkSeed, adrs);
            }
            i3++;
            ht5 = this;
        }
        byte[][] bArr2 = new byte[i2][];
        for (int i21 = 0; i21 != i2; i21++) {
            SIG_XMSS sig_xmss = sig_xmssArr[i21];
            bArr2[i21] = Arrays.concatenate(sig_xmss.f228866sig, Arrays.concatenate(sig_xmss.auth));
        }
        return Arrays.concatenate(bArr2);
    }

    public byte[] treehash(byte[] bArr, int i, int i2, byte[] bArr2, ADRS adrs) {
        if (((i >>> i2) << i2) != i) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        ADRS adrs2 = new ADRS(adrs);
        for (int i3 = 0; i3 < (1 << i2); i3++) {
            adrs2.setTypeAndClear(0);
            int i5 = i + i3;
            adrs2.setKeyPairAddress(i5);
            byte[] bArrPkGen = this.wots.pkGen(bArr, bArr2, adrs2);
            adrs2.setTypeAndClear(2);
            adrs2.setTreeHeight(1);
            adrs2.setTreeIndex(i5);
            int i6 = 1;
            while (!linkedList.isEmpty() && ((NodeEntry) linkedList.get(0)).nodeHeight == i6) {
                i5 = (i5 - 1) / 2;
                adrs2.setTreeIndex(i5);
                bArrPkGen = this.engine.H(bArr2, adrs2, ((NodeEntry) linkedList.remove(0)).nodeValue, bArrPkGen);
                i6++;
                adrs2.setTreeHeight(i6);
            }
            linkedList.add(0, new NodeEntry(bArrPkGen, i6));
        }
        return ((NodeEntry) linkedList.get(0)).nodeValue;
    }

    public boolean verify(byte[] bArr, SIG_XMSS[] sig_xmssArr, byte[] bArr2, long j2, int i, byte[] bArr3) {
        ADRS adrs = new ADRS();
        SIG_XMSS sig_xmss = sig_xmssArr[0];
        adrs.setLayerAddress(0);
        adrs.setTreeAddress(j2);
        HT ht5 = this;
        byte[] bArrXmss_pkFromSig = ht5.xmss_pkFromSig(i, sig_xmss, bArr, bArr2, adrs);
        int i2 = 1;
        while (true) {
            SLHDSAEngine sLHDSAEngine = ht5.engine;
            if (i2 >= sLHDSAEngine.D) {
                return Arrays.areEqual(bArr3, bArrXmss_pkFromSig);
            }
            int i3 = sLHDSAEngine.H_PRIME;
            int i5 = (int) (((long) ((1 << i3) - 1)) & j2);
            j2 >>>= i3;
            SIG_XMSS sig_xmss2 = sig_xmssArr[i2];
            adrs.setLayerAddress(i2);
            adrs.setTreeAddress(j2);
            bArrXmss_pkFromSig = ht5.xmss_pkFromSig(i5, sig_xmss2, bArrXmss_pkFromSig, bArr2, adrs);
            i2++;
            ht5 = this;
        }
    }

    public byte[] xmss_PKgen(byte[] bArr, byte[] bArr2, ADRS adrs) {
        return treehash(bArr, 0, this.engine.H_PRIME, bArr2, adrs);
    }

    public byte[] xmss_pkFromSig(int i, SIG_XMSS sig_xmss, byte[] bArr, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        int i2 = 0;
        adrs2.setTypeAndClear(0);
        adrs2.setKeyPairAddress(i);
        byte[] wOTSSig = sig_xmss.getWOTSSig();
        byte[][] xmssauth = sig_xmss.getXMSSAUTH();
        byte[] bArrPkFromSig = this.wots.pkFromSig(wOTSSig, bArr, bArr2, adrs2);
        adrs2.setTypeAndClear(2);
        adrs2.setTreeIndex(i);
        while (i2 < this.engine.H_PRIME) {
            int i3 = i2 + 1;
            adrs2.setTreeHeight(i3);
            if (((1 << i2) & i) == 0) {
                adrs2.setTreeIndex(adrs2.getTreeIndex() / 2);
                bArrPkFromSig = this.engine.H(bArr2, adrs2, bArrPkFromSig, xmssauth[i2]);
            } else {
                adrs2.setTreeIndex((adrs2.getTreeIndex() - 1) / 2);
                bArrPkFromSig = this.engine.H(bArr2, adrs2, xmssauth[i2], bArrPkFromSig);
            }
            i2 = i3;
        }
        return bArrPkFromSig;
    }

    public SIG_XMSS xmss_sign(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, ADRS adrs) {
        byte[][] bArr4 = new byte[this.engine.H_PRIME][];
        ADRS adrs2 = new ADRS(adrs);
        adrs2.setTypeAndClear(2);
        adrs2.setLayerAddress(adrs.getLayerAddress());
        adrs2.setTreeAddress(adrs.getTreeAddress());
        int i2 = 0;
        while (i2 < this.engine.H_PRIME) {
            byte[] bArr5 = bArr2;
            bArr4[i2] = treehash(bArr5, ((i >>> i2) ^ 1) << i2, i2, bArr3, adrs2);
            i2++;
            bArr2 = bArr5;
        }
        byte[] bArr6 = bArr2;
        ADRS adrs3 = new ADRS(adrs);
        adrs3.setTypeAndClear(0);
        adrs3.setKeyPairAddress(i);
        return new SIG_XMSS(this.wots.sign(bArr, bArr6, bArr3, adrs3), bArr4);
    }
}
