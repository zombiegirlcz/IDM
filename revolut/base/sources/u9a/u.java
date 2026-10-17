package u9a;

import com.revolut.feature.pix.api.model.PixAuthorisationFrequency;
import com.revolut.retail.feature.beneficiary.models.BeneficiaryIdentificationType;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f278443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f278444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f278445c;

    static {
        int[] iArr = new int[BeneficiaryIdentificationType.values().length];
        try {
            iArr[BeneficiaryIdentificationType.BR_CPF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BeneficiaryIdentificationType.BR_CNPJ.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f278443a = iArr;
        int[] iArr2 = new int[PixAuthorisationFrequency.values().length];
        try {
            iArr2[PixAuthorisationFrequency.DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[PixAuthorisationFrequency.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PixAuthorisationFrequency.FORTNIGHTLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PixAuthorisationFrequency.MONTHLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PixAuthorisationFrequency.QUARTERLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PixAuthorisationFrequency.SEMIANNUAL.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[PixAuthorisationFrequency.ANNUAL.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        f278444b = iArr2;
        int[] iArr3 = new int[g8a.m.values().length];
        try {
            iArr3[g8a.m.CANCELLED_BY_RECIPIENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[g8a.m.CANCELLED_BY_SERVICE_PROVIDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[g8a.m.DECLINED.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[g8a.m.ENDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[g8a.m.EXPIRED.ordinal()] = 5;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[g8a.m.FAILED.ordinal()] = 6;
        } catch (NoSuchFieldError unused15) {
        }
        f278445c = iArr3;
    }
}
