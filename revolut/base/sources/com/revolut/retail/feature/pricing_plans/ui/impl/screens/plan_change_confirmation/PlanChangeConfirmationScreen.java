package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_change_confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_change_confirmation.PlanChangeConfirmationScreen;
import dli.a;
import dli.c;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import qgk.y;
import te0.w;
import ulk.e;
import ulk.f;
import ulk.i;
import ulk.n;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_change_confirmation/PlanChangeConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lulk/i;", "Ldli/a;", "Lulk/n;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanChangeConfirmationScreen extends ViewController<i> implements a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(PlanChangeConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int K;
    public final Object L;
    public final h M;
    public final Object N;
    public final Object O;

    public PlanChangeConfirmationScreen(PlanChangeConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ulk.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanChangeConfirmationScreen f281032b;

            {
                this.f281032b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = PlanChangeConfirmationScreen.P;
                        PlanChangeConfirmationScreen planChangeConfirmationScreen = this.f281032b;
                        return dli.f.a(planChangeConfirmationScreen, (q) planChangeConfirmationScreen.O.getValue(), v.k(new FullScreenStateDelegate(), new CellDetailsDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PlanChangeConfirmationScreen.P;
                        return (q) ((y) this.f281032b.N.getValue()).f246329c.get();
                }
            }
        });
        this.M = s.t(this, e.f);
        this.N = w.y0(new uj7.a(this, inputData, 5));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ulk.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PlanChangeConfirmationScreen f281032b;

            {
                this.f281032b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PlanChangeConfirmationScreen.P;
                        PlanChangeConfirmationScreen planChangeConfirmationScreen = this.f281032b;
                        return dli.f.a(planChangeConfirmationScreen, (q) planChangeConfirmationScreen.O.getValue(), v.k(new FullScreenStateDelegate(), new CellDetailsDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PlanChangeConfirmationScreen.P;
                        return (q) ((y) this.f281032b.N.getValue()).f246329c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f281041a;
        Clause clause = uiState.d;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        Clause clause2 = uiState.f281042b;
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
        navBarWithToolbar.setDescriptionText(clause2);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setVisibility(clause == null ? 8 : 0);
        largeActionButton.setText(clause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (y) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (ulk.q) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        LargeActionButton goToButton = d3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new f(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new f(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getC0() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.L.getValue();
    }
}
