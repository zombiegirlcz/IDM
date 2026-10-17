package n7j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f213166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f213167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f213168c;

    static {
        int[] iArr = new int[f8l.e.values().length];
        try {
            iArr[f8l.e.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f8l.e.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f8l.e.LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f8l.e.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f213166a = iArr;
        int[] iArr2 = new int[f8l.b.values().length];
        try {
            iArr2[f8l.b.TO.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[f8l.b.FROM.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f213167b = iArr2;
        int[] iArr3 = new int[f8l.c.values().length];
        try {
            iArr3[f8l.c.FIAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[f8l.c.COMMODITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[f8l.c.CRYPTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[f8l.c.SECURITY.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[f8l.c.UNDEFINED.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        f213168c = iArr3;
    }
}
