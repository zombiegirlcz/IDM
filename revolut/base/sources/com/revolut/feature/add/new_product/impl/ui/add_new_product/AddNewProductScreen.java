package com.revolut.feature.add.new_product.impl.ui.add_new_product;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.add.new_product.api.R$string;
import com.revolut.feature.add.new_product.impl.R$id;
import com.revolut.feature.add.new_product.impl.R$layout;
import com.revolut.feature.add.new_product.impl.ui.add_new_product.AddNewProductScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import dr2.l;
import efm.r;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import t60.b;
import te0.w;
import tw0.v;
import vc.s;
import y5g.d;
import ye1.m;
import yed.g0;
import yf1.b0;
import yf1.f;
import yf1.g;
import yf1.i;
import yf1.n;
import yf1.p;
import yp0.y;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/add/new_product/impl/ui/add_new_product/AddNewProductScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lyf1/p;", "Companion", "a", "feature_add_new_product_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddNewProductScreen extends ViewController<q> implements dli.a {
    public final n K;
    public final h L;
    public final RowDelegate M;
    public final FullScreenStateDelegate N;
    public final v O;
    public final int P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(AddNewProductScreen.class, "binding", "getBinding()Lcom/revolut/feature/add/new_product/impl/databinding/ScreenAddNewProductBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public AddNewProductScreen(n inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, f.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = new FullScreenStateDelegate();
        this.O = new v();
        this.P = R$layout.screen_add_new_product;
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: yf1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewProductScreen f313119b;

            {
                this.f313119b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AddNewProductScreen addNewProductScreen = this.f313119b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AddNewProductScreen.T;
                        return (o) addNewProductScreen.R1().f262303l.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AddNewProductScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(addNewProductScreen.m2()).a().get(sf1.n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", sf1.n.class, " is not found"));
                        }
                        sf1.n nVar = ((sf1.n) aVar2.b()).G;
                        n nVar2 = addNewProductScreen.K;
                        nVar2.getClass();
                        ScreenContentRecyclerView addNewProductRecyclerView = addNewProductScreen.d3().f253678c;
                        Intrinsics.checkNotNullExpressionValue(addNewProductRecyclerView, "addNewProductRecyclerView");
                        return new sf1.p(nVar, nVar2, addNewProductRecyclerView);
                    default:
                        KProperty[] kPropertyArr3 = AddNewProductScreen.T;
                        AddNewProductScreen addNewProductScreen2 = this.f313119b;
                        return dli.f.a(addNewProductScreen2, addNewProductScreen2.R2(), d0.E0(((fd6.a) addNewProductScreen2.R1().f262300g.get()).e, zhm.v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), addNewProductScreen2.M, addNewProductScreen2.N)), R$id.addNewProduct_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: yf1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewProductScreen f313119b;

            {
                this.f313119b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AddNewProductScreen addNewProductScreen = this.f313119b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddNewProductScreen.T;
                        return (o) addNewProductScreen.R1().f262303l.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AddNewProductScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(addNewProductScreen.m2()).a().get(sf1.n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", sf1.n.class, " is not found"));
                        }
                        sf1.n nVar = ((sf1.n) aVar2.b()).G;
                        n nVar2 = addNewProductScreen.K;
                        nVar2.getClass();
                        ScreenContentRecyclerView addNewProductRecyclerView = addNewProductScreen.d3().f253678c;
                        Intrinsics.checkNotNullExpressionValue(addNewProductRecyclerView, "addNewProductRecyclerView");
                        return new sf1.p(nVar, nVar2, addNewProductRecyclerView);
                    default:
                        KProperty[] kPropertyArr3 = AddNewProductScreen.T;
                        AddNewProductScreen addNewProductScreen2 = this.f313119b;
                        return dli.f.a(addNewProductScreen2, addNewProductScreen2.R2(), d0.E0(((fd6.a) addNewProductScreen2.R1().f262300g.get()).e, zhm.v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), addNewProductScreen2.M, addNewProductScreen2.N)), R$id.addNewProduct_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: yf1.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AddNewProductScreen f313119b;

            {
                this.f313119b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AddNewProductScreen addNewProductScreen = this.f313119b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AddNewProductScreen.T;
                        return (o) addNewProductScreen.R1().f262303l.get();
                    case 1:
                        KProperty[] kPropertyArr2 = AddNewProductScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(addNewProductScreen.m2()).a().get(sf1.n.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", sf1.n.class, " is not found"));
                        }
                        sf1.n nVar = ((sf1.n) aVar2.b()).G;
                        n nVar2 = addNewProductScreen.K;
                        nVar2.getClass();
                        ScreenContentRecyclerView addNewProductRecyclerView = addNewProductScreen.d3().f253678c;
                        Intrinsics.checkNotNullExpressionValue(addNewProductRecyclerView, "addNewProductRecyclerView");
                        return new sf1.p(nVar, nVar2, addNewProductRecyclerView);
                    default:
                        KProperty[] kPropertyArr3 = AddNewProductScreen.T;
                        AddNewProductScreen addNewProductScreen2 = this.f313119b;
                        return dli.f.a(addNewProductScreen2, addNewProductScreen2.R2(), d0.E0(((fd6.a) addNewProductScreen2.R1().f262300g.get()).e, zhm.v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), addNewProductScreen2.M, addNewProductScreen2.N)), R$id.addNewProduct_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        p uiState = (p) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        Tabs tabs = d3().d;
        ArrayList arrayList = uiState.f313128b;
        Clause clause = uiState.f;
        tabs.setItems(arrayList, uiState.d);
        ((b0) R1().f262302j.get()).f313115a.setValue(uiState.f313129c);
        NavBarWithToolbar navBarWithToolbar = d3().f253677b;
        Clause clause2 = uiState.e;
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
        navBarWithToolbar.setDescriptionText(clause2);
        navBarWithToolbar.setSecondDescriptionVisible(clause != null);
        navBarWithToolbar.setSecondDescriptionText(clause);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f253677b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.add_new_product_screen_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.add_new_product_screen_search_hint, null, null, 14));
        navBarWithToolbar.setSearchButtonActive(true);
        ScreenContentRecyclerView addNewProductRecyclerView = d3().f253678c;
        Intrinsics.checkNotNullExpressionValue(addNewProductRecyclerView, "addNewProductRecyclerView");
        y.g(addNewProductRecyclerView, m2());
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, vkm.q.q(e.b(d3().f253677b.X0)), new g(this, continuation, 0), 3);
        int i = 2;
        ViewController.P2(this, e.b(d3().f253677b.f59409p.f57337m), new woc.p(i, R2(), yf1.o.class, "onInputChanged", "onInputChanged(Ljava/lang/String;)V", 4, 21), 3);
        ViewController.P2(this, e.b(this.N.f52371h.f121375b), new yf1.h(this, null), 3);
        ViewController.P2(this, e.b(this.M.f53218h), new i(2, 4, yf1.o.class, R2(), "onItemClick", "onItemClick(Lcom/revolut/core/ui_kit/delegates/RowDelegate$Model;)V"), 3);
        ViewController.P2(this, e.b(d3().f253677b.f59410q), new d(this, continuation, 18), 3);
        ViewController.P2(this, e.b(d3().d.f58882b), new woc.p(i, R2(), yf1.o.class, "onTabClicked", "onTabClicked(Ljava/lang/String;)V", 4, 22), 3);
        r rVarThrottleLast = ((t60.g) ((b) R1().d.get())).R().filter(new ya6.f(new g0(this, 1), 18)).throttleLast(200L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(rVarThrottleLast, "throttleLast(...)");
        ViewController.P2(this, t1.e0(e.b(rVarThrottleLast)), new g(this, continuation, 1), 3);
        ScreenContentRecyclerView addNewProductRecyclerView = d3().f253678c;
        Intrinsics.checkNotNullExpressionValue(addNewProductRecyclerView, "addNewProductRecyclerView");
        Flow flowQ = vkm.q.q(new l(vkm.q.s(((b0) R1().f262302j.get()).f313115a, new m(12), vkm.q.f290100b), 9));
        if (((t60.g) ((b) R1().d.get())).Q().f268120a > 0) {
            flowQ = vkm.q.t(flowQ, 1);
        }
        ViewController.P2(this, flowQ, new wo2.l(addNewProductRecyclerView, this, continuation, 25), 3);
    }

    public final rf1.a d3() {
        ViewBinding value = this.L.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (rf1.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final sf1.p R1() {
        return (sf1.p) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: f3, reason: merged with bridge method [inline-methods] */
    public final yf1.o R2() {
        return (yf1.o) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.S.getValue();
    }
}
