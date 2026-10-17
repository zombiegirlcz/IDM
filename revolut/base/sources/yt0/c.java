package yt0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f316526a;

    static {
        int[] iArr = new int[zv0.b.values().length];
        try {
            iArr[zv0.b.EXPANDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zv0.b.HALF_EXPANDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zv0.b.COLLAPSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[zv0.b.HIDDEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f316526a = iArr;
    }
}
