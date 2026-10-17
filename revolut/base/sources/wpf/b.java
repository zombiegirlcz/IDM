package wpf;

import com.revolut.feature.kyc.api.my_number.JpMyNumberKycStatusViewConfigurationFactory$Parcel;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f299232a;

    static {
        int[] iArr = new int[JpMyNumberKycStatusViewConfigurationFactory$Parcel.values().length];
        try {
            iArr[JpMyNumberKycStatusViewConfigurationFactory$Parcel.ABSENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JpMyNumberKycStatusViewConfigurationFactory$Parcel.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[JpMyNumberKycStatusViewConfigurationFactory$Parcel.RECEIVER_ISSUES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f299232a = iArr;
    }
}
