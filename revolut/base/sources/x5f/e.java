package x5f;

import ael.z;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import vdl.i0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qmc.h f302954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nmc.d f302955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final emc.e f302956c;
    public final qmc.d d;
    public final qmc.b e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0 f302957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f302958h;

    public e(qmc.h roboPortfolioInfoProvider, nmc.d roboPortfolioUIMapper, emc.e templatesInteractor, qmc.d portfolioBalanceProvider, qmc.b roboContextProvider, gte.a featureToggleInteractor, i0 performanceParametersRepository, z performanceCalculator) {
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        Intrinsics.checkNotNullParameter(roboPortfolioUIMapper, "roboPortfolioUIMapper");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(portfolioBalanceProvider, "portfolioBalanceProvider");
        Intrinsics.checkNotNullParameter(roboContextProvider, "roboContextProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(performanceParametersRepository, "performanceParametersRepository");
        Intrinsics.checkNotNullParameter(performanceCalculator, "performanceCalculator");
        this.f302954a = roboPortfolioInfoProvider;
        this.f302955b = roboPortfolioUIMapper;
        this.f302956c = templatesInteractor;
        this.d = portfolioBalanceProvider;
        this.e = roboContextProvider;
        this.f = featureToggleInteractor;
        this.f302957g = performanceParametersRepository;
        this.f302958h = performanceCalculator;
    }

    public final y6f.b a(RoboPortfolioInfo roboPortfolioInfo, del.b bVar, boolean z, vel.j jVar) {
        nmc.d dVar = this.f302955b;
        Clause clauseC = dVar.c(roboPortfolioInfo);
        if (!z) {
            clauseC = new TextLocalisedClause(R$string.wealth_robo_template_details_title, u.c(clauseC), null, 12);
        }
        Image imageB = dVar.b(roboPortfolioInfo);
        MoneyClause moneyClause = new MoneyClause(mif.a.Q(bVar.f113708a), new MoneyClause.Format.Headers(null, null, null, false, false, 31), null, null, 12);
        MoneyClause moneyClause2 = new MoneyClause(jVar != null ? jVar.f288360a : mif.a.Q(bVar.f113710c), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        BigDecimal bigDecimal = jVar != null ? jVar.f288361b : bVar.d;
        Clause[] elements = {moneyClause2, bigDecimal != null ? xqi.a.c(bigDecimal, false, false, false, false, false, 95) : null, hx7.a.G(pdh.c.ALL)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        m70.a.a(t0.f186434a);
        return new y6f.b(clauseC, imageB, new y6f.a(moneyClause, new CompositeClause(listL, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12)));
    }
}
