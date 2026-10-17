package com.revolut.feature.credit.card.impl.ui.statement_financing.setup;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ay4.f;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AppTipDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PickerDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarCellDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.statement_financing.setup.CreditCardStatementFinancingSetupScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ip0.md;
import iw4.m;
import iw4.n;
import iw4.p;
import jii.u;
import jm4.s2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import vkm.d;
import w01.k;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement_financing/setup/CreditCardStatementFinancingSetupScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Liw4/m;", "Ldli/a;", "Liw4/p;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardStatementFinancingSetupScreen extends ViewController<m> implements dli.a, no.m {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(CreditCardStatementFinancingSetupScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final /* synthetic */ ep4.b K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final h V;
    public final Object W;
    public final Object X;
    public final Object Y;

    public CreditCardStatementFinancingSetupScreen(CreditCardStatementFinancingSetupScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = ep4.b.f128075a;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = w.y0(new is7.b(29));
        this.N = w.y0(new iw4.b(0));
        this.O = w.y0(new iw4.b(1));
        this.P = w.y0(new iw4.b(2));
        this.Q = w.y0(new iw4.b(3));
        this.R = w.y0(new iw4.b(4));
        this.S = w.y0(new iw4.b(5));
        this.T = w.y0(new iw4.b(6));
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: iw4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementFinancingSetupScreen f168937b;

            {
                this.f168937b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardStatementFinancingSetupScreen creditCardStatementFinancingSetupScreen = this.f168937b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementFinancingSetupScreen.Z;
                        CreditCardStatementFinancingSetupScreen creditCardStatementFinancingSetupScreen2 = this.f168937b;
                        return dli.f.a(creditCardStatementFinancingSetupScreen2, creditCardStatementFinancingSetupScreen2.R2(), v.k((FullScreenStateDelegate) creditCardStatementFinancingSetupScreen2.M.getValue(), (CellDetailsActionDelegate) creditCardStatementFinancingSetupScreen2.P.getValue(), (AppTipDelegate) creditCardStatementFinancingSetupScreen2.Q.getValue(), (SuggestionsBarCellDelegate) creditCardStatementFinancingSetupScreen2.R.getValue(), (SuggestionsBarDelegate) creditCardStatementFinancingSetupScreen2.S.getValue(), (CellDetailsDelegate) creditCardStatementFinancingSetupScreen2.T.getValue(), new TextDelegate(), new RowLoadingDelegate(), new CounterTextDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementFinancingSetupScreen.Z;
                        return (j60.a) ((s2) creditCardStatementFinancingSetupScreen.W.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementFinancingSetupScreen.Z;
                        return (n) ((s2) creditCardStatementFinancingSetupScreen.W.getValue()).i.get();
                }
            }
        });
        this.V = s.t(this, iw4.c.f);
        this.W = w.y0(new md(this, inputData, 17));
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: iw4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementFinancingSetupScreen f168937b;

            {
                this.f168937b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardStatementFinancingSetupScreen creditCardStatementFinancingSetupScreen = this.f168937b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementFinancingSetupScreen.Z;
                        CreditCardStatementFinancingSetupScreen creditCardStatementFinancingSetupScreen2 = this.f168937b;
                        return dli.f.a(creditCardStatementFinancingSetupScreen2, creditCardStatementFinancingSetupScreen2.R2(), v.k((FullScreenStateDelegate) creditCardStatementFinancingSetupScreen2.M.getValue(), (CellDetailsActionDelegate) creditCardStatementFinancingSetupScreen2.P.getValue(), (AppTipDelegate) creditCardStatementFinancingSetupScreen2.Q.getValue(), (SuggestionsBarCellDelegate) creditCardStatementFinancingSetupScreen2.R.getValue(), (SuggestionsBarDelegate) creditCardStatementFinancingSetupScreen2.S.getValue(), (CellDetailsDelegate) creditCardStatementFinancingSetupScreen2.T.getValue(), new TextDelegate(), new RowLoadingDelegate(), new CounterTextDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementFinancingSetupScreen.Z;
                        return (j60.a) ((s2) creditCardStatementFinancingSetupScreen.W.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementFinancingSetupScreen.Z;
                        return (n) ((s2) creditCardStatementFinancingSetupScreen.W.getValue()).i.get();
                }
            }
        });
        final int i3 = 2;
        this.Y = w.y0(new Function0(this) { // from class: iw4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementFinancingSetupScreen f168937b;

            {
                this.f168937b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardStatementFinancingSetupScreen creditCardStatementFinancingSetupScreen = this.f168937b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementFinancingSetupScreen.Z;
                        CreditCardStatementFinancingSetupScreen creditCardStatementFinancingSetupScreen2 = this.f168937b;
                        return dli.f.a(creditCardStatementFinancingSetupScreen2, creditCardStatementFinancingSetupScreen2.R2(), v.k((FullScreenStateDelegate) creditCardStatementFinancingSetupScreen2.M.getValue(), (CellDetailsActionDelegate) creditCardStatementFinancingSetupScreen2.P.getValue(), (AppTipDelegate) creditCardStatementFinancingSetupScreen2.Q.getValue(), (SuggestionsBarCellDelegate) creditCardStatementFinancingSetupScreen2.R.getValue(), (SuggestionsBarDelegate) creditCardStatementFinancingSetupScreen2.S.getValue(), (CellDetailsDelegate) creditCardStatementFinancingSetupScreen2.T.getValue(), new TextDelegate(), new RowLoadingDelegate(), new CounterTextDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementFinancingSetupScreen.Z;
                        return (j60.a) ((s2) creditCardStatementFinancingSetupScreen.W.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementFinancingSetupScreen.Z;
                        return (n) ((s2) creditCardStatementFinancingSetupScreen.W.getValue()).i.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LargeActionButton largeActionButton = d3().f174564b;
        k.e(largeActionButton, uiState.f168955b.f168953b);
        largeActionButton.setText(uiState.f168955b.f168952a);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        TextLocalisedClause textLocalisedClause = uiState.f168956c;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return ep4.b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (s2) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((j60.a) this.X.getValue()).d(v.k((LargeActionButtonDelegate) this.N.getValue(), (PickerDelegate) this.O.getValue()));
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d dVarB = rd0.e.b(((FullScreenStateDelegate) this.M.getValue()).f52371h.f121375b);
        ?? r2 = this.P;
        com.revolut.kompot.navigable.a.g2(this, new f(vkm.q.J(dVarB, rd0.e.b(((CellDetailsActionDelegate) r2.getValue()).d), new iqh.d(rd0.e.b(((CellDetailsActionDelegate) r2.getValue()).f51780c), 11), rd0.e.b(((SuggestionsBarDelegate) this.S.getValue()).p().d), rd0.e.b(((CellDetailsDelegate) this.T.getValue()).d)), yx4.b.Companion, 10), null, new hp4.e(2, R2(), n.class, "onItemClicked", "onItemClicked(Lcom/revolut/feature/credit/core/ui/ClickWrapper;)V", 4, 22), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new iw4.h(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new iw4.h(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((AppTipDelegate) this.Q.getValue()).f51654g), null, new iw4.h(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.Q(new iqh.d(rd0.e.b(((PickerDelegate) this.O.getValue()).f52922c), 10), new hcj.o((Continuation) null, new iqh.d(rd0.e.b(((LargeActionButtonDelegate) this.N.getValue()).d.f121375b), 9), 29)), null, new hp4.e(2, R2(), n.class, "onInstalmentItemSelected", "onInstalmentItemSelected(I)V", 4, 23), 3);
    }

    public final u d3() {
        ViewBinding value = this.V.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.Y.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
