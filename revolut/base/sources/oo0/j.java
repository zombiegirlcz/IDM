package oo0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f226983a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.PLAYING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.ABSENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.LOADING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.PAUSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[a.ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f226983a = iArr;
    }
}
