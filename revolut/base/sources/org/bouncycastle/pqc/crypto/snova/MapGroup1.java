package org.bouncycastle.pqc.crypto.snova;

import java.lang.reflect.Array;
import org.bouncycastle.util.GF16;

/* JADX INFO: loaded from: classes14.dex */
class MapGroup1 {
    public final byte[][][] aAlpha;
    public final byte[][][] bAlpha;

    /* JADX INFO: renamed from: p11, reason: collision with root package name */
    public final byte[][][][] f228878p11;

    /* JADX INFO: renamed from: p12, reason: collision with root package name */
    public final byte[][][][] f228879p12;

    /* JADX INFO: renamed from: p21, reason: collision with root package name */
    public final byte[][][][] f228880p21;
    public final byte[][][] qAlpha1;
    public final byte[][][] qAlpha2;

    public MapGroup1(SnovaParameters snovaParameters) {
        int m3 = snovaParameters.getM();
        int v = snovaParameters.getV();
        int o = snovaParameters.getO();
        int alpha = snovaParameters.getAlpha();
        int lsq = snovaParameters.getLsq();
        Class cls = Byte.TYPE;
        this.f228878p11 = (byte[][][][]) Array.newInstance((Class<?>) cls, m3, v, v, lsq);
        this.f228879p12 = (byte[][][][]) Array.newInstance((Class<?>) cls, m3, v, o, lsq);
        this.f228880p21 = (byte[][][][]) Array.newInstance((Class<?>) cls, m3, o, v, lsq);
        this.aAlpha = (byte[][][]) Array.newInstance((Class<?>) cls, m3, alpha, lsq);
        this.bAlpha = (byte[][][]) Array.newInstance((Class<?>) cls, m3, alpha, lsq);
        this.qAlpha1 = (byte[][][]) Array.newInstance((Class<?>) cls, m3, alpha, lsq);
        this.qAlpha2 = (byte[][][]) Array.newInstance((Class<?>) cls, m3, alpha, lsq);
    }

    private static int decodeAlpha(byte[] bArr, int i, byte[][][] bArr2, int i2) {
        int iDecodeArray = 0;
        for (byte[][] bArr3 : bArr2) {
            iDecodeArray += decodeArray(bArr, i + iDecodeArray, bArr3, i2 - iDecodeArray);
        }
        return iDecodeArray;
    }

    public static int decodeArray(byte[] bArr, int i, byte[][] bArr2, int i2) {
        int i3 = 0;
        for (int i5 = 0; i5 < bArr2.length; i5++) {
            int iMin = Math.min(bArr2[i5].length, i2 << 1);
            GF16.decode(bArr, i + i3, bArr2[i5], 0, iMin);
            int i6 = (iMin + 1) >> 1;
            i3 += i6;
            i2 -= i6;
        }
        return i3;
    }

    public static int decodeP(byte[] bArr, int i, byte[][][][] bArr2, int i2) {
        int iDecodeAlpha = 0;
        for (byte[][][] bArr3 : bArr2) {
            iDecodeAlpha += decodeAlpha(bArr, i + iDecodeAlpha, bArr3, i2);
        }
        return iDecodeAlpha;
    }

    public static int fillAlpha(byte[] bArr, int i, byte[][][] bArr2, int i2) {
        int i3 = 0;
        for (int i5 = 0; i5 < bArr2.length; i5++) {
            int i6 = 0;
            while (true) {
                byte[][] bArr3 = bArr2[i5];
                if (i6 < bArr3.length) {
                    int iMin = Math.min(bArr3[i6].length, i2 - i3);
                    System.arraycopy(bArr, i + i3, bArr2[i5][i6], 0, iMin);
                    i3 += iMin;
                    i6++;
                }
            }
        }
        return i3;
    }

    public static int fillP(byte[] bArr, int i, byte[][][][] bArr2, int i2) {
        int iFillAlpha = 0;
        for (byte[][][] bArr3 : bArr2) {
            iFillAlpha += fillAlpha(bArr, i + iFillAlpha, bArr3, i2 - iFillAlpha);
        }
        return iFillAlpha;
    }

    public void decode(byte[] bArr, int i, boolean z) {
        int iDecodeP = decodeP(bArr, 0, this.f228878p11, i);
        int iDecodeP2 = iDecodeP + decodeP(bArr, iDecodeP, this.f228879p12, i - iDecodeP);
        int iDecodeP3 = iDecodeP2 + decodeP(bArr, iDecodeP2, this.f228880p21, i - iDecodeP2);
        if (z) {
            int iDecodeAlpha = iDecodeP3 + decodeAlpha(bArr, iDecodeP3, this.aAlpha, i - iDecodeP3);
            int iDecodeAlpha2 = iDecodeAlpha + decodeAlpha(bArr, iDecodeAlpha, this.bAlpha, i - iDecodeAlpha);
            int iDecodeAlpha3 = iDecodeAlpha2 + decodeAlpha(bArr, iDecodeAlpha2, this.qAlpha1, i - iDecodeAlpha2);
            decodeAlpha(bArr, iDecodeAlpha3, this.qAlpha2, i - iDecodeAlpha3);
        }
    }

    public void fill(byte[] bArr, boolean z) {
        int iFillP = fillP(bArr, 0, this.f228878p11, bArr.length);
        int iFillP2 = iFillP + fillP(bArr, iFillP, this.f228879p12, bArr.length - iFillP);
        int iFillP3 = iFillP2 + fillP(bArr, iFillP2, this.f228880p21, bArr.length - iFillP2);
        if (z) {
            int iFillAlpha = iFillP3 + fillAlpha(bArr, iFillP3, this.aAlpha, bArr.length - iFillP3);
            int iFillAlpha2 = iFillAlpha + fillAlpha(bArr, iFillAlpha, this.bAlpha, bArr.length - iFillAlpha);
            int iFillAlpha3 = iFillAlpha2 + fillAlpha(bArr, iFillAlpha2, this.qAlpha1, bArr.length - iFillAlpha2);
            fillAlpha(bArr, iFillAlpha3, this.qAlpha2, bArr.length - iFillAlpha3);
        }
    }
}
