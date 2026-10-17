package g2f;

import aw0.o9;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.trade_rev_points.api.R$string;
import ip0.ej;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import mx0.c7;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static koi.j a(u2f.d agent) {
        Intrinsics.checkNotNullParameter(agent, "agent");
        Object[] elements = {d0.W(agent.f276620g) ? null : new TextClause(agent.f276620g, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.trade_rev_points_agent_details_footer_terms_text, u.c(new TextLocalisedClause(R$string.trade_rev_points_agent_details_footer_terms_conditions, v.k(new TextClause(agent.f276624m.f276640c, (Style) new Click(28, (Integer) null, (Object) agent.i, "PARTNER_TERMS_WEBSITE_ID", false), (Integer) null, false, (o9) null, (List) null, 124), new TextLocalisedClause(R$string.trade_rev_points_agent_details_footer_terms_rev_points, null, new Click(30, (Integer) null, (Object) null, "REV_POINTS_TERMS_ID", false), 10)), null, 12)), null, 12)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        m70.a.t(t0.f186434a);
        ej ejVar = new ej("DESCRIPTION_LIST_ID", new c7(new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, null, 6));
        yp0.b.r(ejVar, 0, 0, 0, 0, 15);
        return ejVar;
    }
}
