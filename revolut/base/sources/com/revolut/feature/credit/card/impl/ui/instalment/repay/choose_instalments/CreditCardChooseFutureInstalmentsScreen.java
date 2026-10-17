package com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputSliderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.CreditCardChooseFutureInstalmentsScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.CreditCardChooseFutureInstalmentsScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ep4.b;
import jii.u;
import jm4.a2;
import jm4.a3;
import jm4.r0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.j0;
import u36.g;
import urd.n;
import us4.c;
import us4.i;
import us4.j;
import us4.k;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/choose_instalments/CreditCardChooseFutureInstalmentsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lus4/i;", "Ldli/a;", "Lus4/m;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardChooseFutureInstalmentsScreen extends ViewController<i> implements dli.a, m {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(CreditCardChooseFutureInstalmentsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final /* synthetic */ b K;
    public final CreditCardChooseFutureInstalmentsScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final h U;
    public final Object V;

    public CreditCardChooseFutureInstalmentsScreen(CreditCardChooseFutureInstalmentsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: us4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardChooseFutureInstalmentsScreen f282417b;

            {
                this.f282417b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardChooseFutureInstalmentsScreen creditCardChooseFutureInstalmentsScreen = this.f282417b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardChooseFutureInstalmentsScreen.W;
                        return (j) ((r0) creditCardChooseFutureInstalmentsScreen.V.getValue()).f176309c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardChooseFutureInstalmentsScreen.W;
                        CreditCardChooseFutureInstalmentsScreen creditCardChooseFutureInstalmentsScreen2 = this.f282417b;
                        return dli.f.a(creditCardChooseFutureInstalmentsScreen2, (j) creditCardChooseFutureInstalmentsScreen2.N.getValue(), v.k(new RowLoadingDelegate(), new InputSliderLoadingDelegate(), new ListSubheaderDelegate(), new ProductSelectionDelegate(), (FullScreenStateDelegate) creditCardChooseFutureInstalmentsScreen2.O.getValue(), (SuggestionsBarDelegate) creditCardChooseFutureInstalmentsScreen2.R.getValue(), (CellDetailsDelegate) creditCardChooseFutureInstalmentsScreen2.Q.getValue(), (VaultsProgressDelegate) creditCardChooseFutureInstalmentsScreen2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardChooseFutureInstalmentsScreen.W;
                        qji.b bVarU2 = creditCardChooseFutureInstalmentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.di.CreditCardChooseFutureInstalmentsScreenInjector");
                        a2 a2Var = (a2) bVarU2;
                        a3 a3Var = a2Var.f175961b;
                        a2 a2Var2 = a2Var.f175962c;
                        CreditCardChooseFutureInstalmentsScreenContract$InputData creditCardChooseFutureInstalmentsScreenContract$InputData = creditCardChooseFutureInstalmentsScreen.L;
                        creditCardChooseFutureInstalmentsScreenContract$InputData.getClass();
                        return new r0(a3Var, a2Var2, creditCardChooseFutureInstalmentsScreenContract$InputData);
                }
            }
        });
        this.O = w.y0(new ujb.v(26));
        this.P = w.y0(new ujb.v(27));
        this.Q = w.y0(new ujb.v(28));
        this.R = w.y0(new ujb.v(29));
        this.S = w.y0(new us4.b(0));
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: us4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardChooseFutureInstalmentsScreen f282417b;

            {
                this.f282417b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardChooseFutureInstalmentsScreen creditCardChooseFutureInstalmentsScreen = this.f282417b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardChooseFutureInstalmentsScreen.W;
                        return (j) ((r0) creditCardChooseFutureInstalmentsScreen.V.getValue()).f176309c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardChooseFutureInstalmentsScreen.W;
                        CreditCardChooseFutureInstalmentsScreen creditCardChooseFutureInstalmentsScreen2 = this.f282417b;
                        return dli.f.a(creditCardChooseFutureInstalmentsScreen2, (j) creditCardChooseFutureInstalmentsScreen2.N.getValue(), v.k(new RowLoadingDelegate(), new InputSliderLoadingDelegate(), new ListSubheaderDelegate(), new ProductSelectionDelegate(), (FullScreenStateDelegate) creditCardChooseFutureInstalmentsScreen2.O.getValue(), (SuggestionsBarDelegate) creditCardChooseFutureInstalmentsScreen2.R.getValue(), (CellDetailsDelegate) creditCardChooseFutureInstalmentsScreen2.Q.getValue(), (VaultsProgressDelegate) creditCardChooseFutureInstalmentsScreen2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardChooseFutureInstalmentsScreen.W;
                        qji.b bVarU2 = creditCardChooseFutureInstalmentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.di.CreditCardChooseFutureInstalmentsScreenInjector");
                        a2 a2Var = (a2) bVarU2;
                        a3 a3Var = a2Var.f175961b;
                        a2 a2Var2 = a2Var.f175962c;
                        CreditCardChooseFutureInstalmentsScreenContract$InputData creditCardChooseFutureInstalmentsScreenContract$InputData = creditCardChooseFutureInstalmentsScreen.L;
                        creditCardChooseFutureInstalmentsScreenContract$InputData.getClass();
                        return new r0(a3Var, a2Var2, creditCardChooseFutureInstalmentsScreenContract$InputData);
                }
            }
        });
        this.U = s.t(this, c.f);
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: us4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardChooseFutureInstalmentsScreen f282417b;

            {
                this.f282417b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardChooseFutureInstalmentsScreen creditCardChooseFutureInstalmentsScreen = this.f282417b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardChooseFutureInstalmentsScreen.W;
                        return (j) ((r0) creditCardChooseFutureInstalmentsScreen.V.getValue()).f176309c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardChooseFutureInstalmentsScreen.W;
                        CreditCardChooseFutureInstalmentsScreen creditCardChooseFutureInstalmentsScreen2 = this.f282417b;
                        return dli.f.a(creditCardChooseFutureInstalmentsScreen2, (j) creditCardChooseFutureInstalmentsScreen2.N.getValue(), v.k(new RowLoadingDelegate(), new InputSliderLoadingDelegate(), new ListSubheaderDelegate(), new ProductSelectionDelegate(), (FullScreenStateDelegate) creditCardChooseFutureInstalmentsScreen2.O.getValue(), (SuggestionsBarDelegate) creditCardChooseFutureInstalmentsScreen2.R.getValue(), (CellDetailsDelegate) creditCardChooseFutureInstalmentsScreen2.Q.getValue(), (VaultsProgressDelegate) creditCardChooseFutureInstalmentsScreen2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardChooseFutureInstalmentsScreen.W;
                        qji.b bVarU2 = creditCardChooseFutureInstalmentsScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.choose_instalments.di.CreditCardChooseFutureInstalmentsScreenInjector");
                        a2 a2Var = (a2) bVarU2;
                        a3 a3Var = a2Var.f175961b;
                        a2 a2Var2 = a2Var.f175962c;
                        CreditCardChooseFutureInstalmentsScreenContract$InputData creditCardChooseFutureInstalmentsScreenContract$InputData = creditCardChooseFutureInstalmentsScreen.L;
                        creditCardChooseFutureInstalmentsScreenContract$InputData.getClass();
                        return new r0(a3Var, a2Var2, creditCardChooseFutureInstalmentsScreenContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        us4.m uiState = (us4.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        d3().f174565c.setSecondDescriptionText(uiState.f282432a.f282431a);
        k kVar = uiState.f282434c;
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(kVar.f282429a);
        w01.k.e(largeActionButton, kVar.f282430b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (r0) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_card_instalment_repay_choose_future_instalments_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_card_instalment_repay_choose_future_instalments_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new ss4.h(vkm.q.J(new n(rd0.e.b(d3().f174565c.f59410q), 1), new n(rd0.e.b(d3().f174564b.o), 2), rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), rd0.e.b(((CellDetailsDelegate) this.Q.getValue()).f), rd0.e.b(((SuggestionsBarDelegate) this.R.getValue()).p().d), rd0.e.b(((LargeActionButtonDelegate) this.P.getValue()).d.f121375b)), yx4.b.Companion, 4), new g(2, (j) this.N.getValue(), j.class, "onItemClick", "onItemClick(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 4), 3);
    }

    public final u d3() {
        ViewBinding value = this.U.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
