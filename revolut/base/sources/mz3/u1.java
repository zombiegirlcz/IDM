package mz3;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f210691a;

    static {
        int[] iArr = new int[ws3.a.values().length];
        try {
            iArr[ws3.a.REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ws3.a.ADDITIONAL_DOCUMENTS_REQUIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ws3.a.WAITING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ws3.a.TICKETOR_PROGRESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f210691a = iArr;
    }
}
