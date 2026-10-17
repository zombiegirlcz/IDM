package hea;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f151662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f151663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f151664c;

    static {
        int[] iArr = new int[io3.l.values().length];
        try {
            iArr[io3.l.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[io3.l.MERCHANT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[io3.l.REVX_FIAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f151662a = iArr;
        int[] iArr2 = new int[io3.i.values().length];
        try {
            iArr2[io3.i.INTERNAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[io3.i.EXTERNAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f151663b = iArr2;
        int[] iArr3 = new int[x91.a.values().length];
        try {
            iArr3[x91.a.BALANCE_AND_CCY.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[x91.a.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f151664c = iArr3;
    }
}
