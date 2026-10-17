package vt0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f291870a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.LIST_SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.FULL_SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.ANIMATING_TO_LIST_SCREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f291870a = iArr;
    }
}
