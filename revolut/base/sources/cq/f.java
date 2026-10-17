package cq;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f107978a;

    static {
        int[] iArr = new int[zp.a.values().length];
        try {
            iArr[zp.a.IMMEDIATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zp.a.FLEXIBLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f107978a = iArr;
    }
}
