package hbg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f150700a;

    static {
        int[] iArr = new int[tei.b.values().length];
        try {
            iArr[tei.b.CONFIRMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tei.b.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tei.b.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[tei.b.PROCESSING_CANCELLATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[tei.b.PARTIALLY_COMPLETED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f150700a = iArr;
    }
}
