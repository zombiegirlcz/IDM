package com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.intro;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.FlexibleBarChartDelegate;
import com.revolut.core.ui_kit.delegates.SegmentedGaugeChartDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.trading.managed_portfolios.impl.R$string;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.intro.PortfolioRevealIntroScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.intro.PortfolioRevealIntroScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import h8f.b;
import h8f.c;
import h8f.h;
import h8f.i;
import h8f.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import w5f.u;
import w5f.v;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/intro/PortfolioRevealIntroScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lh8f/h;", "Ldli/a;", "Lh8f/j;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PortfolioRevealIntroScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(PortfolioRevealIntroScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final PortfolioRevealIntroScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final ao.h P;

    public PortfolioRevealIntroScreen(PortfolioRevealIntroScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: h8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioRevealIntroScreen f150029b;

            {
                this.f150029b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PortfolioRevealIntroScreen portfolioRevealIntroScreen = this.f150029b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioRevealIntroScreen.Q;
                        qji.b bVarU2 = portfolioRevealIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.intro.di.PortfolioRevealIntroScreenInjector");
                        u uVar = (u) bVarU2;
                        w5f.m mVar = uVar.f295242b;
                        u uVar2 = uVar.f295243c;
                        PortfolioRevealIntroScreenContract$InputData portfolioRevealIntroScreenContract$InputData = portfolioRevealIntroScreen.K;
                        portfolioRevealIntroScreenContract$InputData.getClass();
                        return new v(mVar, uVar2, portfolioRevealIntroScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioRevealIntroScreen.Q;
                        return (i) ((v) portfolioRevealIntroScreen.M.getValue()).f295245b.get();
                    default:
                        KProperty[] kPropertyArr3 = PortfolioRevealIntroScreen.Q;
                        PortfolioRevealIntroScreen portfolioRevealIntroScreen2 = this.f150029b;
                        return dli.f.a(portfolioRevealIntroScreen2, (i) portfolioRevealIntroScreen2.N.getValue(), zhm.v.k(new ContainerDelegate(zhm.v.k(new SegmentedGaugeChartDelegate(), new FlexibleBarChartDelegate()), null, 6), new TextDelegate()), 0, null, new koi.h(null, false, false, 1), null, 44);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: h8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioRevealIntroScreen f150029b;

            {
                this.f150029b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PortfolioRevealIntroScreen portfolioRevealIntroScreen = this.f150029b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioRevealIntroScreen.Q;
                        qji.b bVarU2 = portfolioRevealIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.intro.di.PortfolioRevealIntroScreenInjector");
                        u uVar = (u) bVarU2;
                        w5f.m mVar = uVar.f295242b;
                        u uVar2 = uVar.f295243c;
                        PortfolioRevealIntroScreenContract$InputData portfolioRevealIntroScreenContract$InputData = portfolioRevealIntroScreen.K;
                        portfolioRevealIntroScreenContract$InputData.getClass();
                        return new v(mVar, uVar2, portfolioRevealIntroScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioRevealIntroScreen.Q;
                        return (i) ((v) portfolioRevealIntroScreen.M.getValue()).f295245b.get();
                    default:
                        KProperty[] kPropertyArr3 = PortfolioRevealIntroScreen.Q;
                        PortfolioRevealIntroScreen portfolioRevealIntroScreen2 = this.f150029b;
                        return dli.f.a(portfolioRevealIntroScreen2, (i) portfolioRevealIntroScreen2.N.getValue(), zhm.v.k(new ContainerDelegate(zhm.v.k(new SegmentedGaugeChartDelegate(), new FlexibleBarChartDelegate()), null, 6), new TextDelegate()), 0, null, new koi.h(null, false, false, 1), null, 44);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: h8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PortfolioRevealIntroScreen f150029b;

            {
                this.f150029b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PortfolioRevealIntroScreen portfolioRevealIntroScreen = this.f150029b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PortfolioRevealIntroScreen.Q;
                        qji.b bVarU2 = portfolioRevealIntroScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.intro.di.PortfolioRevealIntroScreenInjector");
                        u uVar = (u) bVarU2;
                        w5f.m mVar = uVar.f295242b;
                        u uVar2 = uVar.f295243c;
                        PortfolioRevealIntroScreenContract$InputData portfolioRevealIntroScreenContract$InputData = portfolioRevealIntroScreen.K;
                        portfolioRevealIntroScreenContract$InputData.getClass();
                        return new v(mVar, uVar2, portfolioRevealIntroScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = PortfolioRevealIntroScreen.Q;
                        return (i) ((v) portfolioRevealIntroScreen.M.getValue()).f295245b.get();
                    default:
                        KProperty[] kPropertyArr3 = PortfolioRevealIntroScreen.Q;
                        PortfolioRevealIntroScreen portfolioRevealIntroScreen2 = this.f150029b;
                        return dli.f.a(portfolioRevealIntroScreen2, (i) portfolioRevealIntroScreen2.N.getValue(), zhm.v.k(new ContainerDelegate(zhm.v.k(new SegmentedGaugeChartDelegate(), new FlexibleBarChartDelegate()), null, 6), new TextDelegate()), 0, null, new koi.h(null, false, false, 1), null, 44);
                }
            }
        });
        this.P = s.t(this, b.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().d.setContentDescription(uiState.f150039b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.managed_portfolios_reveal_intro_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
