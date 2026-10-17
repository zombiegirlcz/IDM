package rp0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f256152a;

    static {
        int[] iArr = new int[o1.values().length];
        try {
            iArr[o1.ANIMATING_HIDE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o1.HIDDEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o1.ANIMATING_SHOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[o1.SHOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f256152a = iArr;
    }
}
