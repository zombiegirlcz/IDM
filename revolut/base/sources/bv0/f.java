package bv0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18937a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.LOADING_SHORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.LOADING_LONG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.ACTIVE_SYSTEM_THEME.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[a.PRIMARY_WHITE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[a.INACTIVE_PRIMARY_WHITE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[a.ACTIVE_NOT_CLICKABLE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[a.INACTIVE_CONTEXTUAL_THEME.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[a.ACTIVE_CONTEXTUAL_THEME.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f18937a = iArr;
    }
}
