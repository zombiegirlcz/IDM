package ev0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f129677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f129678b;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.UP_TO_DAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.ONLY_DAYS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.UP_TO_HOURS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f129677a = iArr;
        int[] iArr2 = new int[d.values().length];
        try {
            iArr2[d.SYSTEM.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[d.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[d.DARK.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f129678b = iArr2;
    }
}
