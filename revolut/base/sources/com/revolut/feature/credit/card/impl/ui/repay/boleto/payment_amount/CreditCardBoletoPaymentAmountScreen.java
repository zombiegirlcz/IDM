package com.revolut.feature.credit.card.impl.ui.repay.boleto.payment_amount;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bk6.c;
import br4.e;
import bu4.d;
import bu4.f;
import bu4.g;
import bu4.i;
import bu4.k;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.repay.boleto.payment_amount.CreditCardBoletoPaymentAmountScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import ep4.b;
import java.util.List;
import jii.u;
import jm4.m0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay/boleto/payment_amount/CreditCardBoletoPaymentAmountScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lbu4/d;", "Ldli/a;", "Lbu4/i;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardBoletoPaymentAmountScreen extends ViewController<d> implements a, m {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(CreditCardBoletoPaymentAmountScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final /* synthetic */ b K;
    public final int L;
    public final h M;
    public final Object N;
    public final boolean O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

    public CreditCardBoletoPaymentAmountScreen(CreditCardBoletoPaymentAmountContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = s.t(this, k.f);
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: bu4.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardBoletoPaymentAmountScreen f18681b;

            {
                this.f18681b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardBoletoPaymentAmountScreen creditCardBoletoPaymentAmountScreen = this.f18681b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardBoletoPaymentAmountScreen.W;
                        return (m) ((m0) creditCardBoletoPaymentAmountScreen.P.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardBoletoPaymentAmountScreen.W;
                        qd0.b bVarN = ((m0) creditCardBoletoPaymentAmountScreen.P.getValue()).f176194b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardBoletoPaymentAmountScreen.W;
                        return new GridBoxDelegate(v.k((AttributeSelectorSmallDelegate) creditCardBoletoPaymentAmountScreen.S.getValue(), new AttributeSelectorSmallLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardBoletoPaymentAmountScreen.W;
                        return new CenteredAmountDelegate(new bhi.c(creditCardBoletoPaymentAmountScreen, 25));
                    default:
                        KProperty[] kPropertyArr5 = CreditCardBoletoPaymentAmountScreen.W;
                        CreditCardBoletoPaymentAmountScreen creditCardBoletoPaymentAmountScreen2 = this.f18681b;
                        return dli.f.a(creditCardBoletoPaymentAmountScreen2, (m) creditCardBoletoPaymentAmountScreen2.N.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), (GridBoxDelegate) creditCardBoletoPaymentAmountScreen2.T.getValue(), (FullScreenStateDelegate) creditCardBoletoPaymentAmountScreen2.R.getValue(), (CenteredAmountDelegate) creditCardBoletoPaymentAmountScreen2.U.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = true;
        this.P = w.y0(new bc1.a(this, inputData, 29));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: bu4.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardBoletoPaymentAmountScreen f18681b;

            {
                this.f18681b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardBoletoPaymentAmountScreen creditCardBoletoPaymentAmountScreen = this.f18681b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardBoletoPaymentAmountScreen.W;
                        return (m) ((m0) creditCardBoletoPaymentAmountScreen.P.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardBoletoPaymentAmountScreen.W;
                        qd0.b bVarN = ((m0) creditCardBoletoPaymentAmountScreen.P.getValue()).f176194b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardBoletoPaymentAmountScreen.W;
                        return new GridBoxDelegate(v.k((AttributeSelectorSmallDelegate) creditCardBoletoPaymentAmountScreen.S.getValue(), new AttributeSelectorSmallLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardBoletoPaymentAmountScreen.W;
                        return new CenteredAmountDelegate(new bhi.c(creditCardBoletoPaymentAmountScreen, 25));
                    default:
                        KProperty[] kPropertyArr5 = CreditCardBoletoPaymentAmountScreen.W;
                        CreditCardBoletoPaymentAmountScreen creditCardBoletoPaymentAmountScreen2 = this.f18681b;
                        return dli.f.a(creditCardBoletoPaymentAmountScreen2, (m) creditCardBoletoPaymentAmountScreen2.N.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), (GridBoxDelegate) creditCardBoletoPaymentAmountScreen2.T.getValue(), (FullScreenStateDelegate) creditCardBoletoPaymentAmountScreen2.R.getValue(), (CenteredAmountDelegate) creditCardBoletoPaymentAmountScreen2.U.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = w.y0(new e(21));
        this.S = w.y0(new e(22));
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: bu4.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardBoletoPaymentAmountScreen f18681b;

            {
                this.f18681b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardBoletoPaymentAmountScreen creditCardBoletoPaymentAmountScreen = this.f18681b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardBoletoPaymentAmountScreen.W;
                        return (m) ((m0) creditCardBoletoPaymentAmountScreen.P.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardBoletoPaymentAmountScreen.W;
                        qd0.b bVarN = ((m0) creditCardBoletoPaymentAmountScreen.P.getValue()).f176194b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardBoletoPaymentAmountScreen.W;
                        return new GridBoxDelegate(v.k((AttributeSelectorSmallDelegate) creditCardBoletoPaymentAmountScreen.S.getValue(), new AttributeSelectorSmallLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardBoletoPaymentAmountScreen.W;
                        return new CenteredAmountDelegate(new bhi.c(creditCardBoletoPaymentAmountScreen, 25));
                    default:
                        KProperty[] kPropertyArr5 = CreditCardBoletoPaymentAmountScreen.W;
                        CreditCardBoletoPaymentAmountScreen creditCardBoletoPaymentAmountScreen2 = this.f18681b;
                        return dli.f.a(creditCardBoletoPaymentAmountScreen2, (m) creditCardBoletoPaymentAmountScreen2.N.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), (GridBoxDelegate) creditCardBoletoPaymentAmountScreen2.T.getValue(), (FullScreenStateDelegate) creditCardBoletoPaymentAmountScreen2.R.getValue(), (CenteredAmountDelegate) creditCardBoletoPaymentAmountScreen2.U.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i5 = 3;
        this.U = w.y0(new Function0(this) { // from class: bu4.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardBoletoPaymentAmountScreen f18681b;

            {
                this.f18681b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                CreditCardBoletoPaymentAmountScreen creditCardBoletoPaymentAmountScreen = this.f18681b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardBoletoPaymentAmountScreen.W;
                        return (m) ((m0) creditCardBoletoPaymentAmountScreen.P.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardBoletoPaymentAmountScreen.W;
                        qd0.b bVarN = ((m0) creditCardBoletoPaymentAmountScreen.P.getValue()).f176194b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardBoletoPaymentAmountScreen.W;
                        return new GridBoxDelegate(v.k((AttributeSelectorSmallDelegate) creditCardBoletoPaymentAmountScreen.S.getValue(), new AttributeSelectorSmallLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardBoletoPaymentAmountScreen.W;
                        return new CenteredAmountDelegate(new bhi.c(creditCardBoletoPaymentAmountScreen, 25));
                    default:
                        KProperty[] kPropertyArr5 = CreditCardBoletoPaymentAmountScreen.W;
                        CreditCardBoletoPaymentAmountScreen creditCardBoletoPaymentAmountScreen2 = this.f18681b;
                        return dli.f.a(creditCardBoletoPaymentAmountScreen2, (m) creditCardBoletoPaymentAmountScreen2.N.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), (GridBoxDelegate) creditCardBoletoPaymentAmountScreen2.T.getValue(), (FullScreenStateDelegate) creditCardBoletoPaymentAmountScreen2.R.getValue(), (CenteredAmountDelegate) creditCardBoletoPaymentAmountScreen2.U.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i6 = 4;
        this.V = w.y0(new Function0(this) { // from class: bu4.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardBoletoPaymentAmountScreen f18681b;

            {
                this.f18681b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                CreditCardBoletoPaymentAmountScreen creditCardBoletoPaymentAmountScreen = this.f18681b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardBoletoPaymentAmountScreen.W;
                        return (m) ((m0) creditCardBoletoPaymentAmountScreen.P.getValue()).d.get();
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardBoletoPaymentAmountScreen.W;
                        qd0.b bVarN = ((m0) creditCardBoletoPaymentAmountScreen.P.getValue()).f176194b.k.n();
                        s.j(bVarN);
                        return new u80.d(((s80.b) bVarN).b());
                    case 2:
                        KProperty[] kPropertyArr3 = CreditCardBoletoPaymentAmountScreen.W;
                        return new GridBoxDelegate(v.k((AttributeSelectorSmallDelegate) creditCardBoletoPaymentAmountScreen.S.getValue(), new AttributeSelectorSmallLoadingDelegate()), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
                    case 3:
                        KProperty[] kPropertyArr4 = CreditCardBoletoPaymentAmountScreen.W;
                        return new CenteredAmountDelegate(new bhi.c(creditCardBoletoPaymentAmountScreen, 25));
                    default:
                        KProperty[] kPropertyArr5 = CreditCardBoletoPaymentAmountScreen.W;
                        CreditCardBoletoPaymentAmountScreen creditCardBoletoPaymentAmountScreen2 = this.f18681b;
                        return dli.f.a(creditCardBoletoPaymentAmountScreen2, (m) creditCardBoletoPaymentAmountScreen2.N.getValue(), v.k(new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), (GridBoxDelegate) creditCardBoletoPaymentAmountScreen2.T.getValue(), (FullScreenStateDelegate) creditCardBoletoPaymentAmountScreen2.R.getValue(), (CenteredAmountDelegate) creditCardBoletoPaymentAmountScreen2.U.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        bu4.h hVar = uiState.f18679b;
        LargeActionButton largeActionButton = d3().f174564b;
        if (hVar instanceof g) {
            w01.k.a(largeActionButton);
            return;
        }
        if (!(hVar instanceof bu4.e)) {
            if (!(hVar instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            w01.k.a(largeActionButton);
        } else {
            w01.k.d(largeActionButton);
            bu4.e eVar = (bu4.e) hVar;
            largeActionButton.setText(eVar.f18674a);
            largeActionButton.setEnabled(eVar.f18675b);
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
    public final xki.e R1() {
        return (m0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (bu4.m) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: T2 */
    public final Boolean getG() {
        return Boolean.valueOf(this.O);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView screenContentRecyclerView = d3().d;
        screenContentRecyclerView.setNestedScrollingEnabled(false);
        screenContentRecyclerView.setOverScrollMode(2);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_card_boleto_payment_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_card_boleto_payment_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        NavBarWithToolbar.Companion companion = NavBarWithToolbar.INSTANCE;
        navBarWithToolbar.j0(false);
        d3().f174564b.setLoadingButtonTag("id_generate_boleto");
        Continuation continuation = null;
        ViewController.P2(this, vkm.q.J(rd0.e.b(((FullScreenStateDelegate) this.R.getValue()).f52371h.f121375b), rd0.e.b(((AttributeSelectorSmallDelegate) this.S.getValue()).p()), new c(rd0.e.b(d3().f174564b.o), 19)), new btd.e(this, continuation, 5), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new brc.h(this, continuation, 8), 3);
    }

    public final u d3() {
        ViewBinding value = this.M.getValue(this, W[0]);
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
        return (dli.c) this.V.getValue();
    }
}
