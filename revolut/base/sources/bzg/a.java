package bzg;

import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.wealth.analytics.R$string;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsProduct f19986a;

    public a(AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f19986a = analyticsProduct;
    }

    public final ActionsBottomSheetController a(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        return new ActionsBottomSheetController(new dii.a(new lw0.a(textLocalisedClause, textLocalisedClause2, null, null, false, 28), new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.wealth_analytics_common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), this.f19986a, null, null, 24));
    }
}
