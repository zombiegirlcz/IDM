package x5c;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f302934a;

    static {
        int[] iArr = new int[k5c.b.values().length];
        try {
            iArr[k5c.b.ALREADY_ONBOARDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k5c.b.ELIGIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k5c.b.NOT_ELIGIBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f302934a = iArr;
    }
}
