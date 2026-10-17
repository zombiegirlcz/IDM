package wlf;

import aw0.o9;
import aw0.u0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transactions.impl.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import tof.w3;
import tof.x3;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static CellDetailsDelegate.Model a(String str) {
        if (str != null) {
            return new CellDetailsDelegate.Model("ID_BLIK_OPERATION_NUMBER", new TextLocalisedClause(R$string.transactionUI_transaction_blik_operation_number, null, null, 14), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, u0.LARGE, null, false, 0, 0, 32632);
        }
        return null;
    }

    public static CellDetailsDelegate.Model b(w3 w3Var) {
        Clause textClause;
        if (w3Var == null) {
            return null;
        }
        if (w3Var instanceof w3.d) {
            textClause = new TextLocalisedClause(com.revolut.feature.apm.blik.api.R$string.blik_transaction_payment_type_pos_purchase, null, null, 14);
        } else if (w3Var instanceof w3.e) {
            textClause = new TextLocalisedClause(com.revolut.feature.apm.blik.api.R$string.blik_transaction_payment_type_pos_purchase_cancel, null, null, 14);
        } else if (w3Var instanceof w3.f) {
            textClause = new TextLocalisedClause(com.revolut.feature.apm.blik.api.R$string.blik_transaction_payment_type_pos_purchase_correct, null, null, 14);
        } else if (w3Var instanceof w3.g) {
            textClause = new TextLocalisedClause(com.revolut.feature.apm.blik.api.R$string.blik_transaction_payment_type_pos_return, null, null, 14);
        } else if (w3Var instanceof w3.h) {
            textClause = new TextLocalisedClause(com.revolut.feature.apm.blik.api.R$string.blik_transaction_payment_type_pos_return_cancel, null, null, 14);
        } else if (w3Var instanceof w3.i) {
            textClause = new TextLocalisedClause(com.revolut.feature.apm.blik.api.R$string.blik_transaction_payment_type_web_purchase, null, null, 14);
        } else if (w3Var instanceof w3.j) {
            textClause = new TextLocalisedClause(com.revolut.feature.apm.blik.api.R$string.blik_transaction_payment_type_web_purchase_cancel, null, null, 14);
        } else if (w3Var instanceof w3.k) {
            textClause = new TextLocalisedClause(com.revolut.feature.apm.blik.api.R$string.blik_transaction_payment_type_web_purchase_correct, null, null, 14);
        } else if (w3Var instanceof w3.l) {
            textClause = new TextLocalisedClause(com.revolut.feature.apm.blik.api.R$string.blik_transaction_payment_type_web_return, null, null, 14);
        } else if (w3Var instanceof w3.m) {
            textClause = new TextLocalisedClause(com.revolut.feature.apm.blik.api.R$string.blik_transaction_payment_type_web_return_cancel, null, null, 14);
        } else if (w3Var instanceof w3.a) {
            textClause = new TextLocalisedClause(com.revolut.feature.apm.blik.api.R$string.blik_transaction_payment_type_cash_withdrawal, null, null, 14);
        } else if (w3Var instanceof w3.b) {
            textClause = new TextLocalisedClause(com.revolut.feature.apm.blik.api.R$string.blik_transaction_payment_type_cash_withdrawal_cancel, null, null, 14);
        } else if (w3Var instanceof w3.c) {
            textClause = new TextLocalisedClause(com.revolut.feature.apm.blik.api.R$string.blik_transaction_payment_type_cash_withdrawal_correct, null, null, 14);
        } else {
            if (!(w3Var instanceof x3)) {
                throw new NoWhenBranchMatchedException();
            }
            textClause = new TextClause(((x3) w3Var).f273158a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return new CellDetailsDelegate.Model("ID_OTP_PAYMENT_METHOD", new TextLocalisedClause(R$string.transactionUI_transaction_payment_method, null, null, 14), textClause, 0, null, null, null, u0.LARGE, null, false, 0, 0, 32632);
    }
}
