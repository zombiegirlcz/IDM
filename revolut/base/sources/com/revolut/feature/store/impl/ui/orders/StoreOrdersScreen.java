package com.revolut.feature.store.impl.ui.orders;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.feature.store.impl.R$id;
import com.revolut.feature.store.impl.R$layout;
import com.revolut.feature.store.impl.ui.orders.StoreOrdersScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import k2e.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l3e.e;
import l3e.f;
import l3e.g;
import l3e.i;
import l3e.j;
import l3e.k;
import l3e.l;
import te0.w;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/store/impl/ui/orders/StoreOrdersScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ll3e/e;", "Ldli/a;", "Ll3e/g;", "<init>", "()V", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoreOrdersScreen extends ViewController<e> implements dli.a {
    public final RowDelegate K = new RowDelegate(null, null, 7);
    public final LargeActionButtonDelegate L = new LargeActionButtonDelegate();
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final CellDetailsChevronDelegate N = new CellDetailsChevronDelegate();
    public final int O = R$layout.screen_store_orders;
    public final Object P;
    public final Object Q;
    public final Object R;

    public StoreOrdersScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: l3e.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreOrdersScreen f191944b;

            {
                this.f191944b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StoreOrdersScreen storeOrdersScreen = this.f191944b;
                switch (i2) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(storeOrdersScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new k2e.m(((k2e.j) aVar2.b()).f180521r);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                    case 1:
                        return (f) ((k2e.m) storeOrdersScreen.P.getValue()).f180533b.get();
                    default:
                        StoreOrdersScreen storeOrdersScreen2 = this.f191944b;
                        return dli.f.a(storeOrdersScreen2, storeOrdersScreen2.R2(), v.k(new ListSubheaderDelegate(), storeOrdersScreen2.K, storeOrdersScreen2.L, new RowLoadingDelegate(), storeOrdersScreen2.M, storeOrdersScreen2.N), R$id.storeOrders_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: l3e.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreOrdersScreen f191944b;

            {
                this.f191944b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StoreOrdersScreen storeOrdersScreen = this.f191944b;
                switch (i22) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(storeOrdersScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new k2e.m(((k2e.j) aVar2.b()).f180521r);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                    case 1:
                        return (f) ((k2e.m) storeOrdersScreen.P.getValue()).f180533b.get();
                    default:
                        StoreOrdersScreen storeOrdersScreen2 = this.f191944b;
                        return dli.f.a(storeOrdersScreen2, storeOrdersScreen2.R2(), v.k(new ListSubheaderDelegate(), storeOrdersScreen2.K, storeOrdersScreen2.L, new RowLoadingDelegate(), storeOrdersScreen2.M, storeOrdersScreen2.N), R$id.storeOrders_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: l3e.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreOrdersScreen f191944b;

            {
                this.f191944b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StoreOrdersScreen storeOrdersScreen = this.f191944b;
                switch (i22) {
                    case 0:
                        phm.a aVar = (phm.a) ue0.e.j(storeOrdersScreen.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return new k2e.m(((k2e.j) aVar2.b()).f180521r);
                        }
                        throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                    case 1:
                        return (f) ((k2e.m) storeOrdersScreen.P.getValue()).f180533b.get();
                    default:
                        StoreOrdersScreen storeOrdersScreen2 = this.f191944b;
                        return dli.f.a(storeOrdersScreen2, storeOrdersScreen2.R2(), v.k(new ListSubheaderDelegate(), storeOrdersScreen2.K, storeOrdersScreen2.L, new RowLoadingDelegate(), storeOrdersScreen2.M, storeOrdersScreen2.N), R$id.storeOrders_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (m) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.K.f53218h), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.L.d.f121375b), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f51821c), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.M.f52371h.f121375b), null, new l(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final f R2() {
        return (f) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
