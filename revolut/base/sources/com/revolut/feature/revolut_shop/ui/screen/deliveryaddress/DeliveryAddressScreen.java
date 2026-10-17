package com.revolut.feature.revolut_shop.ui.screen.deliveryaddress;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit.views.navbar.PlusActionNavBarMenuItem;
import com.revolut.feature.revolut_shop.api.R$string;
import com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.DeliveryAddressScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import d4c.b;
import d4c.c;
import d4c.d;
import d4c.f;
import d4c.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolut_shop/ui/screen/deliveryaddress/DeliveryAddressScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ld4c/f;", "Ldli/a;", "Ld4c/h;", "Companion", "a", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeliveryAddressScreen extends ViewController<f> implements dli.a {
    public final int K;
    public final h L;
    public final Object M;
    public final Object N;
    public final SelectableDelegate O;
    public final Object P;
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(DeliveryAddressScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.revolut_shop.ui.screen.deliveryaddress.DeliveryAddressScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public DeliveryAddressScreen(DeliveryAddressScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_nextbutton;
        this.L = s.t(this, b.f);
        this.M = w.y0(new cvi.b(this, inputData, 15));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: d4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeliveryAddressScreen f111271b;

            {
                this.f111271b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        DeliveryAddressScreen.Companion companion = DeliveryAddressScreen.INSTANCE;
                        return (g) ((m3c.b) this.f111271b.M.getValue()).f202325c.get();
                    default:
                        DeliveryAddressScreen.Companion companion2 = DeliveryAddressScreen.INSTANCE;
                        DeliveryAddressScreen deliveryAddressScreen = this.f111271b;
                        return dli.f.a(deliveryAddressScreen, deliveryAddressScreen.R2(), v.k(deliveryAddressScreen.O, new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.O = new SelectableDelegate(new RowDelegate(null, null, 7));
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: d4c.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeliveryAddressScreen f111271b;

            {
                this.f111271b = this;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        DeliveryAddressScreen.Companion companion = DeliveryAddressScreen.INSTANCE;
                        return (g) ((m3c.b) this.f111271b.M.getValue()).f202325c.get();
                    default:
                        DeliveryAddressScreen.Companion companion2 = DeliveryAddressScreen.INSTANCE;
                        DeliveryAddressScreen deliveryAddressScreen = this.f111271b;
                        return dli.f.a(deliveryAddressScreen, deliveryAddressScreen.R2(), v.k(deliveryAddressScreen.O, new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        d4c.h uiState = (d4c.h) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174564b.setEnabled(uiState.f111276b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (m3c.b) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_select_delivery_address_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setMenuItems(u.c(PlusActionNavBarMenuItem.Companion.c(PlusActionNavBarMenuItem.INSTANCE, "NEW_ADDRESS_MENU_ITEM_LIST_ID", new TextLocalisedClause(R$string.revolut_shop_flow_home_screen_select_delivery_address_bar_button_new_title, null, null, 14), null, 60)));
        d3().f174564b.setText(new TextLocalisedClause(R$string.revolut_shop_flow_checkout_screen_delivery_address_button_title, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174565c.o.f57403b), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.O.r()), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, null, 2), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g R2() {
        return (g) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
