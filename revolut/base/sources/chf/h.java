package chf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f24217a;

    static {
        int[] iArr = new int[hzi.a.values().length];
        try {
            iArr[hzi.a.MANUALLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hzi.a.AUTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f24217a = iArr;
    }
}
