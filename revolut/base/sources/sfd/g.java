package sfd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f262398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f262399b;

    static {
        int[] iArr = new int[ngd.a.values().length];
        try {
            iArr[ngd.a.ONE_DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ngd.a.ONE_WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f262398a = iArr;
        int[] iArr2 = new int[ngd.b.values().length];
        try {
            iArr2[ngd.b.LINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ngd.b.CANDLESTICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f262399b = iArr2;
    }
}
