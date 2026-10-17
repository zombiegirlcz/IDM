package hbg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f150724a;

    static {
        int[] iArr = new int[tei.b.values().length];
        try {
            iArr[tei.b.CONFIRMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tei.b.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tei.b.PARTIALLY_COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f150724a = iArr;
    }
}
