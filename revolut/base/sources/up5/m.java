package up5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f281904a;

    static {
        int[] iArr = new int[wp5.f.values().length];
        try {
            iArr[wp5.f.INCORRECT_FEES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wp5.f.EXPIRED_QUOTE_TOKEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f281904a = iArr;
    }
}
