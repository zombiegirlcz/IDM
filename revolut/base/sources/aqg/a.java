package aqg;

import pcd.l0;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f8429b;

    static {
        int[] iArr = new int[pcd.b.values().length];
        try {
            iArr[pcd.b.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pcd.b.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pcd.b.PERSONAL_JOINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pcd.b.YOUTH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[pcd.b.PERSONAL_UNDER_18.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f8428a = iArr;
        int[] iArr2 = new int[l0.values().length];
        try {
            iArr2[l0.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[l0.GROUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[l0.PRO_REGULAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[l0.PRO_TAX.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[l0.SAVINGS.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[l0.SAVINGS_FIXED_TERM.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[l0.MONEY_MARKET_FUND_SAVINGS.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[l0.UNDETERMINED.ordinal()] = 8;
        } catch (NoSuchFieldError unused13) {
        }
        f8429b = iArr2;
    }
}
