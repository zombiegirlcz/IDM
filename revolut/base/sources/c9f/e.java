package c9f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22373a;

    static {
        int[] iArr = new int[u8f.d.values().length];
        try {
            iArr[u8f.d.IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u8f.d.OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u8f.d.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f22373a = iArr;
    }
}
