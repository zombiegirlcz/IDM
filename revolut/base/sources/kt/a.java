package kt;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f189483a;

    static {
        int[] iArr = new int[h00.c.values().length];
        try {
            iArr[h00.c.PASSPORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h00.c.NATIONAL_IDENTITY_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h00.c.DRIVING_LICENCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h00.c.RESIDENCE_PERMIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[h00.c.PASSPORT_CARD.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f189483a = iArr;
    }
}
