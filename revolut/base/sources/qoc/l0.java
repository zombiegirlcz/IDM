package qoc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f248128a;

    static {
        int[] iArr = new int[jlc.p.values().length];
        try {
            iArr[jlc.p.SIMULATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jlc.p.ACTUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f248128a = iArr;
    }
}
