package r4f;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.trading.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements m1h.d {
    @Override // m1h.d
    public final Clause a(m1h.b disclaimer) {
        int i;
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        if (disclaimer instanceof c) {
            c cVar = (c) disclaimer;
            if (cVar instanceof a) {
                switch (d.f251447a[((a) disclaimer).f251445a.ordinal()]) {
                    case 1:
                        i = R$string.wealth_cash_fund_fx_disclaimer_uk;
                        break;
                    case 2:
                        i = R$string.wealth_cash_fund_fx_disclaimer_eea;
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        i = R$string.wealth_cash_fund_fx_disclaimer;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
                Intrinsics.checkNotNullParameter("question.will-i-be-charged-for-exchanging-foreign-currencies", "key");
                return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(textLocalisedClause, new TextLocalisedClause(R.string.common_action_learn_more, null, new Click(28, (Integer) null, (Object) new f(), "STOCKS_INFO_DISCLAIMER_LEARN_MORE_LIST_ID", false), 10)));
            }
            if (!cVar.equals(b.f251446a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
