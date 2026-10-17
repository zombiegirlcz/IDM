package mpd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f207803a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.START_DATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.END_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f207803a = iArr;
    }
}
