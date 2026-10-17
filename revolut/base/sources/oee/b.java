package oee;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f224581a;

    static {
        int[] iArr = new int[h93.e.values().length];
        try {
            iArr[h93.e.OUT_FOR_DELIVERY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h93.e.FAILED_ATTEMPT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h93.e.DELIVERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h93.e.IN_TRANSIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[h93.e.EXCEPTION.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f224581a = iArr;
    }
}
