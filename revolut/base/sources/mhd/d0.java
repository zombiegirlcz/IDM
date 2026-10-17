package mhd;

import com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.watchlist.WatchlistHomeScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends yji.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rfd.d f205491c;
    public final rfd.a d;

    public d0(rfd.d view, rfd.a controllerModelExtension) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        this.f205491c = view;
        this.d = controllerModelExtension;
    }

    @Override // yji.d
    public final void M() {
        WatchlistHomeScreen watchlistHomeScreen = (WatchlistHomeScreen) this.f205491c;
        yji.d.H(this, new lt.d(rd0.e.b(watchlistHomeScreen.c0.f53218h), 24), new mc9.n(2, this.d, rfd.a.class, "onWatchlistItemClicked", "onWatchlistItemClicked(Lcom/revolut/feature/shared_separate_favourites/domain/watchlist/WatchlistItem;)V", 4, 10), 3);
        yji.d.H(this, rd0.e.b(watchlistHomeScreen.f86972h0.f), new b0(this, null), 3);
        yji.d.H(this, new lt.d(rd0.e.b(watchlistHomeScreen.g0.f52371h.f121375b), 23), new c0(this, null), 3);
    }
}
