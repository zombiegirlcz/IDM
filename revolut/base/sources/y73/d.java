package y73;

import com.revolut.feature.tab.accounts.models.ProductId;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f311323a;

    static {
        int[] iArr = new int[ProductId.values().length];
        try {
            iArr[ProductId.YOUTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProductId.PRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ProductId.JOINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ProductId.CREDIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f311323a = iArr;
    }
}
