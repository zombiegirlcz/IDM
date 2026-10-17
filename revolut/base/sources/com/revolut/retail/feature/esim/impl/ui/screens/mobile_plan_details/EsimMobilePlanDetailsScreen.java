package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details;

import afj.y1;
import afj.z1;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.EsimMobilePlanDetailsScreenContract$InputData;
import efm.r;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import ve7.i;
import vgk.g;
import vjj.d;
import vjj.f;
import vjj.k;
import vjj.v;
import xki.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/a;", "Ldli/a;", "Lvjj/w;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanDetailsScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(EsimMobilePlanDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final EsimMobilePlanDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;

    public EsimMobilePlanDetailsScreen(EsimMobilePlanDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, vjj.b.f);
        this.N = w.y0(new i(11));
        this.O = w.y0(new i(12));
        this.P = w.y0(new i(13));
        this.Q = w.y0(new i(14));
        this.R = w.y0(new i(15));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: vjj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanDetailsScreen f289755b;

            {
                this.f289755b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanDetailsScreen esimMobilePlanDetailsScreen = this.f289755b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanDetailsScreen.V;
                        EsimMobilePlanDetailsScreen esimMobilePlanDetailsScreen2 = this.f289755b;
                        return dli.f.a(esimMobilePlanDetailsScreen2, esimMobilePlanDetailsScreen2.R2(), zhm.v.k((FullScreenStateDelegate) esimMobilePlanDetailsScreen2.N.getValue(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), (RowDelegate) esimMobilePlanDetailsScreen2.O.getValue(), (ListSubheaderDelegate) esimMobilePlanDetailsScreen2.R.getValue(), (CellDetailsDelegate) esimMobilePlanDetailsScreen2.P.getValue(), (ActionsDelegate) esimMobilePlanDetailsScreen2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanDetailsScreen.V;
                        qji.b bVarU2 = esimMobilePlanDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.di.EsimMobilePlanDetailsScreenInjector");
                        y1 y1Var = (y1) ((wjj.a) bVarU2).s().mo3808a(esimMobilePlanDetailsScreen);
                        EsimMobilePlanDetailsScreenContract$InputData esimMobilePlanDetailsScreenContract$InputData = esimMobilePlanDetailsScreen.K;
                        switch (y1Var.f4538a) {
                            case 0:
                                esimMobilePlanDetailsScreenContract$InputData.getClass();
                                y1Var.d = esimMobilePlanDetailsScreenContract$InputData;
                                break;
                            case 1:
                                esimMobilePlanDetailsScreenContract$InputData.getClass();
                                y1Var.d = esimMobilePlanDetailsScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanDetailsScreenContract$InputData.getClass();
                                y1Var.d = esimMobilePlanDetailsScreenContract$InputData;
                                break;
                        }
                        return (z1) y1Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanDetailsScreen.V;
                        z1 z1Var = (z1) esimMobilePlanDetailsScreen.T.getValue();
                        switch (z1Var.f4550a) {
                            case 0:
                                return (v) z1Var.f4554h.get();
                            case 1:
                                return (v) z1Var.f4554h.get();
                            default:
                                return (v) z1Var.f4554h.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: vjj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanDetailsScreen f289755b;

            {
                this.f289755b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanDetailsScreen esimMobilePlanDetailsScreen = this.f289755b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanDetailsScreen.V;
                        EsimMobilePlanDetailsScreen esimMobilePlanDetailsScreen2 = this.f289755b;
                        return dli.f.a(esimMobilePlanDetailsScreen2, esimMobilePlanDetailsScreen2.R2(), zhm.v.k((FullScreenStateDelegate) esimMobilePlanDetailsScreen2.N.getValue(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), (RowDelegate) esimMobilePlanDetailsScreen2.O.getValue(), (ListSubheaderDelegate) esimMobilePlanDetailsScreen2.R.getValue(), (CellDetailsDelegate) esimMobilePlanDetailsScreen2.P.getValue(), (ActionsDelegate) esimMobilePlanDetailsScreen2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanDetailsScreen.V;
                        qji.b bVarU2 = esimMobilePlanDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.di.EsimMobilePlanDetailsScreenInjector");
                        y1 y1Var = (y1) ((wjj.a) bVarU2).s().mo3808a(esimMobilePlanDetailsScreen);
                        EsimMobilePlanDetailsScreenContract$InputData esimMobilePlanDetailsScreenContract$InputData = esimMobilePlanDetailsScreen.K;
                        switch (y1Var.f4538a) {
                            case 0:
                                esimMobilePlanDetailsScreenContract$InputData.getClass();
                                y1Var.d = esimMobilePlanDetailsScreenContract$InputData;
                                break;
                            case 1:
                                esimMobilePlanDetailsScreenContract$InputData.getClass();
                                y1Var.d = esimMobilePlanDetailsScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanDetailsScreenContract$InputData.getClass();
                                y1Var.d = esimMobilePlanDetailsScreenContract$InputData;
                                break;
                        }
                        return (z1) y1Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanDetailsScreen.V;
                        z1 z1Var = (z1) esimMobilePlanDetailsScreen.T.getValue();
                        switch (z1Var.f4550a) {
                            case 0:
                                return (v) z1Var.f4554h.get();
                            case 1:
                                return (v) z1Var.f4554h.get();
                            default:
                                return (v) z1Var.f4554h.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: vjj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanDetailsScreen f289755b;

            {
                this.f289755b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanDetailsScreen esimMobilePlanDetailsScreen = this.f289755b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanDetailsScreen.V;
                        EsimMobilePlanDetailsScreen esimMobilePlanDetailsScreen2 = this.f289755b;
                        return dli.f.a(esimMobilePlanDetailsScreen2, esimMobilePlanDetailsScreen2.R2(), zhm.v.k((FullScreenStateDelegate) esimMobilePlanDetailsScreen2.N.getValue(), new CellDetailsLoadingDelegate(), new RowLoadingDelegate(), (RowDelegate) esimMobilePlanDetailsScreen2.O.getValue(), (ListSubheaderDelegate) esimMobilePlanDetailsScreen2.R.getValue(), (CellDetailsDelegate) esimMobilePlanDetailsScreen2.P.getValue(), (ActionsDelegate) esimMobilePlanDetailsScreen2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanDetailsScreen.V;
                        qji.b bVarU2 = esimMobilePlanDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.di.EsimMobilePlanDetailsScreenInjector");
                        y1 y1Var = (y1) ((wjj.a) bVarU2).s().mo3808a(esimMobilePlanDetailsScreen);
                        EsimMobilePlanDetailsScreenContract$InputData esimMobilePlanDetailsScreenContract$InputData = esimMobilePlanDetailsScreen.K;
                        switch (y1Var.f4538a) {
                            case 0:
                                esimMobilePlanDetailsScreenContract$InputData.getClass();
                                y1Var.d = esimMobilePlanDetailsScreenContract$InputData;
                                break;
                            case 1:
                                esimMobilePlanDetailsScreenContract$InputData.getClass();
                                y1Var.d = esimMobilePlanDetailsScreenContract$InputData;
                                break;
                            default:
                                esimMobilePlanDetailsScreenContract$InputData.getClass();
                                y1Var.d = esimMobilePlanDetailsScreenContract$InputData;
                                break;
                        }
                        return (z1) y1Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanDetailsScreen.V;
                        z1 z1Var = (z1) esimMobilePlanDetailsScreen.T.getValue();
                        switch (z1Var.f4550a) {
                            case 0:
                                return (v) z1Var.f4554h.get();
                            case 1:
                                return (v) z1Var.f4554h.get();
                            default:
                                return (v) z1Var.f4554h.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        vjj.w uiState = (vjj.w) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        k kVar = uiState.f289791b;
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        if (kVar == null) {
            navBarWithToolbar.setDescriptionVisible(false);
            navBarWithToolbar.setSecondDescriptionVisible(false);
        } else {
            Clause clause = kVar.f289770b;
            Clause clause2 = kVar.f289769a;
            navBarWithToolbar.setDescriptionVisible(clause2 != null);
            navBarWithToolbar.setSecondDescriptionVisible(clause != null);
            navBarWithToolbar.setDescriptionText(clause2);
            navBarWithToolbar.setSecondDescriptionText(clause);
        }
        Clause clause3 = uiState.f289792c;
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setVisibility(clause3 == null ? 8 : 0);
        largeActionButton.setText(clause3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (z1) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(8);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new f(this, continuation, 0), 3);
        r rVarFilter = d3().f174565c.o.f57403b.filter(new vif.c(new g(27), 4));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter), null, new f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new f(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), null, new vjj.g(this, null), 3);
        r rVarFilter2 = ((ActionsDelegate) this.Q.getValue()).f51611c.f121375b.filter(new vif.c(new g(24), 2));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter2), null, new vjj.h(this, null), 3);
        ?? r87 = this.R;
        r rVarFilter3 = ((ListSubheaderDelegate) r87.getValue()).d.filter(new vif.c(new g(25), 3));
        Intrinsics.checkNotNullExpressionValue(rVarFilter3, "filter(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarFilter3), null, new vjj.i(this, null), 3);
        ?? r06 = this.P;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsDelegate) r06.getValue()).e), null, new vjj.c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((CellDetailsDelegate) r06.getValue()).d, new g(26))), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ListSubheaderDelegate) r87.getValue()).f52707c), null, new vjj.e(this, null), 3);
        r rVarMergeWith = d3().f174565c.p0().mergeWith(d3().f174565c.x0());
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMergeWith), null, new d(this, continuation, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final v R2() {
        return (v) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
