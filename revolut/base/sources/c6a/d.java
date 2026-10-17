package c6a;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f21751a;

    static {
        int[] iArr = new int[x5a.b.values().length];
        try {
            iArr[x5a.b.CARD_PAYMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x5a.b.DIRECT_DEBIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[x5a.b.BOTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f21751a = iArr;
    }
}
