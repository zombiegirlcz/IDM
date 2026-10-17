package eaf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f124248a;

    static {
        int[] iArr = new int[u8f.d.values().length];
        try {
            iArr[u8f.d.OUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u8f.d.IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u8f.d.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f124248a = iArr;
    }
}
