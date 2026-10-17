package gul;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f146976a;

    static {
        int[] iArr = new int[aul.b.values().length];
        try {
            iArr[aul.b.SECURITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[aul.b.FIAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f146976a = iArr;
    }
}
