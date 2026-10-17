package fj3;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f135524a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.DYNAMIC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f135524a = iArr;
    }
}
