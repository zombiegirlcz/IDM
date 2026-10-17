package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.business_details;

import afj.b0;
import afj.t;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.business_details.EsimMobilePlanDynamicFormBusinessDetailsScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.business_details.EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import h30.l;
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
import vfg.m;
import vkj.b;
import vkj.c;
import vkj.d;
import vkj.g;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/business_details/EsimMobilePlanDynamicFormBusinessDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvkj/g;", "Ldli/a;", "Lvkj/i;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanDynamicFormBusinessDetailsScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EsimMobilePlanDynamicFormBusinessDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public EsimMobilePlanDynamicFormBusinessDetailsScreen(EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = w.y0(new i(22));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: vkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanDynamicFormBusinessDetailsScreen f289968b;

            {
                this.f289968b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanDynamicFormBusinessDetailsScreen esimMobilePlanDynamicFormBusinessDetailsScreen = this.f289968b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanDynamicFormBusinessDetailsScreen.R;
                        EsimMobilePlanDynamicFormBusinessDetailsScreen esimMobilePlanDynamicFormBusinessDetailsScreen2 = this.f289968b;
                        return dli.f.a(esimMobilePlanDynamicFormBusinessDetailsScreen2, esimMobilePlanDynamicFormBusinessDetailsScreen2.d(), u.c((InputTextDelegate) esimMobilePlanDynamicFormBusinessDetailsScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanDynamicFormBusinessDetailsScreen.R;
                        qji.b bVarU2 = esimMobilePlanDynamicFormBusinessDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.business_details.di.EsimMobilePlanDynamicFormBusinessDetailsScreenInjector");
                        b0 b0Var = (b0) bVarU2;
                        afj.b bVar = b0Var.f4170b;
                        b0 b0Var2 = b0Var.f4171c;
                        EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData esimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData = esimMobilePlanDynamicFormBusinessDetailsScreen.K;
                        esimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData.getClass();
                        return new t(bVar, b0Var2, esimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanDynamicFormBusinessDetailsScreen.R;
                        return (h) ((t) esimMobilePlanDynamicFormBusinessDetailsScreen.P.getValue()).f4446b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: vkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanDynamicFormBusinessDetailsScreen f289968b;

            {
                this.f289968b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanDynamicFormBusinessDetailsScreen esimMobilePlanDynamicFormBusinessDetailsScreen = this.f289968b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanDynamicFormBusinessDetailsScreen.R;
                        EsimMobilePlanDynamicFormBusinessDetailsScreen esimMobilePlanDynamicFormBusinessDetailsScreen2 = this.f289968b;
                        return dli.f.a(esimMobilePlanDynamicFormBusinessDetailsScreen2, esimMobilePlanDynamicFormBusinessDetailsScreen2.d(), u.c((InputTextDelegate) esimMobilePlanDynamicFormBusinessDetailsScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanDynamicFormBusinessDetailsScreen.R;
                        qji.b bVarU2 = esimMobilePlanDynamicFormBusinessDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.business_details.di.EsimMobilePlanDynamicFormBusinessDetailsScreenInjector");
                        b0 b0Var = (b0) bVarU2;
                        afj.b bVar = b0Var.f4170b;
                        b0 b0Var2 = b0Var.f4171c;
                        EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData esimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData = esimMobilePlanDynamicFormBusinessDetailsScreen.K;
                        esimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData.getClass();
                        return new t(bVar, b0Var2, esimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanDynamicFormBusinessDetailsScreen.R;
                        return (h) ((t) esimMobilePlanDynamicFormBusinessDetailsScreen.P.getValue()).f4446b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: vkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanDynamicFormBusinessDetailsScreen f289968b;

            {
                this.f289968b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanDynamicFormBusinessDetailsScreen esimMobilePlanDynamicFormBusinessDetailsScreen = this.f289968b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanDynamicFormBusinessDetailsScreen.R;
                        EsimMobilePlanDynamicFormBusinessDetailsScreen esimMobilePlanDynamicFormBusinessDetailsScreen2 = this.f289968b;
                        return dli.f.a(esimMobilePlanDynamicFormBusinessDetailsScreen2, esimMobilePlanDynamicFormBusinessDetailsScreen2.d(), u.c((InputTextDelegate) esimMobilePlanDynamicFormBusinessDetailsScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanDynamicFormBusinessDetailsScreen.R;
                        qji.b bVarU2 = esimMobilePlanDynamicFormBusinessDetailsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.business_details.di.EsimMobilePlanDynamicFormBusinessDetailsScreenInjector");
                        b0 b0Var = (b0) bVarU2;
                        afj.b bVar = b0Var.f4170b;
                        b0 b0Var2 = b0Var.f4171c;
                        EsimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData esimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData = esimMobilePlanDynamicFormBusinessDetailsScreen.K;
                        esimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData.getClass();
                        return new t(bVar, b0Var2, esimMobilePlanDynamicFormBusinessDetailsScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanDynamicFormBusinessDetailsScreen.R;
                        return (h) ((t) esimMobilePlanDynamicFormBusinessDetailsScreen.P.getValue()).f4446b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        vkj.i uiState = (vkj.i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f289973b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_business_details_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_business_details_header_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_business_details_header_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGrey50), false, null, false, null, 254), 10));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        LargeActionButton largeActionButton = d3().f174564b;
        l.A(R.string.common_action_continue, null, null, 14, largeActionButton);
        largeActionButton.setEnabled(false);
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, continuation, 1), 3);
        ?? r56 = this.N;
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).e.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).f52576h.f121375b), new m(this, continuation, 9), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final vkj.h d() {
        return (vkj.h) this.Q.getValue();
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
