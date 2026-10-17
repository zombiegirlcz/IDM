package sgd;

import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;
import com.revolut.feature.shared_separate_favourites.domain.watchlist.Watchlist;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CombinedWatchlistContext f262644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Watchlist f262645b;

    public d(CombinedWatchlistContext watchlistContext, Watchlist watchlist) {
        Intrinsics.checkNotNullParameter(watchlistContext, "watchlistContext");
        Intrinsics.checkNotNullParameter(watchlist, "watchlist");
        this.f262644a = watchlistContext;
        this.f262645b = watchlist;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f262644a, dVar.f262644a) && Intrinsics.f(this.f262645b, dVar.f262645b);
    }

    public final int hashCode() {
        return this.f262645b.hashCode() + (this.f262644a.hashCode() * 31);
    }
}
