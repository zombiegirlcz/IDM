package dr0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f117057a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.SOLID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.BLUR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.REFLECTION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f117057a = iArr;
    }
}
