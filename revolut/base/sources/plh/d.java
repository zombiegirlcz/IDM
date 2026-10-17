package plh;

import xzg.q0;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f237398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f237399b;

    static {
        int[] iArr = new int[q0.values().length];
        try {
            iArr[q0.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q0.PERSONAL_JOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f237398a = iArr;
        int[] iArr2 = new int[tih.d.values().length];
        try {
            iArr2[tih.d.SECURITIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[tih.d.TAA_ISA.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[tih.d.TAA_CUSTODIAN_JISA.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[tih.d.TAA_PERSONAL_JISA.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[tih.d.TAA_PEA.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[tih.d.ROBO.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[tih.d.MARGIN.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[tih.d.GIA_MARGIN.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[tih.d.COMMODITIES.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[tih.d.BONDS.ordinal()] = 10;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[tih.d.ETFS.ordinal()] = 11;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[tih.d.PRIVATE_MARKETS.ordinal()] = 12;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[tih.d.JOINT_SECURITIES.ordinal()] = 13;
        } catch (NoSuchFieldError unused15) {
        }
        f237399b = iArr2;
    }
}
