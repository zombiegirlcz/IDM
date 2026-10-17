package pzk;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.trading_onboarding.impl.R$string;
import java.util.List;
import jki.i;
import jki.j;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(i iVar) {
        j domainState = (j) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RowDelegate.Model model = new RowDelegate.Model("TRADING_INVESTMENT_GOALS_MAXIMIZE", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_wealth, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 62), new TextLocalisedClause(R$string.wealth_onboarding_eu_objectives_maximize_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_onboarding_eu_objectives_maximize_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        RowDelegate.Model model2 = new RowDelegate.Model("TRADING_INVESTMENT_GOALS_OPPORTUNISTIC", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_candlestick_chart, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 62), new TextLocalisedClause(R$string.wealth_onboarding_eu_objectives_opportunistic_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_onboarding_eu_objectives_opportunistic_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        RowDelegate.Model model3 = new RowDelegate.Model("TRADING_INVESTMENT_GOALS_FREQUENT", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_lightning, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 62), new TextLocalisedClause(R$string.wealth_onboarding_eu_objectives_frequent_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_onboarding_eu_objectives_frequent_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        RowDelegate.Model model4 = new RowDelegate.Model("TRADING_INVESTMENT_GOALS_PRESERVATION", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_limit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 62), new TextLocalisedClause(R$string.wealth_onboarding_eu_objectives_preservation_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_onboarding_eu_objectives_preservation_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
        RowDelegate.Model model5 = new RowDelegate.Model("TRADING_INVESTMENT_GOALS_INVESTING", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_lightbulb, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 62), new TextLocalisedClause(R$string.wealth_onboarding_eu_objectives_investing_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.wealth_onboarding_eu_objectives_investing_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
        return new c(v.k(model, model2, model3, model4, model5));
    }
}
