package raf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f252845a;

    static {
        int[] iArr = new int[cfl.b.values().length];
        try {
            iArr[cfl.b.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cfl.b.ONBOARDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cfl.b.ACTIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[cfl.b.SUSPENDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[cfl.b.TERMINATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[cfl.b.OFFBOARDING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f252845a = iArr;
    }
}
