package es;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f128756a;

    static {
        int[] iArr = new int[vr.g.values().length];
        try {
            iArr[vr.g.MANDATORY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vr.g.NOT_AVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vr.g.AVAILABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f128756a = iArr;
    }
}
