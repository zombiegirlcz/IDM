package n5i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f212603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f212604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f212605c;
    public static final /* synthetic */ int[] d;

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
        f212603a = iArr;
        int[] iArr2 = new int[com.revolut.feature_market_data_api.models.a.values().length];
        try {
            iArr2[com.revolut.feature_market_data_api.models.a.BOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[com.revolut.feature_market_data_api.models.a.STRUCTURED_NOTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[com.revolut.feature_market_data_api.models.a.OTHER.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f212604b = iArr2;
        int[] iArr3 = new int[f8l.e.values().length];
        try {
            iArr3[f8l.e.LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[f8l.e.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f212605c = iArr3;
        int[] iArr4 = new int[f8l.c.values().length];
        try {
            iArr4[f8l.c.FIAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[f8l.c.SECURITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[f8l.c.COMMODITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[f8l.c.CRYPTO.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[f8l.c.UNDEFINED.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        d = iArr4;
    }
}
