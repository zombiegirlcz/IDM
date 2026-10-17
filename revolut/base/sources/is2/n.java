package is2;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f168093a;

    static {
        int[] iArr = new int[ibd.h.values().length];
        try {
            iArr[ibd.h.BIZUM_MANDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ibd.h.CARD_MANDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ibd.h.PREDEFINED_CARD_MANDATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ibd.h.MANUAL_CARD_MANDATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f168093a = iArr;
    }
}
