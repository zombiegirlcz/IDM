package com.revolut.feature.travel.experiences.impl.ui.flow.tabs;

import ali.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.R$id;
import com.revolut.feature.travel.experiences.impl.R$layout;
import com.revolut.feature.travel.experiences.impl.ui.flow.tabs.TravelExperiencesTabsFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import k0d.c;
import k1g.b;
import k1g.d;
import k1g.i;
import k1g.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import w0g.n;
import xki.e;
import z0g.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/impl/ui/flow/tabs/TravelExperiencesTabsFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lk1g/i;", "Lali/g;", "Lk1g/l;", "Lcom/revolut/feature/travel/experiences/impl/ui/flow/tabs/TravelExperiencesTabsFlowContract$PagerItem;", "feature_travel_experiences_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelExperiencesTabsFlow extends ViewController<i> implements g {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(TravelExperiencesTabsFlow.class, "binding", "getBinding()Lcom/revolut/feature/travel/experiences/impl/databinding/ScreenExperiencesTabsBinding;", 0))};
    public final boolean K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public TravelExperiencesTabsFlow(TravelExperiencesTabsFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = true;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_experiences_tabs;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: k1g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesTabsFlow f180242b;

            {
                this.f180242b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelExperiencesTabsFlow travelExperiencesTabsFlow = this.f180242b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesTabsFlow.Q;
                        return mif.a.a(travelExperiencesTabsFlow, 0, R$id.experiencesTabsScreen_viewPager, travelExperiencesTabsFlow.R2(), 5);
                    default:
                        KProperty[] kPropertyArr2 = TravelExperiencesTabsFlow.Q;
                        return (d) ((q) travelExperiencesTabsFlow.O.getValue()).d.get();
                }
            }
        });
        this.O = w.y0(new jnf.a(this, inputData, 23));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: k1g.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelExperiencesTabsFlow f180242b;

            {
                this.f180242b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelExperiencesTabsFlow travelExperiencesTabsFlow = this.f180242b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelExperiencesTabsFlow.Q;
                        return mif.a.a(travelExperiencesTabsFlow, 0, R$id.experiencesTabsScreen_viewPager, travelExperiencesTabsFlow.R2(), 5);
                    default:
                        KProperty[] kPropertyArr2 = TravelExperiencesTabsFlow.Q;
                        return (d) ((q) travelExperiencesTabsFlow.O.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f293724b.setItems(uiState.f180253a.f180252a);
        d3().f293724b.b(uiState.f180254b);
        d3().f293725c.setMenuItems(uiState.f180255c);
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        TravelExperiencesTabsFlowContract$PagerItem tab2 = (TravelExperiencesTabsFlowContract$PagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(tab2, "pagerItem");
        a aVar = (a) R2();
        aVar.getClass();
        Intrinsics.checkNotNullParameter(tab2, "tab");
        aVar.H2(aVar.f93008s, new c(tab2, 5));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (q) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f293725c;
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.experiences_home_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.experiences_home_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f293725c;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new jkc.g(this, continuation, 29), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.o.f57403b), null, new k1g.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f293724b.f58581q), new k1g.c(this, continuation, 1), 3);
    }

    public final n d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (n) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d d() {
        return (d) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.K);
    }
}
