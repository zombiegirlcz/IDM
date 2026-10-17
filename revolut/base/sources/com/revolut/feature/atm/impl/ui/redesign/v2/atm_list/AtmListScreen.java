package com.revolut.feature.atm.impl.ui.redesign.v2.atm_list;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.a0;
import cli.o;
import cli.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.feature.atm.impl.R$id;
import com.revolut.feature.atm.impl.R$layout;
import com.revolut.feature.atm.impl.ui.redesign.v2.atm_list.AtmListScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import defpackage.e1;
import ek2.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.ranges.f;
import kotlin.reflect.KProperty;
import mx0.c9;
import uj2.c;
import uk2.b;
import vc.s;
import xki.e;
import yp0.y;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/atm/impl/ui/redesign/v2/atm_list/AtmListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Lcli/w;", "Luk2/c;", "<init>", "()V", "feature_atm_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AtmListScreen extends ViewController<Object> implements w {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(AtmListScreen.class, "binding", "getBinding()Lcom/revolut/feature/atm/impl/databinding/ScreenAtmListBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final RowDelegate L;
    public final FullScreenStateDelegate M;
    public final int[] N;
    public float O;
    public Float P;
    public int Q;
    public final j R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final int V;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/atm/impl/databinding/ScreenAtmListBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i = R$id.atmListScreen_navigationBar;
            NavBarBottomSheet navBarBottomSheet = (NavBarBottomSheet) ViewBindings.findChildViewById(p0, i);
            if (navBarBottomSheet != null) {
                i = R$id.atmListScreen_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    return new c(controllerContainerCoordinatorLayout, navBarBottomSheet, screenContentRecyclerView);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public AtmListScreen() {
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.L = rowDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.M = fullScreenStateDelegate;
        final int i = 2;
        this.N = new int[2];
        final int i2 = 0;
        final int i3 = 1;
        this.R = new j(7, v.k(new RowLoadingDelegate(), rowDelegate, fullScreenStateDelegate), false);
        this.S = te0.w.y0(new Function0(this) { // from class: uk2.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtmListScreen f280655b;

            {
                this.f280655b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                AtmListScreen atmListScreen = this.f280655b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = AtmListScreen.W;
                        qji.b bVarU2 = atmListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.atm.impl.ui.redesign.v2.atm_list.di.AtmListInjector");
                        xj2.o oVar = (xj2.o) bVarU2;
                        xj2.n nVar = oVar.f306490a;
                        xj2.o oVar2 = oVar.f306491b;
                        xj2.j jVar = new xj2.j();
                        jVar.f306467a = e4m.b.b(new wpg.g(nVar, oVar2, jVar, 1, 13));
                        jVar.f306468b = e4m.b.b(new wpg.g(nVar, oVar2, jVar, 0, 13));
                        return jVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AtmListScreen.W;
                        return (v) ((xj2.j) atmListScreen.S.getValue()).f306468b.get();
                    default:
                        KProperty[] kPropertyArr3 = AtmListScreen.W;
                        return n14.e.a(atmListScreen, atmListScreen.d());
                }
            }
        });
        this.T = te0.w.y0(new Function0(this) { // from class: uk2.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtmListScreen f280655b;

            {
                this.f280655b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                AtmListScreen atmListScreen = this.f280655b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = AtmListScreen.W;
                        qji.b bVarU2 = atmListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.atm.impl.ui.redesign.v2.atm_list.di.AtmListInjector");
                        xj2.o oVar = (xj2.o) bVarU2;
                        xj2.n nVar = oVar.f306490a;
                        xj2.o oVar2 = oVar.f306491b;
                        xj2.j jVar = new xj2.j();
                        jVar.f306467a = e4m.b.b(new wpg.g(nVar, oVar2, jVar, 1, 13));
                        jVar.f306468b = e4m.b.b(new wpg.g(nVar, oVar2, jVar, 0, 13));
                        return jVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AtmListScreen.W;
                        return (v) ((xj2.j) atmListScreen.S.getValue()).f306468b.get();
                    default:
                        KProperty[] kPropertyArr3 = AtmListScreen.W;
                        return n14.e.a(atmListScreen, atmListScreen.d());
                }
            }
        });
        this.U = te0.w.y0(new Function0(this) { // from class: uk2.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtmListScreen f280655b;

            {
                this.f280655b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                AtmListScreen atmListScreen = this.f280655b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = AtmListScreen.W;
                        qji.b bVarU2 = atmListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.atm.impl.ui.redesign.v2.atm_list.di.AtmListInjector");
                        xj2.o oVar = (xj2.o) bVarU2;
                        xj2.n nVar = oVar.f306490a;
                        xj2.o oVar2 = oVar.f306491b;
                        xj2.j jVar = new xj2.j();
                        jVar.f306467a = e4m.b.b(new wpg.g(nVar, oVar2, jVar, 1, 13));
                        jVar.f306468b = e4m.b.b(new wpg.g(nVar, oVar2, jVar, 0, 13));
                        return jVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AtmListScreen.W;
                        return (v) ((xj2.j) atmListScreen.S.getValue()).f306468b.get();
                    default:
                        KProperty[] kPropertyArr3 = AtmListScreen.W;
                        return n14.e.a(atmListScreen, atmListScreen.d());
                }
            }
        });
        this.V = R$layout.screen_atm_list;
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        uk2.c uiState = (uk2.c) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        b bVar = qVar instanceof b ? (b) qVar : null;
        if (pd.b.k(bVar != null ? Boolean.valueOf(bVar.f280642a) : null)) {
            d3().f280481b.setHeaderModel(uiState.f280644a);
        }
        if (pd.b.k(bVar != null ? Boolean.valueOf(bVar.f280643b) : null)) {
            this.R.c(uiState.f280645b);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (xj2.j) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f280481b.setOnClickListener(new c9(this, 25));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.Q = tk2.q.a(view);
        ViewCompat.setOnApplyWindowInsetsListener(view, new e1(this, view, 5));
        d3().f280482c.setAlpha(1.0f);
        d3().f280481b.setAlpha(BitmapDescriptorFactory.HUE_RED);
        d3().f280481b.setClickable(false);
        pd.b.a(this, new g(this, view, 1));
        pd.b.b(this, new ebi.a(this, view, 2));
        ViewController.P2(this, d().f280669w, new uk2.o(this, null, 0), 3);
        if (d3().f280482c.getAdapter() == null) {
            ScreenContentRecyclerView atmListScreenRecyclerView = d3().f280482c;
            Intrinsics.checkNotNullExpressionValue(atmListScreenRecyclerView, "atmListScreenRecyclerView");
            y.h(atmListScreenRecyclerView, this.R, new LinearLayoutManager(atmListScreenRecyclerView.getContext()));
        }
        ViewController.P2(this, vkm.q.J(new tzh.g(rd0.e.b(this.L.f53218h), 20), new tzh.g(rd0.e.b(this.M.f.f121375b), 19)), new uk2.o(this, null, 1), 3);
    }

    public final c d3() {
        ViewBinding value = this.K.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final uk2.v d() {
        return (uk2.v) this.T.getValue();
    }

    public final void f3(float f) {
        Float f4 = this.P;
        if (f4 != null) {
            float fFloatValue = f4.floatValue();
            if (fFloatValue > BitmapDescriptorFactory.HUE_RED) {
                float f5 = f.f(f / fFloatValue, BitmapDescriptorFactory.HUE_RED, 1.0f);
                d3().f280482c.setAlpha(f5);
                d3().f280481b.setAlpha(1.0f - f5);
                d3().f280481b.setClickable(f5 < 1.0f);
            }
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.U.getValue();
    }
}
