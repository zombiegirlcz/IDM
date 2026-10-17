package ypg;

import pcd.l0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f315863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f315864b;

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
            iArr[l0.GROUP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l0.REGULAR.ordinal()] = 5;
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
        f315863a = iArr;
        int[] iArr2 = new int[pcd.b.values().length];
        try {
            iArr2[pcd.b.PERSONAL_JOINT.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[pcd.b.YOUTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[pcd.b.PERSONAL_UNDER_18.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[pcd.b.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[pcd.b.PERSONAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused13) {
        }
        f315864b = iArr2;
    }
}
