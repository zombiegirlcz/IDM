package u1m;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f276449a;

    static {
        int[] iArr = new int[s.values().length];
        try {
            iArr[s.INITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[s.SESSION_CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[s.DEVELOPMENT_MODE_CHECKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[s.RUNNING_PROCESSES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[s.PROCESSES_COMPLETED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[s.ALL_COMPLETED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[s.ERROR_OR_ABORTED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f276449a = iArr;
    }
}
