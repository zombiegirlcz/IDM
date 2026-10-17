package com.revolut.feature.add.new_product.impl.ui.add_new_product_group;

import ag1.b;
import ag1.c;
import ag1.d;
import ag1.f;
import ag1.g;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.add.new_product.impl.ui.add_new_product_group.AddNewProductGroupScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/add/new_product/impl/ui/add_new_product_group/AddNewProductGroupScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lag1/d;", "feature_add_new_product_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddNewProductGroupScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(AddNewProductGroupScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final b K;
    public final RowDelegate L;
    public final h M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public AddNewProductGroupScreen(b inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new RowDelegate(null, null, 7);
        this.M = s.t(this, f.f);
        this.N = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ag1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewProductGroupScreen f4757b;

            {
                this.f4757b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddNewProductGroupScreen addNewProductGroupScreen = this.f4757b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddNewProductGroupScreen.R;
                        return (c) ((sf1.o) addNewProductGroupScreen.P.getValue()).f262296c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AddNewProductGroupScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(addNewProductGroupScreen.m2()).a().get(sf1.n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", sf1.n.class, " is not found"));
                        }
                        sf1.n nVar = ((sf1.n) aVar2.b()).G;
                        b bVar = addNewProductGroupScreen.K;
                        bVar.getClass();
                        return new sf1.o(nVar, bVar);
                    default:
                        KProperty[] kPropertyArr3 = AddNewProductGroupScreen.R;
                        AddNewProductGroupScreen addNewProductGroupScreen2 = this.f4757b;
                        return dli.f.a(addNewProductGroupScreen2, (c) addNewProductGroupScreen2.O.getValue(), v.k(addNewProductGroupScreen2.L, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ag1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewProductGroupScreen f4757b;

            {
                this.f4757b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddNewProductGroupScreen addNewProductGroupScreen = this.f4757b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddNewProductGroupScreen.R;
                        return (c) ((sf1.o) addNewProductGroupScreen.P.getValue()).f262296c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AddNewProductGroupScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(addNewProductGroupScreen.m2()).a().get(sf1.n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", sf1.n.class, " is not found"));
                        }
                        sf1.n nVar = ((sf1.n) aVar2.b()).G;
                        b bVar = addNewProductGroupScreen.K;
                        bVar.getClass();
                        return new sf1.o(nVar, bVar);
                    default:
                        KProperty[] kPropertyArr3 = AddNewProductGroupScreen.R;
                        AddNewProductGroupScreen addNewProductGroupScreen2 = this.f4757b;
                        return dli.f.a(addNewProductGroupScreen2, (c) addNewProductGroupScreen2.O.getValue(), v.k(addNewProductGroupScreen2.L, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ag1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewProductGroupScreen f4757b;

            {
                this.f4757b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddNewProductGroupScreen addNewProductGroupScreen = this.f4757b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddNewProductGroupScreen.R;
                        return (c) ((sf1.o) addNewProductGroupScreen.P.getValue()).f262296c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AddNewProductGroupScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(addNewProductGroupScreen.m2()).a().get(sf1.n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", sf1.n.class, " is not found"));
                        }
                        sf1.n nVar = ((sf1.n) aVar2.b()).G;
                        b bVar = addNewProductGroupScreen.K;
                        bVar.getClass();
                        return new sf1.o(nVar, bVar);
                    default:
                        KProperty[] kPropertyArr3 = AddNewProductGroupScreen.R;
                        AddNewProductGroupScreen addNewProductGroupScreen2 = this.f4757b;
                        return dli.f.a(addNewProductGroupScreen2, (c) addNewProductGroupScreen2.O.getValue(), v.k(addNewProductGroupScreen2.L, new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        Clause clause = uiState.f4754a;
        if (clause != null) {
            NavBarWithToolbar navBarWithToolbar = d3().f174539b;
            navBarWithToolbar.setToolbarTitle(clause);
            navBarWithToolbar.setTitle(clause, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (sf1.o) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new a07.d(this, null, 21), 3);
        ViewController.P2(this, rd0.e.b(this.L.f53218h), new g(2, 4, c.class, (c) this.O.getValue(), "onItemClick", "onItemClick(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
