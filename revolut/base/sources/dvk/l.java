package dvk;

import nel.z;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f118159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f118160b;

    static {
        int[] iArr = new int[z.values().length];
        try {
            iArr[z.ETF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z.ETC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z.ETN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[z.BOND.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[z.EQUITY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[z.CFD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[z.SPAC.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[z.ADR.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[z.WARRANT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[z.COMMODITY.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[z.FUND.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[z.MUTUAL_FUND.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[z.STRUCTURED_NOTE.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[z.OPTION.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[z.UNSPECIFIED.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        f118159a = iArr;
        int[] iArr2 = new int[hel.b.values().length];
        try {
            iArr2[hel.b.EEA.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[hel.b.GB.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[hel.b.US.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[hel.b.SG.ordinal()] = 4;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[hel.b.MX.ordinal()] = 5;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[hel.b.BR.ordinal()] = 6;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[hel.b.AU.ordinal()] = 7;
        } catch (NoSuchFieldError unused22) {
        }
        f118160b = iArr2;
    }
}
