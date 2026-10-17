package pj3;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f236655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f236656b;

    static {
        int[] iArr = new int[hj3.e.values().length];
        try {
            iArr[hj3.e.ALL_SCREENS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hj3.e.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[hj3.e.END_SCREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f236655a = iArr;
        int[] iArr2 = new int[hj3.f.values().length];
        try {
            iArr2[hj3.f.MARKETING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[hj3.f.FIN_CRIME.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f236656b = iArr2;
    }
}
