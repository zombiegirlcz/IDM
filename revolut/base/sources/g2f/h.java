package g2f;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsHeadlineDelegate;
import com.revolut.core.ui_kit.delegates.n2;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.trade_rev_points.api.R$string;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsRate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class h {
    public h(v1f.c clauseFormatter) {
        Intrinsics.checkNotNullParameter(clauseFormatter, "clauseFormatter");
    }

    public final CellDetailsHeadlineDelegate.Model a(u2f.d agent) {
        String str;
        Intrinsics.checkNotNullParameter(agent, "agent");
        TradeRevPointsRate tradeRevPointsRate = agent.f276624m.f276642h;
        n2 n2Var = null;
        if (tradeRevPointsRate == null) {
            return null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.miles_airline_details_rate_info_title, null, null, 14);
        CompositeClause compositeClauseF = v1f.c.f(tradeRevPointsRate, v1f.a.REV_POINTS, null);
        u2f.g gVar = agent.f276624m.i;
        if (gVar != null && (str = gVar.f276637c) != null) {
            n2Var = new n2(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        CellDetailsHeadlineDelegate.Model model = new CellDetailsHeadlineDelegate.Model(textLocalisedClause, compositeClauseF, n2Var);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public final koi.j b(u2f.d agent) {
        Intrinsics.checkNotNullParameter(agent, "agent");
        if (agent.f276625n.size() != 1) {
            return a(agent);
        }
        int i = g.f140044a[((u2f.l) d0.b0(agent.f276625n)).ordinal()];
        if (i == 1) {
            return a(agent);
        }
        if (i == 2 || i == 3) {
            CellDetailsHeadlineDelegate.Model model = new CellDetailsHeadlineDelegate.Model(new TextLocalisedClause(R$string.miles_airline_details_offer_title, null, null, 14), new TextLocalisedClause(R$string.trade_rev_points_agent_details_offer_description, null, null, 14), null);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return model;
        }
        if (i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
