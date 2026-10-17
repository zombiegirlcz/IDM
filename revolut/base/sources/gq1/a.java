package gq1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f145508a;

    static {
        int[] iArr = new int[xo1.j.values().length];
        try {
            iArr[xo1.j.CANCELLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[xo1.j.DRAFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[xo1.j.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[xo1.j.SCHEDULED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[xo1.j.COMPLETED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f145508a = iArr;
    }
}
