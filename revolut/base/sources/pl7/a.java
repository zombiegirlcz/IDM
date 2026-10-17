package pl7;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f237276a;

    static {
        int[] iArr = new int[q06.e.values().length];
        try {
            iArr[q06.e.CarInsurancePolicy.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q06.e.CarInsuranceTelematicsDeviceDelivery.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q06.e.CarInsuranceUploadDocuments.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[q06.e.CarInsuranceSmartDriving.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f237276a = iArr;
    }
}
