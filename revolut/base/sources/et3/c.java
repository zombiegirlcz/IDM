package et3;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f129183a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.SKIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.REJECTED_UNDISCLOSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.SHOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f129183a = iArr;
    }
}
