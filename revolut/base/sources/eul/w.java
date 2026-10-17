package eul;

import k4l.r0;
import nel.z;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f129660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f129661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f129662c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

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
        f129660a = iArr;
        int[] iArr2 = new int[z.values().length];
        try {
            iArr2[z.FUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[z.MUTUAL_FUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[z.ADR.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[z.BOND.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[z.CFD.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[z.COMMODITY.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[z.EQUITY.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[z.ETC.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[z.ETF.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[z.ETN.ordinal()] = 10;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[z.SPAC.ordinal()] = 11;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[z.WARRANT.ordinal()] = 12;
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
        f129661b = iArr2;
        int[] iArr3 = new int[f8l.c.values().length];
        try {
            iArr3[f8l.c.FIAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[f8l.c.COMMODITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[f8l.c.CRYPTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr3[f8l.c.SECURITY.ordinal()] = 4;
        } catch (NoSuchFieldError unused23) {
        }
        f129662c = iArr3;
        int[] iArr4 = new int[bfl.g.values().length];
        try {
            iArr4[bfl.g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr4[bfl.g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused25) {
        }
        d = iArr4;
        int[] iArr5 = new int[aul.b.values().length];
        try {
            iArr5[aul.b.FIAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr5[aul.b.SECURITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused27) {
        }
        e = iArr5;
    }
}
