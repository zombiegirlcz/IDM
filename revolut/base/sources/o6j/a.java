package o6j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f222617a;

    static {
        int[] iArr = new int[l6j.a.values().length];
        try {
            iArr[l6j.a.STOP_BUY_ORDER_INTRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l6j.a.STOP_SELL_ORDER_INTRO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l6j.a.LIMIT_BUY_ORDER_INTRO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l6j.a.LIMIT_SELL_ORDER_INTRO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l6j.a.RECURRING_ORDER_INTRO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f222617a = iArr;
    }
}
