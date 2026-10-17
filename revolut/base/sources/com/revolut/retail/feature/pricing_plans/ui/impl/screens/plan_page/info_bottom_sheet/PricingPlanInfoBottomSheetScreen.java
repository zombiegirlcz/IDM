package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.info_bottom_sheet;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import aw0.o9;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import cnk.c;
import cnk.e;
import cnk.j;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$layout;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.info_bottom_sheet.PricingPlanInfoBottomSheetScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.info_bottom_sheet.PricingPlanInfoBottomSheetScreenContract$InputData;
import java.util.List;
import jo0.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import org.jetbrains.annotations.NotNull;
import pki.b;
import qgk.i0;
import qgk.q1;
import v0.a;
import vc.s;
import z92.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_page/info_bottom_sheet/PricingPlanInfoBottomSheetScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcnk/c;", "Lcli/w;", "Lcnk/k;", "Lno/k;", "Companion", "a", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PricingPlanInfoBottomSheetScreen extends ViewController<c> implements w, k {
    public final PricingPlanInfoBottomSheetScreenContract$InputData K;
    public final int L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public AnalyticsContext R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(PricingPlanInfoBottomSheetScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/pricing_plans/ui/impl/databinding/ScreenPricingPlanInfoBottomSheetBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.info_bottom_sheet.PricingPlanInfoBottomSheetScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public PricingPlanInfoBottomSheetScreen(PricingPlanInfoBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_pricing_plan_info_bottom_sheet;
        this.M = f.m(inputData.f103621c);
        this.N = s.t(this, e.f);
        final int i = 0;
        this.O = te0.w.y0(new Function0(this) { // from class: cnk.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PricingPlanInfoBottomSheetScreen f25455b;

            {
                this.f25455b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PricingPlanInfoBottomSheetScreen pricingPlanInfoBottomSheetScreen = this.f25455b;
                switch (i2) {
                    case 0:
                        PricingPlanInfoBottomSheetScreen.Companion companion = PricingPlanInfoBottomSheetScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(pricingPlanInfoBottomSheetScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PricingPlanInfoBottomSheetScreenContract$InputData pricingPlanInfoBottomSheetScreenContract$InputData = pricingPlanInfoBottomSheetScreen.K;
                        pricingPlanInfoBottomSheetScreenContract$InputData.getClass();
                        return new q1(i0Var, pricingPlanInfoBottomSheetScreenContract$InputData);
                    case 1:
                        PricingPlanInfoBottomSheetScreen.Companion companion2 = PricingPlanInfoBottomSheetScreen.INSTANCE;
                        return (j) ((q1) pricingPlanInfoBottomSheetScreen.O.getValue()).d.get();
                    default:
                        PricingPlanInfoBottomSheetScreen.Companion companion3 = PricingPlanInfoBottomSheetScreen.INSTANCE;
                        return n14.e.a(pricingPlanInfoBottomSheetScreen, (j) pricingPlanInfoBottomSheetScreen.P.getValue());
                }
            }
        });
        final int i2 = 1;
        this.P = te0.w.y0(new Function0(this) { // from class: cnk.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PricingPlanInfoBottomSheetScreen f25455b;

            {
                this.f25455b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PricingPlanInfoBottomSheetScreen pricingPlanInfoBottomSheetScreen = this.f25455b;
                switch (i22) {
                    case 0:
                        PricingPlanInfoBottomSheetScreen.Companion companion = PricingPlanInfoBottomSheetScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(pricingPlanInfoBottomSheetScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PricingPlanInfoBottomSheetScreenContract$InputData pricingPlanInfoBottomSheetScreenContract$InputData = pricingPlanInfoBottomSheetScreen.K;
                        pricingPlanInfoBottomSheetScreenContract$InputData.getClass();
                        return new q1(i0Var, pricingPlanInfoBottomSheetScreenContract$InputData);
                    case 1:
                        PricingPlanInfoBottomSheetScreen.Companion companion2 = PricingPlanInfoBottomSheetScreen.INSTANCE;
                        return (j) ((q1) pricingPlanInfoBottomSheetScreen.O.getValue()).d.get();
                    default:
                        PricingPlanInfoBottomSheetScreen.Companion companion3 = PricingPlanInfoBottomSheetScreen.INSTANCE;
                        return n14.e.a(pricingPlanInfoBottomSheetScreen, (j) pricingPlanInfoBottomSheetScreen.P.getValue());
                }
            }
        });
        final int i3 = 2;
        this.Q = te0.w.y0(new Function0(this) { // from class: cnk.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PricingPlanInfoBottomSheetScreen f25455b;

            {
                this.f25455b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PricingPlanInfoBottomSheetScreen pricingPlanInfoBottomSheetScreen = this.f25455b;
                switch (i22) {
                    case 0:
                        PricingPlanInfoBottomSheetScreen.Companion companion = PricingPlanInfoBottomSheetScreen.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(pricingPlanInfoBottomSheetScreen.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).X;
                        PricingPlanInfoBottomSheetScreenContract$InputData pricingPlanInfoBottomSheetScreenContract$InputData = pricingPlanInfoBottomSheetScreen.K;
                        pricingPlanInfoBottomSheetScreenContract$InputData.getClass();
                        return new q1(i0Var, pricingPlanInfoBottomSheetScreenContract$InputData);
                    case 1:
                        PricingPlanInfoBottomSheetScreen.Companion companion2 = PricingPlanInfoBottomSheetScreen.INSTANCE;
                        return (j) ((q1) pricingPlanInfoBottomSheetScreen.O.getValue()).d.get();
                    default:
                        PricingPlanInfoBottomSheetScreen.Companion companion3 = PricingPlanInfoBottomSheetScreen.INSTANCE;
                        return n14.e.a(pricingPlanInfoBottomSheetScreen, (j) pricingPlanInfoBottomSheetScreen.P.getValue());
                }
            }
        });
        this.R = new AnalyticsContext(a.b("plan.dashboard.info_bottom_sheet", AnalyticsContext.INSTANCE));
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.M);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        cnk.k uiState = (cnk.k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        AnimatedBackgroundView animatedBackgroundView = d3().f215223b;
        AnimatedBackgroundType animatedBackgroundType = uiState.f25459b;
        i iVar = uiState.f25460c;
        animatedBackgroundView.setVisibility(animatedBackgroundType != null ? 0 : 8);
        AnimatedBackgroundType animatedBackgroundType2 = uiState.f25459b;
        if (animatedBackgroundType2 != null) {
            animatedBackgroundView.setBackgroundType(animatedBackgroundType2);
        }
        d3().d.setHeaderModel(uiState.f25458a);
        ActionFooterView actionFooterView = d3().f215224c;
        actionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.R = analyticsContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (q1) this.O.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (j) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        pd.b.p(view, new TextClause(this.K.f103620b.f102779b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        if (((Boolean) g.k.getValue()).booleanValue()) {
            mki.b bVarQ2 = q2();
            ActionFooterView screenPricingPlanInfoBottomSheetFooter = d3().f215224c;
            Intrinsics.checkNotNullExpressionValue(screenPricingPlanInfoBottomSheetFooter, "screenPricingPlanInfoBottomSheetFooter");
            ofm.q.K(bVarQ2, screenPricingPlanInfoBottomSheetFooter);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new cbf.c(rd0.e.b(d3().f215224c.f), 11), new cnk.h(this, null), 3);
        ViewController.P2(this, new cbf.c(rd0.e.b(d3().f215224c.f58955g), 12), new cnk.i(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f215224c.e), new ck7.j(this, null, 7), 3);
    }

    public final ngk.o d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ngk.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.Q.getValue();
    }
}
