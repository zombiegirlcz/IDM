package tjh;

import xzg.o0;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f271753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f271754b;

    static {
        int[] iArr = new int[o0.values().length];
        try {
            iArr[o0.TERMINATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o0.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o0.AVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[o0.UNAVAILABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[o0.ONBOARDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[o0.ACTIVE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[o0.SUSPENDED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[o0.OFFBOARDING.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f271753a = iArr;
        int[] iArr2 = new int[nel.z.values().length];
        try {
            iArr2[nel.z.ADR.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[nel.z.ETF.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[nel.z.ETC.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[nel.z.ETN.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[nel.z.EQUITY.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[nel.z.WARRANT.ordinal()] = 6;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[nel.z.SPAC.ordinal()] = 7;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[nel.z.CFD.ordinal()] = 8;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[nel.z.BOND.ordinal()] = 9;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[nel.z.COMMODITY.ordinal()] = 10;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[nel.z.FUND.ordinal()] = 11;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[nel.z.MUTUAL_FUND.ordinal()] = 12;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[nel.z.STRUCTURED_NOTE.ordinal()] = 13;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[nel.z.OPTION.ordinal()] = 14;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[nel.z.UNSPECIFIED.ordinal()] = 15;
        } catch (NoSuchFieldError unused23) {
        }
        f271754b = iArr2;
    }
}
