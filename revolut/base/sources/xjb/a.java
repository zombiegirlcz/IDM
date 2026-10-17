package xjb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f306506a;

    static {
        int[] iArr = new int[qib.a.values().length];
        try {
            iArr[qib.a.INACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qib.a.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qib.a.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f306506a = iArr;
    }
}
