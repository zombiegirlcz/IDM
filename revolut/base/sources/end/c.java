package end;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f127809a;

    static {
        int[] iArr = new int[dmd.d.values().length];
        try {
            iArr[dmd.d.CURRENCY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[dmd.d.ACCOUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[dmd.d.ACCOUNT_WITH_CURRENCY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f127809a = iArr;
    }
}
