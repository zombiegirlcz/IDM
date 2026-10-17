package com.revolut.feature.travel.flights.impl.ui.screen.self_transfer;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import c4g.p;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.flights.impl.R$id;
import com.revolut.feature.travel.flights.impl.R$layout;
import com.revolut.feature.travel.flights.impl.ui.screen.self_transfer.TravelFlightsSelfTransferScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.f;
import dw3.p3;
import f4g.z;
import f7g.c;
import f7g.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import ue0.e;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/self_transfer/TravelFlightsSelfTransferScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lf7g/c;", "<init>", "()V", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsSelfTransferScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(TravelFlightsSelfTransferScreen.class, "binding", "getBinding()Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsSelfTransferBinding;", 0))};
    public final int K = R$layout.screen_travel_flights_self_transfer;
    public final h L = s.t(this, a.f);
    public final Object M;
    public final Object N;
    public final Object O;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, p.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/flights/impl/databinding/ScreenTravelFlightsSelfTransferBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i = R$id.travelFlightsSelfTransferScreen_navBar;
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
            if (navBarWithToolbar != null) {
                i = R$id.travelFlightsSelfTransferScreen_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new p(controllerContainerCoordinatorLayout, navBarWithToolbar);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public TravelFlightsSelfTransferScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: f7g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsSelfTransferScreen f132608b;

            {
                this.f132608b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelFlightsSelfTransferScreen travelFlightsSelfTransferScreen = this.f132608b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsSelfTransferScreen.P;
                        phm.a aVar = (phm.a) e.j(travelFlightsSelfTransferScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        z zVar = new z();
                        zVar.f132224a = e4m.b.b(new p3(zVar));
                        return zVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsSelfTransferScreen.P;
                        return (d) ((z) travelFlightsSelfTransferScreen.M.getValue()).f132224a.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsSelfTransferScreen.P;
                        TravelFlightsSelfTransferScreen travelFlightsSelfTransferScreen2 = this.f132608b;
                        return f.a(travelFlightsSelfTransferScreen2, (d) travelFlightsSelfTransferScreen2.N.getValue(), v.k(new ListSubheaderDelegate(), new RowDelegate(null, null, 7), new PlainTextDelegate()), R$id.travelFlightsSelfTransferScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: f7g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsSelfTransferScreen f132608b;

            {
                this.f132608b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelFlightsSelfTransferScreen travelFlightsSelfTransferScreen = this.f132608b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsSelfTransferScreen.P;
                        phm.a aVar = (phm.a) e.j(travelFlightsSelfTransferScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        z zVar = new z();
                        zVar.f132224a = e4m.b.b(new p3(zVar));
                        return zVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsSelfTransferScreen.P;
                        return (d) ((z) travelFlightsSelfTransferScreen.M.getValue()).f132224a.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsSelfTransferScreen.P;
                        TravelFlightsSelfTransferScreen travelFlightsSelfTransferScreen2 = this.f132608b;
                        return f.a(travelFlightsSelfTransferScreen2, (d) travelFlightsSelfTransferScreen2.N.getValue(), v.k(new ListSubheaderDelegate(), new RowDelegate(null, null, 7), new PlainTextDelegate()), R$id.travelFlightsSelfTransferScreen_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: f7g.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelFlightsSelfTransferScreen f132608b;

            {
                this.f132608b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelFlightsSelfTransferScreen travelFlightsSelfTransferScreen = this.f132608b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelFlightsSelfTransferScreen.P;
                        phm.a aVar = (phm.a) e.j(travelFlightsSelfTransferScreen.m2()).a().get(f4g.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", f4g.b.class, " is not found"));
                        }
                        f4g.b bVar = ((f4g.b) aVar2.b()).o;
                        z zVar = new z();
                        zVar.f132224a = e4m.b.b(new p3(zVar));
                        return zVar;
                    case 1:
                        KProperty[] kPropertyArr2 = TravelFlightsSelfTransferScreen.P;
                        return (d) ((z) travelFlightsSelfTransferScreen.M.getValue()).f132224a.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelFlightsSelfTransferScreen.P;
                        TravelFlightsSelfTransferScreen travelFlightsSelfTransferScreen2 = this.f132608b;
                        return f.a(travelFlightsSelfTransferScreen2, (d) travelFlightsSelfTransferScreen2.N.getValue(), v.k(new ListSubheaderDelegate(), new RowDelegate(null, null, 7), new PlainTextDelegate()), R$id.travelFlightsSelfTransferScreen_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        c uiState = (c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar travelFlightsSelfTransferScreenNavBar = d3().f21291b;
        Intrinsics.checkNotNullExpressionValue(travelFlightsSelfTransferScreenNavBar, "travelFlightsSelfTransferScreenNavBar");
        f7g.a model = uiState.f132609a;
        Intrinsics.checkNotNullParameter(travelFlightsSelfTransferScreenNavBar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        TextLocalisedClause textLocalisedClause = model.f132606a;
        travelFlightsSelfTransferScreenNavBar.setToolbarTitle(textLocalisedClause);
        travelFlightsSelfTransferScreenNavBar.setTitle(textLocalisedClause, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (z) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (d) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f21291b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f21291b.f59410q), new ev7.b(this, null, 17), 3);
    }

    public final p d3() {
        ViewBinding value = this.L.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (p) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getC0() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
