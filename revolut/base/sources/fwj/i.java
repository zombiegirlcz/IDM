package fwj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f138672a;

    static {
        int[] iArr = new int[rl0.d.values().length];
        try {
            iArr[rl0.d.PASSCODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rl0.d.PASSKEY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f138672a = iArr;
    }
}
