package ahd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f4956b;

    static {
        int[] iArr = new int[ogd.l.values().length];
        try {
            iArr[ogd.l.ASCENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ogd.l.DESCENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f4955a = iArr;
        int[] iArr2 = new int[ogd.m.values().length];
        try {
            iArr2[ogd.m.MANUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ogd.m.PRICE_CHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ogd.m.VOLUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ogd.m.CHANGE_24H.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ogd.m.PRICE.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ogd.m.ALPHABETICAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        f4956b = iArr2;
    }
}
