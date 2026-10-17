package w1m;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f293893a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.DriversLicense.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.ResidenceCard.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.SpecialPermanentResidentCertificate.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g.IndividualNumberCard.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f293893a = iArr;
    }
}
