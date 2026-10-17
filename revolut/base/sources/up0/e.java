package up0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f281701a;

    static {
        int[] iArr = new int[p0.values().length];
        try {
            iArr[p0.BALANCE_INCREASE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p0.BALANCE_DECREASE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p0.ACCOUNT_SWITCH_OUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[p0.ACCOUNT_SWITCH_IN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f281701a = iArr;
    }
}
