package ivc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f168827a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.CARDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.DEVICES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.ESIMS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f168827a = iArr;
    }
}
