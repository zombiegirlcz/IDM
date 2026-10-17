package m11;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f201182a;

    static {
        int[] iArr = new int[f11.c.values().length];
        try {
            iArr[f11.c.PREMIUM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f11.c.METAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f11.c.ULTRA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f201182a = iArr;
    }
}
