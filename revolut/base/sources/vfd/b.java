package vfd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared_separate_favourites.combined_watchlist.flow.CombinedWatchlistHomeFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements xki.c, khd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CombinedWatchlistHomeFlowContract$InputData f288574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f288575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f288576c = this;
    public final e4m.e d = e4m.b.b(new ux8.b(this, 19));

    public b(a aVar, CombinedWatchlistHomeFlowContract$InputData combinedWatchlistHomeFlowContract$InputData) {
        this.f288575b = aVar;
        this.f288574a = combinedWatchlistHomeFlowContract$InputData;
    }

    @Override // khd.b
    public final khd.a b() {
        return new d(this.f288575b, this.f288576c);
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
