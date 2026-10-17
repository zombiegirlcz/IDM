package gqd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f145705a;

    static {
        int[] iArr = new int[hzi.c.values().length];
        try {
            iArr[hzi.c.ONE_TIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hzi.c.RECURRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f145705a = iArr;
    }
}
