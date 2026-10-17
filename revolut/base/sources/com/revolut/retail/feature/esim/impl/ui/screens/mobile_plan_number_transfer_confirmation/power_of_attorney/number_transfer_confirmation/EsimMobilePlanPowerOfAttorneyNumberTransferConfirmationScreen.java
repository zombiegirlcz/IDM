package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation;

import afj.n0;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import h30.l;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pka.c;
import plj.d;
import plj.f;
import plj.i;
import plj.j;
import te0.w;
import tx0.j0;
import vc.s;
import wp5.y;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/power_of_attorney/number_transfer_confirmation/EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/power_of_attorney/number_transfer_confirmation/a;", "Ldli/a;", "Lplj/j;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen(EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, plj.b.f);
        this.N = w.y0(new c(17));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: plj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen f237415b;

            {
                this.f237415b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen = this.f237415b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.R;
                        EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen2 = this.f237415b;
                        return dli.f.a(esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen2, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen2.d(), v.k(new RowDelegate(null, null, 7), (InputTextDelegate) esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.R;
                        qji.b bVarU2 = esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.di.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenInjector");
                        n0 n0Var = (n0) bVarU2;
                        afj.b bVar = n0Var.f4355b;
                        n0 n0Var2 = n0Var.f4356c;
                        EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData = esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.K;
                        esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData.getClass();
                        return new afj.o0(bVar, n0Var2, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.R;
                        return (i) ((afj.o0) esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.P.getValue()).d.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: plj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen f237415b;

            {
                this.f237415b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen = this.f237415b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.R;
                        EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen2 = this.f237415b;
                        return dli.f.a(esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen2, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen2.d(), v.k(new RowDelegate(null, null, 7), (InputTextDelegate) esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.R;
                        qji.b bVarU2 = esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.di.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenInjector");
                        n0 n0Var = (n0) bVarU2;
                        afj.b bVar = n0Var.f4355b;
                        n0 n0Var2 = n0Var.f4356c;
                        EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData = esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.K;
                        esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData.getClass();
                        return new afj.o0(bVar, n0Var2, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.R;
                        return (i) ((afj.o0) esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.P.getValue()).d.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: plj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen f237415b;

            {
                this.f237415b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen = this.f237415b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.R;
                        EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen2 = this.f237415b;
                        return dli.f.a(esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen2, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen2.d(), v.k(new RowDelegate(null, null, 7), (InputTextDelegate) esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen2.N.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.R;
                        qji.b bVarU2 = esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.power_of_attorney.number_transfer_confirmation.di.EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenInjector");
                        n0 n0Var = (n0) bVarU2;
                        afj.b bVar = n0Var.f4355b;
                        n0 n0Var2 = n0Var.f4356c;
                        EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData = esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.K;
                        esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData.getClass();
                        return new afj.o0(bVar, n0Var2, esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.R;
                        return (i) ((afj.o0) esimMobilePlanPowerOfAttorneyNumberTransferConfirmationScreen.P.getValue()).d.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174564b.setEnabled(uiState.f237425b);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        f fVar = uiState.f237426c;
        Clause clause = fVar.f237419a;
        navBarWithToolbar.setToolbarTitle(clause);
        navBarWithToolbar.setTitle(clause, null);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        Clause clause2 = fVar.f237420b;
        navBarWithToolbar.setDescriptionText(clause2);
        navBarWithToolbar.setDescriptionColor(R$attr.uikit_colorGrey50);
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (afj.o0) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(this.K.f101343g == hgj.c.CLOSE ? R$drawable.uikit_icn_24_cross : ofm.q.k(q2())));
        l.A(R.string.common_action_continue, null, null, 14, d3().f174564b);
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new plj.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new plj.c(this, continuation, 1), 3);
        ?? r56 = this.N;
        com.revolut.kompot.navigable.a.g2(this, y.x(((InputTextDelegate) r56.getValue()).f52575g.f121375b, ((InputTextDelegate) r56.getValue()).i.f121375b, "mergeWith(...)"), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.p0()), null, new pfk.o0(this, continuation, 17), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.Q.getValue();
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
