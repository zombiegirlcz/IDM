package nz8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f220990a;

    static {
        int[] iArr = new int[rz8.h.values().length];
        try {
            iArr[rz8.h.LIST_SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rz8.h.LIST_LARGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[rz8.h.GRID.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f220990a = iArr;
    }
}
