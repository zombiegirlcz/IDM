package nnj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f217689a;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.HIDDEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.VISIBLE_ENABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o.VISIBLE_DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f217689a = iArr;
    }
}
