package poc;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.Intrinsics;
import poc.d;
import rp0.l;
import rp0.t;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j60.a f237958a;

    public b(a provider, j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        this.f237958a = bottomExpandableDialogControllerExtension;
    }

    public final void a(c parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("RISK_METRICS_INFO_BUTTON", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, d.a.f237960a, null, 744);
        int i = R$attr.uikit_dp24;
        int i2 = R$attr.uikit_dp16;
        yp0.b.l(model, i, i, i2, i2, null, false, 48);
        this.f237958a.x(new y(u.c(model), new t(new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_metrics_dialog_title, null, null, 14), new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_metrics_dialog_description, null, null, 14), null, 28), l.WINDOW, null, null, null, 1016));
    }
}
