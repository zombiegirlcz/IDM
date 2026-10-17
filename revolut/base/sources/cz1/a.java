package cz1;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPaymentMethod;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f110139a;

    static {
        int[] iArr = new int[ApmPaymentAuthorisationPaymentMethod.values().length];
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.PAY_TO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.UPI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.GIRO_HU_DIRECT_DEBIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.MASAV_IL_DIRECT_DEBIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.AANI.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.ALIPAY_PLUS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.IRIS.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.PIX_MANDATE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.PSE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.WERO.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[ApmPaymentAuthorisationPaymentMethod.MASAV_IL_R2P.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        f110139a = iArr;
    }
}
