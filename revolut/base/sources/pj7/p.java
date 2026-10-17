package pj7;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f236690a;

    static {
        int[] iArr = new int[nj7.a.values().length];
        try {
            iArr[nj7.a.SELECT_PURPOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[nj7.a.SELECT_CANCELLER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[nj7.a.REMOVE_EXPENSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[nj7.a.REMOVE_DOCUMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[nj7.a.ADD_START_DATE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[nj7.a.ADD_CANCELLATION_DATE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f236690a = iArr;
    }
}
