package es0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f128842a;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.NOT_INITIALISED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.TABS_VISIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p.SHOWING_TABS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[p.PERIOD_VISIBLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[p.SHOWING_PERIOD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f128842a = iArr;
    }
}
