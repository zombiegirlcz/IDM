package s5i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f260090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f260091b;

    static {
        int[] iArr = new int[f8l.b.values().length];
        try {
            iArr[f8l.b.FROM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f8l.b.TO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f260090a = iArr;
        int[] iArr2 = new int[f8l.e.values().length];
        try {
            iArr2[f8l.e.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[f8l.e.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[f8l.e.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[f8l.e.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f260091b = iArr2;
    }
}
