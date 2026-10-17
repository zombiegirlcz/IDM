package cwl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f109858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f109859b;

    static {
        int[] iArr = new int[isi.a.values().length];
        try {
            iArr[isi.a.ORDER_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[isi.a.UNDEFINED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f109858a = iArr;
        int[] iArr2 = new int[m0j.a.values().length];
        try {
            iArr2[m0j.a.NOT_STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[m0j.a.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[m0j.a.FINISHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f109859b = iArr2;
    }
}
