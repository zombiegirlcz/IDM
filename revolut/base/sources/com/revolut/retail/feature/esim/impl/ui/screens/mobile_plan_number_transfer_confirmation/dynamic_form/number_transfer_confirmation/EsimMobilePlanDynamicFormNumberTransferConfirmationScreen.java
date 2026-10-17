package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation;

import afj.b0;
import afj.u;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.e;
import aw0.m6;
import aw0.n6;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.EsimMobilePlanDynamicFormNumberTransferConfirmationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData;
import hgj.c;
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
import wp5.y;
import xkj.d;
import xkj.f;
import xkj.j;
import xkj.k;
import xkj.l;
import xkj.m;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/EsimMobilePlanDynamicFormNumberTransferConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/dynamic_form/number_transfer_confirmation/a;", "Ldli/a;", "Lxkj/m;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanDynamicFormNumberTransferConfirmationScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EsimMobilePlanDynamicFormNumberTransferConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData K;
    public final int L;
    public final h M;
    public final InputTextDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public EsimMobilePlanDynamicFormNumberTransferConfirmationScreen(EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = s.t(this, xkj.b.f);
        this.N = new InputTextDelegate(null);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: xkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanDynamicFormNumberTransferConfirmationScreen f306817b;

            {
                this.f306817b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanDynamicFormNumberTransferConfirmationScreen esimMobilePlanDynamicFormNumberTransferConfirmationScreen = this.f306817b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanDynamicFormNumberTransferConfirmationScreen.R;
                        EsimMobilePlanDynamicFormNumberTransferConfirmationScreen esimMobilePlanDynamicFormNumberTransferConfirmationScreen2 = this.f306817b;
                        return dli.f.a(esimMobilePlanDynamicFormNumberTransferConfirmationScreen2, esimMobilePlanDynamicFormNumberTransferConfirmationScreen2.R2(), v.k(new RowDelegate(null, null, 7), esimMobilePlanDynamicFormNumberTransferConfirmationScreen2.N), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanDynamicFormNumberTransferConfirmationScreen.R;
                        qji.b bVarU2 = esimMobilePlanDynamicFormNumberTransferConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.di.EsimMobilePlanDynamicFormNumberTransferConfirmationScreenInjector");
                        b0 b0Var = (b0) bVarU2;
                        afj.b bVar = b0Var.f4170b;
                        b0 b0Var2 = b0Var.f4171c;
                        EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData = esimMobilePlanDynamicFormNumberTransferConfirmationScreen.K;
                        esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.getClass();
                        return new u(bVar, b0Var2, esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanDynamicFormNumberTransferConfirmationScreen.R;
                        return (j) ((u) esimMobilePlanDynamicFormNumberTransferConfirmationScreen.P.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: xkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanDynamicFormNumberTransferConfirmationScreen f306817b;

            {
                this.f306817b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanDynamicFormNumberTransferConfirmationScreen esimMobilePlanDynamicFormNumberTransferConfirmationScreen = this.f306817b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanDynamicFormNumberTransferConfirmationScreen.R;
                        EsimMobilePlanDynamicFormNumberTransferConfirmationScreen esimMobilePlanDynamicFormNumberTransferConfirmationScreen2 = this.f306817b;
                        return dli.f.a(esimMobilePlanDynamicFormNumberTransferConfirmationScreen2, esimMobilePlanDynamicFormNumberTransferConfirmationScreen2.R2(), v.k(new RowDelegate(null, null, 7), esimMobilePlanDynamicFormNumberTransferConfirmationScreen2.N), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanDynamicFormNumberTransferConfirmationScreen.R;
                        qji.b bVarU2 = esimMobilePlanDynamicFormNumberTransferConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.di.EsimMobilePlanDynamicFormNumberTransferConfirmationScreenInjector");
                        b0 b0Var = (b0) bVarU2;
                        afj.b bVar = b0Var.f4170b;
                        b0 b0Var2 = b0Var.f4171c;
                        EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData = esimMobilePlanDynamicFormNumberTransferConfirmationScreen.K;
                        esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.getClass();
                        return new u(bVar, b0Var2, esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanDynamicFormNumberTransferConfirmationScreen.R;
                        return (j) ((u) esimMobilePlanDynamicFormNumberTransferConfirmationScreen.P.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: xkj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanDynamicFormNumberTransferConfirmationScreen f306817b;

            {
                this.f306817b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanDynamicFormNumberTransferConfirmationScreen esimMobilePlanDynamicFormNumberTransferConfirmationScreen = this.f306817b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanDynamicFormNumberTransferConfirmationScreen.R;
                        EsimMobilePlanDynamicFormNumberTransferConfirmationScreen esimMobilePlanDynamicFormNumberTransferConfirmationScreen2 = this.f306817b;
                        return dli.f.a(esimMobilePlanDynamicFormNumberTransferConfirmationScreen2, esimMobilePlanDynamicFormNumberTransferConfirmationScreen2.R2(), v.k(new RowDelegate(null, null, 7), esimMobilePlanDynamicFormNumberTransferConfirmationScreen2.N), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanDynamicFormNumberTransferConfirmationScreen.R;
                        qji.b bVarU2 = esimMobilePlanDynamicFormNumberTransferConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.dynamic_form.number_transfer_confirmation.di.EsimMobilePlanDynamicFormNumberTransferConfirmationScreenInjector");
                        b0 b0Var = (b0) bVarU2;
                        afj.b bVar = b0Var.f4170b;
                        b0 b0Var2 = b0Var.f4171c;
                        EsimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData = esimMobilePlanDynamicFormNumberTransferConfirmationScreen.K;
                        esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData.getClass();
                        return new u(bVar, b0Var2, esimMobilePlanDynamicFormNumberTransferConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanDynamicFormNumberTransferConfirmationScreen.R;
                        return (j) ((u) esimMobilePlanDynamicFormNumberTransferConfirmationScreen.P.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = d3().f174533b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
        k kVar = uiState.f306834c;
        screenRecyclerNavbarActionFooterActionFooterView.setModel(new e(false, kVar.f306829c, null, m6.c(n6.Companion, kVar.f306828b, LargeActionButton.ButtonStyle.f58725a, null, null, kVar.f306827a, null, null, null, 988), null, null, 53));
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        l lVar = uiState.f306832a;
        Clause clause = lVar.f306830a;
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setToolbarTitle(clause);
        Clause clause2 = lVar.f306831b;
        navBarWithToolbar.setDescriptionText(clause2);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setDescriptionColor(R$attr.uikit_colorGrey50);
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (u) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(this.K.f101265g == c.CLOSE ? R$drawable.uikit_icn_24_cross : ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new xkj.c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new xkj.c(this, continuation, 1), 3);
        InputTextDelegate inputTextDelegate = this.N;
        ViewController.P2(this, y.x(inputTextDelegate.f52575g.f121375b, inputTextDelegate.i.f121375b, "mergeWith(...)"), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new xkj.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(inputTextDelegate.f52576h.f121375b), new f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174534c.p0()), new f(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.e), new f(this, null, 2), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j R2() {
        return (j) this.Q.getValue();
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
