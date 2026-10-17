package com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.openbanking.Provider;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OpenBankingAuthPaymentScreen;
import com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.OpenBankingAuthPaymentScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.common.ui.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.r;
import egb.m0;
import ej6.k;
import ej6.u;
import h30.l;
import ihm.f;
import in0.g;
import java.util.List;
import jii.t;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xf6.r2;
import xf6.s2;
import xf6.w2;
import xki.e;
import yhm.j;
import yy0.i;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/screen/payment/OpenBankingAuthPaymentScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lej6/u;", "Ldli/a;", "Lej6/w;", "Lin0/g;", "Lmkd/g;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OpenBankingAuthPaymentScreen extends ViewController<u> implements dli.a, g, mkd.g {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(OpenBankingAuthPaymentScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterTwoButtonsBinding;", 0))};
    public final OpenBankingAuthPaymentScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Lazy P;
    public final CellDetailsActionDelegate Q;
    public final ActionWidgetDelegate R;
    public final HeroBannerDelegate S;
    public final ScrollerDelegate T;
    public final Object U;

    public OpenBankingAuthPaymentScreen(OpenBankingAuthPaymentScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_two_buttons;
        this.M = s.t(this, ej6.h.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ej6.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OpenBankingAuthPaymentScreen f126741b;

            {
                this.f126741b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OpenBankingAuthPaymentScreen openBankingAuthPaymentScreen = this.f126741b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OpenBankingAuthPaymentScreen.V;
                        qji.b bVarU2 = openBankingAuthPaymentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.di.OpenBankingAuthPaymentScreenInjector");
                        r2 r2Var = (r2) bVarU2;
                        w2 w2Var = r2Var.f305035b;
                        r2 r2Var2 = r2Var.f305036c;
                        OpenBankingAuthPaymentScreenContract$InputData openBankingAuthPaymentScreenContract$InputData = openBankingAuthPaymentScreen.K;
                        openBankingAuthPaymentScreenContract$InputData.getClass();
                        return new s2(w2Var, r2Var2, openBankingAuthPaymentScreenContract$InputData, openBankingAuthPaymentScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = OpenBankingAuthPaymentScreen.V;
                        return (v) ((s2) ((gj6.a) openBankingAuthPaymentScreen.N.getValue())).f305057l.get();
                    default:
                        KProperty[] kPropertyArr3 = OpenBankingAuthPaymentScreen.V;
                        OpenBankingAuthPaymentScreen openBankingAuthPaymentScreen2 = this.f126741b;
                        return dli.f.a(openBankingAuthPaymentScreen2, openBankingAuthPaymentScreen2.R2(), zhm.v.k((RowDelegate) openBankingAuthPaymentScreen2.P.getValue(), new ListCellDelegate(), new ListSubheaderDelegate(), openBankingAuthPaymentScreen2.Q, new CellDetailsDelegate(), new RowLoadingDelegate(), new TextDelegate(), openBankingAuthPaymentScreen2.R, openBankingAuthPaymentScreen2.S, openBankingAuthPaymentScreen2.T), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: ej6.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OpenBankingAuthPaymentScreen f126741b;

            {
                this.f126741b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OpenBankingAuthPaymentScreen openBankingAuthPaymentScreen = this.f126741b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OpenBankingAuthPaymentScreen.V;
                        qji.b bVarU2 = openBankingAuthPaymentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.di.OpenBankingAuthPaymentScreenInjector");
                        r2 r2Var = (r2) bVarU2;
                        w2 w2Var = r2Var.f305035b;
                        r2 r2Var2 = r2Var.f305036c;
                        OpenBankingAuthPaymentScreenContract$InputData openBankingAuthPaymentScreenContract$InputData = openBankingAuthPaymentScreen.K;
                        openBankingAuthPaymentScreenContract$InputData.getClass();
                        return new s2(w2Var, r2Var2, openBankingAuthPaymentScreenContract$InputData, openBankingAuthPaymentScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = OpenBankingAuthPaymentScreen.V;
                        return (v) ((s2) ((gj6.a) openBankingAuthPaymentScreen.N.getValue())).f305057l.get();
                    default:
                        KProperty[] kPropertyArr3 = OpenBankingAuthPaymentScreen.V;
                        OpenBankingAuthPaymentScreen openBankingAuthPaymentScreen2 = this.f126741b;
                        return dli.f.a(openBankingAuthPaymentScreen2, openBankingAuthPaymentScreen2.R2(), zhm.v.k((RowDelegate) openBankingAuthPaymentScreen2.P.getValue(), new ListCellDelegate(), new ListSubheaderDelegate(), openBankingAuthPaymentScreen2.Q, new CellDetailsDelegate(), new RowLoadingDelegate(), new TextDelegate(), openBankingAuthPaymentScreen2.R, openBankingAuthPaymentScreen2.S, openBankingAuthPaymentScreen2.T), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = j.b(new m0(12));
        this.Q = new CellDetailsActionDelegate();
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.R = actionWidgetDelegate;
        HeroBannerDelegate heroBannerDelegate = new HeroBannerDelegate(0);
        this.S = heroBannerDelegate;
        final int i3 = 2;
        this.T = new ScrollerDelegate(v.k(actionWidgetDelegate, heroBannerDelegate), false);
        this.U = w.y0(new Function0(this) { // from class: ej6.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OpenBankingAuthPaymentScreen f126741b;

            {
                this.f126741b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OpenBankingAuthPaymentScreen openBankingAuthPaymentScreen = this.f126741b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OpenBankingAuthPaymentScreen.V;
                        qji.b bVarU2 = openBankingAuthPaymentScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.external_accounts.impl.ui.apptoapp.screen.payment.di.OpenBankingAuthPaymentScreenInjector");
                        r2 r2Var = (r2) bVarU2;
                        w2 w2Var = r2Var.f305035b;
                        r2 r2Var2 = r2Var.f305036c;
                        OpenBankingAuthPaymentScreenContract$InputData openBankingAuthPaymentScreenContract$InputData = openBankingAuthPaymentScreen.K;
                        openBankingAuthPaymentScreenContract$InputData.getClass();
                        return new s2(w2Var, r2Var2, openBankingAuthPaymentScreenContract$InputData, openBankingAuthPaymentScreen);
                    case 1:
                        KProperty[] kPropertyArr2 = OpenBankingAuthPaymentScreen.V;
                        return (v) ((s2) ((gj6.a) openBankingAuthPaymentScreen.N.getValue())).f305057l.get();
                    default:
                        KProperty[] kPropertyArr3 = OpenBankingAuthPaymentScreen.V;
                        OpenBankingAuthPaymentScreen openBankingAuthPaymentScreen2 = this.f126741b;
                        return dli.f.a(openBankingAuthPaymentScreen2, openBankingAuthPaymentScreen2.R2(), zhm.v.k((RowDelegate) openBankingAuthPaymentScreen2.P.getValue(), new ListCellDelegate(), new ListSubheaderDelegate(), openBankingAuthPaymentScreen2.Q, new CellDetailsDelegate(), new RowLoadingDelegate(), new TextDelegate(), openBankingAuthPaymentScreen2.R, openBankingAuthPaymentScreen2.S, openBankingAuthPaymentScreen2.T), R$id.screenRecyclerNavbarFooterTwoButtons_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        ej6.w uiState = (ej6.w) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        t tVarD3 = d3();
        Clause clause = uiState.f126758b;
        if (clause != null) {
            NavBarWithToolbar screenRecyclerNavbarFooterTwoButtonsToolbar = tVarD3.f174562g;
            Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsToolbar, "screenRecyclerNavbarFooterTwoButtonsToolbar");
            screenRecyclerNavbarFooterTwoButtonsToolbar.setTitle(clause, null);
            tVarD3.f174562g.setToolbarTitle(clause);
        }
        tVarD3.f174560b.setEnabled(uiState.f126759c);
        tVarD3.f.setEnabled(uiState.d);
        tVarD3.d.setTextClause(uiState.e);
        tVarD3.f174562g.setHeaderDisclaimerSticky(uiState.f);
    }

    @Override // mkd.g
    public final r F1() {
        return this.T.i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (gj6.a) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        String str;
        Intrinsics.checkNotNullParameter(view, "view");
        t tVarD3 = d3();
        ScreenContentRecyclerView screenRecyclerNavbarFooterTwoButtonsRecyclerView = tVarD3.e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarFooterTwoButtonsRecyclerView, "screenRecyclerNavbarFooterTwoButtonsRecyclerView");
        knm.b.v(kli.a.k(m2(), 190.0f), screenRecyclerNavbarFooterTwoButtonsRecyclerView);
        tVarD3.f174561c.setBackgroundResource(R$drawable.uikit_bottom_container_gradient);
        NavBarWithToolbar navBarWithToolbar = tVarD3.f174562g;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        tVarD3.f174560b.setText(new TextLocalisedClause(R$string.common_action_confirm, null, null, 14));
        LargeActionButton largeActionButton = tVarD3.f;
        l.A(R.string.common_action_reject, null, null, 14, largeActionButton);
        largeActionButton.o(LargeActionButton.ButtonStyle.f58726b);
        Provider provider = this.K.f72530b.f60394p;
        if (provider == null || (str = provider.f60402b) == null) {
            return;
        }
        i iVar = yy0.l.Companion;
        UrlImage urlImage = new UrlImage(str, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
        iVar.getClass();
        navBarWithToolbar.setEndImage(i.a(urlImage));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        t tVarD3 = d3();
        ViewController.P2(this, rd0.e.b(tVarD3.f174562g.f59410q), new ej6.i(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(tVarD3.f174560b.o), new ej6.i(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(tVarD3.f.o), new ej6.i(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(tVarD3.d.f58608l), new ej6.i(this, null, 3), 3);
        ViewController.P2(this, rd0.e.b((f) tVarD3.f174562g.f59406n.f258290b), new ea4.d(this, null, 19), 3);
        ViewController.P2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53220l), new ej6.j(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.d), new k(this, null), 3);
    }

    public final t d3() {
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (t) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ej6.v R2() {
        return (ej6.v) this.O.getValue();
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

    @Override // in0.g
    public final boolean p0() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mkd.g
    public final koi.c v0() {
        return ((dli.c) this.U.getValue()).w().f;
    }
}
