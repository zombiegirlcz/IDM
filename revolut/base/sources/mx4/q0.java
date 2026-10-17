package mx4;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import dx4.x3;
import ip0.qd0;
import ip0.vd0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q0 {
    public static List a(x3 item, ax4.b constructorDomainState) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(constructorDomainState, "constructorDomainState");
        Map map = constructorDomainState.f10863m;
        String str = item.d;
        String str2 = item.f120831a;
        String str3 = (String) map.get(str);
        boolean zEquals = str3 != null ? str3.equals(str2) : item.e;
        String str4 = item.f120831a;
        qd0 qd0Var = zEquals ? qd0.SELECTED : qd0.UNSELECTED;
        vd0 vd0Var = vd0.RADIO;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_constructor_radio_option_title, zhm.u.c(item.f120832b), null, 12);
        String str5 = item.f120833c;
        return zhm.u.c(new SelectableDelegate.Model(str4, new RowDelegate.Model(str4, null, textLocalisedClause, null, 0, str5 != null ? new TextLocalisedClause(R$string.credit_application_constructor_radio_option_description, zhm.u.c(new HtmlClause(0, 14, (Integer) null, item, str5)), null, 12) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868826), qd0Var, null, vd0Var, true, new AnalyticsContext(zw4.a.a(str2)), item, null, true, 31304));
    }
}
