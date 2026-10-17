package s12;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f259055a;

    static {
        int[] iArr = new int[aef.a.values().length];
        try {
            iArr[aef.a.SUBMITTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[aef.a.INFORMATION_REQUIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[aef.a.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[aef.a.MERCHANT_REFUND.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[aef.a.INVALID.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f259055a = iArr;
    }
}
