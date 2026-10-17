package ih5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f161295a;

    static {
        int[] iArr = new int[eh5.a.values().length];
        try {
            iArr[eh5.a.LOCKED_UNSTAKE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[eh5.a.OPEN_ORDERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[eh5.a.LOCKED_GIFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f161295a = iArr;
    }
}
