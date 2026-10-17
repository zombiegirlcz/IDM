package aie;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f5233a;

    static {
        int[] iArr = new int[sfe.g.values().length];
        try {
            iArr[sfe.g.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sfe.g.DESTRUCTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f5233a = iArr;
    }
}
