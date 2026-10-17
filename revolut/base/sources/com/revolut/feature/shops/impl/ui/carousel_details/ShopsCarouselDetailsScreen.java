package com.revolut.feature.shops.impl.ui.carousel_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shops.impl.ui.carousel_details.ShopsCarouselDetailsScreen;
import com.revolut.feature.shops.impl.ui.carousel_details.ShopsCarouselDetailsScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import skm.p0;
import te0.w;
import vc.s;
import whd.b;
import xki.e;
import xv0.x;
import y5g.d;
import yid.c;
import yid.f;
import yid.g;
import yid.m;
import yid.n;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/shops/impl/ui/carousel_details/ShopsCarouselDetailsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lyid/m;", "Ldli/a;", "Lyid/o;", "Lwhd/b;", "feature_shops_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShopsCarouselDetailsScreen extends ViewController<m> implements dli.a, b {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(ShopsCarouselDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final ShopsCarouselDetailsScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final boolean O;
    public final Object P;
    public final Object Q;
    public final h R;
    public final VoucherSmallTileDelegate S;
    public final RowDelegate T;
    public final FullScreenStateDelegate U;
    public final SearchButtonDelegate V;

    public ShopsCarouselDetailsScreen(ShopsCarouselDetailsScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: yid.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsCarouselDetailsScreen f314306b;

            {
                this.f314306b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ShopsCarouselDetailsScreen shopsCarouselDetailsScreen = this.f314306b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ShopsCarouselDetailsScreen.W;
                        ShopsCarouselDetailsScreen shopsCarouselDetailsScreen2 = this.f314306b;
                        return dli.f.a(shopsCarouselDetailsScreen2, shopsCarouselDetailsScreen2.d(), v.k(shopsCarouselDetailsScreen2.U, new ScrollerDelegate(v.k(shopsCarouselDetailsScreen2.S, new SmallCardLoadingDelegate(null)), false), shopsCarouselDetailsScreen2.V, new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), shopsCarouselDetailsScreen2.T, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ShopsCarouselDetailsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(shopsCarouselDetailsScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        ShopsCarouselDetailsScreenContract$InputData shopsCarouselDetailsScreenContract$InputData = shopsCarouselDetailsScreen.K;
                        shopsCarouselDetailsScreenContract$InputData.getClass();
                        return new did.h(dVar, shopsCarouselDetailsScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = ShopsCarouselDetailsScreen.W;
                        return (n) ((did.h) shopsCarouselDetailsScreen.M.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr4 = ShopsCarouselDetailsScreen.W;
                        return (on.a) ((did.h) shopsCarouselDetailsScreen.M.getValue()).f115019g.get();
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: yid.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsCarouselDetailsScreen f314306b;

            {
                this.f314306b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ShopsCarouselDetailsScreen shopsCarouselDetailsScreen = this.f314306b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ShopsCarouselDetailsScreen.W;
                        ShopsCarouselDetailsScreen shopsCarouselDetailsScreen2 = this.f314306b;
                        return dli.f.a(shopsCarouselDetailsScreen2, shopsCarouselDetailsScreen2.d(), v.k(shopsCarouselDetailsScreen2.U, new ScrollerDelegate(v.k(shopsCarouselDetailsScreen2.S, new SmallCardLoadingDelegate(null)), false), shopsCarouselDetailsScreen2.V, new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), shopsCarouselDetailsScreen2.T, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ShopsCarouselDetailsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(shopsCarouselDetailsScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        ShopsCarouselDetailsScreenContract$InputData shopsCarouselDetailsScreenContract$InputData = shopsCarouselDetailsScreen.K;
                        shopsCarouselDetailsScreenContract$InputData.getClass();
                        return new did.h(dVar, shopsCarouselDetailsScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = ShopsCarouselDetailsScreen.W;
                        return (n) ((did.h) shopsCarouselDetailsScreen.M.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr4 = ShopsCarouselDetailsScreen.W;
                        return (on.a) ((did.h) shopsCarouselDetailsScreen.M.getValue()).f115019g.get();
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = true;
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: yid.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsCarouselDetailsScreen f314306b;

            {
                this.f314306b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ShopsCarouselDetailsScreen shopsCarouselDetailsScreen = this.f314306b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ShopsCarouselDetailsScreen.W;
                        ShopsCarouselDetailsScreen shopsCarouselDetailsScreen2 = this.f314306b;
                        return dli.f.a(shopsCarouselDetailsScreen2, shopsCarouselDetailsScreen2.d(), v.k(shopsCarouselDetailsScreen2.U, new ScrollerDelegate(v.k(shopsCarouselDetailsScreen2.S, new SmallCardLoadingDelegate(null)), false), shopsCarouselDetailsScreen2.V, new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), shopsCarouselDetailsScreen2.T, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ShopsCarouselDetailsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(shopsCarouselDetailsScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        ShopsCarouselDetailsScreenContract$InputData shopsCarouselDetailsScreenContract$InputData = shopsCarouselDetailsScreen.K;
                        shopsCarouselDetailsScreenContract$InputData.getClass();
                        return new did.h(dVar, shopsCarouselDetailsScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = ShopsCarouselDetailsScreen.W;
                        return (n) ((did.h) shopsCarouselDetailsScreen.M.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr4 = ShopsCarouselDetailsScreen.W;
                        return (on.a) ((did.h) shopsCarouselDetailsScreen.M.getValue()).f115019g.get();
                }
            }
        });
        final int i5 = 3;
        this.Q = w.y0(new Function0(this) { // from class: yid.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ShopsCarouselDetailsScreen f314306b;

            {
                this.f314306b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                ShopsCarouselDetailsScreen shopsCarouselDetailsScreen = this.f314306b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ShopsCarouselDetailsScreen.W;
                        ShopsCarouselDetailsScreen shopsCarouselDetailsScreen2 = this.f314306b;
                        return dli.f.a(shopsCarouselDetailsScreen2, shopsCarouselDetailsScreen2.d(), v.k(shopsCarouselDetailsScreen2.U, new ScrollerDelegate(v.k(shopsCarouselDetailsScreen2.S, new SmallCardLoadingDelegate(null)), false), shopsCarouselDetailsScreen2.V, new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), shopsCarouselDetailsScreen2.T, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ShopsCarouselDetailsScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(shopsCarouselDetailsScreen.m2()).a().get(did.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", did.d.class, " is not found"));
                        }
                        did.d dVar = ((did.d) aVar2.b()).f115008y;
                        ShopsCarouselDetailsScreenContract$InputData shopsCarouselDetailsScreenContract$InputData = shopsCarouselDetailsScreen.K;
                        shopsCarouselDetailsScreenContract$InputData.getClass();
                        return new did.h(dVar, shopsCarouselDetailsScreenContract$InputData);
                    case 2:
                        KProperty[] kPropertyArr3 = ShopsCarouselDetailsScreen.W;
                        return (n) ((did.h) shopsCarouselDetailsScreen.M.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr4 = ShopsCarouselDetailsScreen.W;
                        return (on.a) ((did.h) shopsCarouselDetailsScreen.M.getValue()).f115019g.get();
                }
            }
        });
        this.R = s.t(this, yid.b.f);
        this.S = new VoucherSmallTileDelegate();
        this.T = new RowDelegate(null, null, 7);
        this.U = new FullScreenStateDelegate();
        this.V = new SearchButtonDelegate();
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((yid.o) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getW() {
        return new AnalyticsProduct.Retail(super.f0());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (did.h) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        ShopsCarouselDetailsScreenContract$InputData shopsCarouselDetailsScreenContract$InputData = this.K;
        navBarWithToolbar.setToolbarTitle(new TextClause(shopsCarouselDetailsScreenContract$InputData.f87148b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        navBarWithToolbar.setTitle(new TextClause(shopsCarouselDetailsScreenContract$InputData.f87148b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new d(this, continuation, 27), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.U.f52371h.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.S.f53608c), null, new yid.d(this, null), 3);
        RowDelegate rowDelegate = this.T;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53218h), null, new yid.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53220l), new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.V.f53283c.f121375b), null, new g(this, null), 3);
        ScreenContentRecyclerView recyclerView = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        com.revolut.kompot.navigable.a.g2(this, vkm.q.C(rd0.e.b(cp5.d.g(x.c(recyclerView, 7))), p0.f264002b), null, new yid.h(this, continuation, 0), 3);
        on.a aVar = (on.a) this.Q.getValue();
        ScreenContentRecyclerView recyclerView2 = d3().f174540c;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
        com.revolut.kompot.navigable.a.g2(this, ((sn.a) aVar).b(recyclerView2, false), null, new yid.h(this, continuation, 1), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.R.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final n d() {
        return (n) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
