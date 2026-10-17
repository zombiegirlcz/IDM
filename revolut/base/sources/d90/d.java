package d90;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f112325a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.STOPPED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.CREATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f112325a = iArr;
    }
}
