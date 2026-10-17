package vib;

import uib.c;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f289558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f289559b;

    static {
        int[] iArr = new int[uib.b.values().length];
        try {
            iArr[uib.b.STATEMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[uib.b.SUMMARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f289558a = iArr;
        int[] iArr2 = new int[c.values().length];
        try {
            iArr2[c.SAVINGS_AND_FUNDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[c.FLEXIBLE_CASH_FUNDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[c.FLEXIBLE_ACCOUNTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[c.INTEREST.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[c.SAVINGS.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f289559b = iArr2;
    }
}
