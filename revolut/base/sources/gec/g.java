package gec;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f143280a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.ADD_AND_MOVE_MONEY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.MOVE_MONEY_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.CHOOSE_PAYMENT_METHOD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f.ADD_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f143280a = iArr;
    }
}
