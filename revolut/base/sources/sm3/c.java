package sm3;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f264342a;

    static {
        int[] iArr = new int[vm3.b.values().length];
        try {
            iArr[vm3.b.PHONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vm3.b.EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f264342a = iArr;
    }
}
