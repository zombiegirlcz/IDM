package com.revolut.feature.wealth.ui.impl.trade_redesign.popular_commodities;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.ui.impl.trade_redesign.popular_commodities.PopularCommoditiesController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.wealth.resources.R$string;
import g85.f;
import gmh.c;
import gmh.e;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mkh.k;
import mkh.u;
import pki.b;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/wealth/ui/impl/trade_redesign/popular_commodities/PopularCommoditiesController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lgmh/e;", "<init>", "()V", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PopularCommoditiesController extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PopularCommoditiesController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final RowDelegate K;
    public final SwipeToActionDelegate L;
    public final h M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

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

    public PopularCommoditiesController() {
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.K = rowDelegate;
        this.L = new SwipeToActionDelegate(rowDelegate, false);
        this.M = s.t(this, a.f);
        this.N = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: gmh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PopularCommoditiesController f144853b;

            {
                this.f144853b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PopularCommoditiesController popularCommoditiesController = this.f144853b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PopularCommoditiesController.R;
                        PopularCommoditiesController popularCommoditiesController2 = this.f144853b;
                        return dli.f.a(popularCommoditiesController2, (c) popularCommoditiesController2.Q.getValue(), v.k(popularCommoditiesController2.K, popularCommoditiesController2.L, new FullScreenStateDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PopularCommoditiesController.R;
                        phm.a aVar = (phm.a) ue0.e.j(popularCommoditiesController.m2()).a().get(vhh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new k(((mkh.s) ((u) aVar2.b())).l0, new o5d.b(popularCommoditiesController.L));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = PopularCommoditiesController.R;
                        return (c) ((k) ((hmh.a) popularCommoditiesController.P.getValue())).f206344h.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: gmh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PopularCommoditiesController f144853b;

            {
                this.f144853b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PopularCommoditiesController popularCommoditiesController = this.f144853b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PopularCommoditiesController.R;
                        PopularCommoditiesController popularCommoditiesController2 = this.f144853b;
                        return dli.f.a(popularCommoditiesController2, (c) popularCommoditiesController2.Q.getValue(), v.k(popularCommoditiesController2.K, popularCommoditiesController2.L, new FullScreenStateDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PopularCommoditiesController.R;
                        phm.a aVar = (phm.a) ue0.e.j(popularCommoditiesController.m2()).a().get(vhh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new k(((mkh.s) ((u) aVar2.b())).l0, new o5d.b(popularCommoditiesController.L));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = PopularCommoditiesController.R;
                        return (c) ((k) ((hmh.a) popularCommoditiesController.P.getValue())).f206344h.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: gmh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PopularCommoditiesController f144853b;

            {
                this.f144853b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PopularCommoditiesController popularCommoditiesController = this.f144853b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PopularCommoditiesController.R;
                        PopularCommoditiesController popularCommoditiesController2 = this.f144853b;
                        return dli.f.a(popularCommoditiesController2, (c) popularCommoditiesController2.Q.getValue(), v.k(popularCommoditiesController2.K, popularCommoditiesController2.L, new FullScreenStateDelegate(), new RowLoadingDelegate()), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = PopularCommoditiesController.R;
                        phm.a aVar = (phm.a) ue0.e.j(popularCommoditiesController.m2()).a().get(vhh.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new k(((mkh.s) ((u) aVar2.b())).l0, new o5d.b(popularCommoditiesController.L));
                        }
                        throw new IllegalStateException(a0.d.q("Api ", vhh.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = PopularCommoditiesController.R;
                        return (c) ((k) ((hmh.a) popularCommoditiesController.P.getValue())).f206344h.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (hmh.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (c) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.commodities_popular_commodities_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.commodities_popular_commodities_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.commodities_popular_commodities_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.K.f53218h), new gmh.b(this, null), 3);
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new f(this, null, 18), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
