package com.revolut.feature.global_markets.impl.ui.redesign.flow;

import aii.q;
import ali.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.global_markets.impl.R$id;
import com.revolut.feature.global_markets.impl.R$layout;
import com.revolut.feature.global_markets.impl.ui.redesign.flow.GlobalMarketsRedesignFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.retail.wealth.resources.R$string;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lpl.c;
import lu6.p;
import m75.i;
import m87.d;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/global_markets/impl/ui/redesign/flow/GlobalMarketsRedesignFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lali/g;", "Lm87/d;", "Lcom/revolut/feature/global_markets/impl/ui/redesign/flow/GlobalMarketsRedesignFlowContract$PagerItem;", "<init>", "()V", "feature_global_markets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GlobalMarketsRedesignFlow extends ViewController<q> implements g {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(GlobalMarketsRedesignFlow.class, "binding", "getBinding()Lcom/revolut/feature/global_markets/impl/databinding/FlowGlobalMarketsRedesignBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final int L = R$layout.flow_global_markets_redesign;
    public final int M = R$style.UiKitTheme_Mono;
    public final Object N;
    public final Object O;
    public final Object P;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, w77.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/global_markets/impl/databinding/FlowGlobalMarketsRedesignBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.flowGlobalMarketsRedesign_navBarWithToolbar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.flowGlobalMarketsRedesign_Pager;
                if (((ViewPager2) ViewBindings.findChildViewById(p0, i)) != null) {
                    i = R$id.flowGlobalMarketsRedesign_tabs;
                    Tabs tabs = (Tabs) ViewBindings.findChildViewById(p0, i);
                    if (tabs != null) {
                        return new w77.a((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar, tabs);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public GlobalMarketsRedesignFlow() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: m87.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalMarketsRedesignFlow f203439b;

            {
                this.f203439b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                GlobalMarketsRedesignFlow globalMarketsRedesignFlow = this.f203439b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = GlobalMarketsRedesignFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(globalMarketsRedesignFlow.m2()).a().get(y77.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new y77.d(((y77.c) aVar2.b()).f311372r);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", y77.c.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = GlobalMarketsRedesignFlow.Q;
                        return (b) ((y77.d) globalMarketsRedesignFlow.N.getValue()).f311379c.get();
                    default:
                        KProperty[] kPropertyArr3 = GlobalMarketsRedesignFlow.Q;
                        return mif.a.a(globalMarketsRedesignFlow, 0, R$id.flowGlobalMarketsRedesign_Pager, (b) globalMarketsRedesignFlow.O.getValue(), 5);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: m87.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalMarketsRedesignFlow f203439b;

            {
                this.f203439b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                GlobalMarketsRedesignFlow globalMarketsRedesignFlow = this.f203439b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GlobalMarketsRedesignFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(globalMarketsRedesignFlow.m2()).a().get(y77.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new y77.d(((y77.c) aVar2.b()).f311372r);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", y77.c.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = GlobalMarketsRedesignFlow.Q;
                        return (b) ((y77.d) globalMarketsRedesignFlow.N.getValue()).f311379c.get();
                    default:
                        KProperty[] kPropertyArr3 = GlobalMarketsRedesignFlow.Q;
                        return mif.a.a(globalMarketsRedesignFlow, 0, R$id.flowGlobalMarketsRedesign_Pager, (b) globalMarketsRedesignFlow.O.getValue(), 5);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: m87.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GlobalMarketsRedesignFlow f203439b;

            {
                this.f203439b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                GlobalMarketsRedesignFlow globalMarketsRedesignFlow = this.f203439b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = GlobalMarketsRedesignFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(globalMarketsRedesignFlow.m2()).a().get(y77.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new y77.d(((y77.c) aVar2.b()).f311372r);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", y77.c.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = GlobalMarketsRedesignFlow.Q;
                        return (b) ((y77.d) globalMarketsRedesignFlow.N.getValue()).f311379c.get();
                    default:
                        KProperty[] kPropertyArr3 = GlobalMarketsRedesignFlow.Q;
                        return mif.a.a(globalMarketsRedesignFlow, 0, R$id.flowGlobalMarketsRedesign_Pager, (b) globalMarketsRedesignFlow.O.getValue(), 5);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f295489c.setItems(uiState.f203442a, uiState.f203443b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        GlobalMarketsRedesignFlowContract$PagerItem pagerItem2 = (GlobalMarketsRedesignFlowContract$PagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        com.revolut.feature.global_markets.impl.ui.redesign.flow.a aVar = (com.revolut.feature.global_markets.impl.ui.redesign.flow.a) ((m87.b) this.O.getValue());
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        String tabId = pagerItem2.getF70838b();
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        aVar.H2(aVar.o, new p(tabId, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y77.d) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (y77.d) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (m87.b) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f295488b.f59410q), new c(this, continuation, 27), 3);
        ViewController.P2(this, rd0.e.b(d3().f295489c.f58882b), new i(this, continuation, 2), 3);
        NavBarWithToolbar navBarWithToolbar = d3().f295488b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.invest_markets_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.invest_markets_header_title, null, null, 14), null);
    }

    public final w77.a d3() {
        ViewBinding value = this.K.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (w77.a) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.P.getValue();
    }
}
