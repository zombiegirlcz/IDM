package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers;

import afj.k0;
import afj.y;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreenContract$InputData;
import k22.c;
import kae.d;
import kjk.x;
import kkf.z5;
import kkj.b;
import kkj.g;
import kkj.k;
import kkj.l;
import kkj.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkkj/k;", "Ldli/a;", "Lkkj/m;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanMyNumbersScreen extends ViewController<k> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(EsimMobilePlanMyNumbersScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final EsimMobilePlanMyNumbersScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public EsimMobilePlanMyNumbersScreen(EsimMobilePlanMyNumbersScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = w.y0(new z5(15));
        this.O = w.y0(new z5(16));
        this.P = w.y0(new z5(17));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: kkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanMyNumbersScreen f185069b;

            {
                this.f185069b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanMyNumbersScreen esimMobilePlanMyNumbersScreen = this.f185069b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanMyNumbersScreen.T;
                        EsimMobilePlanMyNumbersScreen esimMobilePlanMyNumbersScreen2 = this.f185069b;
                        return dli.f.a(esimMobilePlanMyNumbersScreen2, esimMobilePlanMyNumbersScreen2.d(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new ActionsLoadingDelegate(), new RowLoadingDelegate(), (RowDelegate) esimMobilePlanMyNumbersScreen2.O.getValue(), (ActionsDelegate) esimMobilePlanMyNumbersScreen2.N.getValue(), (FullScreenStateDelegate) esimMobilePlanMyNumbersScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanMyNumbersScreen.T;
                        qji.b bVarU2 = esimMobilePlanMyNumbersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.di.EsimMobilePlanMyNumbersScreenInjector");
                        k0 k0Var = (k0) bVarU2;
                        afj.b bVar = k0Var.f4310b;
                        k0 k0Var2 = k0Var.f4311c;
                        EsimMobilePlanMyNumbersScreenContract$InputData esimMobilePlanMyNumbersScreenContract$InputData = esimMobilePlanMyNumbersScreen.K;
                        esimMobilePlanMyNumbersScreenContract$InputData.getClass();
                        return new y(bVar, k0Var2, esimMobilePlanMyNumbersScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanMyNumbersScreen.T;
                        return (l) ((y) esimMobilePlanMyNumbersScreen.R.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: kkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanMyNumbersScreen f185069b;

            {
                this.f185069b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanMyNumbersScreen esimMobilePlanMyNumbersScreen = this.f185069b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanMyNumbersScreen.T;
                        EsimMobilePlanMyNumbersScreen esimMobilePlanMyNumbersScreen2 = this.f185069b;
                        return dli.f.a(esimMobilePlanMyNumbersScreen2, esimMobilePlanMyNumbersScreen2.d(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new ActionsLoadingDelegate(), new RowLoadingDelegate(), (RowDelegate) esimMobilePlanMyNumbersScreen2.O.getValue(), (ActionsDelegate) esimMobilePlanMyNumbersScreen2.N.getValue(), (FullScreenStateDelegate) esimMobilePlanMyNumbersScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanMyNumbersScreen.T;
                        qji.b bVarU2 = esimMobilePlanMyNumbersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.di.EsimMobilePlanMyNumbersScreenInjector");
                        k0 k0Var = (k0) bVarU2;
                        afj.b bVar = k0Var.f4310b;
                        k0 k0Var2 = k0Var.f4311c;
                        EsimMobilePlanMyNumbersScreenContract$InputData esimMobilePlanMyNumbersScreenContract$InputData = esimMobilePlanMyNumbersScreen.K;
                        esimMobilePlanMyNumbersScreenContract$InputData.getClass();
                        return new y(bVar, k0Var2, esimMobilePlanMyNumbersScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanMyNumbersScreen.T;
                        return (l) ((y) esimMobilePlanMyNumbersScreen.R.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: kkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanMyNumbersScreen f185069b;

            {
                this.f185069b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanMyNumbersScreen esimMobilePlanMyNumbersScreen = this.f185069b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanMyNumbersScreen.T;
                        EsimMobilePlanMyNumbersScreen esimMobilePlanMyNumbersScreen2 = this.f185069b;
                        return dli.f.a(esimMobilePlanMyNumbersScreen2, esimMobilePlanMyNumbersScreen2.d(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), new ActionsLoadingDelegate(), new RowLoadingDelegate(), (RowDelegate) esimMobilePlanMyNumbersScreen2.O.getValue(), (ActionsDelegate) esimMobilePlanMyNumbersScreen2.N.getValue(), (FullScreenStateDelegate) esimMobilePlanMyNumbersScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanMyNumbersScreen.T;
                        qji.b bVarU2 = esimMobilePlanMyNumbersScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.di.EsimMobilePlanMyNumbersScreenInjector");
                        k0 k0Var = (k0) bVarU2;
                        afj.b bVar = k0Var.f4310b;
                        k0 k0Var2 = k0Var.f4311c;
                        EsimMobilePlanMyNumbersScreenContract$InputData esimMobilePlanMyNumbersScreenContract$InputData = esimMobilePlanMyNumbersScreen.K;
                        esimMobilePlanMyNumbersScreenContract$InputData.getClass();
                        return new y(bVar, k0Var2, esimMobilePlanMyNumbersScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanMyNumbersScreen.T;
                        return (l) ((y) esimMobilePlanMyNumbersScreen.R.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        g gVar = uiState.f185083b;
        navBarWithToolbar.setTitle(gVar.f185073a, null);
        Clause clause = gVar.f185074b;
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setDescriptionVisible(clause != null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (y) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new c(this, continuation, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((RowDelegate) this.O.getValue()).f53218h, new x(27))), null, new d(this, continuation, 17), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.P.getValue()).f52371h.f121375b), null, new kkj.c(this, null), 3);
        ?? r56 = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ActionsDelegate) r56.getValue()).f51611c.f121375b), null, new kkj.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ActionsDelegate) r56.getValue()).e.f121375b), null, new kkj.e(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l d() {
        return (l) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
