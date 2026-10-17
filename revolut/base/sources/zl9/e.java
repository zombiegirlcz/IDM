package zl9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f323200a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.CreatePasscode.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.ChangePasscode.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.SetPasscode.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f323200a = iArr;
    }
}
