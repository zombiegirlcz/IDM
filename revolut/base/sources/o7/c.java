package o7;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f222640a;

    static {
        int[] iArr = new int[a.values().length];
        f222640a = iArr;
        try {
            iArr[a.ZIP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f222640a[a.GZIP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
