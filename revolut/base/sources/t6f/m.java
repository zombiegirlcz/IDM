package t6f;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.f2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.info.ManagedPortfolioDetailsAboutInfoExtensionContract$InputData;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ox5.q0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ManagedPortfolioDetailsAboutInfoExtensionContract$InputData f268335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f268336b;

    public m(ManagedPortfolioDetailsAboutInfoExtensionContract$InputData inputData, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f268335a = inputData;
        this.f268336b = featureToggleInteractor;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        h domainState = (h) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        Set set = this.f268335a.f91320b;
        if (set.contains(i.INFO)) {
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("ManagedPortfolioDetailsAboutInfoExtensionMapper_about", (Image) null, (Clause) new TextLocalisedClause(((jte.d) this.f268336b).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? R$string.wealth_strategies_portfolio_about_title : R$string.managed_portfolios_template_list_about_widget_about_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            eVarB.addAll((List) iii.c.f(domainState.f268332a, new lk7.o(model, 3), new q0(model, 1), new si5.c(model, domainState, 13)));
        }
        if (set.contains(i.HELP)) {
            CellDetailsChevronDelegate.Model model2 = new CellDetailsChevronDelegate.Model("ManagedPortfolioDetailsAboutInfoExtensionMapper_help", new TextLocalisedClause(R$string.managed_portfolios_template_list_about_widget_help_action_title, null, null, 14), f2.INTERNAL, 0, null, null, 2040);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            eVarB.addAll(u.c(model2));
        }
        return new k(u.a(eVarB));
    }
}
