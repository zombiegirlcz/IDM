package q9a;

import com.revolut.feature.pix.api.model.PixAuthorisationFrequency;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f243849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f243850b;

    static {
        int[] iArr = new int[PixAuthorisationFrequency.values().length];
        try {
            iArr[PixAuthorisationFrequency.WEEKLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PixAuthorisationFrequency.MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PixAuthorisationFrequency.QUARTERLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PixAuthorisationFrequency.SEMIANNUAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[PixAuthorisationFrequency.ANNUAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f243849a = iArr;
        int[] iArr2 = new int[BeneficiaryIdentificationType.values().length];
        try {
            iArr2[BeneficiaryIdentificationType.BR_CPF.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[BeneficiaryIdentificationType.BR_CNPJ.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f243850b = iArr2;
    }
}
