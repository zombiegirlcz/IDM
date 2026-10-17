package jq5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f177477a;

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
        try {
            iArr[wp5.b.AmountFitsInLimits.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[wp5.b.LowBalance.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f177477a = iArr;
    }
}
