package jwi;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f179014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f179015b;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.COPY_CARD_NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.GET_THE_APP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f179014a = iArr;
        int[] iArr2 = new int[f.values().length];
        try {
            iArr2[f.ORDER_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[f.DEEPLINK.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f179015b = iArr2;
    }
}
