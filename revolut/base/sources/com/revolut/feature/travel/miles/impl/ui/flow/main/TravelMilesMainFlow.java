package com.revolut.feature.travel.miles.impl.ui.flow.main;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.travel.miles.impl.R$id;
import com.revolut.feature.travel.miles.impl.R$layout;
import com.revolut.feature.travel.miles.impl.ui.flow.main.TravelMilesMainFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import jgg.c;
import jgg.f;
import jgg.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import qji.b;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/miles/impl/ui/flow/main/TravelMilesMainFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ljgg/f;", "Lwki/a;", "Ljgg/g;", "<init>", "()V", "feature_travel_miles_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelMilesMainFlow extends ViewController<f> implements wki.a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(TravelMilesMainFlow.class, "binding", "getBinding()Lcom/revolut/feature/travel/miles/impl/databinding/FlowTravelMilesMainBinding;", 0))};
    public final Object L;
    public final Object N;
    public final Object O;
    public final int K = R$layout.flow_travel_miles_main;
    public final h M = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, rfg.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/travel/miles/impl/databinding/FlowTravelMilesMainBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i = R$id.travelMilesMainFlow_controllerContainer;
            if (((ControllerContainerFrameLayout) ViewBindings.findChildViewById(p0, i)) != null) {
                i = R$id.travelMilesMainFlow_navBarWithToolbar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    return new rfg.a(controllerContainerCoordinatorLayout, navBarWithToolbar);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public TravelMilesMainFlow() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: jgg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesMainFlow f174039b;

            {
                this.f174039b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelMilesMainFlow travelMilesMainFlow = this.f174039b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesMainFlow.P;
                        return md6.s.a(travelMilesMainFlow, (c) travelMilesMainFlow.O.getValue(), R$id.travelMilesMainFlow_controllerContainer, 4);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesMainFlow.P;
                        phm.a aVar = (phm.a) ue0.e.j(travelMilesMainFlow.m2()).a().get(ffg.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ufg.s(((ufg.g) aVar2.b()).A);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ffg.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesMainFlow.P;
                        return (c) ((ufg.s) travelMilesMainFlow.N.getValue()).f279791c.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: jgg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesMainFlow f174039b;

            {
                this.f174039b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelMilesMainFlow travelMilesMainFlow = this.f174039b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesMainFlow.P;
                        return md6.s.a(travelMilesMainFlow, (c) travelMilesMainFlow.O.getValue(), R$id.travelMilesMainFlow_controllerContainer, 4);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesMainFlow.P;
                        phm.a aVar = (phm.a) ue0.e.j(travelMilesMainFlow.m2()).a().get(ffg.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ufg.s(((ufg.g) aVar2.b()).A);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ffg.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesMainFlow.P;
                        return (c) ((ufg.s) travelMilesMainFlow.N.getValue()).f279791c.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: jgg.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelMilesMainFlow f174039b;

            {
                this.f174039b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelMilesMainFlow travelMilesMainFlow = this.f174039b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelMilesMainFlow.P;
                        return md6.s.a(travelMilesMainFlow, (c) travelMilesMainFlow.O.getValue(), R$id.travelMilesMainFlow_controllerContainer, 4);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelMilesMainFlow.P;
                        phm.a aVar = (phm.a) ue0.e.j(travelMilesMainFlow.m2()).a().get(ffg.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new ufg.s(((ufg.g) aVar2.b()).A);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ffg.a.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = TravelMilesMainFlow.P;
                        return (c) ((ufg.s) travelMilesMainFlow.N.getValue()).f279791c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((rfg.a) value).f253777b;
        navBarWithToolbar.setToolbarTitle(uiState.f174043a);
        navBarWithToolbar.setTitle(uiState.f174043a, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setMenuItems(uiState.f174044b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ufg.s) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (ufg.s) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((rfg.a) value).f253777b;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new j2c.b(this, null, 24), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.o.f57403b), null, new j82.q(this, null, 22), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (wki.c) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (wki.c) this.L.getValue();
    }
}
