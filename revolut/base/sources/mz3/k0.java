package mz3;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f210621a;

    static {
        int[] iArr = new int[qs3.a.values().length];
        try {
            iArr[qs3.a.STARTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qs3.a.PASSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qs3.a.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f210621a = iArr;
    }
}
