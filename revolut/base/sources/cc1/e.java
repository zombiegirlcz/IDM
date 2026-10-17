package cc1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f22920a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.SETTINGS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.TIPS_SETTINGS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c.CARD_READER_SETTINGS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[c.LINK_SETTINGS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f22920a = iArr;
    }
}
