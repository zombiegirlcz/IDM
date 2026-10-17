package dlk;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f115798a;

    static {
        int[] iArr = new int[t.values().length];
        try {
            iArr[t.NO_OFFERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t.OFFER_REJECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t.CHAT_CLOSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[t.DOWNGRADE_REASONS_RESULT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[t.DOWNGRADE_FEES_AND_TERMS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[t.DOWNGRADE_LEGIBILITY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f115798a = iArr;
    }
}
