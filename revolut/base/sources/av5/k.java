package av5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9921a;

    static {
        int[] iArr = new int[i.values().length];
        try {
            iArr[i.TRANSACTION_TYPE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[i.CURRENCY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f9921a = iArr;
    }
}
