package com.revolut.feature.store.impl.ui.search;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.j4;
import c2e.b;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.store.api.R$string;
import com.revolut.feature.store.impl.ui.search.StoreSearchScreen;
import com.revolut.kompot.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import java.util.concurrent.TimeUnit;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import r0e.c;
import r3e.d;
import r3e.f;
import r3e.g;
import r3e.j;
import r3e.k;
import r3e.l;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/store/impl/ui/search/StoreSearchScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lr3e/j;", "Ldli/a;", "Lr3e/l;", "Lc2e/b;", "<init>", "()V", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoreSearchScreen extends ViewController<j> implements dli.a, b {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(StoreSearchScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K = s.t(this, a.f);
    public final int L = R$layout.screen_recycler_navbar;
    public final boolean M = true;
    public final FullScreenStateDelegate N = new FullScreenStateDelegate();
    public final RowDelegate O = new RowDelegate(null, null, 7);
    public final RewardsGridDelegate P = new RewardsGridDelegate();
    public final NewsDelegate Q = new NewsDelegate();
    public final NotificationCentreItemDelegate R = new NotificationCentreItemDelegate();
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;

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

    public StoreSearchScreen() {
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: r3e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreSearchScreen f251277b;

            {
                this.f251277b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StoreSearchScreen storeSearchScreen = this.f251277b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StoreSearchScreen.W;
                        StoreSearchScreen storeSearchScreen2 = this.f251277b;
                        return dli.f.a(storeSearchScreen2, storeSearchScreen2.R2(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), storeSearchScreen2.P, new RewardsGridLoadingDelegate(), storeSearchScreen2.O, new RowLoadingDelegate(), storeSearchScreen2.Q, storeSearchScreen2.R, storeSearchScreen2.N), R$id.recyclerView, new r38.m(storeSearchScreen2, 1), null, null, 48);
                    case 1:
                        KProperty[] kPropertyArr2 = StoreSearchScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(storeSearchScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new k2e.o(((k2e.j) aVar2.b()).f180521r, storeSearchScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                    case 2:
                        KProperty[] kPropertyArr3 = StoreSearchScreen.W;
                        return (k) ((k2e.o) storeSearchScreen.T.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr4 = StoreSearchScreen.W;
                        return (on.a) ((k2e.o) storeSearchScreen.T.getValue()).f180540g.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: r3e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreSearchScreen f251277b;

            {
                this.f251277b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StoreSearchScreen storeSearchScreen = this.f251277b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StoreSearchScreen.W;
                        StoreSearchScreen storeSearchScreen2 = this.f251277b;
                        return dli.f.a(storeSearchScreen2, storeSearchScreen2.R2(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), storeSearchScreen2.P, new RewardsGridLoadingDelegate(), storeSearchScreen2.O, new RowLoadingDelegate(), storeSearchScreen2.Q, storeSearchScreen2.R, storeSearchScreen2.N), R$id.recyclerView, new r38.m(storeSearchScreen2, 1), null, null, 48);
                    case 1:
                        KProperty[] kPropertyArr2 = StoreSearchScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(storeSearchScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new k2e.o(((k2e.j) aVar2.b()).f180521r, storeSearchScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                    case 2:
                        KProperty[] kPropertyArr3 = StoreSearchScreen.W;
                        return (k) ((k2e.o) storeSearchScreen.T.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr4 = StoreSearchScreen.W;
                        return (on.a) ((k2e.o) storeSearchScreen.T.getValue()).f180540g.get();
                }
            }
        });
        final int i3 = 2;
        this.U = w.y0(new Function0(this) { // from class: r3e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreSearchScreen f251277b;

            {
                this.f251277b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StoreSearchScreen storeSearchScreen = this.f251277b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StoreSearchScreen.W;
                        StoreSearchScreen storeSearchScreen2 = this.f251277b;
                        return dli.f.a(storeSearchScreen2, storeSearchScreen2.R2(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), storeSearchScreen2.P, new RewardsGridLoadingDelegate(), storeSearchScreen2.O, new RowLoadingDelegate(), storeSearchScreen2.Q, storeSearchScreen2.R, storeSearchScreen2.N), R$id.recyclerView, new r38.m(storeSearchScreen2, 1), null, null, 48);
                    case 1:
                        KProperty[] kPropertyArr2 = StoreSearchScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(storeSearchScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new k2e.o(((k2e.j) aVar2.b()).f180521r, storeSearchScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                    case 2:
                        KProperty[] kPropertyArr3 = StoreSearchScreen.W;
                        return (k) ((k2e.o) storeSearchScreen.T.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr4 = StoreSearchScreen.W;
                        return (on.a) ((k2e.o) storeSearchScreen.T.getValue()).f180540g.get();
                }
            }
        });
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: r3e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreSearchScreen f251277b;

            {
                this.f251277b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                StoreSearchScreen storeSearchScreen = this.f251277b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StoreSearchScreen.W;
                        StoreSearchScreen storeSearchScreen2 = this.f251277b;
                        return dli.f.a(storeSearchScreen2, storeSearchScreen2.R2(), v.k(new ListSubheaderDelegate(), new ListSubheaderLoadingDelegate(), storeSearchScreen2.P, new RewardsGridLoadingDelegate(), storeSearchScreen2.O, new RowLoadingDelegate(), storeSearchScreen2.Q, storeSearchScreen2.R, storeSearchScreen2.N), R$id.recyclerView, new r38.m(storeSearchScreen2, 1), null, null, 48);
                    case 1:
                        KProperty[] kPropertyArr2 = StoreSearchScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(storeSearchScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new k2e.o(((k2e.j) aVar2.b()).f180521r, storeSearchScreen);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                    case 2:
                        KProperty[] kPropertyArr3 = StoreSearchScreen.W;
                        return (k) ((k2e.o) storeSearchScreen.T.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr4 = StoreSearchScreen.W;
                        return (on.a) ((k2e.o) storeSearchScreen.T.getValue()).f180540g.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((l) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getM() {
        return new AnalyticsProduct.Retail(super.f0());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k2e.o) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.K0(j4.NO_ANIMATION);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.store_home_search_title, null, null, 14));
        navBarWithToolbar.j0(false);
        navBarWithToolbar.postDelayed(new cgd.e(navBarWithToolbar, 7), 500L);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new c(this, continuation, 5), 3);
        r rVarThrottleFirst = d3().f174539b.f59409p.f57336l.throttleFirst(1000L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarThrottleFirst, "throttleFirst(...)");
        ViewController.P2(this, rd0.e.b(rVarThrottleFirst), new qu4.s(view, this, continuation, 23), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59409p.f57337m), new r3e.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.O.f53218h), new r3e.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.f53209c.d), new f(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.p()), new g(this, null), 3);
        ViewController.P2(this, ((sn.a) ((on.a) this.V.getValue())).b(((dli.c) this.S.getValue()).h(), false), new r3e.c(this, null, 1), 3);
    }

    public final m d3() {
        ViewBinding value = this.K.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
