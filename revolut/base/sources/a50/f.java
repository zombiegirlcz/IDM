package a50;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f1307a;

    static {
        int[] iArr = new int[j30.a.values().length];
        try {
            iArr[j30.a.MANDATORY_STORIES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j30.a.CMS_STORIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j30.a.VIDEO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f1307a = iArr;
    }
}
