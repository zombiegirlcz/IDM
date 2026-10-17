package c12;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20319a;

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
        f20319a = iArr;
    }
}
