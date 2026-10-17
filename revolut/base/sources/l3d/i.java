package l3d;

import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((WatchlistItem) obj2).f86898a.f86865c, ((WatchlistItem) obj3).f86898a.f86865c);
    }
}
