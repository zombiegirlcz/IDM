package upe;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f282002a;

    static {
        int[] iArr = new int[kpe.b.values().length];
        try {
            iArr[kpe.b.WARNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kpe.b.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[kpe.b.REVIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f282002a = iArr;
    }
}
