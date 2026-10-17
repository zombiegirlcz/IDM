package u09;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f276157a;

    static {
        int[] iArr = new int[y.values().length];
        try {
            iArr[y.LOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y.NOT_STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[y.CONTENT_STARTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[y.CONTENT_FINISHED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[y.QUIZ_STARTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[y.COMPLETED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f276157a = iArr;
    }
}
