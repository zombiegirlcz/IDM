package n4d;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f212355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f212356b;

    static {
        int[] iArr = new int[ogd.m.values().length];
        try {
            iArr[ogd.m.MANUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ogd.m.PRICE_CHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ogd.m.ALPHABETICAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ogd.m.VOLUME.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ogd.m.CHANGE_24H.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ogd.m.PRICE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f212355a = iArr;
        int[] iArr2 = new int[ogd.l.values().length];
        try {
            iArr2[ogd.l.ASCENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ogd.l.DESCENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        f212356b = iArr2;
    }
}
