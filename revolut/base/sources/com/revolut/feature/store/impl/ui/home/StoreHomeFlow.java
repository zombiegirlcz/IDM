package com.revolut.feature.store.impl.ui.home;

import android.content.Context;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import ao.h;
import boh.f;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.store.api.R$string;
import com.revolut.feature.store.impl.R$id;
import com.revolut.feature.store.impl.R$layout;
import com.revolut.feature.store.impl.ui.home.StoreHomeFlow;
import com.revolut.feature.store.impl.ui.home.StoreHomeFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import i3e.d;
import i3e.i;
import i3e.j;
import k2e.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/store/impl/ui/home/StoreHomeFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/store/impl/ui/home/a;", "Lski/a;", "Li3e/i;", "Lcom/revolut/feature/store/impl/ui/home/StoreHomeFlowContract$PagerItem;", "Companion", "i3e/b", "a", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoreHomeFlow extends ViewController<com.revolut.feature.store.impl.ui.home.a> implements ski.a {
    public final StoreHomeFlowContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(StoreHomeFlow.class, "binding", "getBinding()Lcom/revolut/feature/store/impl/databinding/FlowStoreHomeBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public StoreHomeFlow(StoreHomeFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, i3e.c.f);
        this.M = R$layout.flow_store_home;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: i3e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreHomeFlow f158180b;

            {
                this.f158180b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StoreHomeFlow storeHomeFlow = this.f158180b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StoreHomeFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(storeHomeFlow.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                        }
                        k2e.j jVar = ((k2e.j) aVar2.b()).f180521r;
                        StoreHomeFlowContract$InputData storeHomeFlowContract$InputData = storeHomeFlow.K;
                        storeHomeFlowContract$InputData.getClass();
                        return new k2e.l(jVar, storeHomeFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = StoreHomeFlow.Q;
                        return (f) ((k2e.l) storeHomeFlow.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = StoreHomeFlow.Q;
                        return czi.c.c(storeHomeFlow, R$id.storeHome_pager, storeHomeFlow.d());
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: i3e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreHomeFlow f158180b;

            {
                this.f158180b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StoreHomeFlow storeHomeFlow = this.f158180b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StoreHomeFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(storeHomeFlow.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                        }
                        k2e.j jVar = ((k2e.j) aVar2.b()).f180521r;
                        StoreHomeFlowContract$InputData storeHomeFlowContract$InputData = storeHomeFlow.K;
                        storeHomeFlowContract$InputData.getClass();
                        return new k2e.l(jVar, storeHomeFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = StoreHomeFlow.Q;
                        return (f) ((k2e.l) storeHomeFlow.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = StoreHomeFlow.Q;
                        return czi.c.c(storeHomeFlow, R$id.storeHome_pager, storeHomeFlow.d());
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: i3e.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreHomeFlow f158180b;

            {
                this.f158180b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StoreHomeFlow storeHomeFlow = this.f158180b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StoreHomeFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(storeHomeFlow.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                        }
                        k2e.j jVar = ((k2e.j) aVar2.b()).f180521r;
                        StoreHomeFlowContract$InputData storeHomeFlowContract$InputData = storeHomeFlow.K;
                        storeHomeFlowContract$InputData.getClass();
                        return new k2e.l(jVar, storeHomeFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = StoreHomeFlow.Q;
                        return (f) ((k2e.l) storeHomeFlow.N.getValue()).f.get();
                    default:
                        KProperty[] kPropertyArr3 = StoreHomeFlow.Q;
                        return czi.c.c(storeHomeFlow, R$id.storeHome_pager, storeHomeFlow.d());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        i uiState = (i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f148798b.setItems(uiState.f158191a);
        d3().f148798b.b(uiState.f158192b);
        d3().f148799c.setFiltersState(uiState.f158193c);
        d3().f148799c.setMenuItems(uiState.d);
        ViewPager2 storeHomePager = d3().d;
        Intrinsics.checkNotNullExpressionValue(storeHomePager, "storeHomePager");
        Context context = D2().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        knm.b.v(f.p(context), storeHomePager);
        d3().d.setClipToPadding(false);
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        StoreHomeFlowContract$PagerItem pagerItem2 = (StoreHomeFlowContract$PagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        b bVar = (b) d();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        bVar.H2(bVar.f88706t, new j(pagerItem2, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (l) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setUserInputEnabled(false);
        a aVar = Companion;
        NavBarWithToolbar storeHomeNavBarWithToolbar = d3().f148799c;
        Intrinsics.checkNotNullExpressionValue(storeHomeNavBarWithToolbar, "storeHomeNavBarWithToolbar");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.store_home_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.store_home_title, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.store_home_search_title, null, null, 14);
        int iK = ofm.q.k(q2());
        i3e.b model = new i3e.b(iK, textLocalisedClause, textLocalisedClause2, textLocalisedClause3);
        aVar.getClass();
        Intrinsics.checkNotNullParameter(storeHomeNavBarWithToolbar, "<this>");
        Intrinsics.checkNotNullParameter(model, "model");
        storeHomeNavBarWithToolbar.setTitle(textLocalisedClause, null);
        storeHomeNavBarWithToolbar.setToolbarTitle(textLocalisedClause2);
        storeHomeNavBarWithToolbar.setHint(textLocalisedClause3);
        storeHomeNavBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(iK));
        storeHomeNavBarWithToolbar.setSearchButtonActive(true);
        storeHomeNavBarWithToolbar.f59417v0 = false;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f148799c;
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.f59410q), new d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(navBarWithToolbar.o.f57403b), new i3e.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f148799c.u0()), new d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f148799c.v0()), new d(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(d3().f148798b.f58581q), new i3e.e(this, null, 1), 3);
    }

    public final h2e.b d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (h2e.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i3e.f d() {
        return (i3e.f) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ski.c) this.P.getValue();
    }
}
