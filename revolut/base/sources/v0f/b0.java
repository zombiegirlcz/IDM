package v0f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f284797a;

    static {
        int[] iArr = new int[t.values().length];
        try {
            iArr[t.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t.EXPIRE_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t.CVV.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[t.POSTCODE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[t.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f284797a = iArr;
    }
}
