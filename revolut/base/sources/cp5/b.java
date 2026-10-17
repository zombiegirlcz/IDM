package cp5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f107875a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.FIAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f107875a = iArr;
    }
}
