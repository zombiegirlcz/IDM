package vq1;

import com.revolut.feature.apm.bills.pagopa.api.R$string;

/* JADX INFO: loaded from: classes20.dex */
public final class e {
    public static nq1.a a(int i) {
        Integer numValueOf;
        Integer numValueOf2;
        switch (i) {
            case 32100:
                numValueOf = Integer.valueOf(R$string.pago_pa_error_bill_unknown_title);
                numValueOf2 = Integer.valueOf(R$string.pago_pa_error_bill_unknown_description);
                break;
            case 32101:
                numValueOf = Integer.valueOf(R$string.pago_pa_error_bill_already_paid_title);
                numValueOf2 = Integer.valueOf(R$string.pago_pa_error_bill_already_paid_description);
                break;
            case 32102:
                numValueOf = Integer.valueOf(R$string.pago_pa_error_bill_session_already_opened_title);
                numValueOf2 = Integer.valueOf(R$string.pago_pa_error_bill_session_already_opened_description);
                break;
            case 32103:
                numValueOf = Integer.valueOf(R$string.pago_pa_error_processing_issue_title);
                numValueOf2 = Integer.valueOf(R$string.pago_pa_error_processing_issue_description);
                break;
            case 32104:
                numValueOf = Integer.valueOf(R$string.pago_pa_error_bill_timeout_title);
                numValueOf2 = Integer.valueOf(R$string.pago_pa_error_bill_timeout_description);
                break;
            case 32105:
                numValueOf = Integer.valueOf(R$string.pago_pa_error_service_inactive_title);
                numValueOf2 = Integer.valueOf(R$string.pago_pa_error_service_inactive_description);
                break;
            case 32106:
                numValueOf = Integer.valueOf(R$string.pago_pa_error_technical_issue_title);
                numValueOf2 = Integer.valueOf(R$string.pago_pa_error_technical_issue_description);
                break;
            default:
                numValueOf = null;
                numValueOf2 = null;
                break;
        }
        if (numValueOf == null || numValueOf2 == null) {
            return null;
        }
        return new nq1.a(numValueOf.intValue(), numValueOf2.intValue());
    }
}
