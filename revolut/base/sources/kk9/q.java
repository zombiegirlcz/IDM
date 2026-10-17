package kk9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f184550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f184551b;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.Healthy.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.CancelledAndWithdrawal.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p.Outstanding.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[p.Overdue.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f184550a = iArr;
        int[] iArr2 = new int[zh9.c.values().length];
        try {
            iArr2[zh9.c.Healthy.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[zh9.c.Outstanding.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[zh9.c.Overdue.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f184551b = iArr2;
    }
}
