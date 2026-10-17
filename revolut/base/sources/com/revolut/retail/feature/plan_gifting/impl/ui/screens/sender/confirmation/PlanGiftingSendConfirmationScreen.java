package com.revolut.retail.feature.plan_gifting.impl.ui.screens.sender.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.plan_gifting.impl.R$string;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.sender.confirmation.PlanGiftingSendConfirmationScreen;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.sender.confirmation.PlanGiftingSendConfirmationScreenContract$InputData;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lck.b;
import lck.d;
import lck.e;
import lw0.m;
import pbk.f;
import pbk.g;
import te0.w;
import vc.s;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/impl/ui/screens/sender/confirmation/PlanGiftingSendConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Llck/d;", "Ldli/a;", "Llck/e;", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanGiftingSendConfirmationScreen extends ViewController<d> implements a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(PlanGiftingSendConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final PlanGiftingSendConfirmationScreenContract$InputData K;
    public final int L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;

    public PlanGiftingSendConfirmationScreen(PlanGiftingSendConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: lck.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanGiftingSendConfirmationScreen f193888b;

            {
                this.f193888b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanGiftingSendConfirmationScreen planGiftingSendConfirmationScreen = this.f193888b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanGiftingSendConfirmationScreen.Q;
                        PlanGiftingSendConfirmationScreen planGiftingSendConfirmationScreen2 = this.f193888b;
                        return dli.f.a(planGiftingSendConfirmationScreen2, (f) planGiftingSendConfirmationScreen2.P.getValue(), f0.f322471a, R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanGiftingSendConfirmationScreen.Q;
                        qji.b bVarU2 = planGiftingSendConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.plan_gifting.impl.ui.screens.sender.confirmation.di.PlanGiftingSendConfirmationScreenInjector");
                        g gVar = (g) bVarU2;
                        pbk.b bVar = gVar.f234741b;
                        g gVar2 = gVar.f234742c;
                        PlanGiftingSendConfirmationScreenContract$InputData planGiftingSendConfirmationScreenContract$InputData = planGiftingSendConfirmationScreen.K;
                        planGiftingSendConfirmationScreenContract$InputData.getClass();
                        return new pbk.f(bVar, gVar2, planGiftingSendConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanGiftingSendConfirmationScreen.Q;
                        return (f) ((pbk.f) planGiftingSendConfirmationScreen.O.getValue()).f234739c.get();
                }
            }
        });
        this.N = s.t(this, b.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: lck.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanGiftingSendConfirmationScreen f193888b;

            {
                this.f193888b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanGiftingSendConfirmationScreen planGiftingSendConfirmationScreen = this.f193888b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanGiftingSendConfirmationScreen.Q;
                        PlanGiftingSendConfirmationScreen planGiftingSendConfirmationScreen2 = this.f193888b;
                        return dli.f.a(planGiftingSendConfirmationScreen2, (f) planGiftingSendConfirmationScreen2.P.getValue(), f0.f322471a, R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanGiftingSendConfirmationScreen.Q;
                        qji.b bVarU2 = planGiftingSendConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.plan_gifting.impl.ui.screens.sender.confirmation.di.PlanGiftingSendConfirmationScreenInjector");
                        g gVar = (g) bVarU2;
                        pbk.b bVar = gVar.f234741b;
                        g gVar2 = gVar.f234742c;
                        PlanGiftingSendConfirmationScreenContract$InputData planGiftingSendConfirmationScreenContract$InputData = planGiftingSendConfirmationScreen.K;
                        planGiftingSendConfirmationScreenContract$InputData.getClass();
                        return new pbk.f(bVar, gVar2, planGiftingSendConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanGiftingSendConfirmationScreen.Q;
                        return (f) ((pbk.f) planGiftingSendConfirmationScreen.O.getValue()).f234739c.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: lck.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanGiftingSendConfirmationScreen f193888b;

            {
                this.f193888b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanGiftingSendConfirmationScreen planGiftingSendConfirmationScreen = this.f193888b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanGiftingSendConfirmationScreen.Q;
                        PlanGiftingSendConfirmationScreen planGiftingSendConfirmationScreen2 = this.f193888b;
                        return dli.f.a(planGiftingSendConfirmationScreen2, (f) planGiftingSendConfirmationScreen2.P.getValue(), f0.f322471a, R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanGiftingSendConfirmationScreen.Q;
                        qji.b bVarU2 = planGiftingSendConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.plan_gifting.impl.ui.screens.sender.confirmation.di.PlanGiftingSendConfirmationScreenInjector");
                        g gVar = (g) bVarU2;
                        pbk.b bVar = gVar.f234741b;
                        g gVar2 = gVar.f234742c;
                        PlanGiftingSendConfirmationScreenContract$InputData planGiftingSendConfirmationScreenContract$InputData = planGiftingSendConfirmationScreen.K;
                        planGiftingSendConfirmationScreenContract$InputData.getClass();
                        return new pbk.f(bVar, gVar2, planGiftingSendConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanGiftingSendConfirmationScreen.Q;
                        return (f) ((pbk.f) planGiftingSendConfirmationScreen.O.getValue()).f234739c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarBottomSheet navBarBottomSheet = d3().f174546c;
        m mVar = uiState.f193894b;
        if (mVar != null) {
            navBarBottomSheet.setHeaderModel(mVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (lck.f) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174546c.setHeaderModel(null);
        d3().f174545b.setText(new TextLocalisedClause(R$string.plan_gifting_sending_dialog_confirmation_action_confirm, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174545b.o), new la8.h(this, null, 5), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.M.getValue();
    }
}
