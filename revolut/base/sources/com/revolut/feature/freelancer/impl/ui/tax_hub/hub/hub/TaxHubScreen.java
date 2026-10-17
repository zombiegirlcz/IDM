package com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CalendarRowDelegate;
import com.revolut.core.ui_kit.delegates.CalendarRowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.TaxHubScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import g37.g;
import g37.i;
import g37.j;
import g37.q;
import g37.r;
import g37.t;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/tax_hub/hub/hub/TaxHubScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg37/q;", "Ltki/c;", "Lg37/t;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TaxHubScreen extends ViewController<q> implements tki.c {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(TaxHubScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final ActionWidgetDelegate M = new ActionWidgetDelegate();
    public final CalendarRowDelegate N = new CalendarRowDelegate();
    public final FullScreenStateDelegate O = new FullScreenStateDelegate();
    public final ListSubheaderDelegate P = new ListSubheaderDelegate();
    public final RowDelegate Q = new RowDelegate(null, null, 7);
    public final TextDelegate R = new TextDelegate();
    public final Object S;
    public final Object T;
    public final Object U;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public TaxHubScreen() {
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: g37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubScreen f140214b;

            {
                this.f140214b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TaxHubScreen taxHubScreen = this.f140214b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubScreen.V;
                        qji.b bVarU2 = taxHubScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.di.TaxHubScreenInjector");
                        bt6.l lVar = (bt6.l) bVarU2;
                        bt6.b bVar = lVar.f18362c;
                        bt6.l lVar2 = lVar.d;
                        phm.a aVar = (phm.a) ue0.e.j(taxHubScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        hr6.l lVarL = ((us6.q) aVar2.b()).l();
                        lVarL.getClass();
                        return new bt6.t(bVar, lVar2, lVarL);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubScreen.V;
                        return (r) ((bt6.t) taxHubScreen.S.getValue()).f18383c.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubScreen.V;
                        TaxHubScreen taxHubScreen2 = this.f140214b;
                        return tki.g.a(taxHubScreen2, taxHubScreen2.R2(), zhm.v.k(taxHubScreen2.M, taxHubScreen2.N, new CalendarRowLoadingDelegate(), taxHubScreen2.O, taxHubScreen2.P, new ListSubheaderLoadingDelegate(), taxHubScreen2.Q, new RowLoadingDelegate(), taxHubScreen2.R), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: g37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubScreen f140214b;

            {
                this.f140214b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TaxHubScreen taxHubScreen = this.f140214b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubScreen.V;
                        qji.b bVarU2 = taxHubScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.di.TaxHubScreenInjector");
                        bt6.l lVar = (bt6.l) bVarU2;
                        bt6.b bVar = lVar.f18362c;
                        bt6.l lVar2 = lVar.d;
                        phm.a aVar = (phm.a) ue0.e.j(taxHubScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        hr6.l lVarL = ((us6.q) aVar2.b()).l();
                        lVarL.getClass();
                        return new bt6.t(bVar, lVar2, lVarL);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubScreen.V;
                        return (r) ((bt6.t) taxHubScreen.S.getValue()).f18383c.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubScreen.V;
                        TaxHubScreen taxHubScreen2 = this.f140214b;
                        return tki.g.a(taxHubScreen2, taxHubScreen2.R2(), zhm.v.k(taxHubScreen2.M, taxHubScreen2.N, new CalendarRowLoadingDelegate(), taxHubScreen2.O, taxHubScreen2.P, new ListSubheaderLoadingDelegate(), taxHubScreen2.Q, new RowLoadingDelegate(), taxHubScreen2.R), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: g37.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TaxHubScreen f140214b;

            {
                this.f140214b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TaxHubScreen taxHubScreen = this.f140214b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TaxHubScreen.V;
                        qji.b bVarU2 = taxHubScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.di.TaxHubScreenInjector");
                        bt6.l lVar = (bt6.l) bVarU2;
                        bt6.b bVar = lVar.f18362c;
                        bt6.l lVar2 = lVar.d;
                        phm.a aVar = (phm.a) ue0.e.j(taxHubScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        hr6.l lVarL = ((us6.q) aVar2.b()).l();
                        lVarL.getClass();
                        return new bt6.t(bVar, lVar2, lVarL);
                    case 1:
                        KProperty[] kPropertyArr2 = TaxHubScreen.V;
                        return (r) ((bt6.t) taxHubScreen.S.getValue()).f18383c.get();
                    default:
                        KProperty[] kPropertyArr3 = TaxHubScreen.V;
                        TaxHubScreen taxHubScreen2 = this.f140214b;
                        return tki.g.a(taxHubScreen2, taxHubScreen2.R2(), zhm.v.k(taxHubScreen2.M, taxHubScreen2.N, new CalendarRowLoadingDelegate(), taxHubScreen2.O, taxHubScreen2.P, new ListSubheaderLoadingDelegate(), taxHubScreen2.Q, new RowLoadingDelegate(), taxHubScreen2.R), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        t uiState = (t) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        g37.s sVar = uiState.f140228a;
        TextLocalisedClause textLocalisedClause = sVar.f140227c;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setMenuItems(sVar.f140226b);
        navBarWithToolbar.setTopActions(sVar.f140225a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (bt6.t) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174539b.setHeaderTitleMode(j0.MULTILINE_LARGE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new g37.e(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new ft.d(this, continuation, 21), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.C0()), new g37.f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.M.f51589c.f121375b), new g37.e(this, continuation, 1), 3);
        ViewController.P2(this, kii.e.t(this.N.f, "hide(...)"), new g(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52371h.f121375b), new g37.h(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.e), new i(this, null), 3);
        RowDelegate rowDelegate = this.Q;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new j(this, null), 3);
        ViewController.P2(this, new fo6.d(rd0.e.b(rowDelegate.f53220l), 19), new g37.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53530c), new g37.d(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final r R2() {
        return (r) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (tki.a) this.U.getValue();
    }
}
