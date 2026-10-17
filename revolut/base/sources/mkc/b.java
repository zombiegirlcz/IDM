package mkc;

import ekc.c;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f206216a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.CASHBACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.LOYALTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.DISCOUNT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f206216a = iArr;
    }
}
