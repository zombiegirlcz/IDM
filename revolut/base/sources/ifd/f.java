package ifd;

import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WatchlistItem f161004a;

    public f(WatchlistItem watchlistItem) {
        Intrinsics.checkNotNullParameter(watchlistItem, "watchlistItem");
        this.f161004a = watchlistItem;
    }

    @Override // ifd.g
    public final WatchlistItem a() {
        return this.f161004a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f161004a, ((f) obj2).f161004a);
    }

    public final int hashCode() {
        return this.f161004a.hashCode();
    }
}
