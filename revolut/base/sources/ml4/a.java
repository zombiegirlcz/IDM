package ml4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f206632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f206633b;

    static {
        int[] iArr = new int[yw4.a.values().length];
        try {
            iArr[yw4.a.AVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yw4.a.STATEMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yw4.a.SPENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yw4.a.UNSELECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[yw4.a.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f206632a = iArr;
        int[] iArr2 = new int[xw4.a.values().length];
        try {
            iArr2[xw4.a.TERMINATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[xw4.a.OVERDUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[xw4.a.LIMIT_EXCEEDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[xw4.a.HEALTHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        f206633b = iArr2;
    }
}
