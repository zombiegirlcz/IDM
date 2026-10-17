package fs9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f137659a;

    static {
        int[] iArr = new int[oq9.d.values().length];
        try {
            iArr[oq9.d.SETTLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[oq9.d.OWE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[oq9.d.OWED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f137659a = iArr;
    }
}
