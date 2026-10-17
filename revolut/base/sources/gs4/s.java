package gs4;

import anf.w;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.card.impl.ui.instalment.mapper.TransactionsOverviewController;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.n f146329a;

    public s(whf.n transactionItemsMapper) {
        Intrinsics.checkNotNullParameter(transactionItemsMapper, "transactionItemsMapper");
        this.f146329a = transactionItemsMapper;
    }

    public final TransactionsOverviewController a(whf.p transactionsContent) {
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        List list = transactionsContent.f297646a;
        dj0.d.Companion.getClass();
        dj0.d dVarB = dj0.d.e;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            dVarB = i == 0 ? k71.k.b((a3) obj2) : pyd.c.O(dVarB, k71.k.b((a3) obj2));
            i = i2;
        }
        return new TransactionsOverviewController(new o(new TextLocalisedClause(R$string.credit_card_instalment_transactions_overview_title, null, null, 14), new TextLocalisedClause(R$string.credit_card_instalment_transactions_overview_subtitle, u.c(sx4.f.b(3, null, null, dVarB.a())), null, 12), new TextLocalisedClause(R$string.credit_card_instalment_transactions_overview_button, null, null, 14), ((w) this.f146329a).c(transactionsContent, new whf.l(new thf.k(990, false, false, false, false, false)), new whf.i(false))));
    }
}
