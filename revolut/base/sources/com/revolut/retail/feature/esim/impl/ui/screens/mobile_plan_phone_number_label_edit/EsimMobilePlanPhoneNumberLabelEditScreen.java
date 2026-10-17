package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_label_edit;

import afj.j0;
import afj.k0;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_label_edit.EsimMobilePlanPhoneNumberLabelEditScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_label_edit.EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData;
import dli.a;
import gla.k;
import gmj.b;
import gmj.c;
import gmj.d;
import gmj.f;
import gmj.g;
import gmj.i;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_phone_number_label_edit/EsimMobilePlanPhoneNumberLabelEditScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgmj/f;", "Ldli/a;", "Lgmj/g;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanPhoneNumberLabelEditScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EsimMobilePlanPhoneNumberLabelEditScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public EsimMobilePlanPhoneNumberLabelEditScreen(EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, b.f);
        this.N = w.y0(new k(10));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: gmj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPhoneNumberLabelEditScreen f144862b;

            {
                this.f144862b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanPhoneNumberLabelEditScreen esimMobilePlanPhoneNumberLabelEditScreen = this.f144862b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanPhoneNumberLabelEditScreen.R;
                        EsimMobilePlanPhoneNumberLabelEditScreen esimMobilePlanPhoneNumberLabelEditScreen2 = this.f144862b;
                        return dli.f.a(esimMobilePlanPhoneNumberLabelEditScreen2, esimMobilePlanPhoneNumberLabelEditScreen2.d(), u.c((InputTextDelegate) esimMobilePlanPhoneNumberLabelEditScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanPhoneNumberLabelEditScreen.R;
                        qji.b bVarU2 = esimMobilePlanPhoneNumberLabelEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_label_edit.di.EsimMobilePlanPhoneNumberLabelEditScreenInjector");
                        k0 k0Var = (k0) bVarU2;
                        afj.b bVar = k0Var.f4310b;
                        k0 k0Var2 = k0Var.f4311c;
                        EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData esimMobilePlanPhoneNumberLabelEditScreenContract$InputData = esimMobilePlanPhoneNumberLabelEditScreen.K;
                        esimMobilePlanPhoneNumberLabelEditScreenContract$InputData.getClass();
                        return new j0(bVar, k0Var2, esimMobilePlanPhoneNumberLabelEditScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanPhoneNumberLabelEditScreen.R;
                        return (i) ((j0) esimMobilePlanPhoneNumberLabelEditScreen.P.getValue()).f4298c.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: gmj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPhoneNumberLabelEditScreen f144862b;

            {
                this.f144862b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanPhoneNumberLabelEditScreen esimMobilePlanPhoneNumberLabelEditScreen = this.f144862b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanPhoneNumberLabelEditScreen.R;
                        EsimMobilePlanPhoneNumberLabelEditScreen esimMobilePlanPhoneNumberLabelEditScreen2 = this.f144862b;
                        return dli.f.a(esimMobilePlanPhoneNumberLabelEditScreen2, esimMobilePlanPhoneNumberLabelEditScreen2.d(), u.c((InputTextDelegate) esimMobilePlanPhoneNumberLabelEditScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanPhoneNumberLabelEditScreen.R;
                        qji.b bVarU2 = esimMobilePlanPhoneNumberLabelEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_label_edit.di.EsimMobilePlanPhoneNumberLabelEditScreenInjector");
                        k0 k0Var = (k0) bVarU2;
                        afj.b bVar = k0Var.f4310b;
                        k0 k0Var2 = k0Var.f4311c;
                        EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData esimMobilePlanPhoneNumberLabelEditScreenContract$InputData = esimMobilePlanPhoneNumberLabelEditScreen.K;
                        esimMobilePlanPhoneNumberLabelEditScreenContract$InputData.getClass();
                        return new j0(bVar, k0Var2, esimMobilePlanPhoneNumberLabelEditScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanPhoneNumberLabelEditScreen.R;
                        return (i) ((j0) esimMobilePlanPhoneNumberLabelEditScreen.P.getValue()).f4298c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: gmj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPhoneNumberLabelEditScreen f144862b;

            {
                this.f144862b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanPhoneNumberLabelEditScreen esimMobilePlanPhoneNumberLabelEditScreen = this.f144862b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanPhoneNumberLabelEditScreen.R;
                        EsimMobilePlanPhoneNumberLabelEditScreen esimMobilePlanPhoneNumberLabelEditScreen2 = this.f144862b;
                        return dli.f.a(esimMobilePlanPhoneNumberLabelEditScreen2, esimMobilePlanPhoneNumberLabelEditScreen2.d(), u.c((InputTextDelegate) esimMobilePlanPhoneNumberLabelEditScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanPhoneNumberLabelEditScreen.R;
                        qji.b bVarU2 = esimMobilePlanPhoneNumberLabelEditScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_phone_number_label_edit.di.EsimMobilePlanPhoneNumberLabelEditScreenInjector");
                        k0 k0Var = (k0) bVarU2;
                        afj.b bVar = k0Var.f4310b;
                        k0 k0Var2 = k0Var.f4311c;
                        EsimMobilePlanPhoneNumberLabelEditScreenContract$InputData esimMobilePlanPhoneNumberLabelEditScreenContract$InputData = esimMobilePlanPhoneNumberLabelEditScreen.K;
                        esimMobilePlanPhoneNumberLabelEditScreenContract$InputData.getClass();
                        return new j0(bVar, k0Var2, esimMobilePlanPhoneNumberLabelEditScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanPhoneNumberLabelEditScreen.R;
                        return (i) ((j0) esimMobilePlanPhoneNumberLabelEditScreen.P.getValue()).f4298c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f144866b);
        d3().f174565c.setMenuItems(uiState.f144867c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j0) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_action_edit_label_cta, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.esim_mobile_plans_plan_details_my_numbers_action_edit_label_cta, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_save, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.o.f57403b), null, new c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.N.getValue()).e.f121375b), null, new d(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
