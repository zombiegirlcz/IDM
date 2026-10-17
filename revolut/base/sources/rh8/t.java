package rh8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f254371a;

    static {
        int[] iArr = new int[mf8.d.values().length];
        try {
            iArr[mf8.d.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mf8.d.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[mf8.d.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[mf8.d.PASSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f254371a = iArr;
    }
}
