package lnc;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.robo.impl.ui.screen.risk_metrics.RiskMetricsScreenContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import lk7.n;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final onc.b f197148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pnc.b f197149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nmc.d f197150c;
    public final RiskMetricsScreenContract$InputData d;

    public g(onc.b performanceWidgetProvider, pnc.b riskWidgetProvider, nmc.d roboPortfolioUiMapper, RiskMetricsScreenContract$InputData input) {
        Intrinsics.checkNotNullParameter(performanceWidgetProvider, "performanceWidgetProvider");
        Intrinsics.checkNotNullParameter(riskWidgetProvider, "riskWidgetProvider");
        Intrinsics.checkNotNullParameter(roboPortfolioUiMapper, "roboPortfolioUiMapper");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f197148a = performanceWidgetProvider;
        this.f197149b = riskWidgetProvider;
        this.f197150c = roboPortfolioUiMapper;
        this.d = input;
    }

    @Override // jki.p
    public final m a(i iVar) {
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_robo_portfolio_risk_metrics_description_v2, u.c(this.f197150c.g(this.d.f85194a)), null, 12);
        Data data = domainState.f197140a;
        List list = data != null ? (List) iii.c.f(data, new llb.e(20), new lk7.m(29), new n(this, 3)) : null;
        if (list == null) {
            list = f0.f322471a;
        }
        return new e(textLocalisedClause, list);
    }
}
