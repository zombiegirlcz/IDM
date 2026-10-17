package com.revolut.feature.transport.impl.ui.hub.tickets.expired;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.impl.ui.hub.tickets.expired.ExpiredTicketsListScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import hul.c;
import hvf.f;
import hvf.r;
import hwf.d;
import hwf.e;
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
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/transport/impl/ui/hub/tickets/expired/ExpiredTicketsListScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lhwf/e;", "<init>", "()V", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ExpiredTicketsListScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(ExpiredTicketsListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object L;
    public final Object O;
    public final Object P;
    public final Object K = w.y0(new c(12));
    public final int M = R$layout.screen_recycler_navbar;
    public final h N = s.t(this, a.f);

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

    public ExpiredTicketsListScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: hwf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpiredTicketsListScreen f156168b;

            {
                this.f156168b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ExpiredTicketsListScreen expiredTicketsListScreen = this.f156168b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ExpiredTicketsListScreen.Q;
                        ExpiredTicketsListScreen expiredTicketsListScreen2 = this.f156168b;
                        return dli.f.a(expiredTicketsListScreen2, (d) expiredTicketsListScreen2.P.getValue(), v.k(new RowLoadingDelegate(), (RowDelegate) expiredTicketsListScreen2.K.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ExpiredTicketsListScreen.Q;
                        qji.b bVarU2 = expiredTicketsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transport.impl.ui.hub.tickets.expired.di.ExpiredTicketsListScreenInjector");
                        r rVar = (r) bVarU2;
                        return new hvf.f(rVar.f155951b, rVar.f155952c);
                    default:
                        KProperty[] kPropertyArr3 = ExpiredTicketsListScreen.Q;
                        return (d) ((hvf.f) expiredTicketsListScreen.O.getValue()).f155901c.get();
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: hwf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpiredTicketsListScreen f156168b;

            {
                this.f156168b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ExpiredTicketsListScreen expiredTicketsListScreen = this.f156168b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ExpiredTicketsListScreen.Q;
                        ExpiredTicketsListScreen expiredTicketsListScreen2 = this.f156168b;
                        return dli.f.a(expiredTicketsListScreen2, (d) expiredTicketsListScreen2.P.getValue(), v.k(new RowLoadingDelegate(), (RowDelegate) expiredTicketsListScreen2.K.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ExpiredTicketsListScreen.Q;
                        qji.b bVarU2 = expiredTicketsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transport.impl.ui.hub.tickets.expired.di.ExpiredTicketsListScreenInjector");
                        r rVar = (r) bVarU2;
                        return new hvf.f(rVar.f155951b, rVar.f155952c);
                    default:
                        KProperty[] kPropertyArr3 = ExpiredTicketsListScreen.Q;
                        return (d) ((hvf.f) expiredTicketsListScreen.O.getValue()).f155901c.get();
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: hwf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExpiredTicketsListScreen f156168b;

            {
                this.f156168b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ExpiredTicketsListScreen expiredTicketsListScreen = this.f156168b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ExpiredTicketsListScreen.Q;
                        ExpiredTicketsListScreen expiredTicketsListScreen2 = this.f156168b;
                        return dli.f.a(expiredTicketsListScreen2, (d) expiredTicketsListScreen2.P.getValue(), v.k(new RowLoadingDelegate(), (RowDelegate) expiredTicketsListScreen2.K.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ExpiredTicketsListScreen.Q;
                        qji.b bVarU2 = expiredTicketsListScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.transport.impl.ui.hub.tickets.expired.di.ExpiredTicketsListScreenInjector");
                        r rVar = (r) bVarU2;
                        return new hvf.f(rVar.f155951b, rVar.f155952c);
                    default:
                        KProperty[] kPropertyArr3 = ExpiredTicketsListScreen.Q;
                        return (d) ((hvf.f) expiredTicketsListScreen.O.getValue()).f155901c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (f) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final b R2() {
        return (d) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.transport_hub_tab_tickets_section_expired_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transport_hub_tab_tickets_section_expired_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new hbg.h(this, null, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((RowDelegate) this.K.getValue()).f53218h, new hwf.b(0))), null, new hp2.d(this, null, 15), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getX() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
