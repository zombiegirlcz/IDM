package pl7;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f237281a;

    static {
        int[] iArr = new int[q06.e.values().length];
        try {
            iArr[q06.e.CarInsurance.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q06.e.CarInsurancePolicy.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q06.e.CarInsuranceTelematicsDeviceDelivery.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[q06.e.CarInsuranceUploadDocuments.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[q06.e.CarInsuranceSmartDriving.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f237281a = iArr;
    }
}
