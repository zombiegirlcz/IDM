package l02;

import com.revolut.data.network.models.beneficiary.BeneficiaryIdentificationTypeDto;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;
import com.revolut.feature.apm.core.models.payments_authorisations.ExecutionType;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f191142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f191143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f191144c;

    static {
        int[] iArr = new int[ApmPaymentAuthorisationPaymentMethod.values().length];
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.GIRO_HU_DIRECT_DEBIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.IRIS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.PAY_TO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.PIX_MANDATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.PSE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.WERO.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.UPI.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.MASAV_IL_DIRECT_DEBIT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.MASAV_IL_R2P.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.AANI.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.ALIPAY_PLUS.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        f191142a = iArr;
        int[] iArr2 = new int[ExecutionType.values().length];
        try {
            iArr2[ExecutionType.ONE_TIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[ExecutionType.OTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        f191143b = iArr2;
        int[] iArr3 = new int[BeneficiaryIdentificationTypeDto.values().length];
        try {
            iArr3[BeneficiaryIdentificationTypeDto.BR_CPF.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[BeneficiaryIdentificationTypeDto.BR_CNPJ.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        f191144c = iArr3;
    }
}
