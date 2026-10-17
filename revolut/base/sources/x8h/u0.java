package x8h;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f303392a;

    static {
        int[] iArr = new int[uj3.a.values().length];
        try {
            iArr[uj3.a.FEATURE_UNAVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[uj3.a.ONBOARDING_REQUIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[uj3.a.ENABLED_AND_ONBOARDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f303392a = iArr;
    }
}
