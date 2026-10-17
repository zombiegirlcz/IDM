package q2f;

import aw0.h;
import aw0.m6;
import aw0.n6;
import aw0.t0;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.trade_rev_points.api.R$string;
import com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.limit.TradeRevPointsAccountLimitInfoScreenContract$InputData;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccountTransferLimit;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TradeRevPointsAccountLimitInfoScreenContract$InputData f241639a;

    public f(TradeRevPointsAccountLimitInfoScreenContract$InputData inputData, v1f.c clauseFormatter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(clauseFormatter, "clauseFormatter");
        this.f241639a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.trade_rev_points_transfer_limit_title, null, null, 14), new TextLocalisedClause(R$string.trade_rev_points_transfer_limit_subtitle, null, null, 14), null, null, false, 28);
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.trade_rev_points_transfer_limit_cell_yearly_limit, null, null, 14), (Image) null, 0, false, 30);
        TradeRevPointsAccountLimitInfoScreenContract$InputData tradeRevPointsAccountLimitInfoScreenContract$InputData = this.f241639a;
        u2f.k kVar = tradeRevPointsAccountLimitInfoScreenContract$InputData.f91177b;
        TradeRevPointsAccountTransferLimit tradeRevPointsAccountTransferLimit = tradeRevPointsAccountLimitInfoScreenContract$InputData.f91176a;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("POINTS_YEARLY_LIMIT_ITEM_ID", t0Var, v1f.c.d(kVar, tradeRevPointsAccountTransferLimit.f91184a, null), null, null, null, null, 0, null, false, false, null, null, 32760);
        t0 t0Var2 = new t0((Clause) new TextLocalisedClause(R$string.trade_rev_points_transfer_limit_cell_spent, null, null, 14), (Image) null, 0, false, 30);
        u2f.k kVar2 = tradeRevPointsAccountLimitInfoScreenContract$InputData.f91177b;
        List listK = v.k(model, new CellDetailsDelegate.Model("POINTS_SPENT_ITEM_ID", t0Var2, v1f.c.d(kVar2, tradeRevPointsAccountTransferLimit.f91185b, null), null, null, null, null, 0, null, false, false, null, null, 32760), new CellDetailsDelegate.Model("POINTS_LEFT_LIMIT_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.trade_rev_points_transfer_limit_cell_left, null, null, 14), (Image) null, 0, false, 30), v1f.c.d(kVar2, tradeRevPointsAccountTransferLimit.f91186c, null), null, null, null, null, 0, null, false, false, null, null, 32760));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        m6 m6Var = n6.Companion;
        return new cii.b(new h(false, m6.c(m6Var, new TextLocalisedClause(R$string.trade_rev_points_common_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), m6.c(m6Var, new TextLocalisedClause(R$string.trade_rev_points_top_up_upgrade_action_button_title, null, null, 14), LargeActionButton.ButtonStyle.f, null, null, false, null, null, null, 1020), null, null, null, 121), listK, aVar);
    }
}
