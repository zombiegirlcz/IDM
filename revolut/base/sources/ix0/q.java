package ix0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f169280a;

    static {
        int[] iArr = new int[bw0.e.values().length];
        try {
            iArr[bw0.e.Calculator.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bw0.e.SuggestionsElseCalculator.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[bw0.e.SuggestionsWhenTextEmptyElseCalculator.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[bw0.e.None.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f169280a = iArr;
    }
}
