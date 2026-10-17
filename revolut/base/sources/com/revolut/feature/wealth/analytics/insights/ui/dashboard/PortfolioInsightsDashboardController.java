package com.revolut.feature.wealth.analytics.insights.ui.dashboard;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.HeaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SmallRadialGaugeDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.wealth.analytics.insights.ui.dashboard.PortfolioInsightsDashboardContract$InputData;
import com.revolut.feature.wealth.analytics.insights.ui.dashboard.PortfolioInsightsDashboardController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tul.b;
import vc.s;
import xki.e;
import ywg.d;
import ywg.f;
import ywg.i;
import ywg.j;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/analytics/insights/ui/dashboard/PortfolioInsightsDashboardController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lywg/d;", "Ldli/a;", "Lywg/f;", "feature_wealth_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PortfolioInsightsDashboardController extends ViewController<d> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(PortfolioInsightsDashboardController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final PortfolioInsightsDashboardContract$InputData K;
    public final RowDelegate L;
    public final TextDelegate M;
    public final FullScreenStateDelegate N;
    public final b O;
    public final h P;
    public final int Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public PortfolioInsightsDashboardController(PortfolioInsightsDashboardContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new RowDelegate(null, null, 7);
        this.M = new TextDelegate();
        this.N = new FullScreenStateDelegate();
        this.O = new b(this, 25);
        this.P = s.t(this, ywg.h.f);
        this.Q = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: ywg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioInsightsDashboardController f317433b;

            {
                this.f317433b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PortfolioInsightsDashboardController portfolioInsightsDashboardController = this.f317433b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioInsightsDashboardController.U;
                        PortfolioInsightsDashboardController portfolioInsightsDashboardController2 = this.f317433b;
                        return dli.f.a(portfolioInsightsDashboardController2, (a) portfolioInsightsDashboardController2.T.getValue(), v.k(portfolioInsightsDashboardController2.L, portfolioInsightsDashboardController2.M, portfolioInsightsDashboardController2.N, new HeaderDelegate(), new RowLoadingDelegate(), new HeaderLoadingDelegate(), new SmallRadialGaugeDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioInsightsDashboardController.U;
                        qji.b bVarU2 = portfolioInsightsDashboardController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.analytics.insights.ui.dashboard.di.PortfolioInsightsDashboardComponent.Injector");
                        ewg.k kVar = (ewg.k) bVarU2;
                        ewg.h hVar = kVar.d;
                        ewg.k kVar2 = kVar.e;
                        PortfolioInsightsDashboardContract$InputData portfolioInsightsDashboardContract$InputData = portfolioInsightsDashboardController.K;
                        tul.b bVar = portfolioInsightsDashboardController.O;
                        portfolioInsightsDashboardContract$InputData.getClass();
                        bVar.getClass();
                        return new ewg.f(hVar, kVar2, portfolioInsightsDashboardContract$InputData, bVar);
                    default:
                        KProperty[] kPropertyArr3 = PortfolioInsightsDashboardController.U;
                        return (a) ((ewg.f) portfolioInsightsDashboardController.S.getValue()).f130187g.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: ywg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioInsightsDashboardController f317433b;

            {
                this.f317433b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PortfolioInsightsDashboardController portfolioInsightsDashboardController = this.f317433b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioInsightsDashboardController.U;
                        PortfolioInsightsDashboardController portfolioInsightsDashboardController2 = this.f317433b;
                        return dli.f.a(portfolioInsightsDashboardController2, (a) portfolioInsightsDashboardController2.T.getValue(), v.k(portfolioInsightsDashboardController2.L, portfolioInsightsDashboardController2.M, portfolioInsightsDashboardController2.N, new HeaderDelegate(), new RowLoadingDelegate(), new HeaderLoadingDelegate(), new SmallRadialGaugeDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioInsightsDashboardController.U;
                        qji.b bVarU2 = portfolioInsightsDashboardController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.analytics.insights.ui.dashboard.di.PortfolioInsightsDashboardComponent.Injector");
                        ewg.k kVar = (ewg.k) bVarU2;
                        ewg.h hVar = kVar.d;
                        ewg.k kVar2 = kVar.e;
                        PortfolioInsightsDashboardContract$InputData portfolioInsightsDashboardContract$InputData = portfolioInsightsDashboardController.K;
                        tul.b bVar = portfolioInsightsDashboardController.O;
                        portfolioInsightsDashboardContract$InputData.getClass();
                        bVar.getClass();
                        return new ewg.f(hVar, kVar2, portfolioInsightsDashboardContract$InputData, bVar);
                    default:
                        KProperty[] kPropertyArr3 = PortfolioInsightsDashboardController.U;
                        return (a) ((ewg.f) portfolioInsightsDashboardController.S.getValue()).f130187g.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: ywg.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioInsightsDashboardController f317433b;

            {
                this.f317433b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PortfolioInsightsDashboardController portfolioInsightsDashboardController = this.f317433b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioInsightsDashboardController.U;
                        PortfolioInsightsDashboardController portfolioInsightsDashboardController2 = this.f317433b;
                        return dli.f.a(portfolioInsightsDashboardController2, (a) portfolioInsightsDashboardController2.T.getValue(), v.k(portfolioInsightsDashboardController2.L, portfolioInsightsDashboardController2.M, portfolioInsightsDashboardController2.N, new HeaderDelegate(), new RowLoadingDelegate(), new HeaderLoadingDelegate(), new SmallRadialGaugeDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioInsightsDashboardController.U;
                        qji.b bVarU2 = portfolioInsightsDashboardController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.wealth.analytics.insights.ui.dashboard.di.PortfolioInsightsDashboardComponent.Injector");
                        ewg.k kVar = (ewg.k) bVarU2;
                        ewg.h hVar = kVar.d;
                        ewg.k kVar2 = kVar.e;
                        PortfolioInsightsDashboardContract$InputData portfolioInsightsDashboardContract$InputData = portfolioInsightsDashboardController.K;
                        tul.b bVar = portfolioInsightsDashboardController.O;
                        portfolioInsightsDashboardContract$InputData.getClass();
                        bVar.getClass();
                        return new ewg.f(hVar, kVar2, portfolioInsightsDashboardContract$InputData, bVar);
                    default:
                        KProperty[] kPropertyArr3 = PortfolioInsightsDashboardController.U;
                        return (a) ((ewg.f) portfolioInsightsDashboardController.S.getValue()).f130187g.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ewg.f) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (ywg.a) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.P.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((m) value).f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new i(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.f53218h), new j(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
