package nvl;

import k4l.k;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f219748a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.TODAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.NEXT_TRADING_DAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.ONE_WEEK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k.NINETY_DAYS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[k.SIX_MONTHS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[k.CUSTOM.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f219748a = iArr;
    }
}
