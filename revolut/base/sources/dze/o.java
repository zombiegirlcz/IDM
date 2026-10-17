package dze;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121338a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.RESUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.PAUSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f121338a = iArr;
    }
}
