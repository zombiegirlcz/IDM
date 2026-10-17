package uk2;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f280661a;

    static {
        int[] iArr = new int[r.values().length];
        try {
            iArr[r.USER_LOCATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r.SEARCH_IN_AREA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f280661a = iArr;
    }
}
