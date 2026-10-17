package jzb;

import m1c.f1;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f179715a;

    static {
        int[] iArr = new int[f1.values().length];
        try {
            iArr[f1.STAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f1.EXPERIENCES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f1.SHOPS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f1.CHALLENGES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[f1.REVPOINTS_POCKET.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[f1.REVPAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[f1.RECURRING_PAYMENTS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f179715a = iArr;
    }
}
