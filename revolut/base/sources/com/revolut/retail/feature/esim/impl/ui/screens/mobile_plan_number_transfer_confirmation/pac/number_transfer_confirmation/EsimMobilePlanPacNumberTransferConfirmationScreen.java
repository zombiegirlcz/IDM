package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation;

import afj.e0;
import afj.f0;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.EsimMobilePlanPacNumberTransferConfirmationScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData;
import ekd.i0;
import elj.d;
import elj.f;
import elj.j;
import elj.k;
import hgj.c;
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
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/pac/number_transfer_confirmation/EsimMobilePlanPacNumberTransferConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_number_transfer_confirmation/pac/number_transfer_confirmation/a;", "Ldli/a;", "Lelj/k;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimMobilePlanPacNumberTransferConfirmationScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(EsimMobilePlanPacNumberTransferConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public EsimMobilePlanPacNumberTransferConfirmationScreen(EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, elj.b.f);
        this.N = w.y0(new i0(1));
        this.O = w.y0(new i0(2));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: elj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPacNumberTransferConfirmationScreen f127494b;

            {
                this.f127494b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EsimMobilePlanPacNumberTransferConfirmationScreen esimMobilePlanPacNumberTransferConfirmationScreen = this.f127494b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanPacNumberTransferConfirmationScreen.S;
                        EsimMobilePlanPacNumberTransferConfirmationScreen esimMobilePlanPacNumberTransferConfirmationScreen2 = this.f127494b;
                        return dli.f.a(esimMobilePlanPacNumberTransferConfirmationScreen2, esimMobilePlanPacNumberTransferConfirmationScreen2.d(), v.k(new RowDelegate(null, null, 7), (InputTextDelegate) esimMobilePlanPacNumberTransferConfirmationScreen2.N.getValue(), (TextDelegate) esimMobilePlanPacNumberTransferConfirmationScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanPacNumberTransferConfirmationScreen.S;
                        qji.b bVarU2 = esimMobilePlanPacNumberTransferConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.di.EsimMobilePlanPacNumberTransferConfirmationScreenInjector");
                        e0 e0Var = (e0) bVarU2;
                        afj.b bVar = e0Var.f4218b;
                        e0 e0Var2 = e0Var.f4219c;
                        EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData = esimMobilePlanPacNumberTransferConfirmationScreen.K;
                        esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData.getClass();
                        return new f0(bVar, e0Var2, esimMobilePlanPacNumberTransferConfirmationScreen, esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanPacNumberTransferConfirmationScreen.S;
                        return (j) ((f0) esimMobilePlanPacNumberTransferConfirmationScreen.Q.getValue()).f.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: elj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPacNumberTransferConfirmationScreen f127494b;

            {
                this.f127494b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EsimMobilePlanPacNumberTransferConfirmationScreen esimMobilePlanPacNumberTransferConfirmationScreen = this.f127494b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanPacNumberTransferConfirmationScreen.S;
                        EsimMobilePlanPacNumberTransferConfirmationScreen esimMobilePlanPacNumberTransferConfirmationScreen2 = this.f127494b;
                        return dli.f.a(esimMobilePlanPacNumberTransferConfirmationScreen2, esimMobilePlanPacNumberTransferConfirmationScreen2.d(), v.k(new RowDelegate(null, null, 7), (InputTextDelegate) esimMobilePlanPacNumberTransferConfirmationScreen2.N.getValue(), (TextDelegate) esimMobilePlanPacNumberTransferConfirmationScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanPacNumberTransferConfirmationScreen.S;
                        qji.b bVarU2 = esimMobilePlanPacNumberTransferConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.di.EsimMobilePlanPacNumberTransferConfirmationScreenInjector");
                        e0 e0Var = (e0) bVarU2;
                        afj.b bVar = e0Var.f4218b;
                        e0 e0Var2 = e0Var.f4219c;
                        EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData = esimMobilePlanPacNumberTransferConfirmationScreen.K;
                        esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData.getClass();
                        return new f0(bVar, e0Var2, esimMobilePlanPacNumberTransferConfirmationScreen, esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanPacNumberTransferConfirmationScreen.S;
                        return (j) ((f0) esimMobilePlanPacNumberTransferConfirmationScreen.Q.getValue()).f.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: elj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EsimMobilePlanPacNumberTransferConfirmationScreen f127494b;

            {
                this.f127494b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EsimMobilePlanPacNumberTransferConfirmationScreen esimMobilePlanPacNumberTransferConfirmationScreen = this.f127494b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EsimMobilePlanPacNumberTransferConfirmationScreen.S;
                        EsimMobilePlanPacNumberTransferConfirmationScreen esimMobilePlanPacNumberTransferConfirmationScreen2 = this.f127494b;
                        return dli.f.a(esimMobilePlanPacNumberTransferConfirmationScreen2, esimMobilePlanPacNumberTransferConfirmationScreen2.d(), v.k(new RowDelegate(null, null, 7), (InputTextDelegate) esimMobilePlanPacNumberTransferConfirmationScreen2.N.getValue(), (TextDelegate) esimMobilePlanPacNumberTransferConfirmationScreen2.O.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = EsimMobilePlanPacNumberTransferConfirmationScreen.S;
                        qji.b bVarU2 = esimMobilePlanPacNumberTransferConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.di.EsimMobilePlanPacNumberTransferConfirmationScreenInjector");
                        e0 e0Var = (e0) bVarU2;
                        afj.b bVar = e0Var.f4218b;
                        e0 e0Var2 = e0Var.f4219c;
                        EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData = esimMobilePlanPacNumberTransferConfirmationScreen.K;
                        esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData.getClass();
                        return new f0(bVar, e0Var2, esimMobilePlanPacNumberTransferConfirmationScreen, esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = EsimMobilePlanPacNumberTransferConfirmationScreen.S;
                        return (j) ((f0) esimMobilePlanPacNumberTransferConfirmationScreen.Q.getValue()).f.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        elj.h hVar = uiState.f127503a;
        navBarWithToolbar.setTitle(hVar.f127499a, null);
        Clause clause = hVar.f127500b;
        navBarWithToolbar.setDescriptionText(clause);
        navBarWithToolbar.setDescriptionColor(R$attr.uikit_colorGrey50);
        navBarWithToolbar.setDescriptionVisible(clause != null);
        d3().f174564b.setEnabled(uiState.f127505c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f0) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(this.K.f101310g == c.CLOSE ? R$drawable.uikit_icn_24_cross : ofm.q.k(q2())));
        d3().f174564b.setText(new TextLocalisedClause(R$string.common_action_continue, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new elj.c(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new elj.c(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.p0()), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((TextDelegate) this.O.getValue()).d), null, new d(this, null, 1), 3);
        ?? r56 = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).f52575g.f121375b), null, new elj.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) r56.getValue()).e.f121375b), null, new f(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
