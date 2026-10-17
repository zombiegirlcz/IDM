package ale;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f6248a;

    static {
        int[] iArr = new int[iih.b.values().length];
        try {
            iArr[iih.b.DEPOSIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[iih.b.WITHDRAW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f6248a = iArr;
    }
}
