package fn5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f136533a;

    static {
        int[] iArr = new int[yh5.a.values().length];
        try {
            iArr[yh5.a.FEATURE_UNAVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yh5.a.ONBOARDING_REQUIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yh5.a.ENABLED_AND_ONBOARDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f136533a = iArr;
    }
}
