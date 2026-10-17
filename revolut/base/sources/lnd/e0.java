package lnd;

import aw0.l2;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f197173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f197174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f197175c;

    static {
        int[] iArr = new int[yld.d.values().length];
        try {
            iArr[yld.d.SPENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yld.d.NET_BALANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yld.d.EARNINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yld.d.INCOME.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[yld.d.SALES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[yld.d.CASHFLOW.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f197173a = iArr;
        int[] iArr2 = new int[lzi.i.values().length];
        try {
            iArr2[lzi.i.WEEKLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[lzi.i.MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[lzi.i.YEARLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[lzi.i.MAX.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[lzi.i.CUSTOM.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        f197174b = iArr2;
        int[] iArr3 = new int[l2.values().length];
        try {
            iArr3[l2.GREATER_VALUE_GREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[l2.GREATER_VALUE_RED.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        f197175c = iArr3;
    }
}
