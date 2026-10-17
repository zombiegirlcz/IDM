package com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ay4.f;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.choose_instalments.CreditCardChooseInstalmentsScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import ep4.b;
import jii.u;
import jm4.f4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lkf.f0;
import ls4.d;
import ls4.i;
import ls4.j;
import ls4.k;
import ls4.l;
import no.m;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/anticipation/choose_instalments/CreditCardChooseInstalmentsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lls4/i;", "Ldli/a;", "Lls4/l;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardChooseInstalmentsScreen extends ViewController<i> implements dli.a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CreditCardChooseInstalmentsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final /* synthetic */ b K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final h S;
    public final Object T;

    public CreditCardChooseInstalmentsScreen(CreditCardChooseInstalmentsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: ls4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardChooseInstalmentsScreen f199609b;

            {
                this.f199609b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardChooseInstalmentsScreen.U;
                        f4 f4Var = (f4) this.f199609b.T.getValue();
                        switch (f4Var.f176078a) {
                            case 0:
                                return (j) f4Var.d.get();
                            default:
                                return (j) f4Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = CreditCardChooseInstalmentsScreen.U;
                        CreditCardChooseInstalmentsScreen creditCardChooseInstalmentsScreen = this.f199609b;
                        return dli.f.a(creditCardChooseInstalmentsScreen, (j) creditCardChooseInstalmentsScreen.M.getValue(), v.k(new RowLoadingDelegate(), new TextDelegate(), (FullScreenStateDelegate) creditCardChooseInstalmentsScreen.N.getValue(), (CellDetailsDelegate) creditCardChooseInstalmentsScreen.P.getValue(), (SuggestionsBarDelegate) creditCardChooseInstalmentsScreen.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = w.y0(new f0(12));
        this.O = w.y0(new f0(13));
        this.P = w.y0(new f0(14));
        this.Q = w.y0(new f0(15));
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: ls4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardChooseInstalmentsScreen f199609b;

            {
                this.f199609b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardChooseInstalmentsScreen.U;
                        f4 f4Var = (f4) this.f199609b.T.getValue();
                        switch (f4Var.f176078a) {
                            case 0:
                                return (j) f4Var.d.get();
                            default:
                                return (j) f4Var.d.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = CreditCardChooseInstalmentsScreen.U;
                        CreditCardChooseInstalmentsScreen creditCardChooseInstalmentsScreen = this.f199609b;
                        return dli.f.a(creditCardChooseInstalmentsScreen, (j) creditCardChooseInstalmentsScreen.M.getValue(), v.k(new RowLoadingDelegate(), new TextDelegate(), (FullScreenStateDelegate) creditCardChooseInstalmentsScreen.N.getValue(), (CellDetailsDelegate) creditCardChooseInstalmentsScreen.P.getValue(), (SuggestionsBarDelegate) creditCardChooseInstalmentsScreen.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.S = s.t(this, ls4.b.f);
        this.T = w.y0(new lea.b(this, inputData, 24));
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        k kVar = uiState.f199622b;
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(kVar.f199619a);
        w01.k.e(largeActionButton, kVar.f199620b);
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
        return (f4) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_card_anticipation_select_instalment_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_card_anticipation_select_instalment_title, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.credit_card_anticipation_select_instalment_subtitle, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new f(vkm.q.J(rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), rd0.e.b(((CellDetailsDelegate) this.P.getValue()).f), rd0.e.b(((LargeActionButtonDelegate) this.O.getValue()).d.f121375b), rd0.e.b(((SuggestionsBarDelegate) this.Q.getValue()).p().d)), yx4.b.Companion, 16), new jl6.b(2, (j) this.M.getValue(), j.class, "onItemClick", "onItemClick(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 22), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new d(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.S.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
