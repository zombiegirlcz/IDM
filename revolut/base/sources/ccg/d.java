package ccg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23100a;

    static {
        int[] iArr = new int[cgi.e.values().length];
        try {
            iArr[cgi.e.PAY_NOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cgi.e.PAY_LATER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f23100a = iArr;
    }
}
