package bke;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f16364a;

    static {
        int[] iArr = new int[yh5.a.values().length];
        try {
            iArr[yh5.a.ENABLED_AND_ONBOARDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yh5.a.ONBOARDING_REQUIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yh5.a.FEATURE_UNAVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f16364a = iArr;
    }
}
