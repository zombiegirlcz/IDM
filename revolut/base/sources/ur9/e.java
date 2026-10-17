package ur9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f282260a;

    static {
        int[] iArr = new int[st9.d.values().length];
        try {
            iArr[st9.d.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[st9.d.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f282260a = iArr;
    }
}
