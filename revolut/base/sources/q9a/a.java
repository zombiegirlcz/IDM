package q9a;

import com.revolut.feature.pix.api.model.PixAuthorisationFrequency;
import com.revolut.feature.pix.api.model.PixQrCodeImplementation;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f243846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f243847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f243848c;

    static {
        int[] iArr = new int[PixQrCodeImplementation.values().length];
        try {
            iArr[PixQrCodeImplementation.PIX_RECURRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PixQrCodeImplementation.PIX_INSTANT_RECURRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PixQrCodeImplementation.PIX.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PixQrCodeImplementation.PIX_LATER_ACCEPTANCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f243846a = iArr;
        int[] iArr2 = new int[PixAuthorisationFrequency.values().length];
        try {
            iArr2[PixAuthorisationFrequency.WEEKLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PixAuthorisationFrequency.MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PixAuthorisationFrequency.QUARTERLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PixAuthorisationFrequency.SEMIANNUAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[PixAuthorisationFrequency.ANNUAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        f243847b = iArr2;
        int[] iArr3 = new int[BeneficiaryIdentificationType.values().length];
        try {
            iArr3[BeneficiaryIdentificationType.BR_CPF.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[BeneficiaryIdentificationType.BR_CNPJ.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        f243848c = iArr3;
    }
}
