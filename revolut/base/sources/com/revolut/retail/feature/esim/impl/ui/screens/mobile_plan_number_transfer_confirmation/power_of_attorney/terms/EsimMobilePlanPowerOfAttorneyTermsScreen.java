package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.terms;

import afj.n0;
import afj.p0;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.terms.EsimMobilePlanPowerOfAttorneyTermsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.terms.EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sdl.y;
import slj.b;
import slj.c;
import slj.d;
import slj.g;
import slj.i;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/power_of_attorney/terms/EsimMobilePlanPowerOfAttorneyTermsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lslj/g;", "Ldli/a;", "Lslj/i;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanPowerOfAttorneyTermsScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EsimMobilePlanPowerOfAttorneyTermsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public EsimMobilePlanPowerOfAttorneyTermsScreen(EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = w.y0(new y(23));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: slj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPowerOfAttorneyTermsScreen f264209b;

            {
                this.f264209b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanPowerOfAttorneyTermsScreen esimMobilePlanPowerOfAttorneyTermsScreen = this.f264209b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanPowerOfAttorneyTermsScreen.R;
                        EsimMobilePlanPowerOfAttorneyTermsScreen esimMobilePlanPowerOfAttorneyTermsScreen2 = this.f264209b;
                        return dli.f.a(esimMobilePlanPowerOfAttorneyTermsScreen2, esimMobilePlanPowerOfAttorneyTermsScreen2.R2(), u.c((InputChecklistDelegate) esimMobilePlanPowerOfAttorneyTermsScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanPowerOfAttorneyTermsScreen.R;
                        qji.b bVarU2 = esimMobilePlanPowerOfAttorneyTermsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.terms.di.EsimMobilePlanPowerOfAttorneyTermsScreenInjector");
                        n0 n0Var = (n0) bVarU2;
                        afj.b bVar = n0Var.f4355b;
                        n0 n0Var2 = n0Var.f4356c;
                        EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData = esimMobilePlanPowerOfAttorneyTermsScreen.K;
                        esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData.getClass();
                        return new p0(bVar, n0Var2, esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanPowerOfAttorneyTermsScreen.R;
                        return (h) ((p0) esimMobilePlanPowerOfAttorneyTermsScreen.P.getValue()).f4386c.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: slj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPowerOfAttorneyTermsScreen f264209b;

            {
                this.f264209b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanPowerOfAttorneyTermsScreen esimMobilePlanPowerOfAttorneyTermsScreen = this.f264209b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanPowerOfAttorneyTermsScreen.R;
                        EsimMobilePlanPowerOfAttorneyTermsScreen esimMobilePlanPowerOfAttorneyTermsScreen2 = this.f264209b;
                        return dli.f.a(esimMobilePlanPowerOfAttorneyTermsScreen2, esimMobilePlanPowerOfAttorneyTermsScreen2.R2(), u.c((InputChecklistDelegate) esimMobilePlanPowerOfAttorneyTermsScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanPowerOfAttorneyTermsScreen.R;
                        qji.b bVarU2 = esimMobilePlanPowerOfAttorneyTermsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.terms.di.EsimMobilePlanPowerOfAttorneyTermsScreenInjector");
                        n0 n0Var = (n0) bVarU2;
                        afj.b bVar = n0Var.f4355b;
                        n0 n0Var2 = n0Var.f4356c;
                        EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData = esimMobilePlanPowerOfAttorneyTermsScreen.K;
                        esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData.getClass();
                        return new p0(bVar, n0Var2, esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanPowerOfAttorneyTermsScreen.R;
                        return (h) ((p0) esimMobilePlanPowerOfAttorneyTermsScreen.P.getValue()).f4386c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: slj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPowerOfAttorneyTermsScreen f264209b;

            {
                this.f264209b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanPowerOfAttorneyTermsScreen esimMobilePlanPowerOfAttorneyTermsScreen = this.f264209b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanPowerOfAttorneyTermsScreen.R;
                        EsimMobilePlanPowerOfAttorneyTermsScreen esimMobilePlanPowerOfAttorneyTermsScreen2 = this.f264209b;
                        return dli.f.a(esimMobilePlanPowerOfAttorneyTermsScreen2, esimMobilePlanPowerOfAttorneyTermsScreen2.R2(), u.c((InputChecklistDelegate) esimMobilePlanPowerOfAttorneyTermsScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanPowerOfAttorneyTermsScreen.R;
                        qji.b bVarU2 = esimMobilePlanPowerOfAttorneyTermsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.terms.di.EsimMobilePlanPowerOfAttorneyTermsScreenInjector");
                        n0 n0Var = (n0) bVarU2;
                        afj.b bVar = n0Var.f4355b;
                        n0 n0Var2 = n0Var.f4356c;
                        EsimMobilePlanPowerOfAttorneyTermsScreenContract$InputData esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData = esimMobilePlanPowerOfAttorneyTermsScreen.K;
                        esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData.getClass();
                        return new p0(bVar, n0Var2, esimMobilePlanPowerOfAttorneyTermsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanPowerOfAttorneyTermsScreen.R;
                        return (h) ((p0) esimMobilePlanPowerOfAttorneyTermsScreen.P.getValue()).f4386c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f264215b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p0) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_terms_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_terms_header_title, null, null, 14), null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_terms_header_subtitle, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_terms_cta_title, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r56 = this.N;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputChecklistDelegate) r56.getValue()).f52518c), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((InputChecklistDelegate) r56.getValue()).p(), new sl3.i(12))), null, new sek.q(this, continuation, 7), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new d(this, continuation, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final slj.h R2() {
        return (slj.h) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
