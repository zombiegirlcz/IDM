package bah;

import nel.z;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f14079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f14080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f14081c;

    static {
        int[] iArr = new int[hel.b.values().length];
        try {
            iArr[hel.b.GB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hel.b.US.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[hel.b.AU.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[hel.b.MX.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[hel.b.BR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[hel.b.SG.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[hel.b.EEA.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f14079a = iArr;
        int[] iArr2 = new int[com.revolut.feature.wealth.api.ui.extensions.disclaimers.a.values().length];
        try {
            iArr2[com.revolut.feature.wealth.api.ui.extensions.disclaimers.a.RISK.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[com.revolut.feature.wealth.api.ui.extensions.disclaimers.a.BOND_PRICE_AND_VOLUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[com.revolut.feature.wealth.api.ui.extensions.disclaimers.a.YIELD.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[com.revolut.feature.wealth.api.ui.extensions.disclaimers.a.OTHER.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        f14080b = iArr2;
        int[] iArr3 = new int[z.values().length];
        try {
            iArr3[z.BOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[z.CFD.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[z.SPAC.ordinal()] = 3;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[z.WARRANT.ordinal()] = 4;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[z.EQUITY.ordinal()] = 5;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[z.ETF.ordinal()] = 6;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[z.ETC.ordinal()] = 7;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[z.ETN.ordinal()] = 8;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[z.ADR.ordinal()] = 9;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[z.COMMODITY.ordinal()] = 10;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[z.FUND.ordinal()] = 11;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[z.MUTUAL_FUND.ordinal()] = 12;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr3[z.STRUCTURED_NOTE.ordinal()] = 13;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr3[z.OPTION.ordinal()] = 14;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr3[z.UNSPECIFIED.ordinal()] = 15;
        } catch (NoSuchFieldError unused26) {
        }
        f14081c = iArr3;
    }
}
