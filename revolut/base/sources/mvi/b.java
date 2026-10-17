package mvi;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f209256a;

    static {
        int[] iArr = new int[ati.a.values().length];
        try {
            iArr[ati.a.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ati.a.AVAILABLE_SOON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ati.a.READY_TO_USE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f209256a = iArr;
    }
}
