package rq0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f256441a;

    static {
        int[] iArr = new int[gw0.c.values().length];
        try {
            iArr[gw0.c.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gw0.c.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gw0.c.LARGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f256441a = iArr;
    }
}
