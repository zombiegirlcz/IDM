package ox0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f230474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f230475b;

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
        f230474a = iArr;
        int[] iArr2 = new int[d0.values().length];
        try {
            iArr2[d0.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[d0.DISCLAIMER.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f230475b = iArr2;
    }
}
