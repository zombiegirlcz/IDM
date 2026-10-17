package com.revolut.feature.store.impl.ui.exclusives;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.BigTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.feature.store.impl.R$id;
import com.revolut.feature.store.impl.R$layout;
import com.revolut.feature.store.impl.ui.exclusives.StoreExclusivesScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import g06.k;
import g3e.c;
import g3e.j;
import g3e.m;
import g3e.n;
import g3e.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import xki.e;
import yp0.v;
import yp0.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/feature/store/impl/ui/exclusives/StoreExclusivesScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lg3e/c;", "Lc2e/b;", "<init>", "()V", "Companion", "a", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoreExclusivesScreen extends ViewController<q> implements dli.a, c2e.b {
    public final NewsDelegate K = new NewsDelegate();
    public final BigTileDelegate L;
    public final FullScreenStateDelegate M;
    public final ActionsDelegate N;
    public final ScrollerDelegate O;
    public v P;
    public final h Q;
    public final int R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(StoreExclusivesScreen.class, "binding", "getBinding()Lcom/revolut/feature/store/impl/databinding/ScreenStoreExclusivesBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, h2e.h.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/store/impl/databinding/ScreenStoreExclusivesBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.storeExclusives_recyclerView;
            ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
            if (screenContentRecyclerView != null) {
                return new h2e.h((ControllerContainerFrameLayout) p0, screenContentRecyclerView);
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public StoreExclusivesScreen() {
        BigTileDelegate bigTileDelegate = new BigTileDelegate();
        this.L = bigTileDelegate;
        this.M = new FullScreenStateDelegate();
        this.N = new ActionsDelegate();
        final int i = 2;
        final int i2 = 0;
        final int i3 = 1;
        this.O = new ScrollerDelegate(zhm.v.k(bigTileDelegate, new BigTileLoadingDelegate()), false);
        this.Q = s.t(this, b.f);
        this.R = R$layout.screen_store_exclusives;
        this.S = w.y0(new Function0(this) { // from class: g3e.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreExclusivesScreen f140280b;

            {
                this.f140280b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i2;
                StoreExclusivesScreen storeExclusivesScreen = this.f140280b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = StoreExclusivesScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(storeExclusivesScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (k2e.v) ((k2e.u) ((h3e.a) aVar2.b()).b().mo3808a(storeExclusivesScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = StoreExclusivesScreen.W;
                        k2e.v vVar = (k2e.v) storeExclusivesScreen.S.getValue();
                        switch (vVar.f180560a) {
                            case 0:
                                return (b) vVar.e.get();
                            default:
                                return (b) vVar.e.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = StoreExclusivesScreen.W;
                        k2e.v vVar2 = (k2e.v) storeExclusivesScreen.S.getValue();
                        switch (vVar2.f180560a) {
                            case 0:
                                return (on.a) vVar2.f.get();
                            default:
                                return (on.a) vVar2.f.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = StoreExclusivesScreen.W;
                        StoreExclusivesScreen storeExclusivesScreen2 = this.f140280b;
                        return dli.f.a(storeExclusivesScreen2, storeExclusivesScreen2.R2(), zhm.v.k(storeExclusivesScreen2.K, storeExclusivesScreen2.O, storeExclusivesScreen2.N, new RowLoadingDelegate(), storeExclusivesScreen2.M), R$id.storeExclusives_recyclerView, new j(storeExclusivesScreen2, 1), null, null, 48);
                }
            }
        });
        this.T = w.y0(new Function0(this) { // from class: g3e.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreExclusivesScreen f140280b;

            {
                this.f140280b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i3;
                StoreExclusivesScreen storeExclusivesScreen = this.f140280b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = StoreExclusivesScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(storeExclusivesScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (k2e.v) ((k2e.u) ((h3e.a) aVar2.b()).b().mo3808a(storeExclusivesScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = StoreExclusivesScreen.W;
                        k2e.v vVar = (k2e.v) storeExclusivesScreen.S.getValue();
                        switch (vVar.f180560a) {
                            case 0:
                                return (b) vVar.e.get();
                            default:
                                return (b) vVar.e.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = StoreExclusivesScreen.W;
                        k2e.v vVar2 = (k2e.v) storeExclusivesScreen.S.getValue();
                        switch (vVar2.f180560a) {
                            case 0:
                                return (on.a) vVar2.f.get();
                            default:
                                return (on.a) vVar2.f.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = StoreExclusivesScreen.W;
                        StoreExclusivesScreen storeExclusivesScreen2 = this.f140280b;
                        return dli.f.a(storeExclusivesScreen2, storeExclusivesScreen2.R2(), zhm.v.k(storeExclusivesScreen2.K, storeExclusivesScreen2.O, storeExclusivesScreen2.N, new RowLoadingDelegate(), storeExclusivesScreen2.M), R$id.storeExclusives_recyclerView, new j(storeExclusivesScreen2, 1), null, null, 48);
                }
            }
        });
        this.U = w.y0(new Function0(this) { // from class: g3e.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreExclusivesScreen f140280b;

            {
                this.f140280b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i5 = i;
                StoreExclusivesScreen storeExclusivesScreen = this.f140280b;
                switch (i5) {
                    case 0:
                        KProperty[] kPropertyArr = StoreExclusivesScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(storeExclusivesScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (k2e.v) ((k2e.u) ((h3e.a) aVar2.b()).b().mo3808a(storeExclusivesScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = StoreExclusivesScreen.W;
                        k2e.v vVar = (k2e.v) storeExclusivesScreen.S.getValue();
                        switch (vVar.f180560a) {
                            case 0:
                                return (b) vVar.e.get();
                            default:
                                return (b) vVar.e.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = StoreExclusivesScreen.W;
                        k2e.v vVar2 = (k2e.v) storeExclusivesScreen.S.getValue();
                        switch (vVar2.f180560a) {
                            case 0:
                                return (on.a) vVar2.f.get();
                            default:
                                return (on.a) vVar2.f.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = StoreExclusivesScreen.W;
                        StoreExclusivesScreen storeExclusivesScreen2 = this.f140280b;
                        return dli.f.a(storeExclusivesScreen2, storeExclusivesScreen2.R2(), zhm.v.k(storeExclusivesScreen2.K, storeExclusivesScreen2.O, storeExclusivesScreen2.N, new RowLoadingDelegate(), storeExclusivesScreen2.M), R$id.storeExclusives_recyclerView, new j(storeExclusivesScreen2, 1), null, null, 48);
                }
            }
        });
        final int i5 = 3;
        this.V = w.y0(new Function0(this) { // from class: g3e.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreExclusivesScreen f140280b;

            {
                this.f140280b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i59 = i5;
                StoreExclusivesScreen storeExclusivesScreen = this.f140280b;
                switch (i59) {
                    case 0:
                        KProperty[] kPropertyArr = StoreExclusivesScreen.W;
                        phm.a aVar = (phm.a) ue0.e.j(storeExclusivesScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (k2e.v) ((k2e.u) ((h3e.a) aVar2.b()).b().mo3808a(storeExclusivesScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                    case 1:
                        KProperty[] kPropertyArr2 = StoreExclusivesScreen.W;
                        k2e.v vVar = (k2e.v) storeExclusivesScreen.S.getValue();
                        switch (vVar.f180560a) {
                            case 0:
                                return (b) vVar.e.get();
                            default:
                                return (b) vVar.e.get();
                        }
                    case 2:
                        KProperty[] kPropertyArr3 = StoreExclusivesScreen.W;
                        k2e.v vVar2 = (k2e.v) storeExclusivesScreen.S.getValue();
                        switch (vVar2.f180560a) {
                            case 0:
                                return (on.a) vVar2.f.get();
                            default:
                                return (on.a) vVar2.f.get();
                        }
                    default:
                        KProperty[] kPropertyArr4 = StoreExclusivesScreen.W;
                        StoreExclusivesScreen storeExclusivesScreen2 = this.f140280b;
                        return dli.f.a(storeExclusivesScreen2, storeExclusivesScreen2.R2(), zhm.v.k(storeExclusivesScreen2.K, storeExclusivesScreen2.O, storeExclusivesScreen2.N, new RowLoadingDelegate(), storeExclusivesScreen2.M), R$id.storeExclusives_recyclerView, new j(storeExclusivesScreen2, 1), null, null, 48);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((c) oVar);
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
        return (k2e.v) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        v vVar = this.P;
        if (vVar != null) {
            ((dli.c) this.V.getValue()).h().removeOnScrollListener(vVar);
        }
        this.P = null;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        this.P = y.a(((dli.c) this.V.getValue()).h(), 3, true, new j(this, 0));
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.K.p()), null, new m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.d), null, new n(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52371h.f121375b), null, new g3e.o(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f51611c.f121375b), null, new p(this, null), 3);
        on.a aVar = (on.a) this.U.getValue();
        ViewBinding value = this.Q.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ScreenContentRecyclerView storeExclusivesRecyclerView = ((h2e.h) value).f148812b;
        Intrinsics.checkNotNullExpressionValue(storeExclusivesRecyclerView, "storeExclusivesRecyclerView");
        ViewController.P2(this, ((sn.a) aVar).b(storeExclusivesRecyclerView, false), new k(this, null, 11), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final g3e.b d() {
        return (g3e.b) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.V.getValue();
    }
}
