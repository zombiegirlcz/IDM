package yv7;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f317137a;

    static {
        int[] iArr = new int[bu7.f.values().length];
        try {
            iArr[bu7.f.PHONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bu7.f.EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[bu7.f.WEB.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[bu7.f.HIDDEN_PHONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f317137a = iArr;
    }
}
