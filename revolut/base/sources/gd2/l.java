package gd2;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f143046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f143047b;

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
        f143046a = iArr;
        int[] iArr2 = new int[g02.b.values().length];
        try {
            iArr2[g02.b.RETAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[g02.b.BUSINESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[g02.b.JOINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f143047b = iArr2;
    }
}
