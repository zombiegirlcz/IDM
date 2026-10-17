package v1d;

import com.revolut.feature.shared_separate_favourites.domain.combined_watchlist.CombinedWatchlistContext;

/* JADX INFO: loaded from: classes7.dex */
public interface b {
    default a a() {
        return a.SINGLE;
    }

    Object b(String str, gim.c cVar);

    CombinedWatchlistContext c();
}
