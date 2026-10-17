package tzd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f275924a;

    static {
        int[] iArr = new int[ayd.a.values().length];
        try {
            iArr[ayd.a.AccountStatement.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ayd.a.ProfitAndLossStatement.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f275924a = iArr;
    }
}
