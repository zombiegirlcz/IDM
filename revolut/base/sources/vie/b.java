package vie;

import com.revolut.feature.tab.accounts.models.ProductId;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f289577a;

    static {
        int[] iArr = new int[ProductId.values().length];
        try {
            iArr[ProductId.CREDIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProductId.CREDIT_HUB.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProductId.SUBACCOUNT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f289577a = iArr;
    }
}
