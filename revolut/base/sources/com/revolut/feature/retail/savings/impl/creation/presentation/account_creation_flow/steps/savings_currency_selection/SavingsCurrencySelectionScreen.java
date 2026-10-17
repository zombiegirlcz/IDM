package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.g;
import aw0.n6;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.impl.R$id;
import com.revolut.feature.retail.savings.impl.R$layout;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.savings_currency_selection.SavingsCurrencySelectionScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import efm.r;
import h30.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nmb.d;
import nmb.e;
import nmb.f;
import nmb.i;
import nmb.j;
import nmb.m;
import nmb.n;
import nmb.p;
import no.k;
import te0.w;
import tx0.j0;
import vc.s;
import vkm.q0;
import vlb.b;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/steps/savings_currency_selection/SavingsCurrencySelectionScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnmb/e;", "Ldli/a;", "Lnmb/j;", "Lno/k;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SavingsCurrencySelectionScreen extends ViewController<e> implements dli.a, k {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(SavingsCurrencySelectionScreen.class, "binding", "getBinding()Lcom/revolut/feature/retail/savings/impl/databinding/ScreenSavingsCurrencySelectionBinding;", 0))};
    public final RowDelegate K;
    public final FullScreenStateDelegate L;
    public final LargeActionButtonDelegate M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public AnalyticsContext R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final int V;

    public SavingsCurrencySelectionScreen(SavingsCurrencySelectionContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = new RowDelegate(null, null, 7);
        this.L = new FullScreenStateDelegate();
        this.M = new LargeActionButtonDelegate();
        this.N = s.t(this, m.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: nmb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsCurrencySelectionScreen f217251b;

            {
                this.f217251b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SavingsCurrencySelectionScreen savingsCurrencySelectionScreen = this.f217251b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsCurrencySelectionScreen.W;
                        return savingsCurrencySelectionScreen.d3().f307111c;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsCurrencySelectionScreen.W;
                        return savingsCurrencySelectionScreen.d3().d;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsCurrencySelectionScreen.W;
                        return (j60.a) ((rlb.f) savingsCurrencySelectionScreen.S.getValue()).f.get();
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsCurrencySelectionScreen.W;
                        return (g) ((rlb.f) savingsCurrencySelectionScreen.S.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr5 = SavingsCurrencySelectionScreen.W;
                        SavingsCurrencySelectionScreen savingsCurrencySelectionScreen2 = this.f217251b;
                        return dli.f.a(savingsCurrencySelectionScreen2, savingsCurrencySelectionScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), savingsCurrencySelectionScreen2.L, savingsCurrencySelectionScreen2.K, new ListSubheaderDelegate()), R$id.currencySelection_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: nmb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsCurrencySelectionScreen f217251b;

            {
                this.f217251b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SavingsCurrencySelectionScreen savingsCurrencySelectionScreen = this.f217251b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsCurrencySelectionScreen.W;
                        return savingsCurrencySelectionScreen.d3().f307111c;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsCurrencySelectionScreen.W;
                        return savingsCurrencySelectionScreen.d3().d;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsCurrencySelectionScreen.W;
                        return (j60.a) ((rlb.f) savingsCurrencySelectionScreen.S.getValue()).f.get();
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsCurrencySelectionScreen.W;
                        return (g) ((rlb.f) savingsCurrencySelectionScreen.S.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr5 = SavingsCurrencySelectionScreen.W;
                        SavingsCurrencySelectionScreen savingsCurrencySelectionScreen2 = this.f217251b;
                        return dli.f.a(savingsCurrencySelectionScreen2, savingsCurrencySelectionScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), savingsCurrencySelectionScreen2.L, savingsCurrencySelectionScreen2.K, new ListSubheaderDelegate()), R$id.currencySelection_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: nmb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsCurrencySelectionScreen f217251b;

            {
                this.f217251b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SavingsCurrencySelectionScreen savingsCurrencySelectionScreen = this.f217251b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsCurrencySelectionScreen.W;
                        return savingsCurrencySelectionScreen.d3().f307111c;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsCurrencySelectionScreen.W;
                        return savingsCurrencySelectionScreen.d3().d;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsCurrencySelectionScreen.W;
                        return (j60.a) ((rlb.f) savingsCurrencySelectionScreen.S.getValue()).f.get();
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsCurrencySelectionScreen.W;
                        return (g) ((rlb.f) savingsCurrencySelectionScreen.S.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr5 = SavingsCurrencySelectionScreen.W;
                        SavingsCurrencySelectionScreen savingsCurrencySelectionScreen2 = this.f217251b;
                        return dli.f.a(savingsCurrencySelectionScreen2, savingsCurrencySelectionScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), savingsCurrencySelectionScreen2.L, savingsCurrencySelectionScreen2.K, new ListSubheaderDelegate()), R$id.currencySelection_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = new AnalyticsContext(b.a(inputData.f83318a));
        this.S = w.y0(new ni1.a(this, inputData, 6));
        final int i5 = 3;
        this.T = w.y0(new Function0(this) { // from class: nmb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsCurrencySelectionScreen f217251b;

            {
                this.f217251b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                SavingsCurrencySelectionScreen savingsCurrencySelectionScreen = this.f217251b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsCurrencySelectionScreen.W;
                        return savingsCurrencySelectionScreen.d3().f307111c;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsCurrencySelectionScreen.W;
                        return savingsCurrencySelectionScreen.d3().d;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsCurrencySelectionScreen.W;
                        return (j60.a) ((rlb.f) savingsCurrencySelectionScreen.S.getValue()).f.get();
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsCurrencySelectionScreen.W;
                        return (g) ((rlb.f) savingsCurrencySelectionScreen.S.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr5 = SavingsCurrencySelectionScreen.W;
                        SavingsCurrencySelectionScreen savingsCurrencySelectionScreen2 = this.f217251b;
                        return dli.f.a(savingsCurrencySelectionScreen2, savingsCurrencySelectionScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), savingsCurrencySelectionScreen2.L, savingsCurrencySelectionScreen2.K, new ListSubheaderDelegate()), R$id.currencySelection_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.U = w.y0(new Function0(this) { // from class: nmb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SavingsCurrencySelectionScreen f217251b;

            {
                this.f217251b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                SavingsCurrencySelectionScreen savingsCurrencySelectionScreen = this.f217251b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SavingsCurrencySelectionScreen.W;
                        return savingsCurrencySelectionScreen.d3().f307111c;
                    case 1:
                        KProperty[] kPropertyArr2 = SavingsCurrencySelectionScreen.W;
                        return savingsCurrencySelectionScreen.d3().d;
                    case 2:
                        KProperty[] kPropertyArr3 = SavingsCurrencySelectionScreen.W;
                        return (j60.a) ((rlb.f) savingsCurrencySelectionScreen.S.getValue()).f.get();
                    case 3:
                        KProperty[] kPropertyArr4 = SavingsCurrencySelectionScreen.W;
                        return (g) ((rlb.f) savingsCurrencySelectionScreen.S.getValue()).i.get();
                    default:
                        KProperty[] kPropertyArr5 = SavingsCurrencySelectionScreen.W;
                        SavingsCurrencySelectionScreen savingsCurrencySelectionScreen2 = this.f217251b;
                        return dli.f.a(savingsCurrencySelectionScreen2, savingsCurrencySelectionScreen2.R2(), zhm.v.k(new RowLoadingDelegate(), savingsCurrencySelectionScreen2.L, savingsCurrencySelectionScreen2.K, new ListSubheaderDelegate()), R$id.currencySelection_recyclerView, null, null, null, 56);
                }
            }
        });
        this.V = R$layout.screen_savings_currency_selection;
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        i iVar = qVar instanceof i ? (i) qVar : null;
        if (iVar == null || iVar.f217245a) {
            d dVar = uiState.f217248b;
            if (dVar.f217238a) {
                ActionFooterView currencySelectionActionFooter = d3().f307110b;
                Intrinsics.checkNotNullExpressionValue(currencySelectionActionFooter, "currencySelectionActionFooter");
                currencySelectionActionFooter.setVisibility(0);
                ActionFooterView actionFooterView = d3().f307110b;
                TextLocalisedClause textLocalisedClause = dVar.f217240c;
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
                n6 n6Var = new n6(textLocalisedClause, defaultFilledButton, null, null, false, null, f.NEXT_CTA, 508);
                actionFooterView.setModel(dVar.d ? new g(true, new n6(null, defaultFilledButton, dVar.e, null, false, null, f.ADDITIONAL_CTA, 504), n6Var, dVar.f217239b, aw0.f.SMALL_PRIMARY_BUTTON) : new aw0.e(true, dVar.f217239b, null, n6Var, null, null, 52));
            } else {
                ActionFooterView currencySelectionActionFooter2 = d3().f307110b;
                Intrinsics.checkNotNullExpressionValue(currencySelectionActionFooter2, "currencySelectionActionFooter");
                currencySelectionActionFooter2.setVisibility(8);
            }
        }
        if (iVar == null || iVar.f217246b) {
            NavBarWithToolbar navBarWithToolbarF3 = f3();
            nmb.h hVar = uiState.f217249c;
            TextLocalisedClause textLocalisedClause2 = hVar.f217242a;
            navBarWithToolbarF3.setTitle(textLocalisedClause2, null);
            navBarWithToolbarF3.setToolbarTitle(textLocalisedClause2);
            navBarWithToolbarF3.setSecondDescriptionText(hVar.f217243b);
            if (hVar.f217244c) {
                navBarWithToolbarF3.setHints(u.c(new TextLocalisedClause(R$string.savings_select_currency_screen_search, null, null, 14)));
                navBarWithToolbarF3.setSearchButtonActive(true);
                navBarWithToolbarF3.setExpanded(true);
            }
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
        return (rlb.f) this.S.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbarF3 = f3();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.vaults.R$string.mmf_choose_a_currency_title, null, null, 14);
        navBarWithToolbarF3.setTitle(textLocalisedClause, null);
        navBarWithToolbarF3.setToolbarTitle(textLocalisedClause);
        navBarWithToolbarF3.setSecondDescriptionVisible(true);
        navBarWithToolbarF3.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbarF3.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        ((j60.a) this.Q.getValue()).d(u.c(this.M));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().f59410q), null, new n(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.K.f53218h), null, new nmb.o(2, 4, nmb.g.class, R2(), "onRowDelegateItemClick", "onRowDelegateItemClick(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        com.revolut.kompot.navigable.a.g2(this, l.y(d3().f307110b.f, d3().f307110b.f58955g, "merge(...)"), null, new p(this, continuation, 0), 3);
        r rVarMerge = r.merge(f3().x0(), d3().f307110b.e);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        int i = 4;
        int i2 = 2;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rVarMerge), null, new mc9.n(i2, R2(), nmb.g.class, "onClauseDataClick", "onClauseDataClick(Lcom/revolut/core/ui_kit_core/clause/ClauseDisplayer$ClickData;)V", i, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(f3().f59409p.f57337m), null, new p(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, new q0(rd0.e.b(f3().X0), new mc9.n(i2, R2(), nmb.g.class, "onSearchFieldVisibilityChanged", "onSearchFieldVisibilityChanged(Z)V", i, 29), 1), null, new n(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.d.f121375b), null, new nmb.q(this, null), 3);
    }

    public final xmb.f d3() {
        ViewBinding value = this.N.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (xmb.f) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final nmb.g R2() {
        return (nmb.g) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final NavBarWithToolbar f3() {
        return (NavBarWithToolbar) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.U.getValue();
    }
}
