package rpi;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f256391a;

    static {
        int[] iArr = new int[c01.a.values().length];
        try {
            iArr[c01.a.NEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c01.a.DONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c01.a.HIDE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f256391a = iArr;
    }
}
