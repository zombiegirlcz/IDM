package uf4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f279538a;

    static {
        int[] iArr = new int[pf4.c.values().length];
        try {
            iArr[pf4.c.BLOCKING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pf4.c.NON_BLOCKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f279538a = iArr;
    }
}
