package yp0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f315714a;

    static {
        int[] iArr = new int[e0.values().length];
        try {
            iArr[e0.OUTSIDE_BOX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e0.INSIDE_BOX.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f315714a = iArr;
    }
}
