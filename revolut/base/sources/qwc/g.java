package qwc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f249852a;

    static {
        int[] iArr = new int[pwc.h.values().length];
        try {
            iArr[pwc.h.CARD_AND_CACHE_WITHDRAWALS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pwc.h.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pwc.h.TRANSFERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[pwc.h.CARD_PAYMENTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f249852a = iArr;
    }
}
