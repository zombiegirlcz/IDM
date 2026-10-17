package uba;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listK = v.k(new CellDetailsDelegate.Model("ID_INTEREST_FIELD", new TextLocalisedClause(R$string.pix_transaction_review_amount_breakdown_item_interest, null, null, 14), new MoneyClause(domainState.f278792a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("ID_LATE_FEE_FIELD", new TextLocalisedClause(R$string.pix_transaction_review_amount_breakdown_item_late_fee, null, null, 14), new MoneyClause(domainState.f278793b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("ID_DISCOUNT_FIELD", new TextLocalisedClause(R$string.pix_transaction_review_amount_breakdown_item_discount, null, null, 14), new MoneyClause(domainState.f278794c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760), new CellDetailsDelegate.Model("ID_REBATE_FIELD", new TextLocalisedClause(R$string.pix_transaction_review_amount_breakdown_item_rebate, null, null, 14), new MoneyClause(domainState.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new e(listK);
    }
}
