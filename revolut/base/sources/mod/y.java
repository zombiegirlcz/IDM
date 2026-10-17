package mod;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f207641a;

    static {
        int[] iArr = new int[kod.b.values().length];
        try {
            iArr[kod.b.EDIT_DATES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kod.b.EDIT_START_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[kod.b.ADD_TRANSACTIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[kod.b.REMOVE_TRIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f207641a = iArr;
    }
}
