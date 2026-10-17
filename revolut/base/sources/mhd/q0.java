package mhd;

import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlow;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$InputData;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$LaunchMode;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.sorting.WatchlistSortingController;
import com.revolut.kompot.common.ModalDestination;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class q0 extends rfd.a {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CombinedWatchlistContext f205526l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l3d.h0 f205527m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m3d.j f205528n;
    public final m3d.k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final phd.a f205529p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rfd.e f205530q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vki.a f205531r;

    public q0(CombinedWatchlistContext combinedWatchlistContext, l3d.h0 watchlistInteractor, m3d.j watchlistNavigationDestinationProvider, m3d.k watchlistSortingTypesProvider, phd.a shotMessageFactory) {
        Intrinsics.checkNotNullParameter(combinedWatchlistContext, "combinedWatchlistContext");
        Intrinsics.checkNotNullParameter(watchlistInteractor, "watchlistInteractor");
        Intrinsics.checkNotNullParameter(watchlistNavigationDestinationProvider, "watchlistNavigationDestinationProvider");
        Intrinsics.checkNotNullParameter(watchlistSortingTypesProvider, "watchlistSortingTypesProvider");
        Intrinsics.checkNotNullParameter(shotMessageFactory, "shotMessageFactory");
        this.f205526l = combinedWatchlistContext;
        this.f205527m = watchlistInteractor;
        this.f205528n = watchlistNavigationDestinationProvider;
        this.o = watchlistSortingTypesProvider;
        this.f205529p = shotMessageFactory;
        rfd.e eVar = new rfd.e(0);
        this.f205530q = eVar;
        this.f205531r = pyd.c.a(this, eVar);
    }

    @Override // yji.n
    public final void H2() {
        CombinedWatchlistContext combinedWatchlistContext = this.f205526l;
        yji.n.l2(this, boh.f.e(l3d.h0.g(this.f205527m, combinedWatchlistContext.f86890b, combinedWatchlistContext.f86889a, false, false, null, 96), new k0(this, 1)), null, new m0(this, null, 1), 3);
    }

    @Override // rfd.a
    public final boolean Z2() {
        return this.f205527m.c(this.f205526l.f86889a).f225123a == ogd.m.MANUAL;
    }

    @Override // rfd.a
    public final void b3(int i, int i2, int i3) {
        Data data;
        ArrayList arrayListF1;
        vki.a aVar = this.f205531r;
        Data data2 = ((rfd.e) ((j2) aVar.f22677a).getValue()).f253760a;
        try {
            Object content = data2.getContent();
            if (content != null) {
                List list = (List) content;
                int i5 = i2 - i;
                int i6 = i3 - i;
                if (i5 < 0 || i5 >= list.size() || i6 < 0 || i6 >= list.size()) {
                    return;
                }
                arrayListF1 = zhm.d0.f1(list);
                arrayListF1.add(i6, (WatchlistItem) arrayListF1.remove(i5));
            } else {
                arrayListF1 = null;
            }
            data = new Data(arrayListF1, data2.getError(), data2.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data2.getLoading());
        }
        X2(aVar, new me7.h(data, 7));
    }

    @Override // rfd.a
    public final vkm.y c3() {
        return new vkm.y(this.f205531r.B(new mh4.x(8)), new m0(this, null, 0));
    }

    @Override // rfd.a
    public final void d3() {
        yji.n.P2(this, new WatchlistAddAssetFlow(new WatchlistAddAssetFlowContract$InputData(this.f205526l, (WatchlistAddAssetFlowContract$LaunchMode) null, 6)), ModalDestination.Style.FULLSCREEN_FADE.f98307a, null, 2);
    }

    @Override // rfd.a
    public final void e3(WatchlistItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        yji.n.l2(this, this.f205528n.a(item), null, new m0(this, null, 2), 3);
    }

    @Override // rfd.a
    public final void f3(vh clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Object obj2 = clickData.f54883a.f;
        Continuation continuation = null;
        rfd.b bVar = obj2 instanceof rfd.b ? (rfd.b) obj2 : null;
        if (bVar != null) {
            T2(new m2f.b0(this, bVar.f253758a, continuation, 28), new yi5.b(27));
        }
    }

    @Override // rfd.a
    public final void g3() {
        ogd.k kVarC = this.f205527m.c(this.f205526l.f86889a);
        this.o.getClass();
        N2(new WatchlistSortingController(new jhd.g(kVarC, zhm.v.k(ogd.m.MANUAL, ogd.m.PRICE_CHANGE, ogd.m.ALPHABETICAL))), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new k0(this, 0));
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.f205531r;
    }

    @Override // rfd.a
    public final void h3() {
        List list = (List) ((rfd.e) ((j2) this.f205531r.f22677a).getValue()).f253760a.getContent();
        if (list != null) {
            V2(new p0(this, list, null, 0), new yi5.b(29));
        }
    }
}
