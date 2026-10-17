package lig;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f195506a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.ORIGIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f195506a = iArr;
    }
}
