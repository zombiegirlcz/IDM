package lz0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f200853a;

    static {
        int[] iArr = new int[oo0.a.values().length];
        try {
            iArr[oo0.a.PAUSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[oo0.a.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[oo0.a.PLAYING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[oo0.a.LOADING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[oo0.a.ABSENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f200853a = iArr;
    }
}
