package uyl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f284470a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.EXPIRE_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.CVV.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l.POSTCODE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f284470a = iArr;
    }
}
