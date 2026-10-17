package h9g;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f150248a;

    static {
        int[] iArr = new int[ufi.a.values().length];
        try {
            iArr[ufi.a.METER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ufi.a.KILOMETER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f150248a = iArr;
    }
}
