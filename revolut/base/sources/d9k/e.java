package d9k;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f112404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f112405b;

    static {
        int[] iArr = new int[hrf.f.values().length];
        try {
            iArr[hrf.f.INCOMING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hrf.f.OUTGOING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f112404a = iArr;
        int[] iArr2 = new int[i.values().length];
        try {
            iArr2[i.ABSENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[i.SIMPLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[i.WITH_GIF.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[i.WITH_PERSONALISATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f112405b = iArr2;
    }
}
