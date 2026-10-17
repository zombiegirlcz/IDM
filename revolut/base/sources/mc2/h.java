package mc2;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f204254a;

    static {
        int[] iArr = new int[hrf.f.values().length];
        try {
            iArr[hrf.f.OUTGOING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hrf.f.INCOMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f204254a = iArr;
    }
}
