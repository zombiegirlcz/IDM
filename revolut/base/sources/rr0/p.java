package rr0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f256630a;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.STATUS_SHEET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.BOTTOM_SHEET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o.FULLSCREEN_PAGED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[o.POPUP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f256630a = iArr;
    }
}
