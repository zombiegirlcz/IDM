package b7j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f13053b;

    static {
        int[] iArr = new int[m6j.b.values().length];
        try {
            iArr[m6j.b.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m6j.b.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m6j.b.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[m6j.b.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f13052a = iArr;
        int[] iArr2 = new int[m6j.a.values().length];
        try {
            iArr2[m6j.a.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[m6j.a.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f13053b = iArr2;
    }
}
