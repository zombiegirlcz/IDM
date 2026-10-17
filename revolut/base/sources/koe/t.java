package koe;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f186331a;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.REMOVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.UPDATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o.ADD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f186331a = iArr;
    }
}
