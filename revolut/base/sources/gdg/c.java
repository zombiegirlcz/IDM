package gdg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f143177a;

    static {
        int[] iArr = new int[cgi.e.values().length];
        try {
            iArr[cgi.e.PAY_LATER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cgi.e.PAY_NOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f143177a = iArr;
    }
}
