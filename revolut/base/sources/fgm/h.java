package fgm;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f135109a;

    static {
        int[] iArr = new int[a.values().length];
        f135109a = iArr;
        try {
            iArr[a.DROP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f135109a[a.LATEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f135109a[a.MISSING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f135109a[a.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
