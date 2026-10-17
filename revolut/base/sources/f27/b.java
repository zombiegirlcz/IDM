package f27;

import d27.v;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f131442a;

    static {
        int[] iArr = new int[v.values().length];
        try {
            iArr[v.CUSTOMER_SETS_PRICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[v.EXPIRY_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[v.REUSABLE_PAYMENT_LINK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f131442a = iArr;
    }
}
