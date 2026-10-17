package eie;

import com.revolut.feature.tab.accounts.models.ProductId;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f126591a;

    static {
        int[] iArr = new int[ProductId.values().length];
        try {
            iArr[ProductId.CURRENCY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProductId.YOUTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProductId.TOTAL_WEALTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f126591a = iArr;
    }
}
