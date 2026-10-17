package k57;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f181463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f181464b;

    static {
        int[] iArr = new int[ds6.a.values().length];
        try {
            iArr[ds6.a.MONTHLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ds6.a.BI_MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ds6.a.FOUR_MONTHLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ds6.a.QUARTERLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ds6.a.HALF_YEARLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ds6.a.YEARLY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ds6.a.SINGLE_INSTALMENT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ds6.a.TWO_INSTALMENTS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ds6.a.UNKNOWN.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f181463a = iArr;
        int[] iArr2 = new int[es6.b.values().length];
        try {
            iArr2[es6.b.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[es6.b.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[es6.b.FIXED_PERCENTAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[es6.b.PER_PRODUCT_PERCENTAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        f181464b = iArr2;
    }
}
