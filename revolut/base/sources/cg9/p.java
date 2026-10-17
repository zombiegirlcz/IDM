package cg9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f23884a;

    static {
        int[] iArr = new int[xo1.j.values().length];
        try {
            iArr[xo1.j.DRAFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xo1.j.SCHEDULED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[xo1.j.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[xo1.j.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[xo1.j.CANCELLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f23884a = iArr;
    }
}
