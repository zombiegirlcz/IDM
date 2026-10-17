package hqb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f154658a;

    static {
        int[] iArr = new int[pjb.a.values().length];
        try {
            iArr[pjb.a.ULTRA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pjb.a.METAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pjb.a.PREMIUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pjb.a.PLUS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[pjb.a.DEFAULT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[pjb.a.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f154658a = iArr;
    }
}
