package v18;

import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements n {
    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listK = v.k(new PlainTextDelegate.Model("COMPLIANCE_POPUP_PARAGRAPH_1", (Clause) null, (Clause) new TextLocalisedClause(R$string.invest_smart_notifications_launch_disclaimer_paragraph1, null, null, 14), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518), new PlainTextDelegate.Model("COMPLIANCE_POPUP_PARAGRAPH_2", (Clause) null, (Clause) new TextLocalisedClause(R$string.invest_smart_notifications_launch_disclaimer_paragraph2, u.c(new TextLocalisedClause(R$string.invest_smart_notifications_launch_disclaimer_settings, null, new Click(28, (Integer) null, (Object) e.f285270a, "COMPLIANCE_POPUP_ACTION_SETTINGS", false), 10)), null, 12), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.e(false, new TextLocalisedClause(R$string.invest_smart_notifications_launch_disclaimer_footer, null, null, 14), null, new n6(new TextLocalisedClause(R$string.invest_smart_notifications_launch_disclaimer_action_primary, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, d.f285269a, 508), null, null, 53), listK, new lw0.a(new TextLocalisedClause(R$string.invest_smart_notifications_launch_disclaimer_title, null, null, 14), null, null, null, false, 30));
    }
}
