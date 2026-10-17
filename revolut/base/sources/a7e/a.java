package a7e;

import com.revolut.feature.tab.accounts.models.ProductId;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1847a;

    static {
        int[] iArr = new int[ProductId.values().length];
        try {
            iArr[ProductId.YOUTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f1847a = iArr;
    }
}
