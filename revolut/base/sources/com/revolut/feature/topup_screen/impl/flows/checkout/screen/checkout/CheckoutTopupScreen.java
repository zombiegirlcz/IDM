package com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import cli.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsPriceDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutTopupScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import cw7.j;
import cxe.d0;
import cxe.e0;
import cxe.f0;
import cxe.g0;
import cxe.i0;
import cxe.k0;
import cxe.l0;
import cxe.n;
import cxe.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import ove.c0;
import te0.w;
import tx0.j0;
import tx0.t3;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/flows/checkout/screen/checkout/CheckoutTopupScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcxe/n;", "Ldli/a;", "Lcxe/q;", "Lno/k;", "Lno/m;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CheckoutTopupScreen extends ViewController<n> implements dli.a, k, m {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(CheckoutTopupScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final int K;
    public final h L;
    public final AnalyticsProduct M;
    public AnalyticsContext N;
    public final Object O;
    public final Object P;
    public final RowDelegate Q;
    public final ActionsDelegate R;
    public final FullScreenStateDelegate S;
    public final CellDetailsDelegate T;
    public final CellDetailsActionDelegate U;
    public final AttributeSelectorSmallDelegate V;
    public final GridBoxDelegate W;
    public final Object X;

    public CheckoutTopupScreen(CheckoutScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_action_footer;
        this.L = s.t(this, d0.f);
        this.M = inputData.e;
        this.O = w.y0(new cvi.b(this, inputData, 2));
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: cxe.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckoutTopupScreen f109937b;

            {
                this.f109937b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CheckoutTopupScreen.Y;
                        return (o) ((ove.c0) this.f109937b.O.getValue()).f230047h.get();
                    default:
                        KProperty[] kPropertyArr2 = CheckoutTopupScreen.Y;
                        CheckoutTopupScreen checkoutTopupScreen = this.f109937b;
                        return dli.f.a(checkoutTopupScreen, checkoutTopupScreen.R2(), zhm.v.k(checkoutTopupScreen.Q, checkoutTopupScreen.R, checkoutTopupScreen.S, new CellDetailsLoadingDelegate(), checkoutTopupScreen.T, new CellDetailsPriceDelegate(), new ListCellDelegate(), checkoutTopupScreen.U, checkoutTopupScreen.W, new ListSubheaderDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
        this.Q = new RowDelegate(null, null, 7);
        this.R = new ActionsDelegate();
        this.S = new FullScreenStateDelegate();
        this.T = new CellDetailsDelegate();
        this.U = new CellDetailsActionDelegate();
        AttributeSelectorSmallDelegate attributeSelectorSmallDelegate = new AttributeSelectorSmallDelegate();
        this.V = attributeSelectorSmallDelegate;
        this.W = new GridBoxDelegate(u.c(attributeSelectorSmallDelegate), 0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14);
        final int i2 = 1;
        this.X = w.y0(new Function0(this) { // from class: cxe.c0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CheckoutTopupScreen f109937b;

            {
                this.f109937b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CheckoutTopupScreen.Y;
                        return (o) ((ove.c0) this.f109937b.O.getValue()).f230047h.get();
                    default:
                        KProperty[] kPropertyArr2 = CheckoutTopupScreen.Y;
                        CheckoutTopupScreen checkoutTopupScreen = this.f109937b;
                        return dli.f.a(checkoutTopupScreen, checkoutTopupScreen.R2(), zhm.v.k(checkoutTopupScreen.Q, checkoutTopupScreen.R, checkoutTopupScreen.S, new CellDetailsLoadingDelegate(), checkoutTopupScreen.T, new CellDetailsPriceDelegate(), new ListCellDelegate(), checkoutTopupScreen.U, checkoutTopupScreen.W, new ListSubheaderDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        cxe.q uiState = (cxe.q) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        AnalyticsContext analyticsContext = uiState.d;
        i iVar = uiState.f109964c;
        this.N = analyticsContext;
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        p pVar = uiState.f109963b;
        if (pVar != null) {
            Clause clause = pVar.f109960b;
            Clause clause2 = pVar.f109959a;
            navBarWithToolbar.l0();
            navBarWithToolbar.setToolbarTitle(clause2);
            navBarWithToolbar.setTitle(clause2, null);
            navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
            navBarWithToolbar.setSecondDescriptionText(clause);
            navBarWithToolbar.setSecondDescriptionVisible(clause != null);
            navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(pVar.f109961c));
            navBarWithToolbar.setMenuItems(pVar.d);
        } else {
            navBarWithToolbar.setNavigationButtonImage(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
            navBarWithToolbar.I0(t3.TWO_LINES, false);
        }
        ActionFooterView actionFooterView = d3().f174533b;
        actionFooterView.setVisibility(iVar == null ? 8 : 0);
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.N = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c0) this.O.getValue();
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getN() {
        return this.N;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.o.f57403b), null, new g0(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174534c.f59410q), null, new i0(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f), null, new i0(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.f58955g), null, new i0(this, continuation, 2), 3);
        RowDelegate rowDelegate = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53220l), null, new cxe.j0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new k0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(this.R.f51611c.f121375b, new j(12))), null, new g0(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f52371h.f121375b), null, new l0(this, null), 3);
        CellDetailsDelegate cellDetailsDelegate = this.T;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cellDetailsDelegate.d), null, new e0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(cellDetailsDelegate.e), null, new f0(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174533b.e), null, new g0(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.V.p()), null, new cxe.h0(this, null), 3);
    }

    public final jii.k d3() {
        ViewBinding value = this.L.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final cxe.o R2() {
        return (cxe.o) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.X.getValue();
    }
}
