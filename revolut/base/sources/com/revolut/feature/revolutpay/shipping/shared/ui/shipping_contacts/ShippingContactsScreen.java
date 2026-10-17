package com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import bac.g;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revolutpay.shipping.api.navigation.ShippingContactsScreenDescriptor$InputData;
import com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.ShippingContactsScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import grl.k9;
import jii.u;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import vc.s;
import x9h.d;
import xd2.n;
import xec.j;
import xec.k;
import xec.l;
import xec.o;
import xec.p;
import xec.r;
import xec.t;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/revolutpay/shipping/shared/ui/shipping_contacts/ShippingContactsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Loec/a;", "Ldli/a;", "Lxec/m;", "Lno/m;", "feature_revolut_pay_shipping_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShippingContactsScreen extends ViewController<oec.a> implements dli.a, m {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(ShippingContactsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final AnalyticsProduct.Retail K;
    public final Integer L;
    public final int M;
    public final h N;
    public final RowDelegate O;
    public final SelectableDelegate P;
    public final FullScreenStateDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public ShippingContactsScreen(ShippingContactsScreenDescriptor$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = frl.a.e;
        this.K = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        this.L = inputData.f84745c ? Integer.valueOf(R$style.UiKitTheme_Transparent) : null;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = s.t(this, o.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.O = rowDelegate;
        this.P = new SelectableDelegate(rowDelegate);
        this.Q = new FullScreenStateDelegate();
        this.R = w.y0(new wrj.m(this, inputData, 28));
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: xec.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShippingContactsScreen f304601b;

            {
                this.f304601b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = ShippingContactsScreen.U;
                        bac.g gVar = (bac.g) this.f304601b.R.getValue();
                        switch (gVar.f14032a) {
                            case 0:
                                return (j) gVar.e.get();
                            case 1:
                                return (j) gVar.e.get();
                            default:
                                return (j) gVar.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = ShippingContactsScreen.U;
                        ShippingContactsScreen shippingContactsScreen = this.f304601b;
                        return dli.f.a(shippingContactsScreen, shippingContactsScreen.d(), zhm.v.k(new RowLoadingDelegate(), shippingContactsScreen.Q, shippingContactsScreen.O, shippingContactsScreen.P), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: xec.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShippingContactsScreen f304601b;

            {
                this.f304601b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ShippingContactsScreen.U;
                        bac.g gVar = (bac.g) this.f304601b.R.getValue();
                        switch (gVar.f14032a) {
                            case 0:
                                return (j) gVar.e.get();
                            case 1:
                                return (j) gVar.e.get();
                            default:
                                return (j) gVar.e.get();
                        }
                    default:
                        KProperty[] kPropertyArr2 = ShippingContactsScreen.U;
                        ShippingContactsScreen shippingContactsScreen = this.f304601b;
                        return dli.f.a(shippingContactsScreen, shippingContactsScreen.d(), zhm.v.k(new RowLoadingDelegate(), shippingContactsScreen.Q, shippingContactsScreen.O, shippingContactsScreen.P), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getL() {
        return this.L;
    }

    @Override // cli.w
    public final void B(cli.o oVar, q qVar) {
        xec.m uiState = (xec.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        l lVar = uiState.f304598b;
        TextLocalisedClause textLocalisedClause = lVar.f304595a;
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        Clause clause = lVar.f304596b;
        if (clause != null) {
            navBarWithToolbar.setDescriptionText(clause);
            navBarWithToolbar.setDescriptionVisible(true);
        }
        navBarWithToolbar.setMenuItems(v.l(uiState.f304599c));
        k kVar = uiState.d;
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(kVar.f304593a);
        largeActionButton.setEnabled(kVar.f304594b);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new p(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(this.P.r()), new xec.q(this, null), 3);
        RowDelegate rowDelegate = this.O;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new r(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new p(this, continuation, 1), 3);
        efm.r rVarFilter = d3().f174565c.o.f57403b.filter(new d(25, new n(5)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new p(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.k), new xec.s(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.f52371h.f121375b), new t(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.N.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }
}
