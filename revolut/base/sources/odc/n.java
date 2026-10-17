package odc;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.revolutpay.shared.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class n {
    public static aw0.e a(dj0.d dVar, m6c.c cVar, boolean z, Clause clause) {
        return b(clause, cVar == m6c.c.PAY_LATER ? new TextLocalisedClause(R$string.revolut_pay_order_summary_button_pay_later, u.c(d(dVar)), null, 12) : new TextLocalisedClause(R$string.revolut_pay_common_action_pay_amount, u.c(d(dVar)), null, 12), z);
    }

    public static aw0.e b(Clause clause, TextLocalisedClause textLocalisedClause, boolean z) {
        return new aw0.e(true, clause, null, new n6(textLocalisedClause, LargeActionButton.ButtonStyle.f58725a, null, null, z, null, null, 988), null, null, 52);
    }

    public static aw0.e c(m state, Clause clause, m6c.c paymentAction) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(paymentAction, "paymentAction");
        if (state instanceof g) {
            n6.Companion.getClass();
            n6 n6VarA = m6.a();
            Clause clause2 = n6VarA.f10433a;
            LargeActionButton.ButtonStyle style = n6VarA.f10434b;
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter("", "tag");
            return new aw0.e(true, null, null, new n6(clause2, style, null, null, null, "", false, null, null, null, null), null, null, 52);
        }
        if (state instanceof d) {
            return b(clause, new TextLocalisedClause(R$string.revolut_pay_common_action_pay, null, null, 14), false);
        }
        if (state instanceof c) {
            return a(((c) state).f224441a, paymentAction, true, clause);
        }
        if (state instanceof h) {
            return a(((h) state).f224446a, paymentAction, false, clause);
        }
        if (state instanceof j) {
            return a(((j) state).f224448a, paymentAction, false, clause);
        }
        if (state instanceof a) {
            return a(((a) state).f224439a, paymentAction, false, clause);
        }
        if (state instanceof b) {
            return a(((b) state).f224440a, paymentAction, false, clause);
        }
        if (state instanceof i) {
            return a(((i) state).f224447a, paymentAction, false, clause);
        }
        if (state instanceof e) {
            return a(((e) state).f224443a, paymentAction, false, clause);
        }
        if (state instanceof f) {
            return a(((f) state).f224444a, paymentAction, false, clause);
        }
        if (state instanceof k) {
            k kVar = (k) state;
            return b(clause, kVar.f224451c ? new TextLocalisedClause(R$string.revolut_pay_order_summary_action_button_authorize_mit, null, null, 14) : new TextLocalisedClause(R$string.revolut_pay_order_summary_action_button_authorize_pay_mit, u.c(d(kVar.f224449a)), null, 12), true);
        }
        if (state instanceof l) {
            return b(clause, new TextLocalisedClause(R$string.revolut_pay_common_action_pay, null, null, 14), false);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static MoneyClause d(dj0.d dVar) {
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 7), null, o9.NON_SENSITIVE, 4);
    }
}
