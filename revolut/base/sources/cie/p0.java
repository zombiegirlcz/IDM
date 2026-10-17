package cie;

import com.revolut.feature.tab.accounts.models.ProductId;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24512a;

    static {
        int[] iArr = new int[ProductId.values().length];
        try {
            iArr[ProductId.CURRENCY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProductId.LINKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f24512a = iArr;
    }
}
