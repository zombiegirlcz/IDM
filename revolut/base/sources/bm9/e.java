package bm9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f16774a;

    static {
        int[] iArr = new int[nl9.f.values().length];
        try {
            iArr[nl9.f.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[nl9.f.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[nl9.f.NOT_AVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f16774a = iArr;
    }
}
