package ew4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f130090a;

    static {
        int[] iArr = new int[ql4.t.values().length];
        try {
            iArr[ql4.t.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ql4.t.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ql4.t.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ql4.t.SETTLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f130090a = iArr;
    }
}
