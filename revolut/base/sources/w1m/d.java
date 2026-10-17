package w1m;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f293892a;

    static {
        int[] iArr = new int[a3m.g.values().length];
        try {
            iArr[a3m.g.DRIVERS_LICENSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a3m.g.RESIDENCE_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a3m.g.SPECIAL_PERMANENT_RESIDENT_CERTIFICATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a3m.g.INDIVIDUAL_NUMBER_CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f293892a = iArr;
    }
}
