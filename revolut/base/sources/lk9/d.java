package lk9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f196310a;

    static {
        int[] iArr = new int[zh9.o.values().length];
        try {
            iArr[zh9.o.SCHEDULED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zh9.o.OUTSTANDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[zh9.o.OVERDUE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[zh9.o.CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[zh9.o.REPAID.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f196310a = iArr;
    }
}
