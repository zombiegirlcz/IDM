package xsg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f308487a;

    static {
        int[] iArr = new int[com.revolut.feature.wallets.api.module.b.values().length];
        try {
            iArr[com.revolut.feature.wallets.api.module.b.DEBIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.wallets.api.module.b.CREDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f308487a = iArr;
    }
}
