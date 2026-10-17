package orb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f228103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f228104b;

    static {
        int[] iArr = new int[bfl.g.values().length];
        try {
            iArr[bfl.g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bfl.g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f228103a = iArr;
        int[] iArr2 = new int[f8l.b.values().length];
        try {
            iArr2[f8l.b.FROM.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[f8l.b.TO.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f228104b = iArr2;
    }
}
