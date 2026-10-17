package y4b;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.cfd.impl.R$string;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import dj0.d;
import iah.h;
import kotlin.coroutines.Continuation;
import nii.g0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements m1h.a {
    @Override // m1h.a
    public final Object a() {
        throw new IllegalStateException("Recurring add money feature is not available for stocks");
    }

    @Override // m1h.a
    public final Object b(TransferSubjectId transferSubjectId, d dVar, h hVar) {
        throw new IllegalStateException("Recurring add money feature is not available for margin");
    }

    @Override // m1h.a
    public final Object c(TransferSubjectId transferSubjectId, d dVar, Continuation continuation) {
        return new g0(new TextLocalisedClause(R$string.wealth_margin_portfolio_add_money_pending_title, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorBlue), false, null, false, null, 254), null, 8)), null, 12), null, null, null, null, null, null, null, false, null, false, null, 16382);
    }
}
