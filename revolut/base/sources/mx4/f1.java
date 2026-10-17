package mx4;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import dx4.c5;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f1 {
    public static List a(c5 item, ax4.b constructorDomainState) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(constructorDomainState, "constructorDomainState");
        String str = item.f120569a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_constructor_switch_title, zhm.u.c(new TextClause(item.f120570b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        Map map = constructorDomainState.k;
        String str2 = item.f120569a;
        ax4.m mVar = (ax4.m) map.get(str2);
        boolean z = mVar != null ? mVar.f10891b : item.e;
        dx4.q qVar = item.f120571c;
        return zhm.u.c(new CellDetailsSwitcherDelegate.Model(str, textLocalisedClause, z, true, qVar != null ? c8g.c.v(qVar) : 0, null, item, new AnalyticsContext(zw4.a.a(str2)), 3872));
    }
}
