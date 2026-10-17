package lx2;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f200518a;

    static {
        int[] iArr = new int[c90.b.values().length];
        try {
            iArr[c90.b.MDPI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c90.b.HDPI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c90.b.XHDPI.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f200518a = iArr;
    }
}
