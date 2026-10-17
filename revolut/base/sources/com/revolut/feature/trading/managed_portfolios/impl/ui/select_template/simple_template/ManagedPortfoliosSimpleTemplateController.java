package com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.simple_template;

import android.app.Activity;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.ToDoItemDelegate;
import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.feature.trading.managed_portfolios.impl.R$id;
import com.revolut.feature.trading.managed_portfolios.impl.R$layout;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.allocation.ManagedPortfolioDetailsAllocationContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.chart.ManagedPortfolioDetailsChartContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.fees.ManagedPortfolioDetailsFeesExtensionContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.info.ManagedPortfolioDetailsAboutInfoExtensionContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.investments.ManagedPortfolioDetailsInvestmentsExtensionContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.details.performance.ManagedPortfolioPerformanceExtensionContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.simple_template.ManagedPortfoliosSimpleTemplateController;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.simple_template.ManagedPortfoliosSimpleTemplateControllerContract$InputData;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.simple_template.template_risk_level.TemplateRiskLevelControllerExtensionContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import j8f.b;
import j8f.c;
import j8f.d;
import j8f.e;
import j8f.f;
import j8f.g;
import j8f.h;
import j8f.i;
import j8f.m;
import j8f.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import w5f.p;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/simple_template/ManagedPortfoliosSimpleTemplateController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lj8f/m;", "Ldli/a;", "Lj8f/n;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManagedPortfoliosSimpleTemplateController extends ViewController<m> implements a {
    public static final /* synthetic */ KProperty[] q0 = {o0.f186429a.j(new h0(ManagedPortfoliosSimpleTemplateController.class, "binding", "getBinding()Lcom/revolut/feature/trading/managed_portfolios/impl/databinding/ScreenPortfolioSimpleTemplateBinding;", 0))};
    public final ManagedPortfoliosSimpleTemplateControllerContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final FixedTabsDelegate O;
    public final TextDelegate P;
    public final CellDetailsChevronDelegate Q;
    public final TrendViewDelegate R;
    public final FullScreenStateDelegate S;
    public final RowDelegate T;
    public final PlainTextDelegate U;
    public final ListSubheaderDelegate V;
    public final CellDetailsDelegate W;
    public final LargeActionButtonDelegate X;
    public final HeaderDelegate Y;
    public final HeaderLoadingDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RowLoadingDelegate f91470a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final CellDetailsLoadingDelegate f91471b0;
    public final PlainTextLoadingDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ToDoItemDelegate f91472d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final FooterTextDelegate f91473e0;
    public final PlanTileDelegate f0;
    public final SmallActionButtonDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f91474h0;
    public final e i0;
    public final c j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final b f91475k0;
    public final g l0;
    public final h m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final i f91476n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final f f91477o0;
    public final qy5.a p0;

    public ManagedPortfoliosSimpleTemplateController(ManagedPortfoliosSimpleTemplateControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_portfolio_simple_template;
        s.t(this, d.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: j8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfoliosSimpleTemplateController f172178b;

            {
                this.f172178b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ManagedPortfoliosSimpleTemplateController.q0;
                        ManagedPortfoliosSimpleTemplateController managedPortfoliosSimpleTemplateController = this.f172178b;
                        Activity activityM2 = managedPortfoliosSimpleTemplateController.m2();
                        ManagedPortfoliosSimpleTemplateControllerContract$InputData managedPortfoliosSimpleTemplateControllerContract$InputData = managedPortfoliosSimpleTemplateController.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(w5f.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5f.m.class, " is not found"));
                        }
                        w5f.m mVar = ((w5f.m) aVar2.b()).f295201s;
                        String str = managedPortfoliosSimpleTemplateControllerContract$InputData.f91478a;
                        ManagedPortfolioDetailsChartContract$InputData managedPortfolioDetailsChartContract$InputData = new ManagedPortfolioDetailsChartContract$InputData(str, true, false, true);
                        e eVar = managedPortfoliosSimpleTemplateController.i0;
                        ManagedPortfolioDetailsAllocationContract$InputData managedPortfolioDetailsAllocationContract$InputData = new ManagedPortfolioDetailsAllocationContract$InputData(managedPortfoliosSimpleTemplateControllerContract$InputData.f91478a, a6f.a.FORCE_TEMPLATE, true);
                        c cVar = managedPortfoliosSimpleTemplateController.j0;
                        ManagedPortfolioDetailsAboutInfoExtensionContract$InputData managedPortfolioDetailsAboutInfoExtensionContract$InputData = new ManagedPortfolioDetailsAboutInfoExtensionContract$InputData(str);
                        b bVar = managedPortfoliosSimpleTemplateController.f91475k0;
                        ManagedPortfolioDetailsFeesExtensionContract$InputData managedPortfolioDetailsFeesExtensionContract$InputData = new ManagedPortfolioDetailsFeesExtensionContract$InputData(str);
                        g gVar = managedPortfoliosSimpleTemplateController.l0;
                        new ManagedPortfolioDetailsInvestmentsExtensionContract$InputData(str);
                        h hVar = managedPortfoliosSimpleTemplateController.m0;
                        ManagedPortfolioPerformanceExtensionContract$InputData managedPortfolioPerformanceExtensionContract$InputData = new ManagedPortfolioPerformanceExtensionContract$InputData(str);
                        i iVar = managedPortfoliosSimpleTemplateController.f91476n0;
                        TemplateRiskLevelControllerExtensionContract$InputData templateRiskLevelControllerExtensionContract$InputData = new TemplateRiskLevelControllerExtensionContract$InputData(str, managedPortfoliosSimpleTemplateControllerContract$InputData.f91479b, managedPortfoliosSimpleTemplateControllerContract$InputData.f91480c);
                        qy5.a aVar3 = managedPortfoliosSimpleTemplateController.p0;
                        f fVar = managedPortfoliosSimpleTemplateController.f91477o0;
                        eVar.getClass();
                        cVar.getClass();
                        bVar.getClass();
                        gVar.getClass();
                        hVar.getClass();
                        iVar.getClass();
                        aVar3.getClass();
                        fVar.getClass();
                        return new w5f.p(mVar, managedPortfoliosSimpleTemplateController, managedPortfoliosSimpleTemplateControllerContract$InputData, managedPortfolioDetailsChartContract$InputData, eVar, managedPortfolioDetailsAllocationContract$InputData, cVar, managedPortfolioDetailsAboutInfoExtensionContract$InputData, bVar, managedPortfolioDetailsFeesExtensionContract$InputData, gVar, managedPortfolioPerformanceExtensionContract$InputData, iVar, templateRiskLevelControllerExtensionContract$InputData, aVar3, fVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ManagedPortfoliosSimpleTemplateController.q0;
                        return (q) ((w5f.p) this.f172178b.M.getValue()).H.get();
                    default:
                        KProperty[] kPropertyArr3 = ManagedPortfoliosSimpleTemplateController.q0;
                        ManagedPortfoliosSimpleTemplateController managedPortfoliosSimpleTemplateController2 = this.f172178b;
                        q qVar = (q) managedPortfoliosSimpleTemplateController2.N.getValue();
                        FixedTabsDelegate fixedTabsDelegate = managedPortfoliosSimpleTemplateController2.O;
                        CellDetailsChevronDelegate cellDetailsChevronDelegate = managedPortfoliosSimpleTemplateController2.Q;
                        TrendViewDelegate trendViewDelegate = managedPortfoliosSimpleTemplateController2.R;
                        FullScreenStateDelegate fullScreenStateDelegate = managedPortfoliosSimpleTemplateController2.S;
                        RowDelegate rowDelegate = managedPortfoliosSimpleTemplateController2.T;
                        PlainTextDelegate plainTextDelegate = managedPortfoliosSimpleTemplateController2.U;
                        LargeActionButtonDelegate largeActionButtonDelegate = managedPortfoliosSimpleTemplateController2.X;
                        return dli.f.a(managedPortfoliosSimpleTemplateController2, qVar, v.k(fixedTabsDelegate, cellDetailsChevronDelegate, trendViewDelegate, fullScreenStateDelegate, rowDelegate, plainTextDelegate, largeActionButtonDelegate, managedPortfoliosSimpleTemplateController2.V, managedPortfoliosSimpleTemplateController2.W, largeActionButtonDelegate, managedPortfoliosSimpleTemplateController2.f91470a0, managedPortfoliosSimpleTemplateController2.f91471b0, managedPortfoliosSimpleTemplateController2.c0, managedPortfoliosSimpleTemplateController2.Y, managedPortfoliosSimpleTemplateController2.f91472d0, managedPortfoliosSimpleTemplateController2.f91473e0, new FooterTextLoadingDelegate(), managedPortfoliosSimpleTemplateController2.f0, managedPortfoliosSimpleTemplateController2.g0, managedPortfoliosSimpleTemplateController2.Z, managedPortfoliosSimpleTemplateController2.P), R$id.simpleTemplate_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: j8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfoliosSimpleTemplateController f172178b;

            {
                this.f172178b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ManagedPortfoliosSimpleTemplateController.q0;
                        ManagedPortfoliosSimpleTemplateController managedPortfoliosSimpleTemplateController = this.f172178b;
                        Activity activityM2 = managedPortfoliosSimpleTemplateController.m2();
                        ManagedPortfoliosSimpleTemplateControllerContract$InputData managedPortfoliosSimpleTemplateControllerContract$InputData = managedPortfoliosSimpleTemplateController.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(w5f.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5f.m.class, " is not found"));
                        }
                        w5f.m mVar = ((w5f.m) aVar2.b()).f295201s;
                        String str = managedPortfoliosSimpleTemplateControllerContract$InputData.f91478a;
                        ManagedPortfolioDetailsChartContract$InputData managedPortfolioDetailsChartContract$InputData = new ManagedPortfolioDetailsChartContract$InputData(str, true, false, true);
                        e eVar = managedPortfoliosSimpleTemplateController.i0;
                        ManagedPortfolioDetailsAllocationContract$InputData managedPortfolioDetailsAllocationContract$InputData = new ManagedPortfolioDetailsAllocationContract$InputData(managedPortfoliosSimpleTemplateControllerContract$InputData.f91478a, a6f.a.FORCE_TEMPLATE, true);
                        c cVar = managedPortfoliosSimpleTemplateController.j0;
                        ManagedPortfolioDetailsAboutInfoExtensionContract$InputData managedPortfolioDetailsAboutInfoExtensionContract$InputData = new ManagedPortfolioDetailsAboutInfoExtensionContract$InputData(str);
                        b bVar = managedPortfoliosSimpleTemplateController.f91475k0;
                        ManagedPortfolioDetailsFeesExtensionContract$InputData managedPortfolioDetailsFeesExtensionContract$InputData = new ManagedPortfolioDetailsFeesExtensionContract$InputData(str);
                        g gVar = managedPortfoliosSimpleTemplateController.l0;
                        new ManagedPortfolioDetailsInvestmentsExtensionContract$InputData(str);
                        h hVar = managedPortfoliosSimpleTemplateController.m0;
                        ManagedPortfolioPerformanceExtensionContract$InputData managedPortfolioPerformanceExtensionContract$InputData = new ManagedPortfolioPerformanceExtensionContract$InputData(str);
                        i iVar = managedPortfoliosSimpleTemplateController.f91476n0;
                        TemplateRiskLevelControllerExtensionContract$InputData templateRiskLevelControllerExtensionContract$InputData = new TemplateRiskLevelControllerExtensionContract$InputData(str, managedPortfoliosSimpleTemplateControllerContract$InputData.f91479b, managedPortfoliosSimpleTemplateControllerContract$InputData.f91480c);
                        qy5.a aVar3 = managedPortfoliosSimpleTemplateController.p0;
                        f fVar = managedPortfoliosSimpleTemplateController.f91477o0;
                        eVar.getClass();
                        cVar.getClass();
                        bVar.getClass();
                        gVar.getClass();
                        hVar.getClass();
                        iVar.getClass();
                        aVar3.getClass();
                        fVar.getClass();
                        return new w5f.p(mVar, managedPortfoliosSimpleTemplateController, managedPortfoliosSimpleTemplateControllerContract$InputData, managedPortfolioDetailsChartContract$InputData, eVar, managedPortfolioDetailsAllocationContract$InputData, cVar, managedPortfolioDetailsAboutInfoExtensionContract$InputData, bVar, managedPortfolioDetailsFeesExtensionContract$InputData, gVar, managedPortfolioPerformanceExtensionContract$InputData, iVar, templateRiskLevelControllerExtensionContract$InputData, aVar3, fVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ManagedPortfoliosSimpleTemplateController.q0;
                        return (q) ((w5f.p) this.f172178b.M.getValue()).H.get();
                    default:
                        KProperty[] kPropertyArr3 = ManagedPortfoliosSimpleTemplateController.q0;
                        ManagedPortfoliosSimpleTemplateController managedPortfoliosSimpleTemplateController2 = this.f172178b;
                        q qVar = (q) managedPortfoliosSimpleTemplateController2.N.getValue();
                        FixedTabsDelegate fixedTabsDelegate = managedPortfoliosSimpleTemplateController2.O;
                        CellDetailsChevronDelegate cellDetailsChevronDelegate = managedPortfoliosSimpleTemplateController2.Q;
                        TrendViewDelegate trendViewDelegate = managedPortfoliosSimpleTemplateController2.R;
                        FullScreenStateDelegate fullScreenStateDelegate = managedPortfoliosSimpleTemplateController2.S;
                        RowDelegate rowDelegate = managedPortfoliosSimpleTemplateController2.T;
                        PlainTextDelegate plainTextDelegate = managedPortfoliosSimpleTemplateController2.U;
                        LargeActionButtonDelegate largeActionButtonDelegate = managedPortfoliosSimpleTemplateController2.X;
                        return dli.f.a(managedPortfoliosSimpleTemplateController2, qVar, v.k(fixedTabsDelegate, cellDetailsChevronDelegate, trendViewDelegate, fullScreenStateDelegate, rowDelegate, plainTextDelegate, largeActionButtonDelegate, managedPortfoliosSimpleTemplateController2.V, managedPortfoliosSimpleTemplateController2.W, largeActionButtonDelegate, managedPortfoliosSimpleTemplateController2.f91470a0, managedPortfoliosSimpleTemplateController2.f91471b0, managedPortfoliosSimpleTemplateController2.c0, managedPortfoliosSimpleTemplateController2.Y, managedPortfoliosSimpleTemplateController2.f91472d0, managedPortfoliosSimpleTemplateController2.f91473e0, new FooterTextLoadingDelegate(), managedPortfoliosSimpleTemplateController2.f0, managedPortfoliosSimpleTemplateController2.g0, managedPortfoliosSimpleTemplateController2.Z, managedPortfoliosSimpleTemplateController2.P), R$id.simpleTemplate_recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = new FixedTabsDelegate();
        this.P = new TextDelegate();
        this.Q = new CellDetailsChevronDelegate();
        this.R = new TrendViewDelegate(200L);
        this.S = new FullScreenStateDelegate();
        this.T = new RowDelegate(null, null, 7);
        this.U = new PlainTextDelegate();
        this.V = new ListSubheaderDelegate();
        this.W = new CellDetailsDelegate();
        this.X = new LargeActionButtonDelegate();
        this.Y = new HeaderDelegate();
        this.Z = new HeaderLoadingDelegate();
        this.f91470a0 = new RowLoadingDelegate();
        this.f91471b0 = new CellDetailsLoadingDelegate();
        this.c0 = new PlainTextLoadingDelegate();
        this.f91472d0 = new ToDoItemDelegate();
        this.f91473e0 = new FooterTextDelegate();
        this.f0 = new PlanTileDelegate(0);
        this.g0 = new SmallActionButtonDelegate();
        final int i3 = 2;
        this.f91474h0 = w.y0(new Function0(this) { // from class: j8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfoliosSimpleTemplateController f172178b;

            {
                this.f172178b = this;
            }

            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = ManagedPortfoliosSimpleTemplateController.q0;
                        ManagedPortfoliosSimpleTemplateController managedPortfoliosSimpleTemplateController = this.f172178b;
                        Activity activityM2 = managedPortfoliosSimpleTemplateController.m2();
                        ManagedPortfoliosSimpleTemplateControllerContract$InputData managedPortfoliosSimpleTemplateControllerContract$InputData = managedPortfoliosSimpleTemplateController.K;
                        phm.a aVar = (phm.a) ue0.e.j(activityM2).a().get(w5f.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5f.m.class, " is not found"));
                        }
                        w5f.m mVar = ((w5f.m) aVar2.b()).f295201s;
                        String str = managedPortfoliosSimpleTemplateControllerContract$InputData.f91478a;
                        ManagedPortfolioDetailsChartContract$InputData managedPortfolioDetailsChartContract$InputData = new ManagedPortfolioDetailsChartContract$InputData(str, true, false, true);
                        e eVar = managedPortfoliosSimpleTemplateController.i0;
                        ManagedPortfolioDetailsAllocationContract$InputData managedPortfolioDetailsAllocationContract$InputData = new ManagedPortfolioDetailsAllocationContract$InputData(managedPortfoliosSimpleTemplateControllerContract$InputData.f91478a, a6f.a.FORCE_TEMPLATE, true);
                        c cVar = managedPortfoliosSimpleTemplateController.j0;
                        ManagedPortfolioDetailsAboutInfoExtensionContract$InputData managedPortfolioDetailsAboutInfoExtensionContract$InputData = new ManagedPortfolioDetailsAboutInfoExtensionContract$InputData(str);
                        b bVar = managedPortfoliosSimpleTemplateController.f91475k0;
                        ManagedPortfolioDetailsFeesExtensionContract$InputData managedPortfolioDetailsFeesExtensionContract$InputData = new ManagedPortfolioDetailsFeesExtensionContract$InputData(str);
                        g gVar = managedPortfoliosSimpleTemplateController.l0;
                        new ManagedPortfolioDetailsInvestmentsExtensionContract$InputData(str);
                        h hVar = managedPortfoliosSimpleTemplateController.m0;
                        ManagedPortfolioPerformanceExtensionContract$InputData managedPortfolioPerformanceExtensionContract$InputData = new ManagedPortfolioPerformanceExtensionContract$InputData(str);
                        i iVar = managedPortfoliosSimpleTemplateController.f91476n0;
                        TemplateRiskLevelControllerExtensionContract$InputData templateRiskLevelControllerExtensionContract$InputData = new TemplateRiskLevelControllerExtensionContract$InputData(str, managedPortfoliosSimpleTemplateControllerContract$InputData.f91479b, managedPortfoliosSimpleTemplateControllerContract$InputData.f91480c);
                        qy5.a aVar3 = managedPortfoliosSimpleTemplateController.p0;
                        f fVar = managedPortfoliosSimpleTemplateController.f91477o0;
                        eVar.getClass();
                        cVar.getClass();
                        bVar.getClass();
                        gVar.getClass();
                        hVar.getClass();
                        iVar.getClass();
                        aVar3.getClass();
                        fVar.getClass();
                        return new w5f.p(mVar, managedPortfoliosSimpleTemplateController, managedPortfoliosSimpleTemplateControllerContract$InputData, managedPortfolioDetailsChartContract$InputData, eVar, managedPortfolioDetailsAllocationContract$InputData, cVar, managedPortfolioDetailsAboutInfoExtensionContract$InputData, bVar, managedPortfolioDetailsFeesExtensionContract$InputData, gVar, managedPortfolioPerformanceExtensionContract$InputData, iVar, templateRiskLevelControllerExtensionContract$InputData, aVar3, fVar);
                    case 1:
                        KProperty[] kPropertyArr2 = ManagedPortfoliosSimpleTemplateController.q0;
                        return (q) ((w5f.p) this.f172178b.M.getValue()).H.get();
                    default:
                        KProperty[] kPropertyArr3 = ManagedPortfoliosSimpleTemplateController.q0;
                        ManagedPortfoliosSimpleTemplateController managedPortfoliosSimpleTemplateController2 = this.f172178b;
                        q qVar = (q) managedPortfoliosSimpleTemplateController2.N.getValue();
                        FixedTabsDelegate fixedTabsDelegate = managedPortfoliosSimpleTemplateController2.O;
                        CellDetailsChevronDelegate cellDetailsChevronDelegate = managedPortfoliosSimpleTemplateController2.Q;
                        TrendViewDelegate trendViewDelegate = managedPortfoliosSimpleTemplateController2.R;
                        FullScreenStateDelegate fullScreenStateDelegate = managedPortfoliosSimpleTemplateController2.S;
                        RowDelegate rowDelegate = managedPortfoliosSimpleTemplateController2.T;
                        PlainTextDelegate plainTextDelegate = managedPortfoliosSimpleTemplateController2.U;
                        LargeActionButtonDelegate largeActionButtonDelegate = managedPortfoliosSimpleTemplateController2.X;
                        return dli.f.a(managedPortfoliosSimpleTemplateController2, qVar, v.k(fixedTabsDelegate, cellDetailsChevronDelegate, trendViewDelegate, fullScreenStateDelegate, rowDelegate, plainTextDelegate, largeActionButtonDelegate, managedPortfoliosSimpleTemplateController2.V, managedPortfoliosSimpleTemplateController2.W, largeActionButtonDelegate, managedPortfoliosSimpleTemplateController2.f91470a0, managedPortfoliosSimpleTemplateController2.f91471b0, managedPortfoliosSimpleTemplateController2.c0, managedPortfoliosSimpleTemplateController2.Y, managedPortfoliosSimpleTemplateController2.f91472d0, managedPortfoliosSimpleTemplateController2.f91473e0, new FooterTextLoadingDelegate(), managedPortfoliosSimpleTemplateController2.f0, managedPortfoliosSimpleTemplateController2.g0, managedPortfoliosSimpleTemplateController2.Z, managedPortfoliosSimpleTemplateController2.P), R$id.simpleTemplate_recyclerView, null, null, null, 56);
                }
            }
        });
        this.i0 = new e(this);
        this.j0 = new c(this);
        this.f91475k0 = new b(this);
        this.l0 = new g(this);
        this.m0 = new h(this);
        this.f91476n0 = new i(this);
        this.f91477o0 = new f(this);
        this.p0 = new qy5.a(19);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((n) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b k3() {
        return (j8f.q) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.f91474h0.getValue();
    }
}
