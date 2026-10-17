package com.revolut.feature.credit.card.impl.ui.cancellation.checkout;

import aj0.o;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import ap7.k;
import aq4.c;
import aq4.d;
import aq4.f;
import aq4.g;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FooterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.cancellation.checkout.CancellationCheckoutScreen;
import com.revolut.feature.credit.card.impl.ui.cancellation.checkout.CancellationCheckoutScreenContract$InputData;
import com.revolut.feature.credit.card.impl.ui.cancellation.checkout.a;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.List;
import jm4.a3;
import jm4.d0;
import jm4.p0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/cancellation/checkout/CancellationCheckoutScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/credit/card/impl/ui/cancellation/checkout/a;", "Ldli/a;", "Laq4/g;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CancellationCheckoutScreen extends ViewController<a> implements dli.a {
    public static final /* synthetic */ KProperty[] V = {o0.f186429a.j(new h0(CancellationCheckoutScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final CancellationCheckoutScreenContract$InputData K;
    public final int L;
    public final h M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final CellDetailsDelegate Q;
    public final RowDelegate R;
    public final RowLoadingDelegate S;
    public final FooterTextDelegate T;
    public final Object U;

    public CancellationCheckoutScreen(CancellationCheckoutScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.M = s.t(this, aq4.b.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: aq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancellationCheckoutScreen f8246b;

            {
                this.f8246b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CancellationCheckoutScreen cancellationCheckoutScreen = this.f8246b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CancellationCheckoutScreen.V;
                        qji.b bVarU2 = cancellationCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.cancellation.checkout.di.CancellationCheckoutScreenComponent.Injector");
                        p0 p0Var = (p0) bVarU2;
                        a3 a3Var = p0Var.f176243b;
                        p0 p0Var2 = p0Var.f176244c;
                        CancellationCheckoutScreenContract$InputData cancellationCheckoutScreenContract$InputData = cancellationCheckoutScreen.K;
                        cancellationCheckoutScreenContract$InputData.getClass();
                        return new d0(a3Var, p0Var2, cancellationCheckoutScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CancellationCheckoutScreen.V;
                        return (f) ((d0) cancellationCheckoutScreen.N.getValue()).f176032b.get();
                    default:
                        KProperty[] kPropertyArr3 = CancellationCheckoutScreen.V;
                        CancellationCheckoutScreen cancellationCheckoutScreen2 = this.f8246b;
                        return dli.f.a(cancellationCheckoutScreen2, cancellationCheckoutScreen2.d(), v.k((FullScreenStateDelegate) cancellationCheckoutScreen2.P.getValue(), cancellationCheckoutScreen2.Q, cancellationCheckoutScreen2.R, cancellationCheckoutScreen2.S, cancellationCheckoutScreen2.T), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: aq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancellationCheckoutScreen f8246b;

            {
                this.f8246b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CancellationCheckoutScreen cancellationCheckoutScreen = this.f8246b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CancellationCheckoutScreen.V;
                        qji.b bVarU2 = cancellationCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.cancellation.checkout.di.CancellationCheckoutScreenComponent.Injector");
                        p0 p0Var = (p0) bVarU2;
                        a3 a3Var = p0Var.f176243b;
                        p0 p0Var2 = p0Var.f176244c;
                        CancellationCheckoutScreenContract$InputData cancellationCheckoutScreenContract$InputData = cancellationCheckoutScreen.K;
                        cancellationCheckoutScreenContract$InputData.getClass();
                        return new d0(a3Var, p0Var2, cancellationCheckoutScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CancellationCheckoutScreen.V;
                        return (f) ((d0) cancellationCheckoutScreen.N.getValue()).f176032b.get();
                    default:
                        KProperty[] kPropertyArr3 = CancellationCheckoutScreen.V;
                        CancellationCheckoutScreen cancellationCheckoutScreen2 = this.f8246b;
                        return dli.f.a(cancellationCheckoutScreen2, cancellationCheckoutScreen2.d(), v.k((FullScreenStateDelegate) cancellationCheckoutScreen2.P.getValue(), cancellationCheckoutScreen2.Q, cancellationCheckoutScreen2.R, cancellationCheckoutScreen2.S, cancellationCheckoutScreen2.T), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new o(29));
        this.Q = new CellDetailsDelegate();
        this.R = new RowDelegate(null, null, 7);
        this.S = new RowLoadingDelegate();
        this.T = new FooterTextDelegate();
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: aq4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CancellationCheckoutScreen f8246b;

            {
                this.f8246b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CancellationCheckoutScreen cancellationCheckoutScreen = this.f8246b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CancellationCheckoutScreen.V;
                        qji.b bVarU2 = cancellationCheckoutScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.cancellation.checkout.di.CancellationCheckoutScreenComponent.Injector");
                        p0 p0Var = (p0) bVarU2;
                        a3 a3Var = p0Var.f176243b;
                        p0 p0Var2 = p0Var.f176244c;
                        CancellationCheckoutScreenContract$InputData cancellationCheckoutScreenContract$InputData = cancellationCheckoutScreen.K;
                        cancellationCheckoutScreenContract$InputData.getClass();
                        return new d0(a3Var, p0Var2, cancellationCheckoutScreenContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CancellationCheckoutScreen.V;
                        return (f) ((d0) cancellationCheckoutScreen.N.getValue()).f176032b.get();
                    default:
                        KProperty[] kPropertyArr3 = CancellationCheckoutScreen.V;
                        CancellationCheckoutScreen cancellationCheckoutScreen2 = this.f8246b;
                        return dli.f.a(cancellationCheckoutScreen2, cancellationCheckoutScreen2.d(), v.k((FullScreenStateDelegate) cancellationCheckoutScreen2.P.getValue(), cancellationCheckoutScreen2.Q, cancellationCheckoutScreen2.R, cancellationCheckoutScreen2.S, cancellationCheckoutScreen2.T), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setText(uiState.f8251b);
        largeActionButton.setEnabled(uiState.f8252c);
        TextNavBarMenuItem textNavBarMenuItem = uiState.d;
        if (textNavBarMenuItem != null) {
            d3().e.setMenuItems(u.c(textNavBarMenuItem));
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((b) d()).C2(a.C0477a.f69107a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d0) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_facility_cancellation_credit_card_checkout_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.credit_facility_cancellation_credit_card_checkout_subtitle, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().e.f59410q), new c(this, continuation, 0), 3);
        int i = 1;
        ViewController.P2(this, rd0.e.b(d3().f174557b.o), new c(this, continuation, i), 3);
        ViewController.P2(this, rd0.e.b(((FullScreenStateDelegate) this.P.getValue()).f52371h.f121375b), new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o.f57403b), null, new k(this, continuation, i), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.M.getValue(this, V[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final f d() {
        return (f) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
