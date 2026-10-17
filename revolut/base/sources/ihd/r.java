package ihd;

import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends com.revolut.feature.shared_separate_favourites.watchlist.ui.screen.home_widget_customisation.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WatchlistItem f161387a;

    public r(WatchlistItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f161387a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && Intrinsics.f(this.f161387a, ((r) obj2).f161387a);
    }

    public final int hashCode() {
        return this.f161387a.hashCode();
    }
}
