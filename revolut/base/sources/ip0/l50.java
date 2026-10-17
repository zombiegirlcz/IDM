package ip0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class l50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f165130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f165131b;

    static {
        int[] iArr = new int[c50.values().length];
        try {
            iArr[c50.LAST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c50.MIDDLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f165130a = iArr;
        int[] iArr2 = new int[j50.values().length];
        try {
            iArr2[j50.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[j50.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[j50.WARNING.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[j50.COMPLETED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[j50.FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[j50.INACTIVE.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        f165131b = iArr2;
    }
}
