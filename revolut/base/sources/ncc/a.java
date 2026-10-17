package ncc;

import m1c.j;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f214168a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.LOYALTY_BOOSTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.LOYALTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.CASHBACK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j.DISCOUNT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[j.CALENDAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f214168a = iArr;
    }
}
