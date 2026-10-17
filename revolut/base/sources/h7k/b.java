package h7k;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f149908a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.ACCEPT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.DECLINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.CANCEL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j.REMIND.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f149908a = iArr;
    }
}
