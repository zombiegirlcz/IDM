package wq1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f299403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f299404b;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.NOTICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.VEHICLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f299403a = iArr;
        int[] iArr2 = new int[mq1.a.values().length];
        try {
            iArr2[mq1.a.CAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[mq1.a.MOTORCYCLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[mq1.a.TRAILER.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f299404b = iArr2;
    }
}
