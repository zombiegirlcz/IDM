package u2i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f276662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f276663b;

    static {
        int[] iArr = new int[f8l.c.values().length];
        try {
            iArr[f8l.c.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f8l.c.COMMODITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f8l.c.FIAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f8l.c.SECURITY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[f8l.c.UNDEFINED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f276662a = iArr;
        int[] iArr2 = new int[f2i.g.values().length];
        try {
            iArr2[f2i.g.DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[f2i.g.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[f2i.g.MONTHLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f276663b = iArr2;
    }
}
