package com.revolut.retail.feature.travel_status.impl.ui.screens.overview;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.EsimDelegate;
import com.revolut.core.ui_kit.delegates.EsimLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.travel_status.impl.ui.screens.overview.TravelStatusOverviewScreen;
import com.revolut.retail.feature.travel_status.impl.ui.screens.overview.TravelStatusOverviewScreenContract$InputData;
import dli.a;
import dli.c;
import g2l.d;
import g2l.f;
import g2l.i;
import g2l.j;
import g2l.k;
import g2l.l;
import g2l.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/travel_status/impl/ui/screens/overview/TravelStatusOverviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg2l/k;", "Ldli/a;", "Lg2l/l;", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelStatusOverviewScreen extends ViewController<k> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(TravelStatusOverviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final TravelStatusOverviewScreenContract$InputData K;
    public final int L;
    public final EsimDelegate M;
    public final EsimLoadingDelegate N;
    public final FullScreenStateDelegate O;
    public final h P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public TravelStatusOverviewScreen(TravelStatusOverviewScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = new EsimDelegate();
        this.N = new EsimLoadingDelegate();
        this.O = new FullScreenStateDelegate();
        this.P = s.t(this, d.f);
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: g2l.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelStatusOverviewScreen f140136b;

            {
                this.f140136b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TravelStatusOverviewScreen travelStatusOverviewScreen = this.f140136b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TravelStatusOverviewScreen.T;
                        qji.b bVarU2 = travelStatusOverviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.travel_status.impl.ui.screens.overview.di.TravelStatusOverviewScreenInjector");
                        y1l.d dVar = (y1l.d) bVarU2;
                        y1l.b bVar = dVar.f310404b;
                        y1l.d dVar2 = dVar.f310405c;
                        TravelStatusOverviewScreenContract$InputData travelStatusOverviewScreenContract$InputData = travelStatusOverviewScreen.K;
                        travelStatusOverviewScreenContract$InputData.getClass();
                        return new y1l.e(bVar, dVar2, travelStatusOverviewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelStatusOverviewScreen.T;
                        return (m) ((y1l.e) travelStatusOverviewScreen.Q.getValue()).f310408c.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelStatusOverviewScreen.T;
                        TravelStatusOverviewScreen travelStatusOverviewScreen2 = this.f140136b;
                        return dli.f.a(travelStatusOverviewScreen2, (m) travelStatusOverviewScreen2.R.getValue(), v.k(travelStatusOverviewScreen2.N, travelStatusOverviewScreen2.M, travelStatusOverviewScreen2.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: g2l.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelStatusOverviewScreen f140136b;

            {
                this.f140136b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TravelStatusOverviewScreen travelStatusOverviewScreen = this.f140136b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelStatusOverviewScreen.T;
                        qji.b bVarU2 = travelStatusOverviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.travel_status.impl.ui.screens.overview.di.TravelStatusOverviewScreenInjector");
                        y1l.d dVar = (y1l.d) bVarU2;
                        y1l.b bVar = dVar.f310404b;
                        y1l.d dVar2 = dVar.f310405c;
                        TravelStatusOverviewScreenContract$InputData travelStatusOverviewScreenContract$InputData = travelStatusOverviewScreen.K;
                        travelStatusOverviewScreenContract$InputData.getClass();
                        return new y1l.e(bVar, dVar2, travelStatusOverviewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelStatusOverviewScreen.T;
                        return (m) ((y1l.e) travelStatusOverviewScreen.Q.getValue()).f310408c.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelStatusOverviewScreen.T;
                        TravelStatusOverviewScreen travelStatusOverviewScreen2 = this.f140136b;
                        return dli.f.a(travelStatusOverviewScreen2, (m) travelStatusOverviewScreen2.R.getValue(), v.k(travelStatusOverviewScreen2.N, travelStatusOverviewScreen2.M, travelStatusOverviewScreen2.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: g2l.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TravelStatusOverviewScreen f140136b;

            {
                this.f140136b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TravelStatusOverviewScreen travelStatusOverviewScreen = this.f140136b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TravelStatusOverviewScreen.T;
                        qji.b bVarU2 = travelStatusOverviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.travel_status.impl.ui.screens.overview.di.TravelStatusOverviewScreenInjector");
                        y1l.d dVar = (y1l.d) bVarU2;
                        y1l.b bVar = dVar.f310404b;
                        y1l.d dVar2 = dVar.f310405c;
                        TravelStatusOverviewScreenContract$InputData travelStatusOverviewScreenContract$InputData = travelStatusOverviewScreen.K;
                        travelStatusOverviewScreenContract$InputData.getClass();
                        return new y1l.e(bVar, dVar2, travelStatusOverviewScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = TravelStatusOverviewScreen.T;
                        return (m) ((y1l.e) travelStatusOverviewScreen.Q.getValue()).f310408c.get();
                    default:
                        KProperty[] kPropertyArr3 = TravelStatusOverviewScreen.T;
                        TravelStatusOverviewScreen travelStatusOverviewScreen2 = this.f140136b;
                        return dli.f.a(travelStatusOverviewScreen2, (m) travelStatusOverviewScreen2.R.getValue(), v.k(travelStatusOverviewScreen2.N, travelStatusOverviewScreen2.M, travelStatusOverviewScreen2.O), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        j jVar = uiState.f140144b;
        i iVar = jVar instanceof i ? (i) jVar : null;
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setTitle(iVar != null ? iVar.f140140a : null, null);
        navBarWithToolbar.setDescriptionVisible((iVar != null ? iVar.f140141b : null) != null);
        navBarWithToolbar.setDescriptionText(iVar != null ? iVar.f140141b : null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y1l.e) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (m) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new ft.d(this, continuation, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, new fo6.d(rd0.e.b(this.M.d), 18), null, new g06.k(this, continuation, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new f(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }

    public TravelStatusOverviewScreen() {
        this(TravelStatusOverviewScreenContract$InputData.f104316a);
    }
}
