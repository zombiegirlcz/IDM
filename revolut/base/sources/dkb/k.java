package dkb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f115502a;

    static {
        int[] iArr = new int[qib.j.values().length];
        try {
            iArr[qib.j.RECURRING_DRAW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qib.j.ONE_TIME_DRAW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qib.j.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f115502a = iArr;
    }
}
