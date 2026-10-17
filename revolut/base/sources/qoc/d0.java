package qoc;

import com.revolut.core.ui_kit.delegates.InputSliderDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f248104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final soc.b f248105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ks0.n f248106c;
    public final emc.e d;
    public final woc.r e;
    public final qmc.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final soc.a f248107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n0 f248108h;
    public final soc.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final soc.h f248109j;
    public final l80.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final woc.f f248110l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final woc.s f248111m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final smd.s f248112n;
    public final roc.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final usc.a f248113p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final jmc.d f248114q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final zjh.f f248115r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yoc.n f248116s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f248117t;
    public final gah.f u;

    public d0(m projectionDownsampler, soc.b datasetMapper, ks0.n projectionChartStateInteractor, emc.e templatesInteractor, woc.r roboAccountProjectionChartStateProvider, qmc.b roboContextProvider, soc.a dialogMapper, n0 projectionChartMapper, soc.e disclaimerMapper, soc.h slidersMapper, l80.e dateProvider, woc.f optimalRecurringDepositCalculator, woc.s sliderConfigProvider, smd.s displayCurrencyConvertionInteractor, roc.c goalStatusMapper, usc.a paymentsCountProvider, jmc.d editGoalFlowDialogMapper, zjh.f portfolioInteractor, yoc.n roundedMoneyProvider, k investmentHorizonProvider, gah.f remoteDisclaimersFactory) {
        Intrinsics.checkNotNullParameter(projectionDownsampler, "projectionDownsampler");
        Intrinsics.checkNotNullParameter(datasetMapper, "datasetMapper");
        Intrinsics.checkNotNullParameter(projectionChartStateInteractor, "projectionChartStateInteractor");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(roboAccountProjectionChartStateProvider, "roboAccountProjectionChartStateProvider");
        Intrinsics.checkNotNullParameter(roboContextProvider, "roboContextProvider");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(projectionChartMapper, "projectionChartMapper");
        Intrinsics.checkNotNullParameter(disclaimerMapper, "disclaimerMapper");
        Intrinsics.checkNotNullParameter(slidersMapper, "slidersMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(optimalRecurringDepositCalculator, "optimalRecurringDepositCalculator");
        Intrinsics.checkNotNullParameter(sliderConfigProvider, "sliderConfigProvider");
        Intrinsics.checkNotNullParameter(displayCurrencyConvertionInteractor, "displayCurrencyConvertionInteractor");
        Intrinsics.checkNotNullParameter(goalStatusMapper, "goalStatusMapper");
        Intrinsics.checkNotNullParameter(paymentsCountProvider, "paymentsCountProvider");
        Intrinsics.checkNotNullParameter(editGoalFlowDialogMapper, "editGoalFlowDialogMapper");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(roundedMoneyProvider, "roundedMoneyProvider");
        Intrinsics.checkNotNullParameter(investmentHorizonProvider, "investmentHorizonProvider");
        Intrinsics.checkNotNullParameter(remoteDisclaimersFactory, "remoteDisclaimersFactory");
        this.f248104a = projectionDownsampler;
        this.f248105b = datasetMapper;
        this.f248106c = projectionChartStateInteractor;
        this.d = templatesInteractor;
        this.e = roboAccountProjectionChartStateProvider;
        this.f = roboContextProvider;
        this.f248107g = dialogMapper;
        this.f248108h = projectionChartMapper;
        this.i = disclaimerMapper;
        this.f248109j = slidersMapper;
        this.k = dateProvider;
        this.f248110l = optimalRecurringDepositCalculator;
        this.f248111m = sliderConfigProvider;
        this.f248112n = displayCurrencyConvertionInteractor;
        this.o = goalStatusMapper;
        this.f248113p = paymentsCountProvider;
        this.f248114q = editGoalFlowDialogMapper;
        this.f248115r = portfolioInteractor;
        this.f248116s = roundedMoneyProvider;
        this.f248117t = investmentHorizonProvider;
        this.u = remoteDisclaimersFactory;
    }

    public final jlc.f a(jlc.e delegates, j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        gah.e eVarA = this.u.a();
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        r rVar = new r(this.f248104a, this.f248105b, this.f248106c, this.d, this.e, this.f, bottomExpandableDialogControllerExtension, this.f248107g, this.k, this.f248110l, this.f248111m, this.f248112n, this.f248113p, this.f248114q, this.f248115r, this.f248116s, this.f248117t, eVarA);
        return new jlc.f(new f(rVar, delegates, bottomExpandableDialogControllerExtension), rVar);
    }

    public final s0 b(jlc.e delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        InputSliderDelegate inputSliderDelegate = delegates.e;
        j0 j0Var = new j0((inputSliderDelegate == null || delegates.f == null) ? false : true, inputSliderDelegate != null, delegates.f175680g != null, delegates.f175681h != null);
        return new s0(new b(j0Var), this.f248108h, this.i, this.f248109j, new f0(j0Var), j0Var, this.f248111m, this.o, new gah.g());
    }
}
