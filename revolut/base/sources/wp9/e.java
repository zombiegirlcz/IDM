package wp9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f299177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f299178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f299179c;

    static {
        int[] iArr = new int[c0.values().length];
        try {
            iArr[c0.INVISIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c0.ENABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c0.DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f299177a = iArr;
        int[] iArr2 = new int[z.values().length];
        try {
            iArr2[z.INVISIBLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[z.SELECT_ALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[z.DESELECT_ALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f299178b = iArr2;
        int[] iArr3 = new int[cp9.a.values().length];
        try {
            iArr3[cp9.a.AMOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[cp9.a.PERCENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[cp9.a.SHARE.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        f299179c = iArr3;
    }
}
