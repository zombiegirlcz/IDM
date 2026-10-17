package org.bouncycastle.pqc.legacy.sphincsplus;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes14.dex */
class WotsPlus {
    private final SPHINCSPlusEngine engine;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f228948w;

    public WotsPlus(SPHINCSPlusEngine sPHINCSPlusEngine) {
        this.engine = sPHINCSPlusEngine;
        this.f228948w = sPHINCSPlusEngine.WOTS_W;
    }

    public void base_w(byte[] bArr, int i, int i2, int[] iArr, int i3, int i5) {
        int i6 = 0;
        int i21 = 0;
        int i22 = 0;
        while (i6 < i5) {
            if (i21 == 0) {
                i21 += 8;
                i22 = bArr[i];
                i++;
            }
            i21 -= this.engine.WOTS_LOGW;
            iArr[i3] = (i22 >>> i21) & (i2 - 1);
            i6++;
            i3++;
        }
    }

    public byte[] chain(byte[] bArr, int i, int i2, byte[] bArr2, ADRS adrs) {
        if (i2 == 0) {
            return Arrays.clone(bArr);
        }
        if (i + i2 > this.f228948w - 1) {
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            adrs.setHashAddress(i + i3);
            bArr = this.engine.F(bArr2, adrs, bArr);
        }
        return bArr;
    }

    public byte[] pkFromSig(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        SPHINCSPlusEngine sPHINCSPlusEngine;
        ADRS adrs2 = adrs;
        ADRS adrs3 = new ADRS(adrs2);
        SPHINCSPlusEngine sPHINCSPlusEngine2 = this.engine;
        int[] iArr = new int[sPHINCSPlusEngine2.WOTS_LEN];
        base_w(bArr2, 0, this.f228948w, iArr, 0, sPHINCSPlusEngine2.WOTS_LEN1);
        int i = 0;
        int i2 = 0;
        while (true) {
            sPHINCSPlusEngine = this.engine;
            if (i >= sPHINCSPlusEngine.WOTS_LEN1) {
                break;
            }
            i2 += (this.f228948w - 1) - iArr[i];
            i++;
        }
        int i3 = sPHINCSPlusEngine.WOTS_LEN2;
        int i5 = sPHINCSPlusEngine.WOTS_LOGW;
        byte[] bArrIntToBigEndian = Pack.intToBigEndian(i2 << (8 - ((i3 * i5) % 8)));
        int i6 = 4 - (((i3 * i5) + 7) / 8);
        int i21 = this.f228948w;
        SPHINCSPlusEngine sPHINCSPlusEngine3 = this.engine;
        base_w(bArrIntToBigEndian, i6, i21, iArr, sPHINCSPlusEngine3.WOTS_LEN1, sPHINCSPlusEngine3.WOTS_LEN2);
        SPHINCSPlusEngine sPHINCSPlusEngine4 = this.engine;
        byte[] bArr4 = new byte[sPHINCSPlusEngine4.N];
        byte[][] bArr5 = new byte[sPHINCSPlusEngine4.WOTS_LEN][];
        int i22 = 0;
        while (i22 < this.engine.WOTS_LEN) {
            adrs2.setChainAddress(i22);
            int i32 = this.engine.N;
            System.arraycopy(bArr, i22 * i32, bArr4, 0, i32);
            byte[] bArr6 = bArr4;
            int i33 = iArr[i22];
            bArr5[i22] = chain(bArr6, i33, (this.f228948w - 1) - i33, bArr3, adrs2);
            i22++;
            adrs2 = adrs;
            bArr4 = bArr6;
        }
        adrs3.setTypeAndClear(1);
        adrs3.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr3, adrs3, Arrays.concatenate(bArr5));
    }

    public byte[] pkGen(byte[] bArr, byte[] bArr2, ADRS adrs) {
        ADRS adrs2 = new ADRS(adrs);
        byte[][] bArr3 = new byte[this.engine.WOTS_LEN][];
        int i = 0;
        while (i < this.engine.WOTS_LEN) {
            ADRS adrs3 = new ADRS(adrs);
            adrs3.setTypeAndClear(5);
            adrs3.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs3.setChainAddress(i);
            adrs3.setHashAddress(0);
            byte[] bArrPRF = this.engine.PRF(bArr2, bArr, adrs3);
            adrs3.setTypeAndClear(0);
            adrs3.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs3.setChainAddress(i);
            adrs3.setHashAddress(0);
            byte[] bArr4 = bArr2;
            bArr3[i] = chain(bArrPRF, 0, this.f228948w - 1, bArr4, adrs3);
            i++;
            bArr2 = bArr4;
        }
        adrs2.setTypeAndClear(1);
        adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
        return this.engine.T_l(bArr2, adrs2, Arrays.concatenate(bArr3));
    }

    public byte[] sign(byte[] bArr, byte[] bArr2, byte[] bArr3, ADRS adrs) {
        SPHINCSPlusEngine sPHINCSPlusEngine;
        ADRS adrs2 = new ADRS(adrs);
        SPHINCSPlusEngine sPHINCSPlusEngine2 = this.engine;
        int[] iArr = new int[sPHINCSPlusEngine2.WOTS_LEN];
        base_w(bArr, 0, this.f228948w, iArr, 0, sPHINCSPlusEngine2.WOTS_LEN1);
        int i = 0;
        int i2 = 0;
        while (true) {
            sPHINCSPlusEngine = this.engine;
            if (i >= sPHINCSPlusEngine.WOTS_LEN1) {
                break;
            }
            i2 += (this.f228948w - 1) - iArr[i];
            i++;
        }
        int i3 = sPHINCSPlusEngine.WOTS_LOGW;
        if (i3 % 8 != 0) {
            i2 <<= 8 - ((sPHINCSPlusEngine.WOTS_LEN2 * i3) % 8);
        }
        int i5 = ((sPHINCSPlusEngine.WOTS_LEN2 * i3) + 7) / 8;
        byte[] bArrIntToBigEndian = Pack.intToBigEndian(i2);
        int i6 = 4 - i5;
        int i21 = this.f228948w;
        SPHINCSPlusEngine sPHINCSPlusEngine3 = this.engine;
        base_w(bArrIntToBigEndian, i6, i21, iArr, sPHINCSPlusEngine3.WOTS_LEN1, sPHINCSPlusEngine3.WOTS_LEN2);
        byte[][] bArr4 = new byte[this.engine.WOTS_LEN][];
        for (int i22 = 0; i22 < this.engine.WOTS_LEN; i22++) {
            adrs2.setTypeAndClear(5);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setChainAddress(i22);
            adrs2.setHashAddress(0);
            byte[] bArrPRF = this.engine.PRF(bArr3, bArr2, adrs2);
            adrs2.setTypeAndClear(0);
            adrs2.setKeyPairAddress(adrs.getKeyPairAddress());
            adrs2.setChainAddress(i22);
            adrs2.setHashAddress(0);
            bArr4[i22] = chain(bArrPRF, 0, iArr[i22], bArr3, adrs2);
        }
        return Arrays.concatenate(bArr4);
    }
}
