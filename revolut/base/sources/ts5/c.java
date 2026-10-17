package ts5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f273960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f273961b;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.Learn.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.Earn.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f273960a = iArr;
        int[] iArr2 = new int[k5c.b.values().length];
        try {
            iArr2[k5c.b.ELIGIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[k5c.b.ALREADY_ONBOARDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[k5c.b.NOT_ELIGIBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f273961b = iArr2;
    }
}
