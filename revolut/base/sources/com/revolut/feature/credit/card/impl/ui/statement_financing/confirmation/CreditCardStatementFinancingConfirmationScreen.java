package com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation;

import aee.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ay4.f;
import bu7.y;
import buf.u;
import bw4.d;
import bw4.j;
import bw4.l;
import bw4.n;
import bw4.p;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.statement_financing.confirmation.CreditCardStatementFinancingConfirmationScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import ep4.b;
import jm4.p2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.j0;
import vc.s;
import w01.k;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement_financing/confirmation/CreditCardStatementFinancingConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbw4/j;", "Ldli/a;", "Lbw4/p;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardStatementFinancingConfirmationScreen extends ViewController<j> implements dli.a, m {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CreditCardStatementFinancingConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final /* synthetic */ b K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final h R;
    public final Object S;
    public final Object T;
    public final Object U;

    public CreditCardStatementFinancingConfirmationScreen(CreditCardStatementFinancingConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = w.y0(new y(9));
        this.N = w.y0(new y(10));
        this.O = w.y0(new y(11));
        this.P = w.y0(new y(12));
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: bw4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementFinancingConfirmationScreen f19220b;

            {
                this.f19220b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardStatementFinancingConfirmationScreen creditCardStatementFinancingConfirmationScreen = this.f19220b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementFinancingConfirmationScreen.V;
                        CreditCardStatementFinancingConfirmationScreen creditCardStatementFinancingConfirmationScreen2 = this.f19220b;
                        return dli.f.a(creditCardStatementFinancingConfirmationScreen2, (k) creditCardStatementFinancingConfirmationScreen2.T.getValue(), zhm.v.k((RowDelegate) creditCardStatementFinancingConfirmationScreen2.M.getValue(), (CellDetailsDelegate) creditCardStatementFinancingConfirmationScreen2.N.getValue(), (FullScreenStateDelegate) creditCardStatementFinancingConfirmationScreen2.O.getValue(), new ListSubheaderDelegate(), new ProductSelectionDelegate(), new ProgressStepVerticalV2Delegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementFinancingConfirmationScreen.V;
                        return (k) ((p2) creditCardStatementFinancingConfirmationScreen.S.getValue()).f176251h.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementFinancingConfirmationScreen.V;
                        return (j60.a) ((p2) creditCardStatementFinancingConfirmationScreen.S.getValue()).e.get();
                }
            }
        });
        this.R = s.t(this, bw4.b.f);
        this.S = w.y0(new u(this, inputData, 3));
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: bw4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementFinancingConfirmationScreen f19220b;

            {
                this.f19220b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardStatementFinancingConfirmationScreen creditCardStatementFinancingConfirmationScreen = this.f19220b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementFinancingConfirmationScreen.V;
                        CreditCardStatementFinancingConfirmationScreen creditCardStatementFinancingConfirmationScreen2 = this.f19220b;
                        return dli.f.a(creditCardStatementFinancingConfirmationScreen2, (k) creditCardStatementFinancingConfirmationScreen2.T.getValue(), zhm.v.k((RowDelegate) creditCardStatementFinancingConfirmationScreen2.M.getValue(), (CellDetailsDelegate) creditCardStatementFinancingConfirmationScreen2.N.getValue(), (FullScreenStateDelegate) creditCardStatementFinancingConfirmationScreen2.O.getValue(), new ListSubheaderDelegate(), new ProductSelectionDelegate(), new ProgressStepVerticalV2Delegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementFinancingConfirmationScreen.V;
                        return (k) ((p2) creditCardStatementFinancingConfirmationScreen.S.getValue()).f176251h.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementFinancingConfirmationScreen.V;
                        return (j60.a) ((p2) creditCardStatementFinancingConfirmationScreen.S.getValue()).e.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: bw4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementFinancingConfirmationScreen f19220b;

            {
                this.f19220b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardStatementFinancingConfirmationScreen creditCardStatementFinancingConfirmationScreen = this.f19220b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementFinancingConfirmationScreen.V;
                        CreditCardStatementFinancingConfirmationScreen creditCardStatementFinancingConfirmationScreen2 = this.f19220b;
                        return dli.f.a(creditCardStatementFinancingConfirmationScreen2, (k) creditCardStatementFinancingConfirmationScreen2.T.getValue(), zhm.v.k((RowDelegate) creditCardStatementFinancingConfirmationScreen2.M.getValue(), (CellDetailsDelegate) creditCardStatementFinancingConfirmationScreen2.N.getValue(), (FullScreenStateDelegate) creditCardStatementFinancingConfirmationScreen2.O.getValue(), new ListSubheaderDelegate(), new ProductSelectionDelegate(), new ProgressStepVerticalV2Delegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementFinancingConfirmationScreen.V;
                        return (k) ((p2) creditCardStatementFinancingConfirmationScreen.S.getValue()).f176251h.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementFinancingConfirmationScreen.V;
                        return (j60.a) ((p2) creditCardStatementFinancingConfirmationScreen.S.getValue()).e.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        bw4.o oVar2 = uiState.f19233b;
        if ((oVar2 instanceof bw4.m) || (oVar2 instanceof n)) {
            LargeActionButton goToButton = d3().f174564b;
            Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
            k.a(goToButton);
        } else {
            if (!(oVar2 instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            d3().f174564b.setText(((l) oVar2).f19229a);
            LargeActionButton goToButton2 = d3().f174564b;
            Intrinsics.checkNotNullExpressionValue(goToButton2, "goToButton");
            k.d(goToButton2);
        }
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
        return (p2) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (bw4.k) this.T.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.U.getValue()).d(v.k((LargeActionButtonDelegate) this.P.getValue(), (CellDetailsDelegate) this.N.getValue()));
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_card_statement_financing_confirmation_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_card_statement_financing_confirmation_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ?? r152 = this.N;
        com.revolut.kompot.navigable.a.g2(this, new f(vkm.q.J(rd0.e.b(((CellDetailsDelegate) r152.getValue()).f), rd0.e.b(((CellDetailsDelegate) r152.getValue()).d), rd0.e.b(((LargeActionButtonDelegate) this.P.getValue()).d.f121375b), rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), rd0.e.b(((RowDelegate) this.M.getValue()).f53218h)), yx4.b.Companion, 3), null, new g(2, (bw4.k) this.T.getValue(), bw4.k.class, "onItemClicked", "onItemClicked(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 17), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new d(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.R.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Q.getValue();
    }
}
