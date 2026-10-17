package gie;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f144138a;

    static {
        int[] iArr = new int[cmg.a.values().length];
        try {
            iArr[cmg.a.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cmg.a.SHOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cmg.a.RELOAD_AND_SHOW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f144138a = iArr;
    }
}
