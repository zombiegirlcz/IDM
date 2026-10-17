package u80;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f278064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f278065b;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.SYMBOL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.THREE_LETTERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f278064a = iArr;
        int[] iArr2 = new int[e.values().length];
        try {
            iArr2[e.SIGNED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[e.SIGNED_ONLY_NEGATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[e.UNSIGNED.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f278065b = iArr2;
    }
}
