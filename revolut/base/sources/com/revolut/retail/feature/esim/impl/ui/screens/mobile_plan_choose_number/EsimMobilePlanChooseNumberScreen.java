package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_choose_number;

import afj.a0;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_choose_number.EsimMobilePlanChooseNumberScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_choose_number.EsimMobilePlanChooseNumberScreenContract$InputData;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import r0e.c;
import re3.d;
import rjj.b;
import rjj.e;
import rjj.f;
import rjj.g;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_choose_number/EsimMobilePlanChooseNumberScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lrjj/e;", "Ldli/a;", "Lrjj/g;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanChooseNumberScreen extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EsimMobilePlanChooseNumberScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final EsimMobilePlanChooseNumberScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public EsimMobilePlanChooseNumberScreen(EsimMobilePlanChooseNumberScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = w.y0(new d(14));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: rjj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanChooseNumberScreen f254679b;

            {
                this.f254679b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanChooseNumberScreen esimMobilePlanChooseNumberScreen = this.f254679b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanChooseNumberScreen.R;
                        EsimMobilePlanChooseNumberScreen esimMobilePlanChooseNumberScreen2 = this.f254679b;
                        return dli.f.a(esimMobilePlanChooseNumberScreen2, (f) esimMobilePlanChooseNumberScreen2.Q.getValue(), u.c((RowDelegate) esimMobilePlanChooseNumberScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanChooseNumberScreen.R;
                        qji.b bVarU2 = esimMobilePlanChooseNumberScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_choose_number.di.EsimMobilePlanChooseNumberScreenInjector");
                        a0 a0Var = (a0) bVarU2;
                        afj.b bVar = a0Var.f4109b;
                        a0 a0Var2 = a0Var.f4110c;
                        EsimMobilePlanChooseNumberScreenContract$InputData esimMobilePlanChooseNumberScreenContract$InputData = esimMobilePlanChooseNumberScreen.K;
                        esimMobilePlanChooseNumberScreenContract$InputData.getClass();
                        return new afj.s(bVar, a0Var2, esimMobilePlanChooseNumberScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanChooseNumberScreen.R;
                        return (f) ((afj.s) esimMobilePlanChooseNumberScreen.P.getValue()).f4430c.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: rjj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanChooseNumberScreen f254679b;

            {
                this.f254679b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanChooseNumberScreen esimMobilePlanChooseNumberScreen = this.f254679b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanChooseNumberScreen.R;
                        EsimMobilePlanChooseNumberScreen esimMobilePlanChooseNumberScreen2 = this.f254679b;
                        return dli.f.a(esimMobilePlanChooseNumberScreen2, (f) esimMobilePlanChooseNumberScreen2.Q.getValue(), u.c((RowDelegate) esimMobilePlanChooseNumberScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanChooseNumberScreen.R;
                        qji.b bVarU2 = esimMobilePlanChooseNumberScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_choose_number.di.EsimMobilePlanChooseNumberScreenInjector");
                        a0 a0Var = (a0) bVarU2;
                        afj.b bVar = a0Var.f4109b;
                        a0 a0Var2 = a0Var.f4110c;
                        EsimMobilePlanChooseNumberScreenContract$InputData esimMobilePlanChooseNumberScreenContract$InputData = esimMobilePlanChooseNumberScreen.K;
                        esimMobilePlanChooseNumberScreenContract$InputData.getClass();
                        return new afj.s(bVar, a0Var2, esimMobilePlanChooseNumberScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanChooseNumberScreen.R;
                        return (f) ((afj.s) esimMobilePlanChooseNumberScreen.P.getValue()).f4430c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: rjj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanChooseNumberScreen f254679b;

            {
                this.f254679b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanChooseNumberScreen esimMobilePlanChooseNumberScreen = this.f254679b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanChooseNumberScreen.R;
                        EsimMobilePlanChooseNumberScreen esimMobilePlanChooseNumberScreen2 = this.f254679b;
                        return dli.f.a(esimMobilePlanChooseNumberScreen2, (f) esimMobilePlanChooseNumberScreen2.Q.getValue(), u.c((RowDelegate) esimMobilePlanChooseNumberScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanChooseNumberScreen.R;
                        qji.b bVarU2 = esimMobilePlanChooseNumberScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_choose_number.di.EsimMobilePlanChooseNumberScreenInjector");
                        a0 a0Var = (a0) bVarU2;
                        afj.b bVar = a0Var.f4109b;
                        a0 a0Var2 = a0Var.f4110c;
                        EsimMobilePlanChooseNumberScreenContract$InputData esimMobilePlanChooseNumberScreenContract$InputData = esimMobilePlanChooseNumberScreen.K;
                        esimMobilePlanChooseNumberScreenContract$InputData.getClass();
                        return new afj.s(bVar, a0Var2, esimMobilePlanChooseNumberScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanChooseNumberScreen.R;
                        return (f) ((afj.s) esimMobilePlanChooseNumberScreen.P.getValue()).f4430c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        rjj.d dVar = uiState.f254686b;
        navBarWithToolbar.setTitle(dVar.f254680a, null);
        Clause clause = dVar.f254681b;
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setDescriptionVisible(clause != null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (afj.s) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new c(this, null, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.N.getValue()).f53218h), null, new rjj.c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
