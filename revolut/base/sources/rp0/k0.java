package rp0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f256107a;

    static {
        int[] iArr = new int[mw0.o.values().length];
        try {
            iArr[mw0.o.TOUCH_COORDINATES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mw0.o.BELOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[mw0.o.BELOW_START.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[mw0.o.VIEW_BOUNDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f256107a = iArr;
    }
}
