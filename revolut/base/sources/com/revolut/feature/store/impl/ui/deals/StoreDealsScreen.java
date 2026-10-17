package com.revolut.feature.store.impl.ui.deals;

import a3e.e;
import a3e.f;
import a3e.i;
import a3e.k;
import a3e.l;
import a3e.m;
import a3e.n;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.BigTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import com.revolut.core.ui_kit.delegates.MapPlainLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.StaggeredGridItemDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallLoadingDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.feature.store.impl.R$id;
import com.revolut.feature.store.impl.R$layout;
import com.revolut.feature.store.impl.ui.deals.StoreDealsScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import h2e.g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import yp0.v;
import yp0.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/feature/store/impl/ui/deals/StoreDealsScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "La3e/e;", "Ldli/a;", "La3e/g;", "Lc2e/b;", "<init>", "()V", "Companion", "a", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoreDealsScreen extends ViewController<e> implements dli.a, c2e.b {
    public final BigTileDelegate K;
    public final ListSubheaderDelegate L;
    public final MapPlainDelegate M;
    public final RewardsGridDelegate N;
    public final FullScreenStateDelegate O;
    public final VoucherSmallTileDelegate P;
    public final StaggeredGridItemDelegate Q;
    public final StaggeredGridItemDelegate R;
    public final ScrollerDelegate S;
    public v T;
    public final h U;
    public final int V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f88691a0 = {o0.f186429a.j(new h0(StoreDealsScreen.class, "binding", "getBinding()Lcom/revolut/feature/store/impl/databinding/ScreenStoreDealsBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, g.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/store/impl/databinding/ScreenStoreDealsBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.storeDeals_recyclerView;
            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
            if (screenContentRecyclerView != null) {
                return new g((ControllerContainerFrameLayout) p0, screenContentRecyclerView);
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public StoreDealsScreen() {
        BigTileDelegate bigTileDelegate = new BigTileDelegate();
        this.K = bigTileDelegate;
        this.L = new ListSubheaderDelegate();
        this.M = new MapPlainDelegate();
        this.N = new RewardsGridDelegate();
        this.O = new FullScreenStateDelegate();
        VoucherSmallTileDelegate voucherSmallTileDelegate = new VoucherSmallTileDelegate();
        this.P = voucherSmallTileDelegate;
        VoucherSmallLoadingDelegate voucherSmallLoadingDelegate = new VoucherSmallLoadingDelegate();
        this.Q = new StaggeredGridItemDelegate(voucherSmallTileDelegate);
        this.R = new StaggeredGridItemDelegate(voucherSmallLoadingDelegate);
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        this.S = new ScrollerDelegate(zhm.v.k(bigTileDelegate, new BigTileLoadingDelegate()), false);
        this.U = s.t(this, b.f);
        this.V = R$layout.screen_store_deals;
        this.W = w.y0(new Function0(this) { // from class: a3e.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreDealsScreen f1110b;

            {
                this.f1110b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                StoreDealsScreen storeDealsScreen = this.f1110b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = StoreDealsScreen.f88691a0;
                        phm.a aVar = (phm.a) ue0.e.j(storeDealsScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (k2e.s) ((b3e.a) ((b3e.b) aVar2.b()).c().mo3808a(storeDealsScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = StoreDealsScreen.f88691a0;
                        k2e.s sVar = (k2e.s) storeDealsScreen.W.getValue();
                        switch (sVar.f180550a) {
                            case 0:
                                return (f) sVar.f180553g.get();
                            default:
                                return (f) sVar.f180553g.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = StoreDealsScreen.f88691a0;
                        k2e.s sVar2 = (k2e.s) storeDealsScreen.W.getValue();
                        switch (sVar2.f180550a) {
                            case 0:
                                return (on.a) sVar2.f180554h.get();
                            default:
                                return (on.a) sVar2.f180554h.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = StoreDealsScreen.f88691a0;
                        StoreDealsScreen storeDealsScreen2 = this.f1110b;
                        return dli.f.a(storeDealsScreen2, storeDealsScreen2.R2(), zhm.v.k(new BigTileLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RewardsGridLoadingDelegate(), new MapPlainLoadingDelegate(), new VoucherSmallLoadingDelegate(), storeDealsScreen2.K, storeDealsScreen2.L, storeDealsScreen2.M, storeDealsScreen2.N, storeDealsScreen2.O, storeDealsScreen2.S, storeDealsScreen2.Q, storeDealsScreen2.R), R$id.storeDeals_recyclerView, new i(storeDealsScreen2, 1), null, null, 48);
                }
            }
        });
        this.X = w.y0(new Function0(this) { // from class: a3e.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreDealsScreen f1110b;

            {
                this.f1110b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                StoreDealsScreen storeDealsScreen = this.f1110b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = StoreDealsScreen.f88691a0;
                        phm.a aVar = (phm.a) ue0.e.j(storeDealsScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (k2e.s) ((b3e.a) ((b3e.b) aVar2.b()).c().mo3808a(storeDealsScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = StoreDealsScreen.f88691a0;
                        k2e.s sVar = (k2e.s) storeDealsScreen.W.getValue();
                        switch (sVar.f180550a) {
                            case 0:
                                return (f) sVar.f180553g.get();
                            default:
                                return (f) sVar.f180553g.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = StoreDealsScreen.f88691a0;
                        k2e.s sVar2 = (k2e.s) storeDealsScreen.W.getValue();
                        switch (sVar2.f180550a) {
                            case 0:
                                return (on.a) sVar2.f180554h.get();
                            default:
                                return (on.a) sVar2.f180554h.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = StoreDealsScreen.f88691a0;
                        StoreDealsScreen storeDealsScreen2 = this.f1110b;
                        return dli.f.a(storeDealsScreen2, storeDealsScreen2.R2(), zhm.v.k(new BigTileLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RewardsGridLoadingDelegate(), new MapPlainLoadingDelegate(), new VoucherSmallLoadingDelegate(), storeDealsScreen2.K, storeDealsScreen2.L, storeDealsScreen2.M, storeDealsScreen2.N, storeDealsScreen2.O, storeDealsScreen2.S, storeDealsScreen2.Q, storeDealsScreen2.R), R$id.storeDeals_recyclerView, new i(storeDealsScreen2, 1), null, null, 48);
                }
            }
        });
        this.Y = w.y0(new Function0(this) { // from class: a3e.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreDealsScreen f1110b;

            {
                this.f1110b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                StoreDealsScreen storeDealsScreen = this.f1110b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = StoreDealsScreen.f88691a0;
                        phm.a aVar = (phm.a) ue0.e.j(storeDealsScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (k2e.s) ((b3e.a) ((b3e.b) aVar2.b()).c().mo3808a(storeDealsScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = StoreDealsScreen.f88691a0;
                        k2e.s sVar = (k2e.s) storeDealsScreen.W.getValue();
                        switch (sVar.f180550a) {
                            case 0:
                                return (f) sVar.f180553g.get();
                            default:
                                return (f) sVar.f180553g.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = StoreDealsScreen.f88691a0;
                        k2e.s sVar2 = (k2e.s) storeDealsScreen.W.getValue();
                        switch (sVar2.f180550a) {
                            case 0:
                                return (on.a) sVar2.f180554h.get();
                            default:
                                return (on.a) sVar2.f180554h.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = StoreDealsScreen.f88691a0;
                        StoreDealsScreen storeDealsScreen2 = this.f1110b;
                        return dli.f.a(storeDealsScreen2, storeDealsScreen2.R2(), zhm.v.k(new BigTileLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RewardsGridLoadingDelegate(), new MapPlainLoadingDelegate(), new VoucherSmallLoadingDelegate(), storeDealsScreen2.K, storeDealsScreen2.L, storeDealsScreen2.M, storeDealsScreen2.N, storeDealsScreen2.O, storeDealsScreen2.S, storeDealsScreen2.Q, storeDealsScreen2.R), R$id.storeDeals_recyclerView, new i(storeDealsScreen2, 1), null, null, 48);
                }
            }
        });
        final int i5 = 3;
        this.Z = w.y0(new Function0(this) { // from class: a3e.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreDealsScreen f1110b;

            {
                this.f1110b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i59 = i5;
                StoreDealsScreen storeDealsScreen = this.f1110b;
                switch (i59) {
                    case 0:
                        KProperty[] kPropertyArr = StoreDealsScreen.f88691a0;
                        phm.a aVar = (phm.a) ue0.e.j(storeDealsScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (k2e.s) ((b3e.a) ((b3e.b) aVar2.b()).c().mo3808a(storeDealsScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = StoreDealsScreen.f88691a0;
                        k2e.s sVar = (k2e.s) storeDealsScreen.W.getValue();
                        switch (sVar.f180550a) {
                            case 0:
                                return (f) sVar.f180553g.get();
                            default:
                                return (f) sVar.f180553g.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = StoreDealsScreen.f88691a0;
                        k2e.s sVar2 = (k2e.s) storeDealsScreen.W.getValue();
                        switch (sVar2.f180550a) {
                            case 0:
                                return (on.a) sVar2.f180554h.get();
                            default:
                                return (on.a) sVar2.f180554h.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = StoreDealsScreen.f88691a0;
                        StoreDealsScreen storeDealsScreen2 = this.f1110b;
                        return dli.f.a(storeDealsScreen2, storeDealsScreen2.R2(), zhm.v.k(new BigTileLoadingDelegate(), new ListSubheaderLoadingDelegate(), new RewardsGridLoadingDelegate(), new MapPlainLoadingDelegate(), new VoucherSmallLoadingDelegate(), storeDealsScreen2.K, storeDealsScreen2.L, storeDealsScreen2.M, storeDealsScreen2.N, storeDealsScreen2.O, storeDealsScreen2.S, storeDealsScreen2.Q, storeDealsScreen2.R), R$id.storeDeals_recyclerView, new i(storeDealsScreen2, 1), null, null, 48);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((a3e.g) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getU() {
        return new AnalyticsProduct.Retail(super.f0());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (k2e.s) this.W.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        v vVar = this.T;
        if (vVar != null) {
            ((c) this.Z.getValue()).h().removeOnScrollListener(vVar);
        }
        this.T = null;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.T = y.a(((c) this.Z.getValue()).h(), 6, true, new i(this, 0));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52371h.f121375b), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.K.d), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f53209c.d), null, new m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53608c), null, new n(this, null), 3);
        MapPlainDelegate mapPlainDelegate = this.M;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(mapPlainDelegate.f52768c), null, new a3e.o(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(mapPlainDelegate.d), null, new a3e.o(this, null, 1), 3);
        on.a aVar = (on.a) this.Y.getValue();
        ViewBinding value = this.U.getValue(this, f88691a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ScreenContentRecyclerView storeDealsRecyclerView = ((g) value).f148810b;
        Intrinsics.checkNotNullExpressionValue(storeDealsRecyclerView, "storeDealsRecyclerView");
        ViewController.P2(this, ((sn.a) aVar).b(storeDealsRecyclerView, false), new a0l.k(this, null, 5), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final f d() {
        return (f) this.X.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.V;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Z.getValue();
    }
}
