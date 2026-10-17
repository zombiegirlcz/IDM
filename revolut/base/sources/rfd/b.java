package rfd;

import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WatchlistItem f253758a;

    public b(WatchlistItem watchlistItem) {
        Intrinsics.checkNotNullParameter(watchlistItem, "watchlistItem");
        this.f253758a = watchlistItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f253758a, ((b) obj2).f253758a);
    }

    public final int hashCode() {
        return this.f253758a.hashCode();
    }
}
