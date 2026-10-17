package vib;

import uib.c;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f289560a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.SAVINGS_AND_FUNDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.FLEXIBLE_CASH_FUNDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.FLEXIBLE_ACCOUNTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c.INTEREST.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[c.SAVINGS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f289560a = iArr;
    }
}
