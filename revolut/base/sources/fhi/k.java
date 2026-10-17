package fhi;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f135247a;

    static {
        int[] iArr = new int[wgi.a.values().length];
        try {
            iArr[wgi.a.TODAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wgi.a.TOMORROW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f135247a = iArr;
    }
}
