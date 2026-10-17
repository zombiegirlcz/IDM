package mx4;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.za;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import dx4.r3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n0 {
    public static List a(r3 item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f120748a;
        TextLocalisedClause textLocalisedClauseA = ky4.a.a(R$string.credit_application_constructor_plan_amount_header_header, item.f120749b);
        TextLocalisedClause textLocalisedClauseA2 = ky4.a.a(R$string.credit_application_constructor_plan_amount_header_title, item.f120750c);
        TextLocalisedClause textLocalisedClauseA3 = ky4.a.a(R$string.credit_application_constructor_plan_amount_header_title_extra, item.d);
        TextLocalisedClause textLocalisedClauseA4 = ky4.a.a(R$string.credit_application_constructor_plan_amount_header_footer, item.f);
        String str2 = item.e;
        return zhm.u.c(new PlanTileDelegate.Model(str, new za(textLocalisedClauseA, textLocalisedClauseA2, textLocalisedClauseA3, textLocalisedClauseA4, item.f120751g != null, str2 != null ? ky4.a.a(R$string.credit_application_constructor_plan_amount_header_description, str2) : null), null, null, false, false, item.f120751g, new AnalyticsContext(zw4.a.a(item.f120748a)), 3900));
    }
}
