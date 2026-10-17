package unc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f281409a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.UPDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.CREATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.ENABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f281409a = iArr;
    }
}
