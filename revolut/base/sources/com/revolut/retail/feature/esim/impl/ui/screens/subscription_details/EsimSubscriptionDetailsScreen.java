package com.revolut.retail.feature.esim.impl.ui.screens.subscription_details;

import afj.k3;
import afj.l3;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cam.f;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PermissionDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.EsimSubscriptionDetailsScreenContract$InputData;
import dli.c;
import efm.r;
import jii.u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.t3;
import vc.s;
import xki.e;
import zmj.b;
import zmj.d;
import zmj.d0;
import zmj.e0;
import zmj.f0;
import zmj.g;
import zmj.i;
import zmj.j;
import zmj.k;
import zmj.l;
import zmj.m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/subscription_details/EsimSubscriptionDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzmj/d0;", "Ldli/a;", "Lzmj/f0;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimSubscriptionDetailsScreen extends ViewController<d0> implements dli.a {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(EsimSubscriptionDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final EsimSubscriptionDetailsScreenContract$InputData K;
    public final int L;
    public final boolean M;
    public final h N;
    public final CellDetailsDelegate O;
    public final FullScreenStateDelegate P;
    public final CellDetailsChevronDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final CellDetailsStandaloneNoteDelegate V;
    public final Object W;
    public final Object X;
    public final Object Y;

    public EsimSubscriptionDetailsScreen(EsimSubscriptionDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = true;
        this.N = s.t(this, b.f);
        this.O = new CellDetailsDelegate();
        this.P = new FullScreenStateDelegate();
        this.Q = new CellDetailsChevronDelegate();
        this.R = w.y0(new zj9.a(14));
        this.S = w.y0(new zj9.a(15));
        this.T = w.y0(new zj9.a(16));
        this.U = w.y0(new zj9.a(17));
        this.V = new CellDetailsStandaloneNoteDelegate();
        final int i = 0;
        this.W = w.y0(new Function0(this) { // from class: zmj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimSubscriptionDetailsScreen f323544b;

            {
                this.f323544b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimSubscriptionDetailsScreen esimSubscriptionDetailsScreen = this.f323544b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimSubscriptionDetailsScreen.Z;
                        EsimSubscriptionDetailsScreen esimSubscriptionDetailsScreen2 = this.f323544b;
                        return dli.f.a(esimSubscriptionDetailsScreen2, esimSubscriptionDetailsScreen2.d(), zhm.v.k((PlainTextDelegate) esimSubscriptionDetailsScreen2.S.getValue(), esimSubscriptionDetailsScreen2.O, new ListSubheaderDelegate(), esimSubscriptionDetailsScreen2.P, new CellDetailsLoadingDelegate(), new PermissionDelegate(), esimSubscriptionDetailsScreen2.Q, (CellDetailsSwitcherDelegate) esimSubscriptionDetailsScreen2.R.getValue(), (CellDetailsActionDelegate) esimSubscriptionDetailsScreen2.T.getValue(), (ActionsDelegate) esimSubscriptionDetailsScreen2.U.getValue(), esimSubscriptionDetailsScreen2.V), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimSubscriptionDetailsScreen.Z;
                        qji.b bVarU2 = esimSubscriptionDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.di.EsimSubscriptionDetailsScreenInjector");
                        k3 k3Var = (k3) ((anj.a) bVarU2).G().mo3808a(esimSubscriptionDetailsScreen);
                        EsimSubscriptionDetailsScreenContract$InputData esimSubscriptionDetailsScreenContract$InputData = esimSubscriptionDetailsScreen.K;
                        switch (k3Var.f4318a) {
                            case 0:
                                esimSubscriptionDetailsScreenContract$InputData.getClass();
                                k3Var.d = esimSubscriptionDetailsScreenContract$InputData;
                                break;
                            default:
                                esimSubscriptionDetailsScreenContract$InputData.getClass();
                                k3Var.d = esimSubscriptionDetailsScreenContract$InputData;
                                break;
                        }
                        return (l3) k3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimSubscriptionDetailsScreen.Z;
                        l3 l3Var = (l3) esimSubscriptionDetailsScreen.X.getValue();
                        switch (l3Var.f4333a) {
                            case 0:
                                return (e0) l3Var.f.get();
                            default:
                                return (e0) l3Var.f.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: zmj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimSubscriptionDetailsScreen f323544b;

            {
                this.f323544b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimSubscriptionDetailsScreen esimSubscriptionDetailsScreen = this.f323544b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimSubscriptionDetailsScreen.Z;
                        EsimSubscriptionDetailsScreen esimSubscriptionDetailsScreen2 = this.f323544b;
                        return dli.f.a(esimSubscriptionDetailsScreen2, esimSubscriptionDetailsScreen2.d(), zhm.v.k((PlainTextDelegate) esimSubscriptionDetailsScreen2.S.getValue(), esimSubscriptionDetailsScreen2.O, new ListSubheaderDelegate(), esimSubscriptionDetailsScreen2.P, new CellDetailsLoadingDelegate(), new PermissionDelegate(), esimSubscriptionDetailsScreen2.Q, (CellDetailsSwitcherDelegate) esimSubscriptionDetailsScreen2.R.getValue(), (CellDetailsActionDelegate) esimSubscriptionDetailsScreen2.T.getValue(), (ActionsDelegate) esimSubscriptionDetailsScreen2.U.getValue(), esimSubscriptionDetailsScreen2.V), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimSubscriptionDetailsScreen.Z;
                        qji.b bVarU2 = esimSubscriptionDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.di.EsimSubscriptionDetailsScreenInjector");
                        k3 k3Var = (k3) ((anj.a) bVarU2).G().mo3808a(esimSubscriptionDetailsScreen);
                        EsimSubscriptionDetailsScreenContract$InputData esimSubscriptionDetailsScreenContract$InputData = esimSubscriptionDetailsScreen.K;
                        switch (k3Var.f4318a) {
                            case 0:
                                esimSubscriptionDetailsScreenContract$InputData.getClass();
                                k3Var.d = esimSubscriptionDetailsScreenContract$InputData;
                                break;
                            default:
                                esimSubscriptionDetailsScreenContract$InputData.getClass();
                                k3Var.d = esimSubscriptionDetailsScreenContract$InputData;
                                break;
                        }
                        return (l3) k3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimSubscriptionDetailsScreen.Z;
                        l3 l3Var = (l3) esimSubscriptionDetailsScreen.X.getValue();
                        switch (l3Var.f4333a) {
                            case 0:
                                return (e0) l3Var.f.get();
                            default:
                                return (e0) l3Var.f.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: zmj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimSubscriptionDetailsScreen f323544b;

            {
                this.f323544b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimSubscriptionDetailsScreen esimSubscriptionDetailsScreen = this.f323544b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimSubscriptionDetailsScreen.Z;
                        EsimSubscriptionDetailsScreen esimSubscriptionDetailsScreen2 = this.f323544b;
                        return dli.f.a(esimSubscriptionDetailsScreen2, esimSubscriptionDetailsScreen2.d(), zhm.v.k((PlainTextDelegate) esimSubscriptionDetailsScreen2.S.getValue(), esimSubscriptionDetailsScreen2.O, new ListSubheaderDelegate(), esimSubscriptionDetailsScreen2.P, new CellDetailsLoadingDelegate(), new PermissionDelegate(), esimSubscriptionDetailsScreen2.Q, (CellDetailsSwitcherDelegate) esimSubscriptionDetailsScreen2.R.getValue(), (CellDetailsActionDelegate) esimSubscriptionDetailsScreen2.T.getValue(), (ActionsDelegate) esimSubscriptionDetailsScreen2.U.getValue(), esimSubscriptionDetailsScreen2.V), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimSubscriptionDetailsScreen.Z;
                        qji.b bVarU2 = esimSubscriptionDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.subscription_details.di.EsimSubscriptionDetailsScreenInjector");
                        k3 k3Var = (k3) ((anj.a) bVarU2).G().mo3808a(esimSubscriptionDetailsScreen);
                        EsimSubscriptionDetailsScreenContract$InputData esimSubscriptionDetailsScreenContract$InputData = esimSubscriptionDetailsScreen.K;
                        switch (k3Var.f4318a) {
                            case 0:
                                esimSubscriptionDetailsScreenContract$InputData.getClass();
                                k3Var.d = esimSubscriptionDetailsScreenContract$InputData;
                                break;
                            default:
                                esimSubscriptionDetailsScreenContract$InputData.getClass();
                                k3Var.d = esimSubscriptionDetailsScreenContract$InputData;
                                break;
                        }
                        return (l3) k3Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = EsimSubscriptionDetailsScreen.Z;
                        l3 l3Var = (l3) esimSubscriptionDetailsScreen.X.getValue();
                        switch (l3Var.f4333a) {
                            case 0:
                                return (e0) l3Var.f.get();
                            default:
                                return (e0) l3Var.f.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f0 uiState = (f0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        f fVar = uiState.f323552b;
        if (fVar instanceof m) {
            LargeActionButton goToButton = d3().f174564b;
            Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
            knm.b.z(goToButton, false, null, 14);
        } else {
            if (!(fVar instanceof k) && !(fVar instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            LargeActionButton goToButton2 = d3().f174564b;
            Intrinsics.checkNotNullExpressionValue(goToButton2, "goToButton");
            knm.b.z(goToButton2, true, null, 14);
            d3().f174564b.setText(fVar.k());
        }
        zmj.s sVar = uiState.f323553c;
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        if (sVar == null) {
            t3 t3Var = t3.DEFAULT;
            NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
            navBarWithToolbar.I0(t3Var, false);
        } else {
            Clause clause = sVar.f323590c;
            Clause clause2 = sVar.f323589b;
            TextLocalisedClause textLocalisedClause = sVar.f323588a;
            navBarWithToolbar.l0();
            navBarWithToolbar.setTitle(textLocalisedClause, null);
            navBarWithToolbar.setToolbarTitle(textLocalisedClause);
            navBarWithToolbar.setDescriptionVisible(clause2 != null);
            navBarWithToolbar.setDescriptionText(clause2);
            navBarWithToolbar.setSecondDescriptionVisible(clause != null);
            navBarWithToolbar.setSecondDescriptionText(clause);
        }
        d3().f174565c.setMenuItems(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l3) this.X.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        r rVarMergeWith = d3().f174565c.p0().mergeWith(d3().f174565c.x0());
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMergeWith), null, new d(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new zmj.f(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.o.f57403b), null, new d(this, continuation, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.e), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new zmj.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new zmj.f(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.f51821c), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new z75.f(rd0.e.b(((CellDetailsSwitcherDelegate) this.R.getValue()).f51912c), 12), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PlainTextDelegate) this.S.getValue()).d.f121375b), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ActionsDelegate) this.U.getValue()).f51611c.f121375b), null, new zmj.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.V.f51901c), null, new d(this, continuation, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.N.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final e0 d() {
        return (e0) this.Y.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
