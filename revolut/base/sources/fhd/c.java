package fhd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.watchlist.ui.flow.add_asset.WatchlistAddAssetFlowContract$InputData;
import e4m.e;
import fa0.q;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WatchlistAddAssetFlowContract$InputData f135208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f135209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f135210c = this;
    public final e d;
    public final e e;

    public c(b bVar, WatchlistAddAssetFlowContract$InputData watchlistAddAssetFlowContract$InputData) {
        this.f135209b = bVar;
        this.f135208a = watchlistAddAssetFlowContract$InputData;
        int i = 15;
        this.d = e4m.b.b(new q(bVar, this, 1, i));
        this.e = e4m.b.b(new q(bVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
