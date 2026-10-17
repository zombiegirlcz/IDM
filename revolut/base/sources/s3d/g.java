package s3d;

import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WatchlistItem f259648a;

    public g(WatchlistItem watchlistItem) {
        Intrinsics.checkNotNullParameter(watchlistItem, "watchlistItem");
        this.f259648a = watchlistItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f259648a, ((g) obj2).f259648a);
    }

    public final int hashCode() {
        return this.f259648a.hashCode();
    }
}
