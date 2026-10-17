package com.revolut.retail.feature.airportlounges.impl.ui.screens.refund;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsRevPointsDelegate;
import com.revolut.core.ui_kit.delegates.CellIncrementDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.AirportLoungePassDetailsRefundScreen;
import cwi.g1;
import cwi.h1;
import dli.c;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import ryi.b;
import ryi.d;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/impl/ui/screens/refund/AirportLoungePassDetailsRefundScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lryi/d;", "Ldli/a;", "Lryi/h;", "<init>", "()V", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportLoungePassDetailsRefundScreen extends ViewController<d> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(AirportLoungePassDetailsRefundScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar_nextbutton;
    public final boolean L = true;
    public final h M = s.t(this, a.f);
    public final FullScreenStateDelegate N = new FullScreenStateDelegate();
    public final CellIncrementDelegate O = new CellIncrementDelegate();
    public final CellDetailsRevPointsDelegate P = new CellDetailsRevPointsDelegate();
    public final Object Q;
    public final Object R;
    public final Object S;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public AirportLoungePassDetailsRefundScreen() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: ryi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungePassDetailsRefundScreen f258375b;

            {
                this.f258375b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AirportLoungePassDetailsRefundScreen airportLoungePassDetailsRefundScreen = this.f258375b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungePassDetailsRefundScreen.T;
                        qji.b bVarU2 = airportLoungePassDetailsRefundScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.di.AirportLoungePassDetailsRefundScreenInjector");
                        return (h1) ((g1) ((uyi.a) bVarU2).q().mo3808a(airportLoungePassDetailsRefundScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungePassDetailsRefundScreen.T;
                        h1 h1Var = (h1) airportLoungePassDetailsRefundScreen.Q.getValue();
                        switch (h1Var.f109712a) {
                            case 0:
                                return (e) h1Var.f.get();
                            case 1:
                                return (e) h1Var.f.get();
                            default:
                                return (e) h1Var.f.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungePassDetailsRefundScreen.T;
                        AirportLoungePassDetailsRefundScreen airportLoungePassDetailsRefundScreen2 = this.f258375b;
                        return dli.f.a(airportLoungePassDetailsRefundScreen2, airportLoungePassDetailsRefundScreen2.d(), v.k(airportLoungePassDetailsRefundScreen2.N, airportLoungePassDetailsRefundScreen2.O, airportLoungePassDetailsRefundScreen2.P, new RowLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: ryi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungePassDetailsRefundScreen f258375b;

            {
                this.f258375b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AirportLoungePassDetailsRefundScreen airportLoungePassDetailsRefundScreen = this.f258375b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungePassDetailsRefundScreen.T;
                        qji.b bVarU2 = airportLoungePassDetailsRefundScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.di.AirportLoungePassDetailsRefundScreenInjector");
                        return (h1) ((g1) ((uyi.a) bVarU2).q().mo3808a(airportLoungePassDetailsRefundScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungePassDetailsRefundScreen.T;
                        h1 h1Var = (h1) airportLoungePassDetailsRefundScreen.Q.getValue();
                        switch (h1Var.f109712a) {
                            case 0:
                                return (e) h1Var.f.get();
                            case 1:
                                return (e) h1Var.f.get();
                            default:
                                return (e) h1Var.f.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungePassDetailsRefundScreen.T;
                        AirportLoungePassDetailsRefundScreen airportLoungePassDetailsRefundScreen2 = this.f258375b;
                        return dli.f.a(airportLoungePassDetailsRefundScreen2, airportLoungePassDetailsRefundScreen2.d(), v.k(airportLoungePassDetailsRefundScreen2.N, airportLoungePassDetailsRefundScreen2.O, airportLoungePassDetailsRefundScreen2.P, new RowLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: ryi.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AirportLoungePassDetailsRefundScreen f258375b;

            {
                this.f258375b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AirportLoungePassDetailsRefundScreen airportLoungePassDetailsRefundScreen = this.f258375b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AirportLoungePassDetailsRefundScreen.T;
                        qji.b bVarU2 = airportLoungePassDetailsRefundScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.airportlounges.impl.ui.screens.refund.di.AirportLoungePassDetailsRefundScreenInjector");
                        return (h1) ((g1) ((uyi.a) bVarU2).q().mo3808a(airportLoungePassDetailsRefundScreen)).mo3783build();
                    case 1:
                        KProperty[] kPropertyArr2 = AirportLoungePassDetailsRefundScreen.T;
                        h1 h1Var = (h1) airportLoungePassDetailsRefundScreen.Q.getValue();
                        switch (h1Var.f109712a) {
                            case 0:
                                return (e) h1Var.f.get();
                            case 1:
                                return (e) h1Var.f.get();
                            default:
                                return (e) h1Var.f.get();
                        }
                    default:
                        KProperty[] kPropertyArr3 = AirportLoungePassDetailsRefundScreen.T;
                        AirportLoungePassDetailsRefundScreen airportLoungePassDetailsRefundScreen2 = this.f258375b;
                        return dli.f.a(airportLoungePassDetailsRefundScreen2, airportLoungePassDetailsRefundScreen2.d(), v.k(airportLoungePassDetailsRefundScreen2.N, airportLoungePassDetailsRefundScreen2.O, airportLoungePassDetailsRefundScreen2.P, new RowLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        ryi.h uiState = (ryi.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f258384b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h1) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.airport_lounges_refund_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.airport_lounges_refund_header_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.airport_lounges_refund_header_description, zhm.u.c(new TextLocalisedClause(R$string.airport_lounges_refund_header_description_placeholder, null, new Click(30, (Integer) null, (Object) null, "CLAUSE_ID_AVAILABLE_LOUNGE", false), 10)), null, 12));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f174564b.setText(new TextLocalisedClause(R$string.airport_lounges_refund_cta, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new b(this, continuation, 0), 3);
        CellIncrementDelegate cellIncrementDelegate = this.O;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cellIncrementDelegate.f51948c), null, new b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cellIncrementDelegate.d), null, new b(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f51889c), null, new b(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new b(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.x0()), null, new rt4.o(this, continuation, 13), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ryi.e d() {
        return (ryi.e) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
