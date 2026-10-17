package com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import cli.o;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.OrderInitPageListScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import i27.c;
import i27.d;
import i27.f;
import i27.g;
import i27.i;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import us6.l1;
import vc.s;
import vkm.j2;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/sales/order_init_page/list/OrderInitPageListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Li27/i;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OrderInitPageListScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(OrderInitPageListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final FullScreenStateDelegate L = new FullScreenStateDelegate();
    public final RowDelegate M = new RowDelegate(null, null, 7);
    public final ActionsDelegate N = new ActionsDelegate();
    public final boolean O = true;
    public final int P = R$layout.screen_recycler_navbar;
    public final Object Q;
    public final Object R;
    public final Object S;

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

    public OrderInitPageListScreen() {
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: i27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderInitPageListScreen f157874b;

            {
                this.f157874b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                OrderInitPageListScreen orderInitPageListScreen = this.f157874b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = OrderInitPageListScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(orderInitPageListScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new l1(((us6.q) aVar2.b()).Q);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = OrderInitPageListScreen.T;
                        return (g) ((l1) orderInitPageListScreen.Q.getValue()).f282617l.get();
                    default:
                        KProperty[] kPropertyArr3 = OrderInitPageListScreen.T;
                        OrderInitPageListScreen orderInitPageListScreen2 = this.f157874b;
                        return dli.f.a(orderInitPageListScreen2, orderInitPageListScreen2.d(), v.k(orderInitPageListScreen2.L, orderInitPageListScreen2.M, orderInitPageListScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: i27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderInitPageListScreen f157874b;

            {
                this.f157874b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                OrderInitPageListScreen orderInitPageListScreen = this.f157874b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OrderInitPageListScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(orderInitPageListScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new l1(((us6.q) aVar2.b()).Q);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = OrderInitPageListScreen.T;
                        return (g) ((l1) orderInitPageListScreen.Q.getValue()).f282617l.get();
                    default:
                        KProperty[] kPropertyArr3 = OrderInitPageListScreen.T;
                        OrderInitPageListScreen orderInitPageListScreen2 = this.f157874b;
                        return dli.f.a(orderInitPageListScreen2, orderInitPageListScreen2.d(), v.k(orderInitPageListScreen2.L, orderInitPageListScreen2.M, orderInitPageListScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: i27.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderInitPageListScreen f157874b;

            {
                this.f157874b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                OrderInitPageListScreen orderInitPageListScreen = this.f157874b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = OrderInitPageListScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(orderInitPageListScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new l1(((us6.q) aVar2.b()).Q);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = OrderInitPageListScreen.T;
                        return (g) ((l1) orderInitPageListScreen.Q.getValue()).f282617l.get();
                    default:
                        KProperty[] kPropertyArr3 = OrderInitPageListScreen.T;
                        OrderInitPageListScreen orderInitPageListScreen2 = this.f157874b;
                        return dli.f.a(orderInitPageListScreen2, orderInitPageListScreen2.d(), v.k(orderInitPageListScreen2.L, orderInitPageListScreen2.M, orderInitPageListScreen2.N, new RowLoadingDelegate(), new ListSubheaderDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        i27.h hVar = uiState.f157879a;
        navBarWithToolbar.setMenuItems(hVar.f157877a);
        if (hVar.f157878b) {
            navBarWithToolbar.j0(false);
            navBarWithToolbar.K0(j4.FROM_CLICKED_BUTTON);
        } else {
            navBarWithToolbar.H0(false);
            navBarWithToolbar.m0(j4.FROM_CLICKED_BUTTON);
            navBarWithToolbar.i0();
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController, com.revolut.kompot.navigable.a
    public final boolean F2() {
        if (!((com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a) ((j2) ((b) d()).f74195r.f22677a).getValue()).d) {
            return super.F2();
        }
        b bVar = (b) d();
        y yVar = bVar.f74195r;
        if (((com.revolut.feature.freelancer.impl.ui.sales.order_init_page.list.a) ((j2) yVar.f22677a).getValue()).d) {
            bVar.H2(yVar, new g7b.q(false, 19));
            return true;
        }
        bVar.B2();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l1) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_payment_links_header_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        int i = 0;
        int i2 = 1;
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(rd0.e.b(d3().f174539b.f59410q), rd0.e.b(d3().f174539b.f59409p.f57336l)), null, new c(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, new hsl.c(rd0.e.b(d3().f174539b.o.f57403b), 16), null, new c(this, continuation, i2), 3);
        com.revolut.kompot.navigable.a.g2(this, t1.d(rd0.e.b(d3().f174539b.f59409p.f57337m), 300L), null, new d(this, continuation, i), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f53218h), null, new i27.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f51611c.f121375b), null, new d(this, continuation, i2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f52371h.f121375b), null, new f(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.K.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getP() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
