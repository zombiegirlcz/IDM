package com.revolut.feature.credit.card.impl.ui.statement.transactions;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.statement.transactions.CreditCardStatementTransactionsScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ep4.b;
import java.util.List;
import jm4.o4;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tk5.c;
import tna.p;
import tv4.j;
import tv4.k;
import tv4.l;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement/transactions/CreditCardStatementTransactionsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltv4/j;", "Ldli/a;", "Ltv4/m;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardStatementTransactionsScreen extends ViewController<j> implements a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CreditCardStatementTransactionsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ b K;
    public final Object L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public final int Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public CreditCardStatementTransactionsScreen(CreditCardStatementTransactionsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = w.y0(new ts1.h(21));
        this.M = w.y0(new ts1.h(22));
        this.N = w.y0(new ts1.h(23));
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: tv4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementTransactionsScreen f274693b;

            {
                this.f274693b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardStatementTransactionsScreen creditCardStatementTransactionsScreen = this.f274693b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementTransactionsScreen.U;
                        return new SwipeToActionDelegate((RowDelegate) creditCardStatementTransactionsScreen.M.getValue(), false);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementTransactionsScreen.U;
                        CreditCardStatementTransactionsScreen creditCardStatementTransactionsScreen2 = this.f274693b;
                        return dli.f.a(creditCardStatementTransactionsScreen2, (k) creditCardStatementTransactionsScreen2.T.getValue(), v.k((InputDisclosureDelegate) creditCardStatementTransactionsScreen2.L.getValue(), (RowDelegate) creditCardStatementTransactionsScreen2.M.getValue(), (FullScreenStateDelegate) creditCardStatementTransactionsScreen2.N.getValue(), (SwipeToActionDelegate) creditCardStatementTransactionsScreen2.O.getValue(), new RowLoadingDelegate(), new TextDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementTransactionsScreen.U;
                        o4 o4Var = (o4) creditCardStatementTransactionsScreen.S.getValue();
                        switch (o4Var.f176235a) {
                            case 0:
                                return (k) o4Var.f176241l.get();
                            default:
                                return (k) o4Var.f176241l.get();
                        }
                }
            }
        });
        this.P = s.t(this, tv4.b.f);
        this.Q = R$layout.screen_recycler_navbar;
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: tv4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementTransactionsScreen f274693b;

            {
                this.f274693b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardStatementTransactionsScreen creditCardStatementTransactionsScreen = this.f274693b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementTransactionsScreen.U;
                        return new SwipeToActionDelegate((RowDelegate) creditCardStatementTransactionsScreen.M.getValue(), false);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementTransactionsScreen.U;
                        CreditCardStatementTransactionsScreen creditCardStatementTransactionsScreen2 = this.f274693b;
                        return dli.f.a(creditCardStatementTransactionsScreen2, (k) creditCardStatementTransactionsScreen2.T.getValue(), v.k((InputDisclosureDelegate) creditCardStatementTransactionsScreen2.L.getValue(), (RowDelegate) creditCardStatementTransactionsScreen2.M.getValue(), (FullScreenStateDelegate) creditCardStatementTransactionsScreen2.N.getValue(), (SwipeToActionDelegate) creditCardStatementTransactionsScreen2.O.getValue(), new RowLoadingDelegate(), new TextDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementTransactionsScreen.U;
                        o4 o4Var = (o4) creditCardStatementTransactionsScreen.S.getValue();
                        switch (o4Var.f176235a) {
                            case 0:
                                return (k) o4Var.f176241l.get();
                            default:
                                return (k) o4Var.f176241l.get();
                        }
                }
            }
        });
        this.S = w.y0(new tml.a(this, inputData, 18));
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: tv4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementTransactionsScreen f274693b;

            {
                this.f274693b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardStatementTransactionsScreen creditCardStatementTransactionsScreen = this.f274693b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementTransactionsScreen.U;
                        return new SwipeToActionDelegate((RowDelegate) creditCardStatementTransactionsScreen.M.getValue(), false);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementTransactionsScreen.U;
                        CreditCardStatementTransactionsScreen creditCardStatementTransactionsScreen2 = this.f274693b;
                        return dli.f.a(creditCardStatementTransactionsScreen2, (k) creditCardStatementTransactionsScreen2.T.getValue(), v.k((InputDisclosureDelegate) creditCardStatementTransactionsScreen2.L.getValue(), (RowDelegate) creditCardStatementTransactionsScreen2.M.getValue(), (FullScreenStateDelegate) creditCardStatementTransactionsScreen2.N.getValue(), (SwipeToActionDelegate) creditCardStatementTransactionsScreen2.O.getValue(), new RowLoadingDelegate(), new TextDelegate(), new ListSubheaderDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementTransactionsScreen.U;
                        o4 o4Var = (o4) creditCardStatementTransactionsScreen.S.getValue();
                        switch (o4Var.f176235a) {
                            case 0:
                                return (k) o4Var.f176241l.get();
                            default:
                                return (k) o4Var.f176241l.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        tv4.m uiState = (tv4.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        l lVar = uiState.f274706a;
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Clause clause = lVar.f274705b;
        navBarWithToolbar.setDescriptionText(clause);
        d3().f174539b.setDescriptionVisible(clause != null);
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
        return (o4) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (k) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_card_transactions_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_card_transactions_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new c(this, continuation, 20), 3);
        com.revolut.kompot.navigable.a.g2(this, new ss4.h(vkm.q.J(rd0.e.b(((InputDisclosureDelegate) this.L.getValue()).f52538c), rd0.e.b(((RowDelegate) this.M.getValue()).f53218h), rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b)), yx4.b.Companion, 3), null, new p(this, continuation, 16), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.P.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
