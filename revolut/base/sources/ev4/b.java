package ev4;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public abstract class b {
    public static final TextLocalisedClause a(vl4.c state, vl4.d status) {
        pr4.c cVar;
        Custom custom;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(status, "<this>");
        switch (pr4.b.f238928a[status.ordinal()]) {
            case 1:
                cVar = new pr4.c(R$string.credit_card_statement_status_overdue, R$drawable.uikit_icn_24_exclamation_mark, R$attr.uikit_colorStatusDanger);
                break;
            case 2:
                cVar = new pr4.c(R$string.credit_card_statement_status_upcoming, R$drawable.uikit_icn_24_time, R$attr.uikit_colorGreyTone50);
                break;
            case 3:
                cVar = new pr4.c(R$string.credit_card_statement_status_awaiting_repayment, R$drawable.uikit_icn_24_fees, R$attr.uikit_colorForeground);
                break;
            case 4:
                cVar = new pr4.c(R$string.credit_card_statement_status_partially_repaid, R$drawable.uikit_icn_24_check_success, R$attr.uikit_colorGreyTone50);
                break;
            case 5:
                cVar = new pr4.c(R$string.credit_card_statement_status_repaid, R$drawable.uikit_icn_24_check_success, R$attr.uikit_colorStatusSuccess);
                break;
            case 6:
                cVar = null;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (cVar == null) {
            return null;
        }
        int i = cVar.f238929a;
        if (status == vl4.d.OVERDUE) {
            return new TextLocalisedClause(i, null, new Custom(Integer.valueOf(cVar.f238931c), false, null, false, null, 254), 10);
        }
        int i2 = a.f129703a[state.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            custom = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254);
        } else {
            if (i2 != 4 && i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            custom = new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254);
        }
        return new TextLocalisedClause(i, null, custom, 10);
    }

    public static final dj0.d b(vl4.c state, vl4.d status, dj0.d dVar, dj0.d statementBalance) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(statementBalance, "statementBalance");
        return (!v.k(vl4.c.CLOSED, vl4.c.ONGOING).contains(state) || status == vl4.d.FULLY_PAID || dVar == null) ? statementBalance : dVar;
    }
}
