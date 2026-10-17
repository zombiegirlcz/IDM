package wul;

import k4l.o0;
import k4l.r0;
import nel.z;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f300227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f300228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f300229c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[r0.values().length];
        try {
            iArr[r0.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r0.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r0.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[r0.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f300227a = iArr;
        int[] iArr2 = new int[z.values().length];
        try {
            iArr2[z.BOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[z.ADR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[z.ETF.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[z.ETC.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[z.ETN.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[z.EQUITY.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[z.WARRANT.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[z.SPAC.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[z.CFD.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[z.COMMODITY.ordinal()] = 10;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[z.FUND.ordinal()] = 11;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[z.MUTUAL_FUND.ordinal()] = 12;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[z.STRUCTURED_NOTE.ordinal()] = 13;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[z.OPTION.ordinal()] = 14;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[z.UNSPECIFIED.ordinal()] = 15;
        } catch (NoSuchFieldError unused19) {
        }
        f300228b = iArr2;
        int[] iArr3 = new int[o0.values().length];
        try {
            iArr3[o0.PARTIALLY_FILLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        f300229c = iArr3;
        int[] iArr4 = new int[bfl.g.values().length];
        try {
            iArr4[bfl.g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr4[bfl.g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        d = iArr4;
    }
}
