package gd2;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f143041a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.START_REGISTRATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.CONFIRM_PAYMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f143041a = iArr;
    }
}
