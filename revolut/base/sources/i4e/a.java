package i4e;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f158417a;

    static {
        int[] iArr = new int[g4e.a.values().length];
        try {
            iArr[g4e.a.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g4e.a.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g4e.a.COMPLETE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f158417a = iArr;
    }
}
