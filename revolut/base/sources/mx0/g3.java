package mx0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class g3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f209712a;

    static {
        int[] iArr = new int[h3.values().length];
        try {
            iArr[h3.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h3.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h3.ACTIVE_NOT_CLICKABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h3.LOADING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[h3.ACTIVE_CONTEXTUAL_THEME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[h3.INACTIVE_CONTEXTUAL_THEME.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f209712a = iArr;
    }
}
