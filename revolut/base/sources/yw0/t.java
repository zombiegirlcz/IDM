package yw0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f317300a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f317300a = iArr;
    }
}
