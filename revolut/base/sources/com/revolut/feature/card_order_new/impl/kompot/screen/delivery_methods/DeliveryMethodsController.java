package com.revolut.feature.card_order_new.impl.kompot.screen.delivery_methods;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.PermissionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_order_new.impl.kompot.screen.delivery_methods.DeliveryMethodsController;
import com.revolut.feature.cards_core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import eq8.b;
import f33.c;
import f33.d;
import f33.i;
import f33.l;
import f33.n;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import te0.w;
import tx0.j0;
import vc.s;
import x13.x;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/card_order_new/impl/kompot/screen/delivery_methods/DeliveryMethodsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lf33/l;", "Ldli/a;", "Lf33/n;", "Lno/m;", "feature_card_order_new_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeliveryMethodsController extends ViewController<l> implements a, m {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(DeliveryMethodsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarFooterNextbuttonBinding;", 0))};
    public final AnalyticsProduct K;
    public final Object L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public DeliveryMethodsController(DeliveryMethodsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData.k;
        this.L = w.y0(new b(this, inputData, 23));
        this.M = R$layout.screen_recycler_navbar_footer_nextbutton;
        this.N = s.t(this, f33.b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: f33.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeliveryMethodsController f131879b;

            {
                this.f131879b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DeliveryMethodsController deliveryMethodsController = this.f131879b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DeliveryMethodsController.T;
                        return (i) ((x) deliveryMethodsController.L.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = DeliveryMethodsController.T;
                        return new SelectableDelegate((RowDelegate) deliveryMethodsController.P.getValue());
                    default:
                        KProperty[] kPropertyArr3 = DeliveryMethodsController.T;
                        DeliveryMethodsController deliveryMethodsController2 = this.f131879b;
                        return dli.f.a(deliveryMethodsController2, deliveryMethodsController2.R2(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), (RowDelegate) deliveryMethodsController2.P.getValue(), (SelectableDelegate) deliveryMethodsController2.Q.getValue(), (PermissionDelegate) deliveryMethodsController2.R.getValue(), new CellDetailsDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = w.y0(new f2i.b(4));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: f33.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeliveryMethodsController f131879b;

            {
                this.f131879b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DeliveryMethodsController deliveryMethodsController = this.f131879b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeliveryMethodsController.T;
                        return (i) ((x) deliveryMethodsController.L.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = DeliveryMethodsController.T;
                        return new SelectableDelegate((RowDelegate) deliveryMethodsController.P.getValue());
                    default:
                        KProperty[] kPropertyArr3 = DeliveryMethodsController.T;
                        DeliveryMethodsController deliveryMethodsController2 = this.f131879b;
                        return dli.f.a(deliveryMethodsController2, deliveryMethodsController2.R2(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), (RowDelegate) deliveryMethodsController2.P.getValue(), (SelectableDelegate) deliveryMethodsController2.Q.getValue(), (PermissionDelegate) deliveryMethodsController2.R.getValue(), new CellDetailsDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.R = w.y0(new f2i.b(5));
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: f33.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeliveryMethodsController f131879b;

            {
                this.f131879b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DeliveryMethodsController deliveryMethodsController = this.f131879b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeliveryMethodsController.T;
                        return (i) ((x) deliveryMethodsController.L.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = DeliveryMethodsController.T;
                        return new SelectableDelegate((RowDelegate) deliveryMethodsController.P.getValue());
                    default:
                        KProperty[] kPropertyArr3 = DeliveryMethodsController.T;
                        DeliveryMethodsController deliveryMethodsController2 = this.f131879b;
                        return dli.f.a(deliveryMethodsController2, deliveryMethodsController2.R2(), v.k(new RowLoadingDelegate(), new FullScreenStateDelegate(), (RowDelegate) deliveryMethodsController2.P.getValue(), (SelectableDelegate) deliveryMethodsController2.Q.getValue(), (PermissionDelegate) deliveryMethodsController2.R.getValue(), new CellDetailsDelegate()), R$id.screenRecyclerNavbarFooterNextbutton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().e.setMenuItems(uiState.f131903c);
        d3().f174557b.setText(uiState.f131902b);
        d3().f174558c.setTextClause(uiState.d);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (x) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().e;
        navBarWithToolbar.setTitleAutoSize(false);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.card_delivery_methods_title_choose_method, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.card_delivery_methods_title_choose_method, null, null, 14));
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        LargeActionButton largeActionButton = d3().f174557b;
        largeActionButton.setText(new TextLocalisedClause(R$string.card_set_pin_continue, null, null, 14));
        largeActionButton.setTag("DELIVERY_METHODS_NEXT_BUTTON_TAG");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((SelectableDelegate) this.Q.getValue()).r()), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PermissionDelegate) this.R.getValue()).d.f121375b), null, new d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174557b.o), null, new f33.e(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.f59410q), null, new f33.e(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().e.o.f57403b), null, new d(this, null, 1), 3);
    }

    public final jii.s d3() {
        ViewBinding value = this.N.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.s) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i d() {
        return (i) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }
}
