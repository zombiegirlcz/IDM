package qoc;

import ahe.y0;
import aw0.o9;
import cfl.f0;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.wealth.models.robo.PortfolioGoal;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import d9.e1;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.t0;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends jlc.d {

    @NotNull
    public static final g Companion = new g();
    public final jmc.d A;
    public final zjh.f B;
    public final yoc.n C;
    public final k D;
    public final gah.e E;
    public final j2 F;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m f248134m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final soc.b f248135n;
    public final ks0.n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final emc.e f248136p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final woc.r f248137q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final qmc.b f248138r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f248139s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final soc.a f248140t;
    public final l80.e u;
    public final jlc.r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final woc.f f248141w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final woc.s f248142x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final smd.s f248143y;
    public final usc.a z;

    public r(m projectionDownsampler, soc.b datasetMapper, ks0.n projectionChartStateInteractor, emc.e templatesInteractor, woc.r roboAccountProjectionChartStateProvider, qmc.b roboContextProvider, j60.a bottomExpandableDialogControllerExtension, soc.a dialogMapper, l80.e dateProvider, woc.f optimalRecurringDepositCalculator, woc.s sliderConfigProvider, smd.s displayCurrencyConvertionInteractor, usc.a paymentsCountProvider, jmc.d editGoalFlowDialogMapper, zjh.f portfolioInteractor, yoc.n roundedMoneyProvider, k investmentHorizonProvider, gah.e eVar) {
        jlc.r initialState = new jlc.r(null, null, null, null, null, null, null, null, ((l80.f) dateProvider).e(), null, zhm.r0.g(), null, null, null, null);
        Intrinsics.checkNotNullParameter(projectionDownsampler, "projectionDownsampler");
        Intrinsics.checkNotNullParameter(datasetMapper, "datasetMapper");
        Intrinsics.checkNotNullParameter(projectionChartStateInteractor, "projectionChartStateInteractor");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(roboAccountProjectionChartStateProvider, "roboAccountProjectionChartStateProvider");
        Intrinsics.checkNotNullParameter(roboContextProvider, "roboContextProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(optimalRecurringDepositCalculator, "optimalRecurringDepositCalculator");
        Intrinsics.checkNotNullParameter(sliderConfigProvider, "sliderConfigProvider");
        Intrinsics.checkNotNullParameter(displayCurrencyConvertionInteractor, "displayCurrencyConvertionInteractor");
        Intrinsics.checkNotNullParameter(paymentsCountProvider, "paymentsCountProvider");
        Intrinsics.checkNotNullParameter(editGoalFlowDialogMapper, "editGoalFlowDialogMapper");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(roundedMoneyProvider, "roundedMoneyProvider");
        Intrinsics.checkNotNullParameter(investmentHorizonProvider, "investmentHorizonProvider");
        this.f248134m = projectionDownsampler;
        this.f248135n = datasetMapper;
        this.o = projectionChartStateInteractor;
        this.f248136p = templatesInteractor;
        this.f248137q = roboAccountProjectionChartStateProvider;
        this.f248138r = roboContextProvider;
        this.f248139s = bottomExpandableDialogControllerExtension;
        this.f248140t = dialogMapper;
        this.u = dateProvider;
        this.v = initialState;
        this.f248141w = optimalRecurringDepositCalculator;
        this.f248142x = sliderConfigProvider;
        this.f248143y = displayCurrencyConvertionInteractor;
        this.z = paymentsCountProvider;
        this.A = editGoalFlowDialogMapper;
        this.B = portfolioInteractor;
        this.C = roundedMoneyProvider;
        this.D = investmentHorizonProvider;
        this.E = eVar;
        this.F = vkm.q.c(null);
    }

    public static final dj0.d f3(r rVar, PortfolioGoal portfolioGoal, Data data, dj0.d dVar) {
        BigDecimal bigDecimal;
        Object content = data.getContent();
        if (portfolioGoal != null && content != null) {
            alc.j jVar = (alc.j) content;
            usc.a aVar = rVar.z;
            LocalDate localDateA = portfolioGoal.a();
            k4l.c0 c0Var = k4l.c0.MONTH;
            int iH = aVar.h(localDateA, c0Var);
            alc.h hVarA = jVar.a(iH);
            if (hVarA != null && (bigDecimal = hVarA.f6200c) != null) {
                woc.f fVar = rVar.f248141w;
                woc.d dVar2 = new woc.d(portfolioGoal.f95699a, dVar, c0Var, iH, bigDecimal, jVar.d);
                fVar.getClass();
                dj0.d dVarA = woc.f.a(dVar2);
                woc.s sVar = rVar.f248142x;
                dj0.d dVar3 = portfolioGoal.f95699a;
                sVar.getClass();
                long j2 = woc.s.a(dVar3).f6197b.d.f115082a;
                return dj0.d.c(dVarA, (((dVarA.f115082a + j2) - 1) / j2) * j2, null, 2);
            }
        }
        return null;
    }

    @Override // yji.n
    public final void D2() {
        j2 j2Var = this.F;
        Continuation continuation = null;
        yji.n.j2(this, vkm.q.Q(new t0(j2Var, 1), new y0(continuation, this, 22)), null, null, 7);
        yji.n.j2(this, vkm.q.Q(new t0(j2Var, 1), new q7b.j(continuation, this, 19)), null, new qc3.c(this, continuation, 29), 3);
        yji.n.j2(this, this.f248138r.b(true), null, new q(this, null), 3);
    }

    @Override // cki.a
    public final Object Z2() {
        return this.v;
    }

    @Override // jlc.d
    public final void e3(jlc.n input) {
        j2 j2Var;
        Object value;
        Intrinsics.checkNotNullParameter(input, "input");
        do {
            j2Var = this.F;
            value = j2Var.getValue();
        } while (!j2Var.h(value, input));
    }

    public final void g3(a0 parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        boolean z = parcel instanceof w;
        j60.a aVar = this.f248139s;
        if (z) {
            j60.a.v(aVar, false, null, 3);
            return;
        }
        if (parcel instanceof x) {
            A2(u0.c(new FaqFeatureConfig.Starter("question.what-fees-will-i-pay", 2)));
            return;
        }
        if (parcel instanceof y) {
            A2(u0.c(new FaqFeatureConfig.Starter("question.expected-returns", 2)));
            return;
        }
        if (!(parcel instanceof z)) {
            throw new NoWhenBranchMatchedException();
        }
        f0.a aVar2 = ((z) parcel).f248156a;
        dj0.d dVar = aVar2.a().f23728a.f23760b;
        BigDecimal feeYearlyRate = aVar2.a().f23728a.f23759a;
        this.f248140t.getClass();
        Intrinsics.checkNotNullParameter(feeYearlyRate, "feeYearlyRate");
        PercentageClause percentageClause = new PercentageClause(e1.Z(feeYearlyRate), (PercentageClause.Format) null, (Style) null, 6);
        rp0.t tVar = new rp0.t(new TextLocalisedClause(R$string.wealth_robo_onboarding_summary_fees, null, null, 14), yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), zhm.v.k(dVar != null ? new TextLocalisedClause(R$string.wealth_robo_onboarding_fee_disclaimer_with_min_fee, zhm.v.k(percentageClause, new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12) : new TextLocalisedClause(R$string.wealth_robo_onboarding_fee_disclaimer_without_min_fee, zhm.u.c(percentageClause), null, 12), new TextLocalisedClause(R$string.wealth_robo_common_learn_more, null, new Click(28, (Integer) null, (Object) x.f248154a, "fee-info-learn-more", false), 10))), null, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("fee-icon-cta", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, w.f248153a, null, 744);
        int i = R$attr.uikit_dp24;
        yp0.b.r(model, i, i, 0, 0, 12);
        aVar.x(new rp0.y(zhm.u.c(model), tVar, rp0.l.WINDOW, null, null, null, 1016));
    }

    public final boolean h3(PortfolioGoal portfolioGoal) {
        return portfolioGoal.a().compareTo((ChronoLocalDate) ((l80.f) this.u).e().withDayOfMonth(1)) > 0;
    }

    public final Flow i3(jlc.n nVar) {
        PortfolioGoal portfolioGoalA = nVar.a();
        return portfolioGoalA == null ? new go.g(new Data(null, null, false, 6, null), 2) : nVar instanceof jlc.m ? zi0.c.i(portfolioGoalA) : nim.a.v(this.f248143y.d(portfolioGoalA.f95699a), new qce.a(this, portfolioGoalA, 26));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j3(jlc.r r22) {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qoc.r.j3(jlc.r):void");
    }
}
