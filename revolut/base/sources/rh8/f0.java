package rh8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f254335a;

    static {
        int[] iArr = new int[mh8.f.values().length];
        try {
            iArr[mh8.f.WAITING_USER_INPUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mh8.f.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[mh8.f.IN_PROGRESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f254335a = iArr;
    }
}
