package ft4;

import ql4.r0;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f137895a;

    static {
        int[] iArr = new int[r0.values().length];
        try {
            iArr[r0.SINGLE_TRANSACTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r0.MULTIPLE_TRANSACTIONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r0.MULTIPLE_TRANSACTIONS_OR_SINGLE_PROMO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f137895a = iArr;
    }
}
