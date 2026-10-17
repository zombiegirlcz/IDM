package com.revolut.feature.revolutpay.order_tracking.impl.ui.deliveries;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import co7.c;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.deliveries.DeliveriesScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dbc.f;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import uac.d;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/revolutpay/order_tracking/impl/ui/deliveries/DeliveriesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ldbc/f;", "<init>", "()V", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeliveriesScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(DeliveriesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object N;
    public final Object P;
    public final Object Q;
    public final int K = R$layout.screen_recycler_navbar;
    public final RowDelegate L = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final h O = s.t(this, a.f);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
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

    public DeliveriesScreen() {
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: dbc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeliveriesScreen f112706b;

            {
                this.f112706b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DeliveriesScreen deliveriesScreen = this.f112706b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = DeliveriesScreen.R;
                        DeliveriesScreen deliveriesScreen2 = this.f112706b;
                        return dli.f.a(deliveriesScreen2, (e) deliveriesScreen2.Q.getValue(), v.k(deliveriesScreen2.M, new RowLoadingDelegate(), deliveriesScreen2.L), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DeliveriesScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(deliveriesScreen.m2()).a().get(uac.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new uac.d(((uac.f) aVar2.b()).f278578m);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", uac.f.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = DeliveriesScreen.R;
                        return (e) ((uac.d) deliveriesScreen.P.getValue()).f278567a.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: dbc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeliveriesScreen f112706b;

            {
                this.f112706b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DeliveriesScreen deliveriesScreen = this.f112706b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeliveriesScreen.R;
                        DeliveriesScreen deliveriesScreen2 = this.f112706b;
                        return dli.f.a(deliveriesScreen2, (e) deliveriesScreen2.Q.getValue(), v.k(deliveriesScreen2.M, new RowLoadingDelegate(), deliveriesScreen2.L), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DeliveriesScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(deliveriesScreen.m2()).a().get(uac.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new uac.d(((uac.f) aVar2.b()).f278578m);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", uac.f.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = DeliveriesScreen.R;
                        return (e) ((uac.d) deliveriesScreen.P.getValue()).f278567a.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: dbc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeliveriesScreen f112706b;

            {
                this.f112706b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DeliveriesScreen deliveriesScreen = this.f112706b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = DeliveriesScreen.R;
                        DeliveriesScreen deliveriesScreen2 = this.f112706b;
                        return dli.f.a(deliveriesScreen2, (e) deliveriesScreen2.Q.getValue(), v.k(deliveriesScreen2.M, new RowLoadingDelegate(), deliveriesScreen2.L), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = DeliveriesScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(deliveriesScreen.m2()).a().get(uac.f.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new uac.d(((uac.f) aVar2.b()).f278578m);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", uac.f.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = DeliveriesScreen.R;
                        return (e) ((uac.d) deliveriesScreen.P.getValue()).f278567a.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(uiState.f112709a, null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (dbc.e) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new c(this, null, 26), 3);
        ViewController.P2(this, rd0.e.b(this.M.f52371h.f121375b), new dbc.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.L.f53218h), new dbc.c(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
