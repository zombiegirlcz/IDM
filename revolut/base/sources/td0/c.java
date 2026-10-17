package td0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f269907a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.LISTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.UNLISTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f269907a = iArr;
    }
}
