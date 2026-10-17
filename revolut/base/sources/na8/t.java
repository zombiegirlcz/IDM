package na8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f213846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f213847b;

    static {
        int[] iArr = new int[u98.a.values().length];
        try {
            iArr[u98.a.TOO_OLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u98.a.TOO_YOUNG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u98.a.INVALID_AGE_DIFFERENCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[u98.a.FUTURE_DATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[u98.a.ELIGIBLE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f213846a = iArr;
        int[] iArr2 = new int[bj0.b.values().length];
        try {
            iArr2[bj0.b.MALE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[bj0.b.FEMALE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f213847b = iArr2;
    }
}
