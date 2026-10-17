package s3d;

import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WatchlistItem f259647b;

    public f(WatchlistItem watchlistItem, String watchlistId) {
        Intrinsics.checkNotNullParameter(watchlistId, "watchlistId");
        Intrinsics.checkNotNullParameter(watchlistItem, "watchlistItem");
        this.f259646a = watchlistId;
        this.f259647b = watchlistItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f259646a, fVar.f259646a) && Intrinsics.f(this.f259647b, fVar.f259647b);
    }

    public final int hashCode() {
        return this.f259647b.hashCode() + (this.f259646a.hashCode() * 31);
    }
}
