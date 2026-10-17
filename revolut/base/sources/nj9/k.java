package nj9;

import zh9.t1;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f216423a;

    static {
        int[] iArr = new int[t1.values().length];
        try {
            iArr[t1.NotAvailable.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t1.MaxPurchaseLessThanMin.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t1.PurchaseLessThanMin.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[t1.PurchaseBiggerThanMax.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[t1.InsufficientFundsCurrentBalance.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f216423a = iArr;
    }
}
