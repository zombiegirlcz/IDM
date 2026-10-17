package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_bottom_sheet;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanOfferPromptLayout;
import com.revolut.retail.feature.pricing_plans.ui.api.models.d;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$id;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$layout;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_bottom_sheet.PlanOfferBottomSheetScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_bottom_sheet.PlanOfferBottomSheetScreenContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.x5;
import qgk.i0;
import qgk.r0;
import qgk.s0;
import tmk.b;
import tmk.c;
import tmk.f;
import tmk.g;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_offer_bottom_sheet/PlanOfferBottomSheetScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltmk/f;", "Lcli/w;", "Ltmk/h;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanOfferBottomSheetScreen extends ViewController<f> implements w {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(PlanOfferBottomSheetScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenPlanOfferBottomSheetBinding;", 0))};
    public final PlanOfferBottomSheetScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final int O;
    public final h P;

    public PlanOfferBottomSheetScreen(PlanOfferBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: tmk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanOfferBottomSheetScreen f272231b;

            {
                this.f272231b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanOfferBottomSheetScreen planOfferBottomSheetScreen = this.f272231b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanOfferBottomSheetScreen.Q;
                        return (g) ((r0) planOfferBottomSheetScreen.N.getValue()).f246213b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PlanOfferBottomSheetScreen.Q;
                        return n14.e.a(planOfferBottomSheetScreen, (g) planOfferBottomSheetScreen.L.getValue());
                    default:
                        KProperty[] kPropertyArr3 = PlanOfferBottomSheetScreen.Q;
                        qji.b bVarU2 = planOfferBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_bottom_sheet.di.PlanOfferBottomSheetScreenInjector");
                        s0 s0Var = (s0) ((bik.a) bVarU2);
                        i0 i0Var = s0Var.f246226c;
                        s0 s0Var2 = s0Var.d;
                        PlanOfferBottomSheetScreenContract$InputData planOfferBottomSheetScreenContract$InputData = planOfferBottomSheetScreen.K;
                        planOfferBottomSheetScreenContract$InputData.getClass();
                        return new r0(i0Var, s0Var2, planOfferBottomSheetScreenContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.M = te0.w.y0(new Function0(this) { // from class: tmk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanOfferBottomSheetScreen f272231b;

            {
                this.f272231b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanOfferBottomSheetScreen planOfferBottomSheetScreen = this.f272231b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanOfferBottomSheetScreen.Q;
                        return (g) ((r0) planOfferBottomSheetScreen.N.getValue()).f246213b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PlanOfferBottomSheetScreen.Q;
                        return n14.e.a(planOfferBottomSheetScreen, (g) planOfferBottomSheetScreen.L.getValue());
                    default:
                        KProperty[] kPropertyArr3 = PlanOfferBottomSheetScreen.Q;
                        qji.b bVarU2 = planOfferBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_bottom_sheet.di.PlanOfferBottomSheetScreenInjector");
                        s0 s0Var = (s0) ((bik.a) bVarU2);
                        i0 i0Var = s0Var.f246226c;
                        s0 s0Var2 = s0Var.d;
                        PlanOfferBottomSheetScreenContract$InputData planOfferBottomSheetScreenContract$InputData = planOfferBottomSheetScreen.K;
                        planOfferBottomSheetScreenContract$InputData.getClass();
                        return new r0(i0Var, s0Var2, planOfferBottomSheetScreenContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.N = te0.w.y0(new Function0(this) { // from class: tmk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanOfferBottomSheetScreen f272231b;

            {
                this.f272231b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanOfferBottomSheetScreen planOfferBottomSheetScreen = this.f272231b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanOfferBottomSheetScreen.Q;
                        return (g) ((r0) planOfferBottomSheetScreen.N.getValue()).f246213b.get();
                    case 1:
                        KProperty[] kPropertyArr2 = PlanOfferBottomSheetScreen.Q;
                        return n14.e.a(planOfferBottomSheetScreen, (g) planOfferBottomSheetScreen.L.getValue());
                    default:
                        KProperty[] kPropertyArr3 = PlanOfferBottomSheetScreen.Q;
                        qji.b bVarU2 = planOfferBottomSheetScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_bottom_sheet.di.PlanOfferBottomSheetScreenInjector");
                        s0 s0Var = (s0) ((bik.a) bVarU2);
                        i0 i0Var = s0Var.f246226c;
                        s0 s0Var2 = s0Var.d;
                        PlanOfferBottomSheetScreenContract$InputData planOfferBottomSheetScreenContract$InputData = planOfferBottomSheetScreen.K;
                        planOfferBottomSheetScreenContract$InputData.getClass();
                        return new r0(i0Var, s0Var2, planOfferBottomSheetScreenContract$InputData);
                }
            }
        });
        this.O = R$layout.screen_plan_offer_bottom_sheet;
        this.P = s.t(this, b.f);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        tmk.h uiState = (tmk.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().e.setModel(uiState.f272233a);
        d3().f215207c.setModel(uiState.f272234b);
        ActionFooterView planOfferBottomSheetFooterView = d3().d;
        Intrinsics.checkNotNullExpressionValue(planOfferBottomSheetFooterView, "planOfferBottomSheetFooterView");
        i iVar = uiState.f272235c;
        planOfferBottomSheetFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            ActionFooterView planOfferBottomSheetFooterView2 = d3().d;
            Intrinsics.checkNotNullExpressionValue(planOfferBottomSheetFooterView2, "planOfferBottomSheetFooterView");
            planOfferBottomSheetFooterView2.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r0) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (g) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        view.setBackground(null);
        PlanOfferPromptLayout.Background background = this.K.f103589a.f102847a.f102692c;
        PlanOfferPromptLayout.Asset asset = (background != null ? background.f102695a : null) == com.revolut.retail.feature.pricing_plans.ui.api.models.e.ASSET ? background.f102697c : null;
        if ((asset != null ? asset.f102693a : null) == d.IMAGE) {
            d3().f215206b.setModel(new x5(new UrlImage(asset.f102694b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), R$id.planOfferBottomSheet_title));
        }
        if (((Boolean) jo0.g.k.getValue()).booleanValue()) {
            mki.b bVarQ2 = q2();
            ActionFooterView planOfferBottomSheetFooterView = d3().d;
            Intrinsics.checkNotNullExpressionValue(planOfferBottomSheetFooterView, "planOfferBottomSheetFooterView");
            ofm.q.K(bVarQ2, planOfferBottomSheetFooterView);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, rd0.e.b(d3().d.f), null, new c(this, null, 0), 3);
        a.g2(this, rd0.e.b(d3().d.f58955g), null, new c(this, null, 1), 3);
        a.g2(this, rd0.e.b(d3().d.e), null, new t9h.b(this, null, 27), 3);
    }

    public final ngk.i d3() {
        ViewBinding value = this.P.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ngk.i) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.M.getValue();
    }
}
