package kkf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f184677a;

    static {
        int[] iArr = new int[b95.a.values().length];
        try {
            iArr[b95.a.PERSONAL_LOAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b95.a.REFINANCING_LOAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b95.a.MORTGAGE_LOAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f184677a = iArr;
    }
}
