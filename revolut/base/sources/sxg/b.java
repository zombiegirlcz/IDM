package sxg;

import nel.z;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f266485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f266486b;

    static {
        int[] iArr = new int[z.values().length];
        try {
            iArr[z.BOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z.FUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z.CFD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f266485a = iArr;
        int[] iArr2 = new int[iwg.a.values().length];
        try {
            iArr2[iwg.a.ISA.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[iwg.a.JISA.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[iwg.a.PEA.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[iwg.a.SECURITY.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[iwg.a.CFD.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[iwg.a.CRYPTO.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[iwg.a.COMMODITY.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[iwg.a.ROBO.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        f266486b = iArr2;
    }
}
