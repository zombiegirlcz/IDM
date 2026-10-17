package hoa;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f154256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f154257b;

    static {
        int[] iArr = new int[a59.a.values().length];
        try {
            iArr[a59.a.ESSENTIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a59.a.ADVANCED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f154256a = iArr;
        int[] iArr2 = new int[a59.b.values().length];
        try {
            iArr2[a59.b.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[a59.b.WEALTH_INSIGHTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f154257b = iArr2;
    }
}
