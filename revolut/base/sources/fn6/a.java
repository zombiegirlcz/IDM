package fn6;

import aw0.e;
import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements le6.a {
    public final dii.a a(AnalyticsProduct analyticsProduct, String dialogTitle, String dialogDescription) {
        Intrinsics.checkNotNullParameter(dialogTitle, "dialogTitle");
        Intrinsics.checkNotNullParameter(dialogDescription, "dialogDescription");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        return new dii.a(new lw0.a(new TextClause(dialogTitle, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(dialogDescription, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 28), new e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), analyticsProduct, null, null, 24);
    }

    public final dii.a b(String institutionName, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        return new dii.a(new lw0.a(new TextLocalisedClause(R$string.topup_external_institutions_status_unhealthy_prompt_title, u.c(institutionName), null, 12), new TextLocalisedClause(R$string.topup_external_institutions_status_unhealthy_prompt_subtitle, null, null, 14), null, null, false, 28), new e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), analyticsProduct, null, null, 24);
    }
}
