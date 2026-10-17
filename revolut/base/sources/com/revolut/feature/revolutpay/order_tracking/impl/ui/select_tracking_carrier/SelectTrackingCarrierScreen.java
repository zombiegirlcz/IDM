package com.revolut.feature.revolutpay.order_tracking.impl.ui.select_tracking_carrier;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.select_tracking_carrier.SelectTrackingCarrierScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import obc.b;
import obc.c;
import obc.i;
import obc.j;
import obc.k;
import obc.l;
import te0.w;
import uac.g;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/select_tracking_carrier/SelectTrackingCarrierScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lobc/j;", "Ldli/a;", "Lobc/l;", "<init>", "()V", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectTrackingCarrierScreen extends ViewController<j> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(SelectTrackingCarrierScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object O;
    public final Object Q;
    public final Object R;
    public final Integer K = Integer.valueOf(R$style.UiKitTheme_Transparent);
    public final int L = R$layout.screen_recycler_navbar;
    public final RowDelegate M = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate N = new FullScreenStateDelegate();
    public final h P = s.t(this, a.f);

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public SelectTrackingCarrierScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: obc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectTrackingCarrierScreen f223912b;

            {
                this.f223912b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SelectTrackingCarrierScreen selectTrackingCarrierScreen = this.f223912b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SelectTrackingCarrierScreen.S;
                        SelectTrackingCarrierScreen selectTrackingCarrierScreen2 = this.f223912b;
                        return dli.f.a(selectTrackingCarrierScreen2, selectTrackingCarrierScreen2.R2(), v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), selectTrackingCarrierScreen2.M, selectTrackingCarrierScreen2.N), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = SelectTrackingCarrierScreen.S;
                        qji.b bVarU2 = selectTrackingCarrierScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.order_tracking.impl.ui.select_tracking_carrier.di.SelectTrackingCarrierScreenInjector");
                        uac.f fVar = ((uac.i) bVarU2).f278584b;
                        uac.g gVar = new uac.g();
                        gVar.f278579a = e4m.b.b(new uac.c(fVar, gVar, 1));
                        return gVar;
                    default:
                        KProperty[] kPropertyArr3 = SelectTrackingCarrierScreen.S;
                        return (k) ((uac.g) selectTrackingCarrierScreen.Q.getValue()).f278579a.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: obc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectTrackingCarrierScreen f223912b;

            {
                this.f223912b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SelectTrackingCarrierScreen selectTrackingCarrierScreen = this.f223912b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectTrackingCarrierScreen.S;
                        SelectTrackingCarrierScreen selectTrackingCarrierScreen2 = this.f223912b;
                        return dli.f.a(selectTrackingCarrierScreen2, selectTrackingCarrierScreen2.R2(), v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), selectTrackingCarrierScreen2.M, selectTrackingCarrierScreen2.N), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = SelectTrackingCarrierScreen.S;
                        qji.b bVarU2 = selectTrackingCarrierScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.order_tracking.impl.ui.select_tracking_carrier.di.SelectTrackingCarrierScreenInjector");
                        uac.f fVar = ((uac.i) bVarU2).f278584b;
                        uac.g gVar = new uac.g();
                        gVar.f278579a = e4m.b.b(new uac.c(fVar, gVar, 1));
                        return gVar;
                    default:
                        KProperty[] kPropertyArr3 = SelectTrackingCarrierScreen.S;
                        return (k) ((uac.g) selectTrackingCarrierScreen.Q.getValue()).f278579a.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: obc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SelectTrackingCarrierScreen f223912b;

            {
                this.f223912b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SelectTrackingCarrierScreen selectTrackingCarrierScreen = this.f223912b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SelectTrackingCarrierScreen.S;
                        SelectTrackingCarrierScreen selectTrackingCarrierScreen2 = this.f223912b;
                        return dli.f.a(selectTrackingCarrierScreen2, selectTrackingCarrierScreen2.R2(), v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), selectTrackingCarrierScreen2.M, selectTrackingCarrierScreen2.N), 0, null, null, null, 60);
                    case 1:
                        KProperty[] kPropertyArr2 = SelectTrackingCarrierScreen.S;
                        qji.b bVarU2 = selectTrackingCarrierScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.revolutpay.order_tracking.impl.ui.select_tracking_carrier.di.SelectTrackingCarrierScreenInjector");
                        uac.f fVar = ((uac.i) bVarU2).f278584b;
                        uac.g gVar = new uac.g();
                        gVar.f278579a = e4m.b.b(new uac.c(fVar, gVar, 1));
                        return gVar;
                    default:
                        KProperty[] kPropertyArr3 = SelectTrackingCarrierScreen.S;
                        return (k) ((uac.g) selectTrackingCarrierScreen.Q.getValue()).f278579a.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2, reason: from getter */
    public final Integer getK() {
        return this.K;
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        i iVar = uiState.f223922a;
        navBarWithToolbar.setTitle(iVar.f223919a, null);
        navBarWithToolbar.setHint(iVar.f223920b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSearchButtonActive(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new nuh.j(this, null, 27), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), new nt.e(2, R2(), k.class, "onSearchQueryUpdated", "onSearchQueryUpdated(Ljava/lang/String;)V", 4, 13), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.P.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
