package egh;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f125659a;

    static {
        int[] iArr = new int[kel.f.values().length];
        try {
            iArr[kel.f.FREE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kel.f.SOFT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[kel.f.HARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f125659a = iArr;
    }
}
