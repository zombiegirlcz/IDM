package dr8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f117104a;

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
        f117104a = iArr;
    }
}
