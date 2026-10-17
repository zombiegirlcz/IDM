package com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FiltersDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.AirportLoungesPassActivityScreen;
import cwi.k0;
import cwi.p0;
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
import vc.s;
import xki.e;
import xo8.a0;
import xsf.c;
import xxi.d;
import xxi.k;
import xxi.l;
import yp0.v;
import yp0.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/pass_activity/AirportLoungesPassActivityScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lxxi/l;", "<init>", "()V", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungesPassActivityScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(AirportLoungesPassActivityScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final Object M = w.y0(new c(12));
    public final Object N = w.y0(new c(13));
    public final Object O = w.y0(new c(14));
    public final Object P = w.y0(new c(15));
    public v Q;
    public final Object R;
    public final Object S;
    public final Object T;

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

    public AirportLoungesPassActivityScreen() {
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: xxi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesPassActivityScreen f309534b;

            {
                this.f309534b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AirportLoungesPassActivityScreen airportLoungesPassActivityScreen = this.f309534b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesPassActivityScreen.U;
                        AirportLoungesPassActivityScreen airportLoungesPassActivityScreen2 = this.f309534b;
                        return dli.f.a(airportLoungesPassActivityScreen2, airportLoungesPassActivityScreen2.R2(), zhm.v.k((FiltersDelegate) airportLoungesPassActivityScreen2.M.getValue(), (ListSubheaderDelegate) airportLoungesPassActivityScreen2.N.getValue(), new ListSubheaderLoadingDelegate(), (RowDelegate) airportLoungesPassActivityScreen2.O.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) airportLoungesPassActivityScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesPassActivityScreen.U;
                        qji.b bVarU2 = airportLoungesPassActivityScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.di.AirportLoungesPassActivityScreenInjector");
                        p0 p0Var = (p0) bVarU2;
                        return new k0(p0Var.f109756a, p0Var.f109757b, airportLoungesPassActivityScreen);
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungesPassActivityScreen.U;
                        return (k) ((k0) airportLoungesPassActivityScreen.S.getValue()).e.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: xxi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesPassActivityScreen f309534b;

            {
                this.f309534b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AirportLoungesPassActivityScreen airportLoungesPassActivityScreen = this.f309534b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesPassActivityScreen.U;
                        AirportLoungesPassActivityScreen airportLoungesPassActivityScreen2 = this.f309534b;
                        return dli.f.a(airportLoungesPassActivityScreen2, airportLoungesPassActivityScreen2.R2(), zhm.v.k((FiltersDelegate) airportLoungesPassActivityScreen2.M.getValue(), (ListSubheaderDelegate) airportLoungesPassActivityScreen2.N.getValue(), new ListSubheaderLoadingDelegate(), (RowDelegate) airportLoungesPassActivityScreen2.O.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) airportLoungesPassActivityScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesPassActivityScreen.U;
                        qji.b bVarU2 = airportLoungesPassActivityScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.di.AirportLoungesPassActivityScreenInjector");
                        p0 p0Var = (p0) bVarU2;
                        return new k0(p0Var.f109756a, p0Var.f109757b, airportLoungesPassActivityScreen);
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungesPassActivityScreen.U;
                        return (k) ((k0) airportLoungesPassActivityScreen.S.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: xxi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungesPassActivityScreen f309534b;

            {
                this.f309534b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AirportLoungesPassActivityScreen airportLoungesPassActivityScreen = this.f309534b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungesPassActivityScreen.U;
                        AirportLoungesPassActivityScreen airportLoungesPassActivityScreen2 = this.f309534b;
                        return dli.f.a(airportLoungesPassActivityScreen2, airportLoungesPassActivityScreen2.R2(), zhm.v.k((FiltersDelegate) airportLoungesPassActivityScreen2.M.getValue(), (ListSubheaderDelegate) airportLoungesPassActivityScreen2.N.getValue(), new ListSubheaderLoadingDelegate(), (RowDelegate) airportLoungesPassActivityScreen2.O.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) airportLoungesPassActivityScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungesPassActivityScreen.U;
                        qji.b bVarU2 = airportLoungesPassActivityScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.pass_activity.di.AirportLoungesPassActivityScreenInjector");
                        p0 p0Var = (p0) bVarU2;
                        return new k0(p0Var.f109756a, p0Var.f109757b, airportLoungesPassActivityScreen);
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungesPassActivityScreen.U;
                        return (k) ((k0) airportLoungesPassActivityScreen.S.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((l) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k0) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.airport_lounges_pass_activity_home_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        v vVar = this.Q;
        if (vVar != null) {
            d3().f174540c.removeOnScrollListener(vVar);
        }
        this.Q = null;
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new xni.h(this, null, 16), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.P.getValue()).f52371h.f121375b), new d(this, null), 3);
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        this.Q = y.a(recyclerView, 10, true, new xw9.c(this, 10));
        ViewController.P2(this, new a0(rd0.e.b(((FiltersDelegate) this.M.getValue()).f52338c.f121375b), 16), new xv4.o(this, (Continuation) null, 6), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
