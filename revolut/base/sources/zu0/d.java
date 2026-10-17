package zu0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f325193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f325194b;

    static {
        int[] iArr = new int[vu0.r.values().length];
        try {
            iArr[vu0.r.START_TO_END.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vu0.r.END_TO_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f325193a = iArr;
        int[] iArr2 = new int[vu0.s.values().length];
        try {
            iArr2[vu0.s.FROM_END_TO_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[vu0.s.FROM_START_TO_END.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[vu0.s.BOTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f325194b = iArr2;
    }
}
