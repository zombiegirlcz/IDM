package ox0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f230480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f230481b;

    static {
        int[] iArr = new int[b0.values().length];
        try {
            iArr[b0.ABOVE_BUTTONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b0.BELOW_BUTTONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f230480a = iArr;
        int[] iArr2 = new int[e0.values().length];
        try {
            iArr2[e0.MATCH_PARENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[e0.WRAP_CONTENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f230481b = iArr2;
    }
}
