package com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund;

import afj.o3;
import afj.p3;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsRevPointsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.EsimRefundScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.EsimRefundScreenContract$InputData;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lnj.d;
import lnj.g;
import lnj.i;
import te0.w;
import tx0.t3;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund/EsimRefundScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_refund/refund/a;", "Ldli/a;", "Llnj/i;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimRefundScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(EsimRefundScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final EsimRefundScreenContract$InputData K;
    public final int L;
    public final h M;
    public final FullScreenStateDelegate N;
    public final CellDetailsRevPointsDelegate O;
    public final RowDelegate P;
    public final SelectableDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public EsimRefundScreen(EsimRefundScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, lnj.b.f);
        this.N = new FullScreenStateDelegate();
        this.O = new CellDetailsRevPointsDelegate();
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        this.Q = new SelectableDelegate(rowDelegate);
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: lnj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimRefundScreen f197268b;

            {
                this.f197268b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimRefundScreen esimRefundScreen = this.f197268b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimRefundScreen.U;
                        EsimRefundScreen esimRefundScreen2 = this.f197268b;
                        return dli.f.a(esimRefundScreen2, esimRefundScreen2.d(), v.k(esimRefundScreen2.N, new RowLoadingDelegate(), esimRefundScreen2.O, esimRefundScreen2.P, esimRefundScreen2.Q, new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimRefundScreen.U;
                        qji.b bVarU2 = esimRefundScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.di.EsimRefundScreenInjector");
                        o3 o3Var = (o3) ((mnj.a) bVarU2).y().mo3808a(esimRefundScreen);
                        EsimRefundScreenContract$InputData esimRefundScreenContract$InputData = esimRefundScreen.K;
                        switch (o3Var.f4378a) {
                            case 0:
                                esimRefundScreenContract$InputData.getClass();
                                o3Var.d = esimRefundScreenContract$InputData;
                                break;
                            case 1:
                                esimRefundScreenContract$InputData.getClass();
                                o3Var.d = esimRefundScreenContract$InputData;
                                break;
                            default:
                                esimRefundScreenContract$InputData.getClass();
                                o3Var.d = esimRefundScreenContract$InputData;
                                break;
                        }
                        return (p3) o3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimRefundScreen.U;
                        p3 p3Var = (p3) esimRefundScreen.S.getValue();
                        switch (p3Var.f4393a) {
                            case 0:
                                return (h) p3Var.d.get();
                            case 1:
                                return (h) p3Var.d.get();
                            default:
                                return (h) p3Var.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: lnj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimRefundScreen f197268b;

            {
                this.f197268b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimRefundScreen esimRefundScreen = this.f197268b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimRefundScreen.U;
                        EsimRefundScreen esimRefundScreen2 = this.f197268b;
                        return dli.f.a(esimRefundScreen2, esimRefundScreen2.d(), v.k(esimRefundScreen2.N, new RowLoadingDelegate(), esimRefundScreen2.O, esimRefundScreen2.P, esimRefundScreen2.Q, new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimRefundScreen.U;
                        qji.b bVarU2 = esimRefundScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.di.EsimRefundScreenInjector");
                        o3 o3Var = (o3) ((mnj.a) bVarU2).y().mo3808a(esimRefundScreen);
                        EsimRefundScreenContract$InputData esimRefundScreenContract$InputData = esimRefundScreen.K;
                        switch (o3Var.f4378a) {
                            case 0:
                                esimRefundScreenContract$InputData.getClass();
                                o3Var.d = esimRefundScreenContract$InputData;
                                break;
                            case 1:
                                esimRefundScreenContract$InputData.getClass();
                                o3Var.d = esimRefundScreenContract$InputData;
                                break;
                            default:
                                esimRefundScreenContract$InputData.getClass();
                                o3Var.d = esimRefundScreenContract$InputData;
                                break;
                        }
                        return (p3) o3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimRefundScreen.U;
                        p3 p3Var = (p3) esimRefundScreen.S.getValue();
                        switch (p3Var.f4393a) {
                            case 0:
                                return (h) p3Var.d.get();
                            case 1:
                                return (h) p3Var.d.get();
                            default:
                                return (h) p3Var.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: lnj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimRefundScreen f197268b;

            {
                this.f197268b = this;
            }

            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimRefundScreen esimRefundScreen = this.f197268b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimRefundScreen.U;
                        EsimRefundScreen esimRefundScreen2 = this.f197268b;
                        return dli.f.a(esimRefundScreen2, esimRefundScreen2.d(), v.k(esimRefundScreen2.N, new RowLoadingDelegate(), esimRefundScreen2.O, esimRefundScreen2.P, esimRefundScreen2.Q, new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimRefundScreen.U;
                        qji.b bVarU2 = esimRefundScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.subscription_refund.refund.di.EsimRefundScreenInjector");
                        o3 o3Var = (o3) ((mnj.a) bVarU2).y().mo3808a(esimRefundScreen);
                        EsimRefundScreenContract$InputData esimRefundScreenContract$InputData = esimRefundScreen.K;
                        switch (o3Var.f4378a) {
                            case 0:
                                esimRefundScreenContract$InputData.getClass();
                                o3Var.d = esimRefundScreenContract$InputData;
                                break;
                            case 1:
                                esimRefundScreenContract$InputData.getClass();
                                o3Var.d = esimRefundScreenContract$InputData;
                                break;
                            default:
                                esimRefundScreenContract$InputData.getClass();
                                o3Var.d = esimRefundScreenContract$InputData;
                                break;
                        }
                        return (p3) o3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimRefundScreen.U;
                        p3 p3Var = (p3) esimRefundScreen.S.getValue();
                        switch (p3Var.f4393a) {
                            case 0:
                                return (h) p3Var.d.get();
                            case 1:
                                return (h) p3Var.d.get();
                            default:
                                return (h) p3Var.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        if (uiState.f197277b) {
            d3().f174564b.setVisibility(0);
            d3().f174564b.setEnabled(uiState.f197278c);
            d3().f174564b.L(uiState.d);
        } else {
            d3().f174564b.setVisibility(8);
        }
        g gVar = uiState.e;
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        if (gVar.f197275c) {
            t3 t3Var = t3.TWO_LINES;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
            return;
        }
        navBarWithToolbar.l0();
        navBarWithToolbar.setTitle(gVar.f197273a, null);
        Clause clause = gVar.f197274b;
        navBarWithToolbar.setDescriptionVisible(clause != null);
        if (clause != null) {
            navBarWithToolbar.setDescriptionText(clause);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p3) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.esim_refund_request_refund, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new lnj.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new lnj.c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f51889c), null, new lnj.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.Q.r(), new llb.e(22))), null, new lnj.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.p0()), null, new lnj.e(this, continuation, 2), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final lnj.h d() {
        return (lnj.h) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
