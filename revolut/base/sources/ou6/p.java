package ou6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f229839a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.REGULAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.IN_PERSON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.E_COMMERCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f229839a = iArr;
    }
}
