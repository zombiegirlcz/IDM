package com.revolut.feature.trading.managed_portfolios.impl.ui.select_template;

import ali.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading.managed_portfolios.impl.R$id;
import com.revolut.feature.trading.managed_portfolios.impl.R$layout;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.ManagedPortfolioSelectTemplateScreen;
import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.ManagedPortfolioSelectTemplateScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import cvi.j;
import d8f.c;
import d8f.d;
import d8f.m;
import d8f.n;
import d8f.p;
import d8f.t;
import d8f.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import w5f.k;
import xki.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/ManagedPortfolioSelectTemplateScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ld8f/m;", "Lali/g;", "Ld8f/u;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/select_template/ManagedPortfolioSelectTemplateScreenContract$Page;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ManagedPortfolioSelectTemplateScreen extends ViewController<m> implements g {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ManagedPortfolioSelectTemplateScreen.class, "binding", "getBinding()Lcom/revolut/feature/trading/managed_portfolios/impl/databinding/ScreenPortfolioTemplatesBinding;", 0))};
    public final ManagedPortfolioSelectTemplateScreenContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final d Q;

    public ManagedPortfolioSelectTemplateScreen(ManagedPortfolioSelectTemplateScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, d8f.b.f);
        this.M = R$layout.screen_portfolio_templates;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: d8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfolioSelectTemplateScreen f112231b;

            {
                this.f112231b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ManagedPortfolioSelectTemplateScreen managedPortfolioSelectTemplateScreen = this.f112231b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ManagedPortfolioSelectTemplateScreen.R;
                        return mif.a.a(managedPortfolioSelectTemplateScreen, 0, R$id.portfolioTemplates_viewPager, managedPortfolioSelectTemplateScreen.d(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = ManagedPortfolioSelectTemplateScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfolioSelectTemplateScreen.m2()).a().get(w5f.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5f.m.class, " is not found"));
                        }
                        w5f.m mVar = ((w5f.m) aVar2.b()).f295201s;
                        ManagedPortfolioSelectTemplateScreenContract$InputData managedPortfolioSelectTemplateScreenContract$InputData = managedPortfolioSelectTemplateScreen.K;
                        managedPortfolioSelectTemplateScreenContract$InputData.getClass();
                        return new w5f.k(mVar, managedPortfolioSelectTemplateScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ManagedPortfolioSelectTemplateScreen.R;
                        return (n) ((w5f.k) managedPortfolioSelectTemplateScreen.O.getValue()).f295186c.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: d8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfolioSelectTemplateScreen f112231b;

            {
                this.f112231b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ManagedPortfolioSelectTemplateScreen managedPortfolioSelectTemplateScreen = this.f112231b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ManagedPortfolioSelectTemplateScreen.R;
                        return mif.a.a(managedPortfolioSelectTemplateScreen, 0, R$id.portfolioTemplates_viewPager, managedPortfolioSelectTemplateScreen.d(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = ManagedPortfolioSelectTemplateScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfolioSelectTemplateScreen.m2()).a().get(w5f.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5f.m.class, " is not found"));
                        }
                        w5f.m mVar = ((w5f.m) aVar2.b()).f295201s;
                        ManagedPortfolioSelectTemplateScreenContract$InputData managedPortfolioSelectTemplateScreenContract$InputData = managedPortfolioSelectTemplateScreen.K;
                        managedPortfolioSelectTemplateScreenContract$InputData.getClass();
                        return new w5f.k(mVar, managedPortfolioSelectTemplateScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ManagedPortfolioSelectTemplateScreen.R;
                        return (n) ((w5f.k) managedPortfolioSelectTemplateScreen.O.getValue()).f295186c.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: d8f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ManagedPortfolioSelectTemplateScreen f112231b;

            {
                this.f112231b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ManagedPortfolioSelectTemplateScreen managedPortfolioSelectTemplateScreen = this.f112231b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ManagedPortfolioSelectTemplateScreen.R;
                        return mif.a.a(managedPortfolioSelectTemplateScreen, 0, R$id.portfolioTemplates_viewPager, managedPortfolioSelectTemplateScreen.d(), 5);
                    case 1:
                        KProperty[] kPropertyArr2 = ManagedPortfolioSelectTemplateScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(managedPortfolioSelectTemplateScreen.m2()).a().get(w5f.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w5f.m.class, " is not found"));
                        }
                        w5f.m mVar = ((w5f.m) aVar2.b()).f295201s;
                        ManagedPortfolioSelectTemplateScreenContract$InputData managedPortfolioSelectTemplateScreenContract$InputData = managedPortfolioSelectTemplateScreen.K;
                        managedPortfolioSelectTemplateScreenContract$InputData.getClass();
                        return new w5f.k(mVar, managedPortfolioSelectTemplateScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = ManagedPortfolioSelectTemplateScreen.R;
                        return (n) ((w5f.k) managedPortfolioSelectTemplateScreen.O.getValue()).f295186c.get();
                }
            }
        });
        this.Q = new d(this);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        u uiState = (u) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        p pVar = uiState.d;
        d8f.s sVar = uiState.f112259c;
        NavBarWithToolbar navBarWithToolbar = d3().f286211c;
        if (pVar == null) {
            navBarWithToolbar.setLoadingVisible(true);
        } else {
            Clause clause = pVar.f112252b;
            TextLocalisedClause textLocalisedClause = pVar.f112251a;
            navBarWithToolbar.setLoadingVisible(false);
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            navBarWithToolbar.setDescriptionText(clause);
            navBarWithToolbar.setDescriptionVisible(clause != null);
        }
        LargeActionButton largeActionButton = d3().f286210b;
        largeActionButton.setText(sVar.a());
        largeActionButton.setEnabled(sVar.f112255c);
        largeActionButton.setVisibility(sVar.d ? 0 : 8);
        List list = uiState.f112257a;
        String str = uiState.f112258b;
        t tVar = qVar instanceof t ? (t) qVar : null;
        boolean z = tVar != null && tVar.f112256a;
        Tabs tabs = d3().d;
        tabs.setVisibility(list.isEmpty() ? 8 : 0);
        Tabs.setItems$default(tabs, list, null, 2, null);
        if (str != null) {
            Tabs portfolioTemplatesTabs = d3().d;
            Intrinsics.checkNotNullExpressionValue(portfolioTemplatesTabs, "portfolioTemplatesTabs");
            Tabs.u(portfolioTemplatesTabs, str, z, false, false, 12);
        }
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        ManagedPortfolioSelectTemplateScreenContract$Page pagerItem2 = (ManagedPortfolioSelectTemplateScreenContract$Page) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (k) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f286211c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        d3().e.unregisterOnPageChangeCallback(this.Q);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f286211c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().d.f58882b), new j(this, (Continuation) null, 28), 3);
        d3().e.registerOnPageChangeCallback(this.Q);
        ViewController.P2(this, rd0.e.b(d3().f286210b.o), new c(this, null, 1), 3);
    }

    public final v5f.b d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (v5f.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.N.getValue();
    }
}
