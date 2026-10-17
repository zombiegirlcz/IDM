package kul;

import k4l.r0;
import nel.z;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f189846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f189847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f189848c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[z.values().length];
        try {
            iArr[z.ADR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z.BOND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z.CFD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[z.COMMODITY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[z.ETF.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[z.ETC.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[z.ETN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[z.EQUITY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[z.SPAC.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[z.WARRANT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[z.STRUCTURED_NOTE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[z.OPTION.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[z.UNSPECIFIED.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[z.FUND.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[z.MUTUAL_FUND.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        f189846a = iArr;
        int[] iArr2 = new int[com.revolut.shared.feature.market_data.models.domain.models.b.values().length];
        try {
            iArr2[com.revolut.shared.feature.market_data.models.domain.models.b.LARGE_ORDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        f189847b = iArr2;
        int[] iArr3 = new int[r0.values().length];
        try {
            iArr3[r0.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[r0.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[r0.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[r0.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused20) {
        }
        f189848c = iArr3;
        int[] iArr4 = new int[l4l.a.values().length];
        try {
            iArr4[l4l.a.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr4[l4l.a.RETAIL_FIAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr4[l4l.a.SAVINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr4[l4l.a.VAULTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr4[l4l.a.TRADING_GIA.ordinal()] = 5;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr4[l4l.a.TRADING_GIA_CBP.ordinal()] = 6;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr4[l4l.a.JOINT_TRADING_GIA.ordinal()] = 7;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr4[l4l.a.TRADING_TAA_ISA.ordinal()] = 8;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr4[l4l.a.TRADING_TAA_JISA.ordinal()] = 9;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr4[l4l.a.TRADING_TAA_PEA.ordinal()] = 10;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr4[l4l.a.COMMODITIES.ordinal()] = 11;
        } catch (NoSuchFieldError unused31) {
        }
        d = iArr4;
    }
}
