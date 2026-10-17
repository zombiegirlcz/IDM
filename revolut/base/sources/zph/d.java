package zph;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f324304a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.ON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.OFF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.MULTIPLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f324304a = iArr;
    }
}
