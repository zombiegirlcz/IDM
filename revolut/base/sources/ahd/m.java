package ahd;

import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WatchlistItem f4948a;

    public m(WatchlistItem watchlistItem) {
        Intrinsics.checkNotNullParameter(watchlistItem, "watchlistItem");
        this.f4948a = watchlistItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f4948a, ((m) obj2).f4948a);
    }

    public final int hashCode() {
        return this.f4948a.hashCode();
    }
}
