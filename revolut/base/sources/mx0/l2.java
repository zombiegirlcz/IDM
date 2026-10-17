package mx0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f209799a;

    static {
        int[] iArr = new int[q1.values().length];
        try {
            iArr[q1.CLICK_ON_ACTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q1.STORIES_FINISHED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q1.CLICK_ON_SKIP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[q1.ABORTED_BY_SCREEN_MARK_AS_VIEWED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[q1.ABORTED_BY_SCREEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[q1.SCREEN_FAILED_TO_PROVIDE_STORIES.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[q1.FAILED_TO_PLAY_STORIES.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f209799a = iArr;
    }
}
