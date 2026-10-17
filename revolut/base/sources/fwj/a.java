package fwj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f138656a;

    static {
        int[] iArr = new int[q89.f.values().length];
        try {
            iArr[q89.f.SIGN_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q89.f.SIGN_IN_LOST_ACCESS_TO_PHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q89.f.SIGN_UP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[q89.f.STORIES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f138656a = iArr;
    }
}
