package vfd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.api.watchlist.home_widget_customisation.WatchlistWidgetCustomisationScreen$InputData;
import java.util.Set;
import us6.r2;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WatchlistWidgetCustomisationScreen$InputData f288603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f288604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f288605c;

    public h(g gVar, WatchlistWidgetCustomisationScreen$InputData watchlistWidgetCustomisationScreen$InputData) {
        this.f288603a = watchlistWidgetCustomisationScreen$InputData;
        int i = 15;
        this.f288604b = e4m.b.b(new r2(gVar, this, 1, i));
        this.f288605c = e4m.b.b(new r2(gVar, this, 0, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
