package pjh;

import nel.z;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f236780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f236781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f236782c;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.Strategies.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f236780a = iArr;
        int[] iArr2 = new int[z.values().length];
        try {
            iArr2[z.BOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[z.ADR.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[z.ETF.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[z.ETC.ordinal()] = 4;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[z.ETN.ordinal()] = 5;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[z.EQUITY.ordinal()] = 6;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[z.WARRANT.ordinal()] = 7;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[z.SPAC.ordinal()] = 8;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[z.CFD.ordinal()] = 9;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[z.COMMODITY.ordinal()] = 10;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[z.FUND.ordinal()] = 11;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[z.MUTUAL_FUND.ordinal()] = 12;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[z.STRUCTURED_NOTE.ordinal()] = 13;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[z.OPTION.ordinal()] = 14;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[z.UNSPECIFIED.ordinal()] = 15;
        } catch (NoSuchFieldError unused16) {
        }
        f236781b = iArr2;
        int[] iArr3 = new int[hel.b.values().length];
        try {
            iArr3[hel.b.MX.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[hel.b.US.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[hel.b.GB.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[hel.b.AU.ordinal()] = 4;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[hel.b.EEA.ordinal()] = 5;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[hel.b.SG.ordinal()] = 6;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[hel.b.BR.ordinal()] = 7;
        } catch (NoSuchFieldError unused23) {
        }
        f236782c = iArr3;
    }
}
