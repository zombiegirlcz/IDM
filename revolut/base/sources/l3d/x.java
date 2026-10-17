package l3d;

import com.revolut.feature.shared_separate_favourites.domain.watchlist.WatchlistItem;
import java.util.Comparator;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((WatchlistItem) obj2).d, ((WatchlistItem) obj3).d);
    }
}
