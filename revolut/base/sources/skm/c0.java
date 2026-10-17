package skm;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f263961a;

    static {
        int[] iArr = new int[d0.values().length];
        try {
            iArr[d0.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d0.ATOMIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d0.UNDISPATCHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d0.LAZY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f263961a = iArr;
    }
}
