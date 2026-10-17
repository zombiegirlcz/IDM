package org.bouncycastle.pqc.crypto.mayo;

import com.youTransactor.uCube.rpc.Constants;
import org.jmrtd.lds.LDSFile;
import org.jmrtd.lds.icao.DG11File;

/* JADX INFO: loaded from: classes14.dex */
public class MayoParameters {
    public static final MayoParameters mayo1 = new MayoParameters("MAYO_1", 86, 78, 5, 8, 78, 81, 10, 39, 312, 39, 40, 120159, DG11File.PERSONAL_NUMBER_TAG, 24, 1420, 454, new int[]{8, 1, 1, 0}, 24, 32, 24);
    public static final MayoParameters mayo2 = new MayoParameters("MAYO_2", 81, 64, 4, 17, 64, 69, 4, 32, 544, 32, 34, 66560, 34816, 24, 4912, 186, new int[]{8, 0, 2, 8}, 24, 32, 24);
    public static final MayoParameters mayo3 = new MayoParameters("MAYO_3", LDSFile.EF_DG4_TAG, LDSFile.EF_DG12_TAG, 7, 10, LDSFile.EF_DG12_TAG, LDSFile.EF_DG15_TAG, 11, 54, 540, 54, 55, 317844, 58320, 32, 2986, 681, new int[]{8, 0, 1, 7}, 32, 48, 32);
    public static final MayoParameters mayo5 = new MayoParameters("MAYO_5", Constants.EMVTag.TAG_9A_TRANSACTION_DATE, 142, 9, 12, 142, 145, 12, 71, 852, 71, 72, 720863, 120984, 40, 5554, 964, new int[]{4, 0, 8, 1}, 40, 64, 40);
    private static final int pkSeedBytes = 16;
    private final int ACols;
    private final int OBytes;
    private final int P1Bytes;
    private final int P2Bytes;
    private final int cpkBytes;
    private final int cskBytes;
    private final int digestBytes;
    private final int[] fTail;
    private final int k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f228832m;
    private final int mBytes;
    private final int mVecLimbs;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f228833n;
    private final String name;
    private final int o;
    private final int rBytes;
    private final int saltBytes;
    private final int sigBytes;
    private final int skSeedBytes;
    private final int v;
    private final int vBytes;

    private MayoParameters(String str, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32, int i33, int i43, int i59, int i66, int i74, int i92, int i96, int i99, int[] iArr, int i100, int i101, int i102) {
        this.name = str;
        this.f228833n = i;
        this.f228832m = i2;
        this.mVecLimbs = i3;
        this.o = i5;
        this.v = i6;
        this.ACols = i21;
        this.k = i22;
        this.mBytes = i32;
        this.OBytes = i33;
        this.vBytes = i43;
        this.rBytes = i59;
        this.P1Bytes = i66;
        this.P2Bytes = i74;
        this.cskBytes = i92;
        this.cpkBytes = i96;
        this.sigBytes = i99;
        this.fTail = iArr;
        this.saltBytes = i100;
        this.digestBytes = i101;
        this.skSeedBytes = i102;
    }

    public int getACols() {
        return this.ACols;
    }

    public int getCpkBytes() {
        return this.cpkBytes;
    }

    public int getCskBytes() {
        return this.cskBytes;
    }

    public int getDigestBytes() {
        return this.digestBytes;
    }

    public int[] getFTail() {
        return this.fTail;
    }

    public int getK() {
        return this.k;
    }

    public int getM() {
        return this.f228832m;
    }

    public int getMBytes() {
        return this.mBytes;
    }

    public int getMVecLimbs() {
        return this.mVecLimbs;
    }

    public int getN() {
        return this.f228833n;
    }

    public String getName() {
        return this.name;
    }

    public int getO() {
        return this.o;
    }

    public int getOBytes() {
        return this.OBytes;
    }

    public int getP1Bytes() {
        return this.P1Bytes;
    }

    public int getP1Limbs() {
        int i = this.v;
        return (((i + 1) * i) >> 1) * this.mVecLimbs;
    }

    public int getP2Bytes() {
        return this.P2Bytes;
    }

    public int getP2Limbs() {
        return this.v * this.o * this.mVecLimbs;
    }

    public int getP3Limbs() {
        int i = this.o;
        return (((i + 1) * i) >> 1) * this.mVecLimbs;
    }

    public int getPkSeedBytes() {
        return 16;
    }

    public int getRBytes() {
        return this.rBytes;
    }

    public int getSaltBytes() {
        return this.saltBytes;
    }

    public int getSigBytes() {
        return this.sigBytes;
    }

    public int getSkSeedBytes() {
        return this.skSeedBytes;
    }

    public int getV() {
        return this.v;
    }

    public int getVBytes() {
        return this.vBytes;
    }
}
