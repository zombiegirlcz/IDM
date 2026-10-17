package i6g;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f159007a;

    static {
        int[] iArr = new int[m7g.f.values().length];
        try {
            iArr[m7g.f.CITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m7g.f.AIRPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m7g.f.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f159007a = iArr;
    }
}
