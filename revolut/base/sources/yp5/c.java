package yp5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f315788a;

    static {
        int[] iArr = new int[wp5.b.values().length];
        try {
            iArr[wp5.b.DailyLimitExceeded.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wp5.b.MonthlyLimitExceeded.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wp5.b.DailyAddressLimitExceeded.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[wp5.b.MonthlyAddressLimitExceeded.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f315788a = iArr;
    }
}
