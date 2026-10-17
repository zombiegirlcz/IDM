package fnc;

import com.revolut.feature.robo.api.RoboApi$Toggles;
import com.revolut.feature.robo.impl.ui.screen.portfolio_details.PortfolioDetailsScreenContract$InputData;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.trading.managed_portfolios.api.ManagedPortfoliosApi$Toggles$RoboInvestmentSectionRedesign;
import com.revolut.feature.wealth.api.ui.invest.transactions.list.InvestTransactionsListContract$Disclaimers;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import com.revolut.shared.feature.wealth.models.transaction.InvestTransactionsFilter;
import gld.f0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 extends oki.h implements o {
    public final jlc.d A;
    public final gte.a B;
    public final mkd.d C;
    public final qmc.b D;
    public final e7f.b E;
    public final cli.y F;
    public final vii.b G;
    public final Object H;
    public final Object I;
    public final qmc.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zjh.f f136628p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final noc.u f136629q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final PortfolioDetailsScreenContract$InputData f136630r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boc.m f136631s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final moc.a f136632t;
    public final jlc.u u;
    public final tpc.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final jlc.x f136633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final rul.e f136634x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h1h.b f136635y;
    public final doc.f z;

    public d0(m initialState, v stateMapper, qmc.h portfolioInfoProvider, zjh.f portfolioInteractor, noc.u allocationWidgetProvider, PortfolioDetailsScreenContract$InputData inputData, boc.m actionsWidget, moc.a disclaimerWidgetDelegate, jlc.u roboFooterDisclaimersWidgetProvider, tpc.i recurringDepositWidgetProvider, jlc.x recurringDepositWidgetParcelHandler, rul.e spareChangeWidgetProvider, h1h.b transactionsWidgetControllerModelExtension, doc.f chartWidgetExtension, jlc.d projectionsWidgetExtension, gte.a featureToggleInteractor, mkd.d slotManagerFeedExtension, qmc.b roboContextProvider, e7f.b investmentSectionWidgetProvider) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(allocationWidgetProvider, "allocationWidgetProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(actionsWidget, "actionsWidget");
        Intrinsics.checkNotNullParameter(disclaimerWidgetDelegate, "disclaimerWidgetDelegate");
        Intrinsics.checkNotNullParameter(roboFooterDisclaimersWidgetProvider, "roboFooterDisclaimersWidgetProvider");
        Intrinsics.checkNotNullParameter(recurringDepositWidgetProvider, "recurringDepositWidgetProvider");
        Intrinsics.checkNotNullParameter(recurringDepositWidgetParcelHandler, "recurringDepositWidgetParcelHandler");
        Intrinsics.checkNotNullParameter(spareChangeWidgetProvider, "spareChangeWidgetProvider");
        Intrinsics.checkNotNullParameter(transactionsWidgetControllerModelExtension, "transactionsWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(chartWidgetExtension, "chartWidgetExtension");
        Intrinsics.checkNotNullParameter(projectionsWidgetExtension, "projectionsWidgetExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(slotManagerFeedExtension, "slotManagerFeedExtension");
        Intrinsics.checkNotNullParameter(roboContextProvider, "roboContextProvider");
        Intrinsics.checkNotNullParameter(investmentSectionWidgetProvider, "investmentSectionWidgetProvider");
        this.o = portfolioInfoProvider;
        this.f136628p = portfolioInteractor;
        this.f136629q = allocationWidgetProvider;
        this.f136630r = inputData;
        this.f136631s = actionsWidget;
        this.f136632t = disclaimerWidgetDelegate;
        this.u = roboFooterDisclaimersWidgetProvider;
        this.v = recurringDepositWidgetProvider;
        this.f136633w = recurringDepositWidgetParcelHandler;
        this.f136634x = spareChangeWidgetProvider;
        this.f136635y = transactionsWidgetControllerModelExtension;
        this.z = chartWidgetExtension;
        this.A = projectionsWidgetExtension;
        this.B = featureToggleInteractor;
        this.C = slotManagerFeedExtension;
        this.D = roboContextProvider;
        this.E = investmentSectionWidgetProvider;
        this.F = mra.d.b(this, initialState, stateMapper, null, false, 12);
        this.G = new vii.b();
        final int i = 0;
        this.H = te0.w.y0(new Function0(this) { // from class: fnc.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f136667b;

            {
                this.f136667b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i) {
                    case 0:
                        zC = ((jte.d) this.f136667b.B).c(RoboApi$Toggles.RoboOnboardingReassessment.f85022c);
                        break;
                    default:
                        zC = ((jte.d) this.f136667b.B).c(ManagedPortfoliosApi$Toggles$RoboInvestmentSectionRedesign.f91229c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i2 = 1;
        this.I = te0.w.y0(new Function0(this) { // from class: fnc.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f136667b;

            {
                this.f136667b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i2) {
                    case 0:
                        zC = ((jte.d) this.f136667b.B).c(RoboApi$Toggles.RoboOnboardingReassessment.f85022c);
                        break;
                    default:
                        zC = ((jte.d) this.f136667b.B).c(ManagedPortfoliosApi$Toggles$RoboInvestmentSectionRedesign.f91229c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.l
    public final void I1() {
        PortfolioDetailsScreenContract$InputData portfolioDetailsScreenContract$InputData = this.f136630r;
        String str = portfolioDetailsScreenContract$InputData.f85166a;
        w4l.i iVar = w4l.i.f294643c;
        zjh.f fVar = this.f136628p;
        efm.r rVarB = fVar.B(str, iVar);
        String str2 = portfolioDetailsScreenContract$InputData.f85166a;
        Flow flowA = glc.a.a(this.o, str2);
        akg.n nVarV = nim.a.v(flowA, new fkh.f(25));
        Continuation continuation = null;
        yji.l.a1(this, flowA, null, null, new x(this, continuation, 5), 3);
        yji.l.a1(this, this.v.a(str2), null, null, new x(this, continuation, 6), 3);
        yji.l.a1(this, this.f136634x.k(str2), null, null, new x(this, continuation, 7), 3);
        boolean zBooleanValue = ((Boolean) this.I.getValue()).booleanValue();
        vii.b bVar = this.G;
        if (zBooleanValue) {
            yji.l.a1(this, vkm.q.Q(bVar, new f5h.b(continuation, this, 10)), null, null, new x(this, continuation, 8), 3);
        }
        yji.l.a1(this, zjh.f.y(fVar, str2), null, null, new x(this, continuation, 9), 3);
        yji.l.a1(this, this.z.c3(), null, null, new x(this, continuation, 10), 3);
        akg.n nVarV2 = nim.a.v(flowA, new fkh.f(26));
        yji.l.a1(this, mo3.a.g(nVarV2, null, new fk4.r(20), 1), null, null, new b0(this, null, 1), 3);
        yji.l.a1(this, vkm.q.Q(bVar, new a67.c(continuation, nVarV2, this, nVarV, 19)), null, null, new x(this, continuation, 1), 3);
        yji.l.a1(this, this.A.c3(), null, null, new x(this, continuation, 2), 3);
        yji.l.a1(this, mo3.a.g(xam.a.h(new f23.y(this, nVarV, continuation, 6), u0.m(rd0.e.b(rVarB), this.D.a())), null, new fk4.r(21), 1), null, null, new x(this, continuation, 3), 3);
        yji.l.a1(this, xam.a.h(new b0(this, null, 0), nVarV2), null, null, new x(this, continuation, 4), 3);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.l
    public final void T1(long j2) {
        InvestTransactionsFilter.Companion companion = InvestTransactionsFilter.INSTANCE;
        WealthAccountType wealthAccountType = WealthAccountType.ROBO;
        companion.getClass();
        InvestTransactionsFilter.InvestTransactionsFilterImpl investTransactionsFilterImplA = InvestTransactionsFilter.Companion.a(wealthAccountType);
        InvestTransactionsListContract$Disclaimers.INSTANCE.getClass();
        Continuation continuation = null;
        yji.l.b1(this, this.f136635y.c3(investTransactionsFilterImplA, w4l.i.f294643c, new h1h.c(new InvestTransactionsListContract$Disclaimers(false, 7), 1)), null, new x(this, continuation, 0), 3);
        boolean zBooleanValue = ((Boolean) this.H.getValue()).booleanValue();
        mkd.d dVar = this.C;
        if (zBooleanValue) {
            ((f0) dVar).c3(new mkd.a(new SlotContext(akd.s.INVEST_ROBO_DETAILS)));
        }
        yji.l.b1(this, ((f0) dVar).f144638l.h(), null, new x(this, continuation, 11), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.F;
    }
}
