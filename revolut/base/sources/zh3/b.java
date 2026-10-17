package zh3;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f322218a;

    static {
        int[] iArr = new int[th3.a.values().length];
        try {
            iArr[th3.a.PHYSICAL_CARD_LIMIT_REACHED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[th3.a.VIRTUAL_CARD_LIMIT_REACHED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[th3.a.DISPOSABLE_CARD_ALREADY_EXISTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[th3.a.METAL_CARDS_LIMIT_REACHED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f322218a = iArr;
    }
}
