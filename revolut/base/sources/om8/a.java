package om8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f226772a;

    static {
        int[] iArr = new int[hm8.a.values().length];
        try {
            iArr[hm8.a.ABOVE_MAX_AGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hm8.a.ELIGIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[hm8.a.INELIGIBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f226772a = iArr;
    }
}
