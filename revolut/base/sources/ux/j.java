package ux;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f283712a;

    static {
        int[] iArr = new int[xv.a.values().length];
        try {
            iArr[xv.a.ON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xv.a.OFF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[xv.a.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f283712a = iArr;
    }
}
