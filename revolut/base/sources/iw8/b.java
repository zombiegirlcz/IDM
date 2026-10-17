package iw8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f168986a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.COMPLETE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f168986a = iArr;
    }
}
