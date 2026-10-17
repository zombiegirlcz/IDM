package ms0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f208263a;

    static {
        int[] iArr = new int[e4.values().length];
        try {
            iArr[e4.EnabledClickable.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e4.EnabledNonClickable.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e4.DisabledNonClickable.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e4.DisabledClickable.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f208263a = iArr;
    }
}
