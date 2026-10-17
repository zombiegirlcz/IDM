package eoc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import ip0.qd0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.t;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static y a(hoc.e chartSettings, e state) {
        Intrinsics.checkNotNullParameter(chartSettings, "chartSettings");
        Intrinsics.checkNotNullParameter(state, "state");
        if (Intrinsics.f(chartSettings, hoc.e.f154273a)) {
            return new y(u.c(new SelectableDelegate.Model("LIST_ID_ROW_CONTRIBUTION_SELECTABLE", new RowDelegate.Model("LIST_ID_ROW_CONTRIBUTION_ROW", LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_cash_flow, R$attr.uikit_colorAccent, R$attr.uikit_colorAccent_10), null, null, new TextLocalisedClause(R$string.wealth_robo_portfolio_total_value_settings_your_contribution_title, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_portfolio_total_value_settings_your_contribution_subtitle, null, null, 14), null, null, 0, null, false, false, null, null, null, null, null, new d(new c(state.f127899a)), null, 0, 0, 0, 0, 1056964460), state.f127899a ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760)), new t(new TextLocalisedClause(R$string.wealth_robo_portfolio_total_value_settings_title, null, null, 14), null, null, 30), null, null, null, null, 1020);
        }
        throw new NoWhenBranchMatchedException();
    }
}
