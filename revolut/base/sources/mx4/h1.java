package mx4;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.s4;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import dx4.g5;
import dx4.h5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h1 {
    public static List a(h5 item, int i) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(item, "item");
        List listL = zhm.v.l(yoj.b.w(new TextLocalisedClause(R$string.credit_application_constructor_tile_title, zhm.u.c(item.f120616b), null, 12), c8g.c.n(item.f120618g)));
        CompositeClause compositeClause = new CompositeClause(listL, null, null, null, 14);
        s4 s4Var = i < 2 ? s4.FIXED_LARGE : s4.FIXED_SMALL;
        String str = item.f120615a;
        dx4.q qVar = item.d;
        Clause clauseF = qVar != null ? c8g.c.F(qVar) : null;
        Intrinsics.checkNotNullParameter(compositeClause, "<this>");
        if (clauseF != null) {
            listL = zhm.d0.F0(clauseF, listL);
        }
        CompositeClause compositeClauseA = CompositeClause.a(compositeClause, listL, null, 14);
        t4 t4Var = new t4(new TextLocalisedClause(R$string.credit_application_constructor_tile_subtitle, zhm.u.c(item.f120617c), null, 12), s4Var);
        g5 g5Var = item.f;
        if (g5Var != null) {
            int i2 = R$string.credit_application_constructor_tile_label;
            List listC = zhm.u.c(new HtmlClause(0, 30, (Integer) null, (Object) null, g5Var.f120608a));
            dx4.l lVar = g5Var.f120609b;
            textLocalisedClause = new TextLocalisedClause(i2, listC, lVar != null ? new Click(28, (Integer) null, (Object) lVar, g5Var.f120608a, false) : null, 8);
        } else {
            textLocalisedClause = null;
        }
        dx4.l lVar2 = item.e;
        CounterTextDelegate.Model model = new CounterTextDelegate.Model(str, compositeClauseA, t4Var, textLocalisedClause, lVar2 != null, lVar2, new AnalyticsContext(zw4.a.a(item.f120615a)), 0, 0, 0, 0, 1920);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return zhm.u.c(model);
    }
}
