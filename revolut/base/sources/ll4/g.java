package ll4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f196522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f196523b;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.WAITING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.ACTION_REQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[d.TERMINATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[d.NO_ACTIVE_APPLICATION.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f196522a = iArr;
        int[] iArr2 = new int[c.values().length];
        try {
            iArr2[c.CARDS_LIST.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[c.CARDS_WIDGET.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[c.PRODUCTS_WIDGET.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[c.CARD_ORDERING.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        f196523b = iArr2;
    }
}
