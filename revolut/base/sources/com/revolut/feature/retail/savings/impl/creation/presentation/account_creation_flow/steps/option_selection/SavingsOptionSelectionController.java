package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.option_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.impl.R$id;
import com.revolut.feature.retail.savings.impl.R$layout;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.option_selection.SavingsOptionSelectionController;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.u;
import zhm.v;
import zlb.c;
import zlb.d;
import zlb.e;
import zlb.g;
import zlb.i;
import zlb.j;
import zlb.k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/option_selection/SavingsOptionSelectionController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzlb/d;", "Ldli/a;", "Lzlb/e;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsOptionSelectionController extends ViewController<d> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(SavingsOptionSelectionController.class, "binding", "getBinding()Lcom/revolut/feature/retail/savings/impl/databinding/ScreenSavingsOptionSelectionBinding;", 0))};
    public final Object K;
    public final Object L;
    public final int M;
    public final h N;
    public final Object O;
    public final FullScreenStateDelegate P;
    public final LargeActionButtonDelegate Q;
    public final RowDelegate R;
    public final Object S;

    public SavingsOptionSelectionController(SavingsOptionSelectionContract$InputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: zlb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsOptionSelectionController f323218b;

            {
                this.f323218b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SavingsOptionSelectionController savingsOptionSelectionController = this.f323218b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsOptionSelectionController.T;
                        return (c) ((rlb.h) savingsOptionSelectionController.L.getValue()).f254996g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsOptionSelectionController.T;
                        return (j60.a) ((rlb.h) savingsOptionSelectionController.L.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = SavingsOptionSelectionController.T;
                        SavingsOptionSelectionController savingsOptionSelectionController2 = this.f323218b;
                        return dli.f.a(savingsOptionSelectionController2, savingsOptionSelectionController2.R2(), v.k(savingsOptionSelectionController2.P, new RowLoadingDelegate(), savingsOptionSelectionController2.R), R$id.optionSelection_recyclerView, null, null, null, 56);
                }
            }
        });
        this.L = w.y0(new zk7.a(this, input, 3));
        this.M = R$layout.screen_savings_option_selection;
        this.N = s.t(this, g.f);
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: zlb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsOptionSelectionController f323218b;

            {
                this.f323218b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SavingsOptionSelectionController savingsOptionSelectionController = this.f323218b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsOptionSelectionController.T;
                        return (c) ((rlb.h) savingsOptionSelectionController.L.getValue()).f254996g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsOptionSelectionController.T;
                        return (j60.a) ((rlb.h) savingsOptionSelectionController.L.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = SavingsOptionSelectionController.T;
                        SavingsOptionSelectionController savingsOptionSelectionController2 = this.f323218b;
                        return dli.f.a(savingsOptionSelectionController2, savingsOptionSelectionController2.R2(), v.k(savingsOptionSelectionController2.P, new RowLoadingDelegate(), savingsOptionSelectionController2.R), R$id.optionSelection_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new FullScreenStateDelegate();
        this.Q = new LargeActionButtonDelegate();
        this.R = new RowDelegate(null, null, 7);
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: zlb.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsOptionSelectionController f323218b;

            {
                this.f323218b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SavingsOptionSelectionController savingsOptionSelectionController = this.f323218b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsOptionSelectionController.T;
                        return (c) ((rlb.h) savingsOptionSelectionController.L.getValue()).f254996g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsOptionSelectionController.T;
                        return (j60.a) ((rlb.h) savingsOptionSelectionController.L.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = SavingsOptionSelectionController.T;
                        SavingsOptionSelectionController savingsOptionSelectionController2 = this.f323218b;
                        return dli.f.a(savingsOptionSelectionController2, savingsOptionSelectionController2.R2(), v.k(savingsOptionSelectionController2.P, new RowLoadingDelegate(), savingsOptionSelectionController2.R), R$id.optionSelection_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        e uiState = (e) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().d;
        TextLocalisedClause textLocalisedClause = uiState.d;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        d3().f307114c.setTextClause(uiState.f323215b);
        d3().f307113b.setEnabled(uiState.f323216c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (rlb.h) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().d;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.savings_option_selection_subtitle, null, null, 14));
        ((j60.a) this.O.getValue()).d(u.c(this.Q));
        d3().f307113b.setEnabled(false);
        d3().f307113b.setText(new TextLocalisedClause(R$string.savings_onboarding_product_selection_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59410q), null, new zlb.h(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f52371h.f121375b), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f307113b.o), null, new zlb.h(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f307114c.f58608l), null, new ys.i(2, R2(), c.class, "onActionButtonDescriptionClick", "onActionButtonDescriptionClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", 4, 20), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f53218h), null, new j(2, 4, c.class, R2(), "onRowDelegateClick", "onRowDelegateClick(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.d.f121375b), null, new k(this, null), 3);
    }

    public final xmb.g d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (xmb.g) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final c R2() {
        return (c) this.K.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
