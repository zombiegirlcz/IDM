package com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreen;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.AddShippingTrackingScreenContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import wp5.y;
import xki.e;
import zac.c;
import zac.d;
import zac.j;
import zac.k;
import zac.l;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/add_shipping_tracking/AddShippingTrackingScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzac/j;", "Ldli/a;", "Lzac/l;", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddShippingTrackingScreen extends ViewController<j> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(AddShippingTrackingScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final AddShippingTrackingScreenContract$InputData K;
    public final Integer L;
    public final int M;
    public final InputTextDelegate N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;

    public AddShippingTrackingScreen(AddShippingTrackingScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = Integer.valueOf(R$style.UiKitTheme_Transparent);
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        this.N = new InputTextDelegate(null);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: zac.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddShippingTrackingScreen f320647b;

            {
                this.f320647b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddShippingTrackingScreen addShippingTrackingScreen = this.f320647b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddShippingTrackingScreen.S;
                        AddShippingTrackingScreen addShippingTrackingScreen2 = this.f320647b;
                        return dli.f.a(addShippingTrackingScreen2, addShippingTrackingScreen2.d(), u.c(addShippingTrackingScreen2.N), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = AddShippingTrackingScreen.S;
                        qji.b bVarU2 = addShippingTrackingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.di.AddShippingTrackingScreenInjector");
                        uac.i iVar = (uac.i) bVarU2;
                        uac.f fVar = iVar.f278584b;
                        uac.i iVar2 = iVar.f278585c;
                        AddShippingTrackingScreenContract$InputData addShippingTrackingScreenContract$InputData = addShippingTrackingScreen.K;
                        addShippingTrackingScreenContract$InputData.getClass();
                        return new uac.a(fVar, iVar2, addShippingTrackingScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AddShippingTrackingScreen.S;
                        return (k) ((uac.a) addShippingTrackingScreen.Q.getValue()).f278562b.get();
                }
            }
        });
        this.P = s.t(this, zac.b.f);
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: zac.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddShippingTrackingScreen f320647b;

            {
                this.f320647b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddShippingTrackingScreen addShippingTrackingScreen = this.f320647b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddShippingTrackingScreen.S;
                        AddShippingTrackingScreen addShippingTrackingScreen2 = this.f320647b;
                        return dli.f.a(addShippingTrackingScreen2, addShippingTrackingScreen2.d(), u.c(addShippingTrackingScreen2.N), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = AddShippingTrackingScreen.S;
                        qji.b bVarU2 = addShippingTrackingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.di.AddShippingTrackingScreenInjector");
                        uac.i iVar = (uac.i) bVarU2;
                        uac.f fVar = iVar.f278584b;
                        uac.i iVar2 = iVar.f278585c;
                        AddShippingTrackingScreenContract$InputData addShippingTrackingScreenContract$InputData = addShippingTrackingScreen.K;
                        addShippingTrackingScreenContract$InputData.getClass();
                        return new uac.a(fVar, iVar2, addShippingTrackingScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AddShippingTrackingScreen.S;
                        return (k) ((uac.a) addShippingTrackingScreen.Q.getValue()).f278562b.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: zac.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddShippingTrackingScreen f320647b;

            {
                this.f320647b = this;
            }

            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddShippingTrackingScreen addShippingTrackingScreen = this.f320647b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddShippingTrackingScreen.S;
                        AddShippingTrackingScreen addShippingTrackingScreen2 = this.f320647b;
                        return dli.f.a(addShippingTrackingScreen2, addShippingTrackingScreen2.d(), u.c(addShippingTrackingScreen2.N), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = AddShippingTrackingScreen.S;
                        qji.b bVarU2 = addShippingTrackingScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.order_tracking.impl.ui.add_shipping_tracking.di.AddShippingTrackingScreenInjector");
                        uac.i iVar = (uac.i) bVarU2;
                        uac.f fVar = iVar.f278584b;
                        uac.i iVar2 = iVar.f278585c;
                        AddShippingTrackingScreenContract$InputData addShippingTrackingScreenContract$InputData = addShippingTrackingScreen.K;
                        addShippingTrackingScreenContract$InputData.getClass();
                        return new uac.a(fVar, iVar2, addShippingTrackingScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = AddShippingTrackingScreen.S;
                        return (k) ((uac.a) addShippingTrackingScreen.Q.getValue()).f278562b.get();
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
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(uiState.f320654a, null);
        d3().f174564b.setText(uiState.f320655b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (uac.a) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        d3().f174564b.setLoadingButtonTag("ADD_TRACKING_BUTTON_LOADING_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174565c.f59410q), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174564b.o), new c(this, continuation, 1), 3);
        InputTextDelegate inputTextDelegate = this.N;
        ViewController.P2(this, rd0.e.b(inputTextDelegate.e.f121375b), new d(this, null), 3);
        ViewController.P2(this, y.x(inputTextDelegate.f52575g.f121375b, inputTextDelegate.f52577j.f121375b, "mergeWith(...)"), new zac.e(this, null), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k d() {
        return (k) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
