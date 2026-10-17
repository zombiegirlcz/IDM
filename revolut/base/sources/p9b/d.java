package p9b;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f234291a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.NON_DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.TERMINATED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f234291a = iArr;
    }
}
