package svg;

import iwg.c;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f265863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f265864b;

    static {
        int[] iArr = new int[iwg.a.values().length];
        try {
            iArr[iwg.a.JISA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[iwg.a.PEA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[iwg.a.ISA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[iwg.a.SECURITY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[iwg.a.CRYPTO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[iwg.a.COMMODITY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[iwg.a.ROBO.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[iwg.a.CFD.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f265863a = iArr;
        int[] iArr2 = new int[c.values().length];
        try {
            iArr2[c.TIME_WEIGHTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[c.MONEY_WEIGHTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[c.SIMPLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        f265864b = iArr2;
    }
}
