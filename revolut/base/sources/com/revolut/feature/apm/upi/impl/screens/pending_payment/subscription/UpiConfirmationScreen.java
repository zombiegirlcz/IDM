package com.revolut.feature.apm.upi.impl.screens.pending_payment.subscription;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.subscription.UpiConfirmationScreen;
import com.revolut.feature.apm.upi.impl.screens.pending_payment.subscription.UpiConfirmationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tg2.b;
import tg2.c;
import tg2.f;
import tg2.k;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/screens/pending_payment/subscription/UpiConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltg2/f;", "Ldli/a;", "Ltg2/k;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpiConfirmationScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(UpiConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final UpiConfirmationScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;

    public UpiConfirmationScreen(UpiConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_action_footer;
        this.M = s.t(this, b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: tg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiConfirmationScreen f271041b;

            {
                this.f271041b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UpiConfirmationScreen upiConfirmationScreen = this.f271041b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UpiConfirmationScreen.Q;
                        return (o) ((if2.e) upiConfirmationScreen.O.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = UpiConfirmationScreen.Q;
                        qji.b bVarU2 = upiConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.upi.impl.screens.pending_payment.subscription.di.UpiConfirmationScreenInjector");
                        if2.k kVar = (if2.k) bVarU2;
                        if2.f fVar = kVar.f160880b;
                        if2.k kVar2 = kVar.f160881c;
                        UpiConfirmationScreenContract$InputData upiConfirmationScreenContract$InputData = upiConfirmationScreen.K;
                        upiConfirmationScreenContract$InputData.getClass();
                        return new if2.e(fVar, kVar2, upiConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = UpiConfirmationScreen.Q;
                        UpiConfirmationScreen upiConfirmationScreen2 = this.f271041b;
                        return dli.f.a(upiConfirmationScreen2, (o) upiConfirmationScreen2.N.getValue(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new ListSubheaderDelegate(), new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new IconDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: tg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiConfirmationScreen f271041b;

            {
                this.f271041b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UpiConfirmationScreen upiConfirmationScreen = this.f271041b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UpiConfirmationScreen.Q;
                        return (o) ((if2.e) upiConfirmationScreen.O.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = UpiConfirmationScreen.Q;
                        qji.b bVarU2 = upiConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.upi.impl.screens.pending_payment.subscription.di.UpiConfirmationScreenInjector");
                        if2.k kVar = (if2.k) bVarU2;
                        if2.f fVar = kVar.f160880b;
                        if2.k kVar2 = kVar.f160881c;
                        UpiConfirmationScreenContract$InputData upiConfirmationScreenContract$InputData = upiConfirmationScreen.K;
                        upiConfirmationScreenContract$InputData.getClass();
                        return new if2.e(fVar, kVar2, upiConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = UpiConfirmationScreen.Q;
                        UpiConfirmationScreen upiConfirmationScreen2 = this.f271041b;
                        return dli.f.a(upiConfirmationScreen2, (o) upiConfirmationScreen2.N.getValue(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new ListSubheaderDelegate(), new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new IconDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: tg2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiConfirmationScreen f271041b;

            {
                this.f271041b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                UpiConfirmationScreen upiConfirmationScreen = this.f271041b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UpiConfirmationScreen.Q;
                        return (o) ((if2.e) upiConfirmationScreen.O.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = UpiConfirmationScreen.Q;
                        qji.b bVarU2 = upiConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.upi.impl.screens.pending_payment.subscription.di.UpiConfirmationScreenInjector");
                        if2.k kVar = (if2.k) bVarU2;
                        if2.f fVar = kVar.f160880b;
                        if2.k kVar2 = kVar.f160881c;
                        UpiConfirmationScreenContract$InputData upiConfirmationScreenContract$InputData = upiConfirmationScreen.K;
                        upiConfirmationScreenContract$InputData.getClass();
                        return new if2.e(fVar, kVar2, upiConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = UpiConfirmationScreen.Q;
                        UpiConfirmationScreen upiConfirmationScreen2 = this.f271041b;
                        return dli.f.a(upiConfirmationScreen2, (o) upiConfirmationScreen2.N.getValue(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new ListSubheaderDelegate(), new CellDetailsDelegate(), new CellDetailsNoteDelegate(), new IconDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar screenRecyclerNavbarActionFooterNavBar = d3().f174534c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterNavBar, "screenRecyclerNavbarActionFooterNavBar");
        screenRecyclerNavbarActionFooterNavBar.setTitle(uiState.f271049b, null);
        ActionFooterView actionFooterView = d3().f174533b;
        actionFooterView.setVisibility(uiState.d ? 0 : 8);
        i iVar = uiState.f271050c;
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (if2.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (tg2.o) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174534c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f58955g), new c(this, null, 2), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.M.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
