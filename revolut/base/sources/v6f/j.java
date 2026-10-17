package v6f;

import android.os.Parcelable;
import aw0.o9;
import aw0.t0;
import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.robo.api.RoboApi$Toggles;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import yhm.r;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f286380a;

    public j(z6f.a breakdownMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(breakdownMapper, "breakdownMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f286380a = featureToggleInteractor;
    }

    public final ArrayList a(del.b portfolioBalance, dj0.d dVar, od0.i iVar) {
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ManagedPortfolioDetailsInvestmentsExtensionMapper_contribution", new t0((Clause) new TextLocalisedClause(R$string.managed_portfolios_template_details_investment_contribution, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("ManagedPortfolioDetailsInvestmentsExtensionMapper_value", new t0((Clause) new TextLocalisedClause(R$string.managed_portfolios_template_details_investment_value, null, null, 14), (Image) null, 0, false, 30), new MoneyClause(mif.a.Q(portfolioBalance.f113708a), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
        Intrinsics.checkNotNullParameter(portfolioBalance, "portfolioBalance");
        t0 t0Var = new t0((Clause) new TextLocalisedClause(R$string.managed_portfolios_template_details_investment_unrealised_return, null, null, 14), (Image) null, 0, false, 20);
        vel.j jVar = (vel.j) iVar.f224257a;
        MoneyClause moneyClause = new MoneyClause(jVar != null ? jVar.f288360a : mif.a.Q(portfolioBalance.f113710c), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        vel.j jVar2 = (vel.j) iVar.f224257a;
        BigDecimal bigDecimal = jVar2 != null ? jVar2.f288361b : portfolioBalance.d;
        Object[] elements = {moneyClause, bigDecimal != null ? xqi.a.c(bigDecimal, false, false, false, false, true, 95) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        CompositeClause compositeClause = new CompositeClause(kotlin.collections.d.L(elements), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        Intrinsics.checkNotNullParameter(portfolioBalance, "portfolioBalance");
        return yp0.b.g(v.k(model, model2, new CellDetailsDelegate.Model("ManagedPortfolioDetailsInvestmentsExtensionContract_return", t0Var, compositeClause, null, null, null, null, 0, null, false, false, null, null, 32696)), new ListSubheaderDelegate.Model("ManagedPortfolioDetailsInvestmentsExtensionContract_title", (Image) null, (Clause) new TextLocalisedClause(R$string.managed_portfolios_template_details_investment_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (((jte.d) this.f286380a).c(RoboApi$Toggles.RoboUkBePerformanceCalculation.f85025c)) {
            final int i = 1;
            return new g((List) iii.c.f(t1.u(domainState.f286374a, domainState.f286375b, domainState.f286376c), new v6e.d(2), new v25.g(23), new Function3(this) { // from class: v6f.i

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j f286379b;

                {
                    this.f286379b = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    switch (i) {
                        case 0:
                            Pair content = (Pair) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(content, "content");
                            del.b bVar = (del.b) content.f186385a;
                            dj0.d dVar = (dj0.d) content.f186386b;
                            od0.i.Companion.getClass();
                            return this.f286379b.a(bVar, dVar, od0.i.f224256b);
                        default:
                            r content2 = (r) obj2;
                            ((Boolean) obj3).getClass();
                            Intrinsics.checkNotNullParameter(content2, "content");
                            return this.f286379b.a((del.b) content2.f314201a, (dj0.d) content2.f314202b, (od0.i) content2.f314203c);
                    }
                }
            }));
        }
        final int i2 = 0;
        return new g((List) iii.c.f(t1.t(domainState.f286374a, domainState.f286375b), new v6e.d(1), new v25.g(22), new Function3(this) { // from class: v6f.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f286379b;

            {
                this.f286379b = this;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj2, Object obj3, Object obj4) {
                switch (i2) {
                    case 0:
                        Pair content = (Pair) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(content, "content");
                        del.b bVar = (del.b) content.f186385a;
                        dj0.d dVar = (dj0.d) content.f186386b;
                        od0.i.Companion.getClass();
                        return this.f286379b.a(bVar, dVar, od0.i.f224256b);
                    default:
                        r content2 = (r) obj2;
                        ((Boolean) obj3).getClass();
                        Intrinsics.checkNotNullParameter(content2, "content");
                        return this.f286379b.a((del.b) content2.f314201a, (dj0.d) content2.f314202b, (od0.i) content2.f314203c);
                }
            }
        }));
    }
}
