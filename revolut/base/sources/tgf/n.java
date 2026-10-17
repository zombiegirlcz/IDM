package tgf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f271180a;

    static {
        int[] iArr = new int[com.revolut.feature.transactions.api.navigation.d.values().length];
        try {
            iArr[com.revolut.feature.transactions.api.navigation.d.MULTI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.transactions.api.navigation.d.SINGLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f271180a = iArr;
    }
}
