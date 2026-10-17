package qxj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f250100a;

    static {
        int[] iArr = new int[sxj.b.values().length];
        try {
            iArr[sxj.b.NEVER_LOGGED_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sxj.b.LOGGED_IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[sxj.b.LOGGED_OUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f250100a = iArr;
    }
}
