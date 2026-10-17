package rya;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f258287a;

    static {
        int[] iArr = new int[pwa.i.values().length];
        try {
            iArr[pwa.i.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pwa.i.PAST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f258287a = iArr;
    }
}
