package com.revolut.feature.credit.card.impl.ui.statement.export;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.statement.export.CreditCardStatementExportScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import java.util.List;
import jm4.o2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.c7;
import nn7.d;
import no.m;
import nsh.e;
import nv4.j;
import nv4.l;
import nv4.n;
import nv4.p;
import rr0.f;
import te0.w;
import vc.s;
import w01.k;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/statement/export/CreditCardStatementExportScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lnv4/p;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardStatementExportScreen extends ViewController<Object> implements dli.a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CreditCardStatementExportScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final /* synthetic */ ep4.b K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final h R;
    public final Object S;
    public final Object T;

    public CreditCardStatementExportScreen(CreditCardStatementExportScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = ep4.b.f128075a;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: nv4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementExportScreen f219458b;

            {
                this.f219458b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardStatementExportScreen creditCardStatementExportScreen = this.f219458b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementExportScreen.U;
                        return creditCardStatementExportScreen.d3().f174557b.A.V();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementExportScreen.U;
                        CreditCardStatementExportScreen creditCardStatementExportScreen2 = this.f219458b;
                        return dli.f.a(creditCardStatementExportScreen2, creditCardStatementExportScreen2.d(), zhm.v.k((InputTextDelegate) creditCardStatementExportScreen2.N.getValue(), (FixedTabsDelegate) creditCardStatementExportScreen2.P.getValue(), new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementExportScreen.U;
                        return (j) ((o2) creditCardStatementExportScreen.S.getValue()).d.get();
                }
            }
        });
        this.N = w.y0(new ns1.a(24));
        this.O = w.y0(new ns1.a(25));
        this.P = w.y0(new ns1.a(26));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: nv4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementExportScreen f219458b;

            {
                this.f219458b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardStatementExportScreen creditCardStatementExportScreen = this.f219458b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementExportScreen.U;
                        return creditCardStatementExportScreen.d3().f174557b.A.V();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementExportScreen.U;
                        CreditCardStatementExportScreen creditCardStatementExportScreen2 = this.f219458b;
                        return dli.f.a(creditCardStatementExportScreen2, creditCardStatementExportScreen2.d(), zhm.v.k((InputTextDelegate) creditCardStatementExportScreen2.N.getValue(), (FixedTabsDelegate) creditCardStatementExportScreen2.P.getValue(), new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementExportScreen.U;
                        return (j) ((o2) creditCardStatementExportScreen.S.getValue()).d.get();
                }
            }
        });
        this.R = s.t(this, nv4.b.f);
        this.S = w.y0(new e(this, inputData, 3));
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: nv4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardStatementExportScreen f219458b;

            {
                this.f219458b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardStatementExportScreen creditCardStatementExportScreen = this.f219458b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardStatementExportScreen.U;
                        return creditCardStatementExportScreen.d3().f174557b.A.V();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardStatementExportScreen.U;
                        CreditCardStatementExportScreen creditCardStatementExportScreen2 = this.f219458b;
                        return dli.f.a(creditCardStatementExportScreen2, creditCardStatementExportScreen2.d(), zhm.v.k((InputTextDelegate) creditCardStatementExportScreen2.N.getValue(), (FixedTabsDelegate) creditCardStatementExportScreen2.P.getValue(), new RowLoadingDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CreditCardStatementExportScreen.U;
                        return (j) ((o2) creditCardStatementExportScreen.S.getValue()).d.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        nv4.o oVar2 = uiState.f219473b;
        if (oVar2 instanceof l) {
            LargeActionButton screenRecyclerNavbarFooterNextbuttonButton = d3().f174557b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton, "screenRecyclerNavbarFooterNextbuttonButton");
            k.a(screenRecyclerNavbarFooterNextbuttonButton);
            FooterTextView screenRecyclerNavbarFooterNextbuttonFooterView = d3().f174558c;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonFooterView, "screenRecyclerNavbarFooterNextbuttonFooterView");
            k.a(screenRecyclerNavbarFooterNextbuttonFooterView);
            return;
        }
        boolean z = oVar2 instanceof nv4.k;
        ?? r4 = this.M;
        if (z) {
            LargeActionButton screenRecyclerNavbarFooterNextbuttonButton2 = d3().f174557b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton2, "screenRecyclerNavbarFooterNextbuttonButton");
            k.d(screenRecyclerNavbarFooterNextbuttonButton2);
            FooterTextView screenRecyclerNavbarFooterNextbuttonFooterView2 = d3().f174558c;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonFooterView2, "screenRecyclerNavbarFooterNextbuttonFooterView");
            k.d(screenRecyclerNavbarFooterNextbuttonFooterView2);
            ((f) ((sy0.b) r4.getValue())).b(false);
            nv4.k kVar = (nv4.k) oVar2;
            d3().f174557b.setText(kVar.f219467a);
            d3().f174558c.setContent(new c7(kVar.f219468b, false, null, 6));
            return;
        }
        if (oVar2 instanceof n) {
            LargeActionButton screenRecyclerNavbarFooterNextbuttonButton3 = d3().f174557b;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton3, "screenRecyclerNavbarFooterNextbuttonButton");
            k.a(screenRecyclerNavbarFooterNextbuttonButton3);
            FooterTextView screenRecyclerNavbarFooterNextbuttonFooterView3 = d3().f174558c;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonFooterView3, "screenRecyclerNavbarFooterNextbuttonFooterView");
            k.d(screenRecyclerNavbarFooterNextbuttonFooterView3);
            ((f) ((sy0.b) r4.getValue())).b(false);
            d3().f174558c.setContent(new c7(((n) oVar2).f219471a, false, null, 6));
            return;
        }
        if (!(oVar2 instanceof nv4.m)) {
            throw new NoWhenBranchMatchedException();
        }
        LargeActionButton screenRecyclerNavbarFooterNextbuttonButton4 = d3().f174557b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonButton4, "screenRecyclerNavbarFooterNextbuttonButton");
        k.d(screenRecyclerNavbarFooterNextbuttonButton4);
        FooterTextView screenRecyclerNavbarFooterNextbuttonFooterView4 = d3().f174558c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterNextbuttonFooterView4, "screenRecyclerNavbarFooterNextbuttonFooterView");
        k.d(screenRecyclerNavbarFooterNextbuttonFooterView4);
        ((f) ((sy0.b) r4.getValue())).b(true);
        d3().f174558c.setContent(new c7(((nv4.m) oVar2).f219470a, false, null, 6));
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getR() {
        this.K.getClass();
        return ep4.b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (o2) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_card_statement_export_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_card_statement_export_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.credit_statement_limit_screen_caption, null, null, 14));
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, new ay4.f(vkm.q.J(rd0.e.b(((FullScreenStateDelegate) this.O.getValue()).f52371h.f121375b), rd0.e.b(((FixedTabsDelegate) this.P.getValue()).f52339c.f121375b)), yx4.b.Companion, 22), null, new d(this, null, 25), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((InputTextDelegate) this.N.getValue()).f52575g.f121375b), null, new nv4.d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new nv4.e(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new nv4.e(this, null, 1), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.T.getValue();
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
