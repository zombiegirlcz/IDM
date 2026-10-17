package jzb;

import m1c.f1;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f179710a;

    static {
        int[] iArr = new int[f1.values().length];
        try {
            iArr[f1.ONE_OFF_PURCHASE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f1.RECURRING_PURCHASE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f179710a = iArr;
    }
}
