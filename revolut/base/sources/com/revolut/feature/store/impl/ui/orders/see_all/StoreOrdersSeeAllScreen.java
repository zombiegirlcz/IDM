package com.revolut.feature.store.impl.ui.orders.see_all;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.store.api.R$string;
import com.revolut.feature.store.impl.R$id;
import com.revolut.feature.store.impl.R$layout;
import com.revolut.feature.store.impl.ui.orders.see_all.StoreOrdersSeeAllContract$InputData;
import com.revolut.feature.store.impl.ui.orders.see_all.StoreOrdersSeeAllScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import k2e.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import n3e.f;
import n3e.i;
import n3e.j;
import n3e.k;
import n3e.l;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import xki.e;
import yp0.v;
import yp0.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/store/impl/ui/orders/see_all/StoreOrdersSeeAllScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ln3e/f;", "Companion", "a", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoreOrdersSeeAllScreen extends ViewController<q> implements dli.a {
    public final StoreOrdersSeeAllContract$InputData K;
    public final RowDelegate L;
    public final FullScreenStateDelegate M;
    public final CellDetailsChevronDelegate N;
    public v O;
    public final h P;
    public final int Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(StoreOrdersSeeAllScreen.class, "binding", "getBinding()Lcom/revolut/feature/store/impl/databinding/ScreenStoreOrdersSeeAllBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public StoreOrdersSeeAllScreen(StoreOrdersSeeAllContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new RowDelegate(null, null, 7);
        this.M = new FullScreenStateDelegate();
        this.N = new CellDetailsChevronDelegate();
        this.P = s.t(this, i.f);
        this.Q = R$layout.screen_store_orders_see_all;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: n3e.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreOrdersSeeAllScreen f211999b;

            {
                this.f211999b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StoreOrdersSeeAllScreen storeOrdersSeeAllScreen = this.f211999b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StoreOrdersSeeAllScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(storeOrdersSeeAllScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                        }
                        k2e.j jVar = ((k2e.j) aVar2.b()).f180521r;
                        StoreOrdersSeeAllContract$InputData storeOrdersSeeAllContract$InputData = storeOrdersSeeAllScreen.K;
                        storeOrdersSeeAllContract$InputData.getClass();
                        return new n(jVar, storeOrdersSeeAllContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = StoreOrdersSeeAllScreen.U;
                        return (e) ((n) storeOrdersSeeAllScreen.R.getValue()).f180536c.get();
                    default:
                        KProperty[] kPropertyArr3 = StoreOrdersSeeAllScreen.U;
                        StoreOrdersSeeAllScreen storeOrdersSeeAllScreen2 = this.f211999b;
                        return dli.f.a(storeOrdersSeeAllScreen2, storeOrdersSeeAllScreen2.d(), zhm.v.k(storeOrdersSeeAllScreen2.L, new RowLoadingDelegate(), storeOrdersSeeAllScreen2.M, storeOrdersSeeAllScreen2.N), R$id.storeOrdersSeeAll_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: n3e.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreOrdersSeeAllScreen f211999b;

            {
                this.f211999b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StoreOrdersSeeAllScreen storeOrdersSeeAllScreen = this.f211999b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StoreOrdersSeeAllScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(storeOrdersSeeAllScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                        }
                        k2e.j jVar = ((k2e.j) aVar2.b()).f180521r;
                        StoreOrdersSeeAllContract$InputData storeOrdersSeeAllContract$InputData = storeOrdersSeeAllScreen.K;
                        storeOrdersSeeAllContract$InputData.getClass();
                        return new n(jVar, storeOrdersSeeAllContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = StoreOrdersSeeAllScreen.U;
                        return (e) ((n) storeOrdersSeeAllScreen.R.getValue()).f180536c.get();
                    default:
                        KProperty[] kPropertyArr3 = StoreOrdersSeeAllScreen.U;
                        StoreOrdersSeeAllScreen storeOrdersSeeAllScreen2 = this.f211999b;
                        return dli.f.a(storeOrdersSeeAllScreen2, storeOrdersSeeAllScreen2.d(), zhm.v.k(storeOrdersSeeAllScreen2.L, new RowLoadingDelegate(), storeOrdersSeeAllScreen2.M, storeOrdersSeeAllScreen2.N), R$id.storeOrdersSeeAll_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: n3e.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreOrdersSeeAllScreen f211999b;

            {
                this.f211999b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StoreOrdersSeeAllScreen storeOrdersSeeAllScreen = this.f211999b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StoreOrdersSeeAllScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(storeOrdersSeeAllScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                        }
                        k2e.j jVar = ((k2e.j) aVar2.b()).f180521r;
                        StoreOrdersSeeAllContract$InputData storeOrdersSeeAllContract$InputData = storeOrdersSeeAllScreen.K;
                        storeOrdersSeeAllContract$InputData.getClass();
                        return new n(jVar, storeOrdersSeeAllContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = StoreOrdersSeeAllScreen.U;
                        return (e) ((n) storeOrdersSeeAllScreen.R.getValue()).f180536c.get();
                    default:
                        KProperty[] kPropertyArr3 = StoreOrdersSeeAllScreen.U;
                        StoreOrdersSeeAllScreen storeOrdersSeeAllScreen2 = this.f211999b;
                        return dli.f.a(storeOrdersSeeAllScreen2, storeOrdersSeeAllScreen2.d(), zhm.v.k(storeOrdersSeeAllScreen2.L, new RowLoadingDelegate(), storeOrdersSeeAllScreen2.M, storeOrdersSeeAllScreen2.N), R$id.storeOrdersSeeAll_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((f) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (n) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        StoreOrdersSeeAllContract$InputData.Orders orders = StoreOrdersSeeAllContract$InputData.Orders.f88715a;
        StoreOrdersSeeAllContract$InputData storeOrdersSeeAllContract$InputData = this.K;
        if (Intrinsics.f(storeOrdersSeeAllContract$InputData, orders)) {
            textLocalisedClause = new TextLocalisedClause(R$string.store_orders_purchases_title, null, null, 14);
        } else {
            if (!(storeOrdersSeeAllContract$InputData instanceof StoreOrdersSeeAllContract$InputData.GiftCards)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.store_orders_gift_cards_title, null, null, 14);
        }
        ViewBinding value = this.P.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((h2e.i) value).f148814b;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void a3() {
        v vVar = this.O;
        if (vVar != null) {
            ((c) this.T.getValue()).h().removeOnScrollListener(vVar);
        }
        this.O = null;
    }

    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.K instanceof StoreOrdersSeeAllContract$InputData.Orders) {
            this.O = y.a(((c) this.T.getValue()).h(), 3, true, new n1.y(this, 13));
        }
        ViewBinding value = this.P.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((h2e.i) value).f148814b.f59410q), null, new mta.c(this, null, 15), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.f53218h), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52371h.f121375b), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f51821c), null, new l(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final n3e.e d() {
        return (n3e.e) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getQ() {
        return this.Q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.T.getValue();
    }

    public StoreOrdersSeeAllScreen() {
        this(StoreOrdersSeeAllContract$InputData.Orders.f88715a);
    }
}
