package l1a;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f191502a;

    static {
        int[] iArr = new int[ibd.h.values().length];
        try {
            iArr[ibd.h.MANUAL_CARD_MANDATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ibd.h.PREDEFINED_CARD_MANDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ibd.h.CARD_MANDATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ibd.h.EXTERNAL_MANDATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ibd.h.EXTERNAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f191502a = iArr;
    }
}
