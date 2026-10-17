package vgd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.watchlist_assets.WatchlistAssetsScreenContract$InputData;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.Set;
import us6.r2;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements bhd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenContentRecyclerView f288851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o5d.b f288852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WatchlistAssetsScreenContract$InputData f288853c;
    public final b d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f288854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f288855h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f288856j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f288857l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f288858m;

    public f(b bVar, c cVar, WatchlistAssetsScreenContract$InputData watchlistAssetsScreenContract$InputData, ScreenContentRecyclerView screenContentRecyclerView, o5d.b bVar2) {
        this.d = bVar;
        this.f288851a = screenContentRecyclerView;
        this.f288852b = bVar2;
        this.f288853c = watchlistAssetsScreenContract$InputData;
        int i = 18;
        this.e = e4m.b.b(new r2(bVar, this, 1, i));
        this.f = e4m.b.b(new r2(bVar, this, 0, i));
        this.f288854g = e4m.b.b(new r2(bVar, this, 3, i));
        this.f288855h = e4m.b.b(new r2(bVar, this, 2, i));
        this.i = e4m.b.b(new r2(bVar, this, 4, i));
        this.f288856j = e4m.b.b(new r2(bVar, this, 5, i));
        this.k = e4m.b.b(new r2(bVar, this, 7, i));
        this.f288857l = e4m.b.b(new r2(bVar, this, 8, i));
        this.f288858m = e4m.b.b(new r2(bVar, this, 6, i));
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(2);
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.addAll((Iterable) this.f288856j.get());
        return builderBuilderWithExpectedSize.build();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.f288855h.get());
    }
}
