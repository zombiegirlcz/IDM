package com.revolut.feature.credit.card.impl.ui.statement.details;

import ali.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.R$id;
import com.revolut.feature.credit.card.impl.R$layout;
import com.revolut.feature.credit.card.impl.ui.statement.details.CreditCardStatementDetailsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import ep4.b;
import f9g.l;
import fb6.j;
import fv4.c;
import fv4.d;
import fv4.m;
import fv4.n;
import fv4.p;
import jm4.l4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement/details/CreditCardStatementDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lfv4/m;", "Lali/g;", "Lfv4/q;", "Lcom/revolut/feature/credit/card/impl/ui/statement/details/CreditCardStatementDetailsScreenContract$StatementPagerItem;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardStatementDetailsScreen extends ViewController<m> implements g, no.m {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(CreditCardStatementDetailsScreen.class, "binding", "getBinding()Lcom/revolut/feature/credit/card/impl/databinding/ScreenNavbarTabsPagerBinding;", 0))};
    public final /* synthetic */ b K;
    public final int L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;

    public CreditCardStatementDetailsScreen(CreditCardStatementDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = R$layout.screen_navbar_tabs_pager;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: fv4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementDetailsScreen f138321b;

            {
                this.f138321b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardStatementDetailsScreen creditCardStatementDetailsScreen = this.f138321b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementDetailsScreen.Q;
                        return mif.a.a(creditCardStatementDetailsScreen, 0, R$id.screenNavbarTabsPager_pager, creditCardStatementDetailsScreen.d(), 5);
                    default:
                        KProperty[] kPropertyArr2 = CreditCardStatementDetailsScreen.Q;
                        return (n) ((l4) creditCardStatementDetailsScreen.O.getValue()).f176192c.get();
                }
            }
        });
        this.N = s.t(this, c.f);
        this.O = w.y0(new j(this, inputData, 26));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: fv4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementDetailsScreen f138321b;

            {
                this.f138321b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardStatementDetailsScreen creditCardStatementDetailsScreen = this.f138321b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementDetailsScreen.Q;
                        return mif.a.a(creditCardStatementDetailsScreen, 0, R$id.screenNavbarTabsPager_pager, creditCardStatementDetailsScreen.d(), 5);
                    default:
                        KProperty[] kPropertyArr2 = CreditCardStatementDetailsScreen.Q;
                        return (n) ((l4) creditCardStatementDetailsScreen.O.getValue()).f176192c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        fv4.q uiState = (fv4.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        p pVar = uiState.f138340a;
        NavBarWithToolbar navBarWithToolbar = d3().f162304c;
        navBarWithToolbar.setMenuItems(pVar.f138338a);
        navBarWithToolbar.setTitle(pVar.f138339b, null);
        fv4.o oVar2 = uiState.f138341b;
        d3().f162303b.setItems(oVar2.f138337b, oVar2.f138336a);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return b.f128076b;
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        CreditCardStatementDetailsScreenContract$StatementPagerItem pagerItem2 = (CreditCardStatementDetailsScreenContract$StatementPagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        n nVarD = d();
        String tabId = pagerItem2.getF94249a();
        a aVar = (a) nVarD;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        aVar.H2(aVar.f69664s, new l(tabId, 22));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l4) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (l4) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f162304c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f162303b.f58882b), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f162304c.f59410q), null, new ft.d(this, null, 6), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f162304c.o.f57403b), null, new d(this, null, 1), 3);
    }

    public final im4.c d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (im4.c) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.M.getValue();
    }
}
