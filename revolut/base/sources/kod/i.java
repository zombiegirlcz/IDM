package kod;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f186304a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.EDIT_DATES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.EDIT_START_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.ADD_TRANSACTIONS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b.REMOVE_TRIP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f186304a = iArr;
    }
}
