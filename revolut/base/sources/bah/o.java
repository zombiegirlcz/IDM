package bah;

import nel.z;
import z0h.f0;
import z0h.p0;
import z0h.s0;
import z0h.u0;
import z0h.y0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f14089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f14090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f14091c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int[] f14092g;

    static {
        int[] iArr = new int[hel.b.values().length];
        try {
            iArr[hel.b.GB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hel.b.EEA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[hel.b.US.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[hel.b.AU.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[hel.b.SG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[hel.b.MX.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[hel.b.BR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f14089a = iArr;
        int[] iArr2 = new int[f0.values().length];
        try {
            iArr2[f0.WITH_DISCLOSURES.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[f0.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        int[] iArr3 = new int[z.values().length];
        try {
            iArr3[z.BOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[z.ADR.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[z.ETF.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[z.ETC.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[z.ETN.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[z.EQUITY.ordinal()] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[z.WARRANT.ordinal()] = 7;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[z.SPAC.ordinal()] = 8;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[z.CFD.ordinal()] = 9;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[z.COMMODITY.ordinal()] = 10;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[z.FUND.ordinal()] = 11;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[z.MUTUAL_FUND.ordinal()] = 12;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[z.STRUCTURED_NOTE.ordinal()] = 13;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[z.OPTION.ordinal()] = 14;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr3[z.UNSPECIFIED.ordinal()] = 15;
        } catch (NoSuchFieldError unused24) {
        }
        f14090b = iArr3;
        int[] iArr4 = new int[ybl.n.values().length];
        try {
            iArr4[ybl.n.PDF.ordinal()] = 1;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr4[ybl.n.EXCEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused26) {
        }
        f14091c = iArr4;
        int[] iArr5 = new int[y0.values().length];
        try {
            iArr5[y0.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr5[y0.STOCKS.ordinal()] = 2;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr5[y0.ETFS.ordinal()] = 3;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr5[y0.BONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused30) {
        }
        d = iArr5;
        int[] iArr6 = new int[u0.values().length];
        try {
            iArr6[u0.REVOLUT_SUGGESTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr6[u0.EXTERNAL_SUGGESTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused32) {
        }
        e = iArr6;
        int[] iArr7 = new int[s0.values().length];
        try {
            iArr7[s0.INSIGHTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr7[s0.TECHNICALS_AND_SENTIMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr7[s0.FUNDAMENTALS.ordinal()] = 3;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr7[s0.ANALYST_RATINGS.ordinal()] = 4;
        } catch (NoSuchFieldError unused36) {
        }
        f = iArr7;
        int[] iArr8 = new int[p0.values().length];
        try {
            iArr8[p0.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr8[p0.STOCKS.ordinal()] = 2;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr8[p0.ETFS.ordinal()] = 3;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr8[p0.BONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused40) {
        }
        f14092g = iArr8;
    }
}
