package crf;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108362a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.DOWNLOAD_CONFIRMATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.VIEW_RECIPIENT_DETAILS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.LOCATE_TRANSFER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.RECALL_TRANSFER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f108362a = iArr;
    }
}
