package h7f;

import android.os.Parcelable;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import grl.k9;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    public static dii.a a() {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.wealth_robo_template_details_rebalance_state_closure_title, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_template_details_rebalance_state_closure_description_without_placeholder, null, null, 14), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_robo_common_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1016), null, null, 55);
        k9 k9Var = k9.RoboAdvisor;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24);
    }
}
