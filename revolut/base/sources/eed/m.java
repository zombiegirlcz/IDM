package eed;

import pcd.l0;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f125200a;

    static {
        int[] iArr = new int[l0.values().length];
        try {
            iArr[l0.SAVINGS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l0.SAVINGS_FIXED_TERM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l0.MONEY_MARKET_FUND_SAVINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l0.REGULAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l0.GROUP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[l0.PRO_REGULAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[l0.PRO_TAX.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[l0.UNDETERMINED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f125200a = iArr;
    }
}
