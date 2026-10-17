package mx4;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import dx4.m4;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class y0 {
    public static List a(m4 item, ax4.b constructorDomainState) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(constructorDomainState, "constructorDomainState");
        String str = item.f120680a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_application_constructor_row_switch_title, zhm.u.c(new TextClause(item.f120681b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        String str2 = item.f120682c;
        TextLocalisedClause textLocalisedClause2 = str2 != null ? new TextLocalisedClause(R$string.credit_application_constructor_row_switch_description, zhm.u.c(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null;
        ax4.m mVar = (ax4.m) constructorDomainState.k.get(str);
        return zhm.u.c(new RowDelegate.Model(str, null, textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, new vf(mVar != null ? mVar.f10891b : item.d, true), false, null, false, null, null, null, null, null, null, item, new AnalyticsContext(zw4.a.a(str)), 0, 0, 0, 0, 524286938));
    }
}
