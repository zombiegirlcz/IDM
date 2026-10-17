package mx4;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.core.R$string;
import ip0.iq;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r {
    public static List a(r rVar, dx4.t0 item, Map map, int i, int i2, int i3) {
        ax4.a aVar;
        Map map2 = (i3 & 2) != 0 ? null : map;
        int i5 = (i3 & 4) != 0 ? R$attr.uikit_dp8 : i;
        int i6 = (i3 & 8) != 0 ? R$attr.uikit_dp8 : i2;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f120770a;
        InputChecklistDelegate.Model model = new InputChecklistDelegate.Model(str, new TextLocalisedClause(R$string.constructor_template_checkbox, zhm.u.c(new HtmlClause(0, 14, (Integer) null, item, item.f120771b)), null, 12), (map2 == null || (aVar = (ax4.a) map2.get(str)) == null) ? item.d : aVar.f10854a, false, null, iq.CHECK_BUTTON, null, null, item, new AnalyticsContext(zw4.a.a(str)), 0, 0, 0, 523480);
        yp0.b.l(model, i5, i6, 0, 0, null, false, 60);
        return zhm.u.c(model);
    }
}
