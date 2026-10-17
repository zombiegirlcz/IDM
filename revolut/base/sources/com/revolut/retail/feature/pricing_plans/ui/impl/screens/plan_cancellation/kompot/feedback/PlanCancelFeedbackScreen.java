package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.feedback;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.feedback.PlanCancelFeedbackScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.feedback.PlanCancelFeedbackScreenContract$InputData;
import dli.a;
import efm.r;
import jii.t;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import olk.b;
import olk.c;
import olk.d;
import olk.f;
import olk.i;
import qgk.i0;
import qgk.v;
import qgk.x;
import te0.w;
import vc.s;
import xki.e;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_cancellation/kompot/feedback/PlanCancelFeedbackScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lolk/f;", "Ldli/a;", "Lolk/i;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanCancelFeedbackScreen extends ViewController<f> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(PlanCancelFeedbackScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterTwoButtonsBinding;", 0))};
    public final PlanCancelFeedbackScreenContract$InputData K;
    public final h L;
    public final int M;
    public final Lazy N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public PlanCancelFeedbackScreen(PlanCancelFeedbackScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = R$layout.screen_recycler_navbar_footer_two_buttons;
        this.N = j.b(new ok7.b(14));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: olk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanCancelFeedbackScreen f226437b;

            {
                this.f226437b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlanCancelFeedbackScreen planCancelFeedbackScreen = this.f226437b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanCancelFeedbackScreen.R;
                        PlanCancelFeedbackScreen planCancelFeedbackScreen2 = this.f226437b;
                        return dli.f.a(planCancelFeedbackScreen2, (h) planCancelFeedbackScreen2.Q.getValue(), u.c((InputTextDelegate) planCancelFeedbackScreen2.N.getValue()), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanCancelFeedbackScreen.R;
                        qji.b bVarU2 = planCancelFeedbackScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.feedback.di.PlanCancelFeedbackScreenInjector");
                        x xVar = (x) ((flk.a) bVarU2);
                        i0 i0Var = xVar.f246312b;
                        x xVar2 = xVar.f246313c;
                        PlanCancelFeedbackScreenContract$InputData planCancelFeedbackScreenContract$InputData = planCancelFeedbackScreen.K;
                        planCancelFeedbackScreenContract$InputData.getClass();
                        return new v(i0Var, xVar2, planCancelFeedbackScreen, planCancelFeedbackScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanCancelFeedbackScreen.R;
                        return (h) ((v) planCancelFeedbackScreen.P.getValue()).f246284h.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: olk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanCancelFeedbackScreen f226437b;

            {
                this.f226437b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlanCancelFeedbackScreen planCancelFeedbackScreen = this.f226437b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanCancelFeedbackScreen.R;
                        PlanCancelFeedbackScreen planCancelFeedbackScreen2 = this.f226437b;
                        return dli.f.a(planCancelFeedbackScreen2, (h) planCancelFeedbackScreen2.Q.getValue(), u.c((InputTextDelegate) planCancelFeedbackScreen2.N.getValue()), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanCancelFeedbackScreen.R;
                        qji.b bVarU2 = planCancelFeedbackScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.feedback.di.PlanCancelFeedbackScreenInjector");
                        x xVar = (x) ((flk.a) bVarU2);
                        i0 i0Var = xVar.f246312b;
                        x xVar2 = xVar.f246313c;
                        PlanCancelFeedbackScreenContract$InputData planCancelFeedbackScreenContract$InputData = planCancelFeedbackScreen.K;
                        planCancelFeedbackScreenContract$InputData.getClass();
                        return new v(i0Var, xVar2, planCancelFeedbackScreen, planCancelFeedbackScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanCancelFeedbackScreen.R;
                        return (h) ((v) planCancelFeedbackScreen.P.getValue()).f246284h.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: olk.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanCancelFeedbackScreen f226437b;

            {
                this.f226437b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PlanCancelFeedbackScreen planCancelFeedbackScreen = this.f226437b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PlanCancelFeedbackScreen.R;
                        PlanCancelFeedbackScreen planCancelFeedbackScreen2 = this.f226437b;
                        return dli.f.a(planCancelFeedbackScreen2, (h) planCancelFeedbackScreen2.Q.getValue(), u.c((InputTextDelegate) planCancelFeedbackScreen2.N.getValue()), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = PlanCancelFeedbackScreen.R;
                        qji.b bVarU2 = planCancelFeedbackScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.feedback.di.PlanCancelFeedbackScreenInjector");
                        x xVar = (x) ((flk.a) bVarU2);
                        i0 i0Var = xVar.f246312b;
                        x xVar2 = xVar.f246313c;
                        PlanCancelFeedbackScreenContract$InputData planCancelFeedbackScreenContract$InputData = planCancelFeedbackScreen.K;
                        planCancelFeedbackScreenContract$InputData.getClass();
                        return new v(i0Var, xVar2, planCancelFeedbackScreen, planCancelFeedbackScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = PlanCancelFeedbackScreen.R;
                        return (h) ((v) planCancelFeedbackScreen.P.getValue()).f246284h.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f174560b.setText(uiState.f226444b);
        d3().f.setText(uiState.f226445c);
        d3().d.setTextClause(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (olk.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174562g;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.plan_downgrade_feedback_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.plan_downgrade_feedback_subtitle, null, null, 14));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f.o(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174562g.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174560b.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f.o), null, new c(this, null, 2), 3);
        r rVarDistinctUntilChanged = ((InputTextDelegate) this.N.getValue()).e.f121375b.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarDistinctUntilChanged), null, new d(this, null), 3);
    }

    public final t d3() {
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (t) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
