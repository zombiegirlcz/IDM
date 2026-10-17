package rdc;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.revolutpay.shared.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import u6c.k;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public static TextLocalisedClause a(String str, k kVar) {
        switch (kVar == null ? -1 : a.f253409a[kVar.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
                return new TextLocalisedClause(R$string.revolut_pay_error_reason_transaction_declined, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.revolut_pay_error_reason_insufficient_funds, null, null, 14);
            case 5:
                return new TextLocalisedClause(R$string.revolut_pay_error_reason_invalid_card, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.revolut_pay_error_reason_expired_card, null, null, 14);
            case 7:
                return new TextLocalisedClause(R$string.revolut_pay_error_reason_restricted_card, null, null, 14);
            case 8:
                return new TextLocalisedClause(R$string.revolut_pay_error_reason_withdrawal_limit_exceeded, null, null, 14);
            case 9:
                return new TextLocalisedClause(R$string.revolut_pay_error_reason_unkown_card, null, null, 14);
            case 10:
                return new TextLocalisedClause(R$string.revolut_pay_error_reason_pick_up_card, null, null, 14);
            case 11:
                return new TextLocalisedClause(R$string.revolut_pay_error_reason_invalid_email, null, null, 14);
            case 12:
                return new TextLocalisedClause(R$string.revolut_pay_error_reason_do_not_honour, null, null, 14);
            case 13:
                return new TextLocalisedClause(R$string.revolut_pay_error_reason_rejected_by_customer, null, null, 14);
            case 14:
                return new TextLocalisedClause(R$string.revolut_pay_error_reason_cardholder_name_missing, null, null, 14);
            case 15:
                return new TextLocalisedClause(R$string.revolut_pay_error_reason_transaction_not_allowed_for_cardholder, null, null, 14);
            case 16:
                return new TextLocalisedClause(R$string.revolut_pay_error_reason_payment_attempt_blocked, null, null, 14);
            case 17:
                return new TextLocalisedClause(R$string.revolut_pay_error_reason_3ds_challenge_failed, null, null, 14);
            case 18:
                return new TextLocalisedClause(R$string.revolut_pay_error_reason_3ds_challenge_abandoned, null, null, 14);
            case 19:
                return new TextLocalisedClause(R$string.revolut_pay_error_reason_3ds_challenge_failed_manually, null, null, 14);
            case 20:
                return str != null ? new TextLocalisedClause(R$string.revolut_pay_error_reason_customer_name_mismatch, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : new TextLocalisedClause(R$string.revolut_pay_error_reason_payment_attempt_blocked, null, null, 14);
        }
    }
}
