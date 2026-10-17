package sc2;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f261625b;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.BENEFICIARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.CONTACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f261624a = iArr;
        int[] iArr2 = new int[hrf.f.values().length];
        try {
            iArr2[hrf.f.OUTGOING.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[hrf.f.INCOMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f261625b = iArr2;
    }
}
