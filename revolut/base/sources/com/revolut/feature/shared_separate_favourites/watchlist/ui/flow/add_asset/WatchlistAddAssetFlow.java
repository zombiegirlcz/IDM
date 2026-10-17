package com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import au0.j4;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.DraggableTabsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared_separate_favourites.R$id;
import com.revolut.feature.shared_separate_favourites.R$layout;
import com.revolut.feature.shared_separate_favourites.api.R$string;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlow;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$LaunchMode;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import exe.j;
import exe.k;
import hhd.i;
import hhd.l;
import hhd.m;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u00020\u0006:\u0001\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lgfd/d;", "Lali/g;", "Lhhd/m;", "Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$Step;", "Lzfd/g;", "Companion", "a", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WatchlistAddAssetFlow extends ViewController<gfd.d> implements ali.g, zfd.g {
    public final WatchlistAddAssetFlowContract$InputData K;
    public final int L;
    public final boolean M;
    public final Object N;
    public final Object O;
    public final Object P;
    public final ao.h Q;
    public final e0m.b R;
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(WatchlistAddAssetFlow.class, "binding", "getBinding()Lcom/revolut/feature/shared_separate_favourites/databinding/SharedAddAssetRev10FlowBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlow$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public WatchlistAddAssetFlow(WatchlistAddAssetFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.shared_add_asset_rev10_flow;
        this.M = true;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: hhd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WatchlistAddAssetFlow f152386b;

            {
                this.f152386b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                WatchlistAddAssetFlow watchlistAddAssetFlow = this.f152386b;
                switch (i2) {
                    case 0:
                        WatchlistAddAssetFlow.Companion companion = WatchlistAddAssetFlow.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(watchlistAddAssetFlow.m2()).a().get(fhd.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fhd.b.class, " is not found"));
                        }
                        fhd.b bVar = ((fhd.b) aVar2.b()).e;
                        WatchlistAddAssetFlowContract$InputData watchlistAddAssetFlowContract$InputData = watchlistAddAssetFlow.K;
                        watchlistAddAssetFlowContract$InputData.getClass();
                        return new fhd.c(bVar, watchlistAddAssetFlowContract$InputData);
                    case 1:
                        WatchlistAddAssetFlow.Companion companion2 = WatchlistAddAssetFlow.INSTANCE;
                        return (i) ((fhd.c) watchlistAddAssetFlow.N.getValue()).e.get();
                    case 2:
                        WatchlistAddAssetFlow.Companion companion3 = WatchlistAddAssetFlow.INSTANCE;
                        return mif.a.a(watchlistAddAssetFlow, R$layout.flow_add_asset_tab_container, R$id.sharedAddAsset_pager, watchlistAddAssetFlow.R2(), 4);
                    default:
                        WatchlistAddAssetFlow.Companion companion4 = WatchlistAddAssetFlow.INSTANCE;
                        watchlistAddAssetFlow.d3().f183959c.post(new fp0.l(watchlistAddAssetFlow, 6));
                        return Unit.f186387a;
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: hhd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WatchlistAddAssetFlow f152386b;

            {
                this.f152386b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                WatchlistAddAssetFlow watchlistAddAssetFlow = this.f152386b;
                switch (i22) {
                    case 0:
                        WatchlistAddAssetFlow.Companion companion = WatchlistAddAssetFlow.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(watchlistAddAssetFlow.m2()).a().get(fhd.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fhd.b.class, " is not found"));
                        }
                        fhd.b bVar = ((fhd.b) aVar2.b()).e;
                        WatchlistAddAssetFlowContract$InputData watchlistAddAssetFlowContract$InputData = watchlistAddAssetFlow.K;
                        watchlistAddAssetFlowContract$InputData.getClass();
                        return new fhd.c(bVar, watchlistAddAssetFlowContract$InputData);
                    case 1:
                        WatchlistAddAssetFlow.Companion companion2 = WatchlistAddAssetFlow.INSTANCE;
                        return (i) ((fhd.c) watchlistAddAssetFlow.N.getValue()).e.get();
                    case 2:
                        WatchlistAddAssetFlow.Companion companion3 = WatchlistAddAssetFlow.INSTANCE;
                        return mif.a.a(watchlistAddAssetFlow, R$layout.flow_add_asset_tab_container, R$id.sharedAddAsset_pager, watchlistAddAssetFlow.R2(), 4);
                    default:
                        WatchlistAddAssetFlow.Companion companion4 = WatchlistAddAssetFlow.INSTANCE;
                        watchlistAddAssetFlow.d3().f183959c.post(new fp0.l(watchlistAddAssetFlow, 6));
                        return Unit.f186387a;
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: hhd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WatchlistAddAssetFlow f152386b;

            {
                this.f152386b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                WatchlistAddAssetFlow watchlistAddAssetFlow = this.f152386b;
                switch (i22) {
                    case 0:
                        WatchlistAddAssetFlow.Companion companion = WatchlistAddAssetFlow.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(watchlistAddAssetFlow.m2()).a().get(fhd.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fhd.b.class, " is not found"));
                        }
                        fhd.b bVar = ((fhd.b) aVar2.b()).e;
                        WatchlistAddAssetFlowContract$InputData watchlistAddAssetFlowContract$InputData = watchlistAddAssetFlow.K;
                        watchlistAddAssetFlowContract$InputData.getClass();
                        return new fhd.c(bVar, watchlistAddAssetFlowContract$InputData);
                    case 1:
                        WatchlistAddAssetFlow.Companion companion2 = WatchlistAddAssetFlow.INSTANCE;
                        return (i) ((fhd.c) watchlistAddAssetFlow.N.getValue()).e.get();
                    case 2:
                        WatchlistAddAssetFlow.Companion companion3 = WatchlistAddAssetFlow.INSTANCE;
                        return mif.a.a(watchlistAddAssetFlow, R$layout.flow_add_asset_tab_container, R$id.sharedAddAsset_pager, watchlistAddAssetFlow.R2(), 4);
                    default:
                        WatchlistAddAssetFlow.Companion companion4 = WatchlistAddAssetFlow.INSTANCE;
                        watchlistAddAssetFlow.d3().f183959c.post(new fp0.l(watchlistAddAssetFlow, 6));
                        return Unit.f186387a;
                }
            }
        });
        this.Q = s.t(this, hhd.b.f);
        final int i5 = 3;
        this.R = new e0m.b(new Function0(this) { // from class: hhd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WatchlistAddAssetFlow f152386b;

            {
                this.f152386b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                WatchlistAddAssetFlow watchlistAddAssetFlow = this.f152386b;
                switch (i22) {
                    case 0:
                        WatchlistAddAssetFlow.Companion companion = WatchlistAddAssetFlow.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(watchlistAddAssetFlow.m2()).a().get(fhd.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", fhd.b.class, " is not found"));
                        }
                        fhd.b bVar = ((fhd.b) aVar2.b()).e;
                        WatchlistAddAssetFlowContract$InputData watchlistAddAssetFlowContract$InputData = watchlistAddAssetFlow.K;
                        watchlistAddAssetFlowContract$InputData.getClass();
                        return new fhd.c(bVar, watchlistAddAssetFlowContract$InputData);
                    case 1:
                        WatchlistAddAssetFlow.Companion companion2 = WatchlistAddAssetFlow.INSTANCE;
                        return (i) ((fhd.c) watchlistAddAssetFlow.N.getValue()).e.get();
                    case 2:
                        WatchlistAddAssetFlow.Companion companion3 = WatchlistAddAssetFlow.INSTANCE;
                        return mif.a.a(watchlistAddAssetFlow, R$layout.flow_add_asset_tab_container, R$id.sharedAddAsset_pager, watchlistAddAssetFlow.R2(), 4);
                    default:
                        WatchlistAddAssetFlow.Companion companion4 = WatchlistAddAssetFlow.INSTANCE;
                        watchlistAddAssetFlow.d3().f183959c.post(new fp0.l(watchlistAddAssetFlow, 6));
                        return Unit.f186387a;
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        m uiState = (m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        DraggableTabsView draggableTabsView = d3().d;
        ArrayList arrayList = uiState.f152399b;
        draggableTabsView.setVisibility(arrayList.size() <= 1 ? 8 : 0);
        d3().d.setItems(arrayList, uiState.f152398a);
        d3().f183958b.setText(uiState.f152400c);
        if (arrayList.isEmpty()) {
            return;
        }
        this.R.init();
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        WatchlistAddAssetFlowContract$Step pagerItem2 = (WatchlistAddAssetFlowContract$Step) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        ((h) R2()).I2(new l(pagerItem2.getF86946b()));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (fhd.c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (fhd.c) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f183959c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        WatchlistAddAssetFlowContract$InputData watchlistAddAssetFlowContract$InputData = this.K;
        WatchlistAddAssetFlowContract$LaunchMode watchlistAddAssetFlowContract$LaunchMode = watchlistAddAssetFlowContract$InputData.f86940b;
        if (watchlistAddAssetFlowContract$LaunchMode instanceof WatchlistAddAssetFlowContract$LaunchMode.SingleSelection) {
            textLocalisedClause = new TextLocalisedClause(R$string.shared_watchlist_common_search_placeholder, null, null, 14);
        } else {
            if (!(watchlistAddAssetFlowContract$LaunchMode instanceof WatchlistAddAssetFlowContract$LaunchMode.WatchlistSelection) && !Intrinsics.f(watchlistAddAssetFlowContract$LaunchMode, WatchlistAddAssetFlowContract$LaunchMode.DefaultWatchlistSelection.f86942a)) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.shared_watchlist_add_to_watchlist_screen_header_title, null, null, 14);
        }
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setHint(new TextLocalisedClause(R$string.shared_watchlist_common_search_placeholder, null, null, 14));
        int i = 4;
        int i2 = 2;
        com.revolut.kompot.navigable.a.g2(this, new h23.b(rd0.e.b(navBarWithToolbar.f59410q), 20), null, new k(i2, R2(), i.class, "onUIEvent", "onUIEvent(Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$UIEvent;)V", i, 25), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59409p.f57336l), null, new c(this, navBarWithToolbar, null), 3);
        NavBarWithToolbar navBarWithToolbar2 = d3().f183959c;
        navBarWithToolbar2.setSearchButtonActive(true);
        navBarWithToolbar2.K0(j4.NO_ANIMATION);
        ihm.f fVar = navBarWithToolbar2.f59409p.f57337m;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        com.revolut.kompot.navigable.a.g2(this, new j(new h23.b(rd0.e.b(w.y(fVar, 400L)), 21), 15), null, new k(i2, R2(), i.class, "onUIEvent", "onUIEvent(Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$UIEvent;)V", i, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, new h23.b(rd0.e.b(d3().d.m()), 22), null, new k(i2, R2(), i.class, "onUIEvent", "onUIEvent(Lcom/revolut/feature/shared_separate_favourites/watchlist/ui/flow/add_asset/WatchlistAddAssetFlowContract$UIEvent;)V", i, 27), 3);
        if (watchlistAddAssetFlowContract$InputData.f86940b instanceof WatchlistAddAssetFlowContract$LaunchMode.SingleSelection) {
            d3().f183958b.setVisibility(8);
        } else {
            com.revolut.kompot.navigable.a.g2(this, new h23.b(rd0.e.b(d3().f183958b.o), 19), null, new b(this, null), 3);
        }
    }

    public final kgd.d d3() {
        ViewBinding value = this.Q.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (kgd.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final i R2() {
        return (i) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
